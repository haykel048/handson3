public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Unary Operators
         * Fokus pada perbedaan pre- dan post-increment/decrement,
         * serta operator unary lain seperti +, -, dan !
         */

        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

        int counter = 5;
        System.out.println("Pre-increment (++counter): " + (++counter)); // counter jadi 6, print 6
        System.out.println("Post-increment (counter++): " + (counter++)); // print 6, counter baru jadi 7
        counter = 5; // reset
        System.out.println("Pre-decrement (--counter): " + (--counter)); // counter jadi 4, print 4
        System.out.println("Post-decrement (counter--): " + (counter--)); // print 4, counter baru jadi 3

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST INCREMENT ===");

        int a = 10, b = 10;
        int result1 = ++a; // pre-increment: a jadi 11, lalu disimpan ke result1
        System.out.println("a: " + a + ", result1: " + result1);
        int result2 = b++; // post-increment: b disimpan dulu (10), baru b jadi 11
        System.out.println("b: " + b + ", result2: " + result2);

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\n=== PERILAKU PRE vs POST DECREMENT ===");

        int x = 8, y = 8;
        System.out.println("Pre-decrement --x: " + (--x)); // x jadi 7, print 7
        System.out.println("x sekarang: " + x);
        System.out.println("Post-decrement y--: " + (y--)); // print 8, y baru jadi 7
        System.out.println("y sekarang: " + y);

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\n=== UNARY PLUS DAN MINUS ===");

        int positive = 42;
        int negative = -positive; // jadi -42
        int backToPositive = -negative; // balik ke 42
        int plusOp = +positive; // tidak berubah

        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative);
        System.out.println("backToPositive: " + backToPositive);
        System.out.println("plusOp: " + plusOp);

        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\n=== OPERATOR BOOLEAN NOT ===");

        boolean isReady = true;
        boolean isNotReady = !isReady;
        System.out.println("isReady: " + isReady);
        System.out.println("isNotReady: " + isNotReady);
        int number = 5;
        System.out.println("Apakah " + number + " != 0? " + (number != 0));
        boolean doubleNot = !!isReady;
        System.out.println("!!isReady: " + doubleNot); // hasilnya tetap true

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        int attempts = 0;
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);

        int lives = 3;
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);

        int i = 1;
        while (i <= 5) {
            System.out.println("Loop counter i: " + i++);
        }

        int countdown = 3;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown--);
        }

        // ===== SKENARIO MENANTANG =====
        System.out.println("\n=== SKENARIO MENANTANG ===");

        int value = 5;
        int complex1 = value++ + ++value;
        // Prediksi: value++ = 5, ++value = 7 (karena value sudah jadi 6 setelah post-increment)
        // Jadi hasil = 5 + 7 = 12, value akhir = 7
        System.out.println("complex1: " + complex1 + ", value akhir: " + value);

        value = 5;
        int complex2 = --value + value--;
        // Prediksi: --value = 4, value-- = 4 (lalu value jadi 3)
        // Jadi hasil = 4 + 4 = 8, value akhir = 3
        System.out.println("complex2: " + complex2 + ", value akhir: " + value);

        int score = 10;
        System.out.println("Math.max(++score, 12): " + Math.max(++score, 12)); // ++score = 11
        System.out.println("score sekarang: " + score);

        score = 10;
        System.out.println("Math.max(score++, 12): " + Math.max(score++, 12)); // pakai 10 dulu, lalu score jadi 11
        System.out.println("score sekarang: " + score);
    }
}