package Inheritance;

class StaffMember {
    protected String name;
    protected int id;

    public StaffMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID  : " + id);
    }
}

interface Worker {
    void performDuties();
}

class Chef extends StaffMember implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking dishes. Specialty: " + specialty);
    }
}

class Waiter extends StaffMember implements Worker {
    private int tableNumber;

    public Waiter(String name, int id, int tableNumber) {
        super(name, id);
        this.tableNumber = tableNumber;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving table number: " + tableNumber);
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Ramesh", 101, "Italian Cuisine");
        Waiter waiter1 = new Waiter("Anita", 201, 5);

        System.out.println("=== Restaurant Staff Duties ===\n");

        chef1.displayInfo();
        chef1.performDuties();

        System.out.println("\n-------------------\n");

        waiter1.displayInfo();
        waiter1.performDuties();
    }
}

