package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public abstract class Enterprise extends Organization {

    // Static inner class to replace enum
    public static final class EnterpriseType {
        // Static final fields with first letter capitalized
        public static final EnterpriseType Customer = new EnterpriseType("Customer");
        public static final EnterpriseType Distributor = new EnterpriseType("Distributor");
        public static final EnterpriseType Dealer = new EnterpriseType("Dealer");
        public static final EnterpriseType Manufacturer = new EnterpriseType("Manufacturer");
        public static final EnterpriseType Logistic = new EnterpriseType("Logistic");
        public static final EnterpriseType SystemAdmin = new EnterpriseType("System Admin");

        // Private static map to store all instances
        private static final Map<String, EnterpriseType> instances = new HashMap<>();

        // Private static list to store all values (for values() method)
        private static final ArrayList<EnterpriseType> VALUES = new ArrayList<>();

        // Static initializer block to populate the map and values list
        static {
            VALUES.add(Customer);
            VALUES.add(Distributor);
            VALUES.add(Dealer);
            VALUES.add(Manufacturer);
            VALUES.add(Logistic);
            VALUES.add(SystemAdmin);

            instances.put(Customer.getValue(), Customer);
            instances.put(Distributor.getValue(), Distributor);
            instances.put(Dealer.getValue(), Dealer);
            instances.put(Manufacturer.getValue(), Manufacturer);
            instances.put(Logistic.getValue(), Logistic);
            instances.put(SystemAdmin.getValue(), SystemAdmin);
        }

        private final String value;

        // Private constructor to prevent external instantiation
        private EnterpriseType(String value) {
            this.value = value;
        }

        // Mimics enum's values() method
        public static EnterpriseType[] values() {
            return VALUES.toArray(new EnterpriseType[0]);
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
        public static EnterpriseType fromValue(String value) {
            EnterpriseType type = instances.get(value);
            if (type == null) {
                throw new IllegalArgumentException("Invalid Enterprise Type: " + value);
            }
            return type;
        }

        // Equality and hashcode for proper comparison
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EnterpriseType that = (EnterpriseType) o;
            return value.equals(that.value);
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }
    }

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}
