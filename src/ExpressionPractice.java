public class ExpressionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Expression, Statement & Block
         */

        // ===== EXPRESSIONS =====
        System.out.println("=== EXPRESSIONS ===");

        int a = 10;
        int b = 5;

        // Arithmetic expressions
        int sum = a + b;
        int product = a * b;

        // Boolean expression
        boolean isGreater = a > b;

        // String expression
        String greeting = "Hello" + " World";

        // Method call expression
        double power = Math.pow(2, 3);

        // Print hasil expressions
        System.out.println("Sum (a + b): " + sum);
        System.out.println("Product (a * b): " + product);
        System.out.println("Is a > b? " + isGreater);
        System.out.println("Greeting: " + greeting);
        System.out.println("Math.pow(2, 3): " + power);

        // ===== STATEMENTS =====
        System.out.println("\n=== STATEMENTS ===");

        // Declaration + assignment
        int score;
        score = 85;

        // Conditional statement
        if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Loop statement
        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // ===== BLOCKS =====
        System.out.println("\n=== BLOCKS ===");

        int x = 15;

        // If block
        if (x > 10) {
            String category = "High";
            System.out.println("x: " + x + ", category: " + category);
        }

        // For loop block
        for (int i = 1; i <= 3; i++) {
            int iteration = i;
            System.out.println("Iteration number: " + iteration);
        }

        // Variable scope demo
        int outerVariable = 100;

        {
            int innerVariable = 50;
            System.out.println("Inside block -> outerVariable: " + outerVariable + ", innerVariable: " + innerVariable);

            // Modify outerVariable inside block
            outerVariable += 25;
        }

        // After block
        System.out.println("After block -> outerVariable: " + outerVariable);
        // System.out.println(innerVariable); // ❌ Error: innerVariable not visible outside its block
    }
}