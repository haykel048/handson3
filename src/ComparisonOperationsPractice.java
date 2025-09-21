public class ComparisonOperationsPractice {
    public static void main(String[] args) {
        // ===== PERBANDINGAN NUMERIK DASAR =====
        System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

        int firstNum = 25, secondNum = 18;
        System.out.println("25 > 18? " + (firstNum > secondNum));
        System.out.println("25 < 18? " + (firstNum < secondNum));
        System.out.println("25 >= 18? " + (firstNum >= secondNum));
        System.out.println("25 <= 18? " + (firstNum <= secondNum));
        System.out.println("25 == 18? " + (firstNum == secondNum));
        System.out.println("25 != 18? " + (firstNum != secondNum));

        // ===== PERBANDINGAN FLOATING-POINT =====
        System.out.println("\n=== PERBANDINGAN FLOATING-POINT ===");

        double price1 = 19.99, price2 = 20.0;
        System.out.println("Apakah price1 lebih murah dari price2? " + (price1 < price2));
        System.out.println("Apakah selisih harga kurang dari 1.0? " + (Math.abs(price1 - price2) < 1.0));

        double sum = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 == 0.3 ? " + (sum == 0.3));
        System.out.println("Nilai sebenarnya dari 0.1 + 0.2 = " + sum);

        // ===== PERBANDINGAN KARAKTER =====
        System.out.println("\n=== PERBANDINGAN KARAKTER ===");

        char letter1 = 'A', letter2 = 'B';
        System.out.println("Apakah 'A' < 'B'? " + (letter1 < letter2));

        char lower = 'a', upper = 'A';
        System.out.println("Apakah 'a' > 'A'? " + (lower > upper));

        char digit = '7';
        System.out.println("Apakah '7' adalah digit? " + (digit >= '0' && digit <= '9'));

        // ===== PERBANDINGAN STRING =====
        System.out.println("\n=== PERBANDINGAN STRING ===");

        String name1 = "Java";
        String name2 = "Java";
        System.out.println("name1 == name2 ? " + (name1 == name2));

        String name3 = new String("Java");
        System.out.println("name1 == name3 ? " + (name1 == name3));
        System.out.println("name1.equals(name3)? " + name1.equals(name3));

        String lowerCase = "java";
        System.out.println("Case-sensitive comparison: " + name1.equals(lowerCase));
        System.out.println("Case-insensitive comparison: " + name1.equalsIgnoreCase(lowerCase));

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        int grade = 85, passingGrade = 60, honorRoll = 90;
        System.out.println("Apakah siswa lulus? " + (grade >= passingGrade));
        System.out.println("Apakah siswa honor roll? " + (grade >= honorRoll));

        int age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21;
        System.out.println("Boleh mengemudi? " + (age >= drivingAge));
        System.out.println("Boleh memilih? " + (age >= votingAge));
        System.out.println("Boleh minum alkohol? " + (age >= drinkingAge));

        int originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60;
        boolean bulkDiscount = originalPrice > discountThreshold;
        boolean seniorDiscount = customerAge >= seniorAge;
        boolean finalEligibility = bulkDiscount || seniorDiscount;
        System.out.println("Diskon bulk? " + bulkDiscount);
        System.out.println("Diskon senior? " + seniorDiscount);
        System.out.println("Kelayakan akhir diskon? " + finalEligibility);

        // ===== PENGUJIAN BATAS =====
        System.out.println("\n=== PENGUJIAN BATAS ===");

        int score = 100;
        System.out.println("Apakah score valid (0–100)? " + (score >= 0 && score <= 100));

        int[] testScores = {0, 100, -1, 101};
        for (int s : testScores) {
            System.out.println("Score " + s + " valid? " + (s >= 0 && s <= 100));
        }

        int temperature = 25;
        System.out.println("Suhu 25 dalam rentang -10 sampai 40? " + (temperature >= -10 && temperature <= 40));

        int height = 175, minHeight = 160, maxHeight = 200;
        System.out.println("Apakah tinggi 175 dalam rentang 160–200? " + (height >= minHeight && height <= maxHeight));

        score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}