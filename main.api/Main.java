public class Main {
    class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Product p = main.new Product(); // Creating an instance of the inner Product class

        // Calling the methods
        int result1 = p.product(2, 3);
        int result2 = p.product(2, 3, 4);
        double result3 = p.product(2.5, 3.5);

        System.out.println("Result 1: " + result1); // Output: 6
        System.out.println("Result 2: " + result2); // Output: 24
        System.out.println("Result 3: " + result3); // Output: 8.75
    }
}
