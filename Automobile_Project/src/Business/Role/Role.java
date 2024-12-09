package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public abstract class Role {

    // Static inner class to replace enum
    public static final class RoleType {
        // Static final fields with first letter capitalized
        public static final RoleType Admin = new RoleType("Admin");
        public static final RoleType SalesPerson = new RoleType("SalesPerson");
        public static final RoleType Marketing = new RoleType("Marketing");
        public static final RoleType Customer = new RoleType("Customer");
        public static final RoleType Distributor = new RoleType("Distributor");
        public static final RoleType Dealer = new RoleType("Dealer");
        public static final RoleType Manufacturer = new RoleType("Manufacturer");
        public static final RoleType ManufacturerPaint = new RoleType("Manufacturer Paint");
        public static final RoleType ManufacturerTechnical = new RoleType("ManufacturerTechnical");
        public static final RoleType Testing = new RoleType("Testing");
        public static final RoleType Logistics = new RoleType("Logistics");
        public static final RoleType SystemAdmin = new RoleType("System Admin");
        public static final RoleType DealerAdmin = new RoleType("Dealer Admin");
        public static final RoleType SalesAdmin = new RoleType("Sales Admin");

        // Private static map to store all instances
        private static final Map<String, RoleType> instances = new HashMap<>();

        // Private static list to store all values (for values() method)
        private static final ArrayList<RoleType> VALUES = new ArrayList<>();

        // Static initializer block to populate the map and values list
        static {
            VALUES.add(Admin);
            VALUES.add(SalesPerson);
            VALUES.add(Marketing);
            VALUES.add(Customer);
            VALUES.add(Distributor);
            VALUES.add(Dealer);
            VALUES.add(Manufacturer);
            VALUES.add(ManufacturerPaint);
            VALUES.add(ManufacturerTechnical);
            VALUES.add(Testing);
            VALUES.add(Logistics);
            VALUES.add(SystemAdmin);
            VALUES.add(DealerAdmin);
            VALUES.add(SalesAdmin);

            instances.put(Admin.getValue(), Admin);
            instances.put(SalesPerson.getValue(), SalesPerson);
            instances.put(Marketing.getValue(), Marketing);
            instances.put(Customer.getValue(), Customer);
            instances.put(Distributor.getValue(), Distributor);
            instances.put(Dealer.getValue(), Dealer);
            instances.put(Manufacturer.getValue(), Manufacturer);
            instances.put(ManufacturerPaint.getValue(), ManufacturerPaint);
            instances.put(ManufacturerTechnical.getValue(), ManufacturerTechnical);
            instances.put(Testing.getValue(), Testing);
            instances.put(Logistics.getValue(), Logistics);
            instances.put(SystemAdmin.getValue(), SystemAdmin);
            instances.put(DealerAdmin.getValue(), DealerAdmin);
            instances.put(SalesAdmin.getValue(), SalesAdmin);
        }

        private final String value;

        // Private constructor to prevent external instantiation
        private RoleType(String value) {
            this.value = value;
        }

        // Mimics enum's values() method
        public static RoleType[] values() {
            return VALUES.toArray(new RoleType[0]);
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
        public static RoleType fromValue(String value) {
            RoleType type = instances.get(value);
            if (type == null) {
                throw new IllegalArgumentException("Invalid Role Type: " + value);
            }
            return type;
        }

        // Equality and hashcode for proper comparison
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RoleType that = (RoleType) o;
            return value.equals(that.value);
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }
    }

    public RoleType type;

    public abstract JPanel createWorkArea(
            JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business
    );

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
