package Business.DB4OUtil;

import Business.ConfigureASystem;
import Business.EcoSystem;
import Business.WorkQueue.QuoteOrderRequest;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.config.ObjectTranslator;
import com.db4o.query.Predicate;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString(); // Path to the datastore
    private static DB4OUtil dB4OUtil;

    // Singleton instance getter
    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    // Ensure proper shutdown of ObjectContainer
    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    // Create connection to the DB4O database
    private ObjectContainer createConnection() {
        try {
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        //    config.common().add(new TransparentPersistenceSupport());

            // Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            // Controls the depth/level of updating an object
            config.common().updateDepth(Integer.MAX_VALUE);
            
            // Register your topmost Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Cascade updates for EcoSystem
            config.common().objectClass(QuoteOrderRequest.class).cascadeOnUpdate(true);
            config.common().objectClass(Enum.class).translate(new EnumTranslator());

            
            return Db4oEmbedded.openFile(config, FILENAME);
        } catch (Exception ex) {
            System.err.println("Error creating connection to DB4O: " + ex.getMessage());
        }
        return null;
    }

    // Store the system in the database
    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = null;
        try {
            conn = createConnection();
            if (conn == null) {
                throw new IllegalStateException("Failed to create a connection to DB4O.");
            }
            deleteOldSystem(conn); // Delete existing systems
            conn.store(system);
            conn.commit();
        } catch (Exception e) {
            System.err.println("Error storing the system: " + e.getMessage());
        } finally {
            shutdown(conn);
        }
    }

    // Delete old systems from the database
    public void deleteOldSystem(ObjectContainer conn) {
        try {
            ObjectSet<EcoSystem> systems = conn.query(new Predicate<EcoSystem>() {
                @Override
                public boolean match(EcoSystem et) {
                    return true; // Match all existing EcoSystem objects
                }
            });

            for (EcoSystem ecoSystem : systems) {
                conn.delete(ecoSystem);
            }
        } catch (Exception e) {
            System.err.println("Error deleting old systems: " + e.getMessage());
        }
    }

    // Retrieve the system from the database
    public EcoSystem retrieveSystem() {
        ObjectContainer conn = null;
        EcoSystem system = null;

        try {
            conn = createConnection();
            if (conn == null) {
                throw new IllegalStateException("Failed to create a connection to DB4O.");
            }

            ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class); // Query EcoSystem objects
            if (systems.isEmpty()) {
                system = ConfigureASystem.configure(); // Create a new system if none exists
            } else {
                system = systems.get(systems.size() - 1); // Retrieve the latest system
            }
        } catch (Exception e) {
            System.err.println("Error retrieving the system: " + e.getMessage());
        } finally {
            shutdown(conn);
        }

        return system;
    }
    

}

