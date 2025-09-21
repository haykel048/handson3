public class MathOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Matematika
         */

        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        int num1 = 25;
        int num2 = 4;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2; // pembagian integer
        int remainder = num1 % num2; // modulus

        System.out.println("Penjumlahan: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Pengurangan: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Perkalian: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Pembagian (integer): " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Sisa bagi (modulus): " + num1 + " % " + num2 + " = " + remainder);

        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        int divInt = 17 / 5;
        double divFloat1 = 17.0 / 5;
        double divFloat2 = (double) 17 / 5;

        System.out.println("Pembagian integer 17 / 5 = " + divInt);
        System.out.println("Pembagian floating-point 17.0 / 5 = " + divFloat1);
        System.out.println("Pembagian dengan casting (double)17 / 5 = " + divFloat2);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\n=== KALKULASI PRAKTIS ===");

        double panjang = 12.5;
        double lebar = 8.3;
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        double hargaBarang = 15.99;
        int jumlahBarang = 3;
        double totalHarga = jumlahBarang * hargaBarang;
        double pajak = 0.08;
        double totalDenganPajak = totalHarga * (1 + pajak);

        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;

        int totalHari = 50;
        int minggu = totalHari / 7;
        int sisaHari = totalHari % 7;

        System.out.println("Luas persegi panjang = " + luas);
        System.out.println("Keliling persegi panjang = " + keliling);
        System.out.println("Total harga sebelum pajak = $" + totalHarga);
        System.out.println("Total harga setelah pajak (8%) = $" + String.format("%.2f", totalDenganPajak));
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(totalHari + " hari = " + minggu + " minggu dan " + sisaHari + " hari");

        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\n=== KALKULASI KOMPLEKS ===");

        double kecepatan = 65.5;
        double waktu = 2.75;
        double jarak = kecepatan * waktu;

        double pokok = 1000;
        double sukuBunga = 0.05;
        int tahun = 3;
        double jumlah = pokok * Math.pow((1 + sukuBunga), tahun);

        int nilai1 = 85, nilai2 = 92, nilai3 = 78, nilai4 = 96, nilai5 = 88;
        double rataRata = (nilai1 + nilai2 + nilai3 + nilai4 + nilai5) / 5.0;

        System.out.println("Jarak tempuh = " + jarak + " km");
        System.out.println("Jumlah setelah bunga majemuk = $" + String.format("%.2f", jumlah));
        System.out.println("Rata-rata nilai ujian = " + String.format("%.2f", rataRata));
    }
}