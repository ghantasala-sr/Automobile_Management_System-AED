/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DB4OUtil;

/**
 *
 * @author srinivasarithikghantasala
 */
import com.db4o.ObjectContainer;
    import com.db4o.config.ObjectTranslator;
import com.db4o.foundation.NotSupportedException;

public class EnumTranslator implements ObjectTranslator {

    @Override
    public void onActivate(ObjectContainer container, Object applicationObject, Object storedObject) {
        if (applicationObject instanceof Enum && storedObject instanceof String) {
            try {
                String storedValue = (String) storedObject;
                Class<?> enumClass = applicationObject.getClass();
                Enum<?> enumValue = Enum.valueOf((Class<Enum>) enumClass, storedValue);
                ((Enum) applicationObject).name();
            } catch (Exception e) {
                throw new RuntimeException("Error during enum activation: " + e.getMessage());
            }
        }
    }

    @Override
    public Object onStore(ObjectContainer container, Object applicationObject) {
        if (applicationObject instanceof Enum) {
            return ((Enum<?>) applicationObject).name(); // Store the name of the enum
        }
        throw new NotSupportedException("Cannot translate non-enum objects.");
    }

    @Override
    public Class storedClass() {
        return String.class; // Enums are stored as strings
    }
}

