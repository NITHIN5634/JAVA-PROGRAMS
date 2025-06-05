class Sum {
    // Overloaded method with two int parameters
    public int sum(int x, int y) {
        return x + y;
    }

    // Overloaded method with three int parameters
    public int sum(int x, int y, int z) {
        return x + y + z;
    }

    // Overloaded method with two double parameters
    public double sum(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));       // Calls sum(int, int)
        System.out.println(s.sum(10, 20, 30));   // Calls sum(int, int, int)
        System.out.println(s.sum(10.5, 20.5));   // Calls sum(double, double)
    }
}