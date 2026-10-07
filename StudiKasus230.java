import java.util.Scanner;

public class StudiKasus230 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = scanner.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenis = scanner.nextLine();

        System.out.print("Jumlah dokumen: ");
        int dokumen = scanner.nextInt();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara: ");
            int juara = scanner.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurang = 4 - dokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
        }
    }
}