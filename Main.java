import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int i, pilihan, angka1, angka2, hasil;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilihan: \n1. Penjumlahan\n2. Perkalian");
        System.out.print("Ketik angka yang mau dipilih: ");
        pilihan = sc.nextInt();
        System.out.println("==========================");

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan angka pertama: ");
                angka1 = sc.nextInt();
                System.out.print("Masukkan angka kedua: ");
                angka2 = sc.nextInt();
                hasil = angka1+angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                if (hasil % 2 == 0){
                    System.out.println(hasil + " adalah bilangan genap");
                } else {
                    System.out.println(hasil + " adalah bilangan ganjil");
                }
                break;
            case 2:
                System.out.print("Masukkan angka pertama: ");
                angka1 = sc.nextInt();
                System.out.print("Masukkan angka kedua: ");
                angka2 = sc.nextInt();
                hasil = angka1*angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                if (hasil % 2 == 0){
                    System.out.println(hasil + " adalah bilangan genap");
                } else {
                    System.out.println(hasil + " adalah bilangan ganjil");
                }
                break;
            default:
                break;
        }
    }
}
