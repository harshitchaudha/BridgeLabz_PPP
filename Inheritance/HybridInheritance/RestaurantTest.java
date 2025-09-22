package Inheritance.HybridInheritance;

// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass 1: Chef
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " cooks " + specialty + " dishes.");
    }
}

// Subclass 2: Waiter
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " serves " + tablesAssigned + " tables.");
    }
}

// Test
public class RestaurantTest {
    public static void main(String[] args) {
        Worker c = new Chef("Alice", 101, "Italian");
        Worker w = new Waiter("Bob", 102, 5);

        c.performDuties();
        w.performDuties();
    }
}
