public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        int a = 10, b = 5, c = 2;

        System.out.println("a + b * c = " + (a + b * c)); // 10 + 5*2 = 20
        System.out.println("(a + b) * c = " + ((a + b) * c)); // (10+5)*2 = 30
        System.out.println("a * b + c / 2 = " + (a * b + c / 2)); // 10*5 + 2/2 = 50+1=51
        System.out.println("a / b + c * 2 = " + (a / b + c * 2)); // 10/5 + 2*2 = 2+4=6

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        int x = 15, y = 10, z = 20;

        System.out.println("x + y > z - 5 = " + (x + y > z - 5)); // 25 > 15 → true
        System.out.println("x > y + z / 4 = " + (x > y + z / 4)); // 15 > 10+5 → false
        System.out.println("(x + y) > (z - 5) && x < z = " + ((x + y) > (z - 5) && x < z)); // 25>15 && 15<20 → true
        System.out.println("x * 2 + y > z && y < x + 5 = " + (x * 2 + y > z && y < x + 5)); // 40>20 && 10<20 → true

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\n=== PRECEDENCE OPERATOR LOGIKA ===");

        boolean p = true, q = false, r = true;

        System.out.println("p && q || r = " + (p && q || r)); // (true && false) || true = false || true = true
        System.out.println("p || q && r = " + (p || (q && r))); // true || (false && true) = true
        System.out.println("!p && q || r = " + ((!p && q) || r)); // (!true && false) || true = false || true = true
        System.out.println("p && (q || r) = " + (p && (q || r))); // true && (false||true)=true

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\n=== TIPE OPERATOR CAMPURAN ===");

        int num1 = 25, num2 = 15, num3 = 30;

        System.out.println("num1 > num2 + 5 && num3 / 2 < num1 = " + (num1 > num2 + 5 && num3 / 2 < num1));
        // 25 > 20 && 15 < 25 = true && true = true
        System.out.println("num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10 = " +
                (num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10));
        // 40>30 || (5<10 && 15>10) = true || (true&&true)=true
        System.out.println("(num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10 = " +
                ((num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10));
        // (true || true) && true = true

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        int value = 8;
        System.out.println("++value * 2 = " + (++value * 2)); // value=9 → 9*2=18

        value = 8;
        System.out.println("value++ * 2 = " + (value++ * 2)); // 8*2=16, lalu value=9

        value = 8;
        System.out.println("2 * ++value = " + (2 * ++value)); // value=9, 2*9=18

        value = 8;
        System.out.println("-value + 10 = " + (-value + 10)); // -8+10=2

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        a = 5;
        b = 10;
        a += b * 2; // b*2=20 → a=5+20=25
        System.out.println("a += b * 2 → " + a);

        a = 5;
        a *= b + 3; // b+3=13 → a=5*13=65
        System.out.println("a *= b + 3 → " + a);

        a = (b > 5 ? b * 2 : b / 2); // b=10>5 → true → a=20
        System.out.println("a = b > 5 ? b*2 : b/2 → " + a);

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        a = 8; b = 4; c = 2; int d = 6;
        System.out.println("a + b * c - d = " + (a + b * c - d)); // 8+4*2-6 = 8+8-6=10
        System.out.println("(a + b) * (c - d) = " + ((a + b) * (c - d))); // (12)*( -4)= -48

        System.out.println("a > b && c < d || a == b = " + (a > b && c < d || a == b));
        // (8>4 && 2<6) || false = (true && true)||false = true
        System.out.println("a > b && (c < d || a == b) = " + (a > b && (c < d || a == b)));
        // (8>4) && (true||false)= true && true = true

        System.out.println("((a + b) * c) / (d - 2) > (a - b) = " + (((a + b) * c) / (d - 2) > (a - b)));
        // ((12)*2)/(4) > (4) → 24/4 > 4 → 6>4 → true
    }
}