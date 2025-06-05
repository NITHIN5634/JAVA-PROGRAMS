class Sum {
    // Method in the superclass
    public int sum(int x, int y) {
        return x + y;
    }
}

class AdvancedSum extends Sum {
    // Overriding the sum method in the subclass
    @Override
    public int sum(int x, int y) {
        System.out.println("Performing advanced sum operation...");
        return x + y + 10; // Adding an extra value for demonstration
    }
}

public class Main {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        System.out.println(s1.sum(10, 20)); // Calls superclass method

        Sum s2 = new AdvancedSum();
        System.out.println(s2.sum(10, 20)); // Calls overridden method in subclass
    }
}