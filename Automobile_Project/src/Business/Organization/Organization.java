package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.InventoryOrderQueue;
import Business.WorkQueue.PricingOrderQueue;
import Business.WorkQueue.QuoteOrderQueue;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private InventoryOrderQueue inventoryOrderQueue;
    private QuoteOrderQueue quoteOrderQueue;
    private PricingOrderQueue priceOrderQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;

    // Static inner class to replace enum
    public static final class Type {
        // Static final fields with first letter capitalized
        public static final Type Admin = new Type("Admin Organization");
        public static final Type Sales = new Type("Sales Organization");
        public static final Type Customer = new Type("Customer Organization");
        public static final Type Distributor = new Type("Distributor Organization");
        public static final Type Dealer = new Type("Dealer Organization");
        public static final Type Manufacturer = new Type("Manufacturer Organization");
        public static final Type ManufacturerPaint = new Type("Manufacturer Paint Organization");
        public static final Type ManufacturerTechnical = new Type("Manufacturer Technical Organization");
        public static final Type Testing = new Type("Testing Organization");
        public static final Type Logistic = new Type("Logistic Organization");
        public static final Type SystemAdmin = new Type("System Admin Organization");

        // Private static map to store all instances
        private static final Map<String, Type> instances = new HashMap<>();

        // Private static list to store all values (for values() method)
        private static final ArrayList<Type> VALUES = new ArrayList<>();

        // Static initializer block to populate the map and values list
        static {
            VALUES.add(Admin);
            VALUES.add(Sales);
            VALUES.add(Customer);
            VALUES.add(Distributor);
            VALUES.add(Dealer);
            VALUES.add(Manufacturer);
            VALUES.add(ManufacturerPaint);
            VALUES.add(ManufacturerTechnical);
            VALUES.add(Testing);
            VALUES.add(Logistic);
            VALUES.add(SystemAdmin);

            instances.put(Admin.getValue(), Admin);
            instances.put(Sales.getValue(), Sales);
            instances.put(Customer.getValue(), Customer);
            instances.put(Distributor.getValue(), Distributor);
            instances.put(Dealer.getValue(), Dealer);
            instances.put(Manufacturer.getValue(), Manufacturer);
            instances.put(ManufacturerPaint.getValue(), ManufacturerPaint);
            instances.put(ManufacturerTechnical.getValue(), ManufacturerTechnical);
            instances.put(Testing.getValue(), Testing);
            instances.put(Logistic.getValue(), Logistic);
            instances.put(SystemAdmin.getValue(), SystemAdmin);
        }

        private final String value;

        // Private constructor to prevent external instantiation
        private Type(String value) {
            this.value = value;
        }

        // Mimics enum's values() method
        public static Type[] values() {
            return VALUES.toArray(new Type[0]);
        }

        // Getter for value
        public String getValue() {
            return value;
        }

        // Override toString
        @Override
        public String toString() {
            return value;
        }

        // Method to get an instance by value
        public static Type fromValue(String value) {
            Type type = instances.get(value);
            if (type == null) {
                throw new IllegalArgumentException("Invalid Organization Type: " + value);
            }
            return type;
        }

        // Equality and hashcode for proper comparison
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Type type = (Type) o;
            return value.equals(type.value);
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        inventoryOrderQueue = new InventoryOrderQueue();
        quoteOrderQueue = new QuoteOrderQueue();
        priceOrderQueue = new PricingOrderQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public QuoteOrderQueue getQuoteOrderQueue() {
        return quoteOrderQueue;
    }

    public void setQuoteOrderQueue(QuoteOrderQueue quoteOrderQueue) {
        this.quoteOrderQueue = quoteOrderQueue;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public InventoryOrderQueue getInventoryOrderQueue() {
        return inventoryOrderQueue;
    }

    public void setInventoryOrderQueue(InventoryOrderQueue inventoryOrderQueue) {
        this.inventoryOrderQueue = inventoryOrderQueue;
    }

    public PricingOrderQueue getPriceOrderQueue() {
        return priceOrderQueue;
    }

    public void setPriceOrderQueue(PricingOrderQueue priceOrderQueue) {
        this.priceOrderQueue = priceOrderQueue;
    }
    
    

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
