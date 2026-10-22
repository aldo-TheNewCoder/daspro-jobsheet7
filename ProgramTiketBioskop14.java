import java.util.Scanner;
public class ProgramTiketBioskop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============PROGRAM PENJUALAN TIKET DAN PENDAPATAN HARIAN==============");
        int i = 0,jmlTiket = 0,hargaTiket = 50000,tiketTerjual = 0,totalPenjualan = 0,noPelanggan,totalBayar;

        do {
            System.out.println("Masukkan Nomor Pelanggan (Masukkan '0' jika bioskop sudah tutup) :");
            noPelanggan = sc.nextInt();
            if (noPelanggan == 0) {
                System.out.println("Program dihentikan dikarenakan bioskop sudah tutup");
                break;
            } 
            System.out.println("Masukkan jumlah tiket yang dibeli :");
            jmlTiket = sc.nextInt();

            if (jmlTiket > 10) {
                totalBayar = (hargaTiket * jmlTiket) - (hargaTiket * jmlTiket * 15/100);
                System.out.println("Total yang harus dibayar adalah : Rp" + totalBayar);
            } else if (jmlTiket > 4) {
                totalBayar = (hargaTiket * jmlTiket) - (hargaTiket * jmlTiket * 10/100);
                System.out.println("Total yang harus dibayar adalah : Rp" + totalBayar);
            } else if (jmlTiket > 0) {
                totalBayar = hargaTiket * jmlTiket;
                System.out.println("Total yang harus dibayar adalah : Rp" + totalBayar);
            } else {
                System.out.println("Jumlah tiket tidak valid, silahkan input ulang");
                continue;
            } 
            tiketTerjual += jmlTiket;
            totalPenjualan += totalBayar;

        } while(true);
        
        System.out.println("=====================LAPORAN PENJUALAN TIKET HARIAN=====================");
        System.out.println("Total tiket yang terjual hari ini adalah :" + tiketTerjual);
        System.out.println("Total pendapatan hari ini adalah : Rp" + totalPenjualan);
        System.out.println("=============================PROGRAM SELESAI============================");
    } 
}