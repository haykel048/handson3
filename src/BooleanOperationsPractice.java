public class BooleanOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: Operator AND (&&)
        boolean isLoggedIn = true;
        boolean hasPermission = false;

        boolean canAccessAdmin = isLoggedIn && hasPermission;
        System.out.println("User bisa akses admin panel? " + canAccessAdmin);

        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        // Latihan 2: Operator OR (||)
        boolean isWeekend = false;
        boolean isHoliday = true;

        boolean isDayOff = isWeekend || isHoliday;
        System.out.println("\nHari libur? " + isDayOff);

        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        // Latihan 3: Operator NOT (!)
        boolean isRaining = true;
        boolean isSunny = !isRaining;
        System.out.println("\nSedang hujan? " + isRaining);
        System.out.println("Cerah? " + isSunny);
        System.out.println("!!isRaining = " + (!!isRaining));
        System.out.println("!(5 > 3) = " + !(5 > 3));

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        boolean attendanceGood = true;
        boolean gradesHigh = false;
        boolean behaviorGood = true;

        boolean isOutstanding = attendanceGood && gradesHigh && behaviorGood;
        boolean isSatisfactory = attendanceGood && (gradesHigh || behaviorGood);
        boolean needsImprovement = !attendanceGood || !behaviorGood;

        System.out.println("Outstanding? " + isOutstanding);
        System.out.println("Memuaskan? " + isSatisfactory);
        System.out.println("Perlu perbaikan? " + needsImprovement);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        boolean hasKeyCard = true;
        boolean knowsPassword = false;
        boolean isAuthorizedTime = true;
        boolean isEmergency = false;

        boolean normalAccess = hasKeyCard && knowsPassword && isAuthorizedTime;
        boolean emergencyAccess = isEmergency || (hasKeyCard && isAuthorizedTime);
        boolean accessDenied = !(normalAccess || emergencyAccess);

        System.out.println("Akses normal? " + normalAccess);
        System.out.println("Akses darurat? " + emergencyAccess);
        System.out.println("Akses ditolak? " + accessDenied);

        // Latihan 6: Keputusan berdasarkan cuaca
        isRaining = false;
        boolean isSnowing = true;
        int temperature = -5;
        boolean isCloudy = true;

        boolean goodWeather = !isRaining && !isSnowing && temperature > 0;
        boolean needUmbrella = isRaining || (isCloudy && temperature > 20);
        boolean dangerousRoad = isSnowing || (isRaining && temperature < 5);

        System.out.println("\nCuaca bagus untuk outdoor? " + goodWeather);
        System.out.println("Perlu payung? " + needUmbrella);
        System.out.println("Jalan berbahaya? " + dangerousRoad);

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\n=== EVALUASI SHORT-CIRCUIT ===");

        int a = 5, b = 0;

        boolean safeCheck1 = (b != 0) && (a / b > 2);
        System.out.println("Short-circuit AND aman? " + safeCheck1);

        boolean safeCheck2 = (b == 0) || (a / b > 2);
        System.out.println("Short-circuit OR aman? " + safeCheck2);

        // Penjelasan: pada ekspresi pertama, (b != 0) = false, maka (a/b) tidak dievaluasi.
        // Pada ekspresi kedua, (b == 0) = true, maka (a/b) tidak dievaluasi.

        // Latihan 8: Simulasi short-circuit
        boolean expensiveCheck1 = false;
        boolean expensiveCheck2 = true;

        boolean resultAnd = expensiveCheck1 && expensiveCheck2;
        // Karena expensiveCheck1 = false, maka AND berhenti di awal (expensiveCheck2 tidak "dijalankan")
        boolean resultOr = expensiveCheck2 || expensiveCheck1;
        // Karena expensiveCheck2 = true, maka OR berhenti di awal (expensiveCheck1 tidak "dijalankan")

        System.out.println("Hasil simulasi AND short-circuit = " + resultAnd);
        System.out.println("Hasil simulasi OR short-circuit = " + resultOr);
    }
}