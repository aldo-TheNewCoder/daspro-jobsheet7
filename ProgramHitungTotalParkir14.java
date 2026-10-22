import java.util.Scanner;

public class ProgramHitungTotalParkir14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================PROGRAM HITUNG TOTAL PENDAPAAN PARKIR===================");
        int jenis,durasi,total=0,totalSem = 0;

        do  {
            System.out.println("Masukkan jenis kendaraan (1/2), masukkan '0' jika ingin mengakhiri program");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir");
                durasi = sc.nextInt();
                if (jenis == 1) {
                     totalSem = durasi * 3000;
                System.out.println("Total bayar :" + totalSem);
                } else {
                totalSem = durasi * 2000; 
                System.out.println("Total bayar :" + totalSem);
            } total += totalSem;
            } 

        } while(jenis != 0);

        System.out.println("=========================LAPORAN PENDAPATAN PARKIR=========================");
        System.out.println("Total pendapatan parkir :" + total);
        System.out.println("=============================PROGRAM BERAKHIR==============================");

    }
}
