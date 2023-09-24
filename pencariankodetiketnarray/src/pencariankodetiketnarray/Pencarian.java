
package pencariankodetiketnarray; //sesuaikan dengan nama folder project
import java.util.Scanner; //library scanner untuk input sesuatu

public class Pencarian {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Pencarian Kode Tiket Pesawat");
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Tanggal Perjalanan (DD-MM-YYYY): ");
        String tanggal = scanner.nextLine();

        System.out.print("Masukkan kode tiket (contoh: BBBX-P1-035): ");
        String kodeTiket = scanner.nextLine();

        // Memisahkan kode tiket menjadi tujuan, kelas, nomor menu, dan nomor tiket
      
        String tujuan = kodeTiket.substring(0, 3);
        String kelas = kodeTiket.substring(3,4);
        String nomorMenu = kodeTiket.substring(5,7);
        String nomorTiket = kodeTiket.substring(8);
        
        int hargaTiket;
        int diskon = 0;
        int hargaMenu = 0;
        int hargaPerjalanan = 0;
        String kelasBangku = null;
        String tujuanPerjalanan = null ;
        String menu = null;
        String namaPemilik = null;
        
        // Mendeteksi kode tiket

        System.out.println("--------------------------");
        System.out.println("Terdeteksi");
        System.out.println("Kode Tujuan: " + tujuan);
        System.out.println("Tujuan Perjalanan: \n1. Jakarta-Yogya(AAA) \n2. Yogya-Jakarta(BBB) \n3. Jakarta-Solo(CCC) \n5. Solo-Jakarta(DDD)");
        
        if (tujuan.equals("AAA")) {
            tujuanPerjalanan = "Jakarta-Yogya";
            hargaPerjalanan = 350000;
            
        } else if (tujuan.equals("BBB")) {
            tujuanPerjalanan = "Jakarta-Yogya";
            hargaPerjalanan = 300000;
            
        } else if (tujuan.equals("CCC")) {
            tujuanPerjalanan = "Jakarta-Yogya";
            hargaPerjalanan = 375000;
            
        } else if (tujuan.equals("DDD")) {
            tujuanPerjalanan = "Jakarta-Yogya";
            hargaPerjalanan = 325000;
            
        }
        
        System.out.println("--------------------------");
        System.out.println("Kelas: " + kelas);
        System.out.println("Kelas: \n1. VIP (X) \n2. Bisnis (Y) \n3. Ekonomi (Z) ");
        if (kelas.equals("X")) {
            diskon = 20;// Harga untuk kelas VIP (X)
            kelasBangku = "VIP";
            
        } else if (kelas.equals("Y")) {
            diskon = 15;
            kelasBangku = "Bisnis";
            
        } else if (kelas.equals("Z")) {
            diskon = 10 ; // Harga untuk kelas VIP (X)
            kelasBangku = "Ekonomi";
            
        }
        
        System.out.println("--------------------------");
        System.out.println("Nomor Menu: " + nomorMenu);
        System.out.println("Menu: \n1. Paket A (P1) \n2. Paket B (P2) \n3. Paket C (P3) ");
        if (nomorMenu.equals("P1")) {
            menu = "Paket A";
            hargaMenu = 25000;
            
        } else if (nomorMenu.equals("P2")) {
            menu = "Paket A";
            hargaMenu = 37500;
            
        } else if (nomorMenu.equals("P3")) {
            menu = "Paket A";
            hargaMenu = 50000;
            
        }
        
        System.out.println("Nomor Tiket: "+nomorTiket);
        switch (nomorTiket) {
            case "035":
                namaPemilik = "Emir" ;
                
                break;
            case "036":
                if (nama.equals(namaPemilik = "Emri")){
                    System.out.println("Pemilik Tiket: "+namaPemilik);
                }
                break;
            case "037":
                if (nama.equals(namaPemilik = "Ganteng")){
                    System.out.println("Pemilik Tiket: "+namaPemilik);
                }
                
                break;
            default:
                break;
        }
        if (nama.equals(namaPemilik)){
            System.out.println("Pemilik Tiket: "+namaPemilik);
            // Menampilkan informasi serta total harga tiket
            System.out.println("--------------------------");
            System.out.println("\nInformasi Tiket:");
            System.out.println("Nama: " + nama);
            System.out.println("Tanggal Perjalanan: " + tanggal);
            System.out.println("Nomor Tiket: "+ nomorTiket);
            System.out.println("--------------------------");
            System.out.println("Tujuan Perjalanan: "+tujuanPerjalanan);
            System.out.println("Harga Perjalanan: "+ hargaPerjalanan);
            System.out.println("--------------------------");        
            System.out.println("Kelas : " + kelasBangku);
            System.out.println("Diskon : " + diskon +"%");
            System.out.println("--------------------------");        
            System.out.println("Menu : "+menu);
            System.out.println("Harga Menu : "+ hargaMenu);
            System.out.println("--------------------------");
            hargaTiket = hargaPerjalanan - (hargaPerjalanan * diskon / 100)+hargaMenu; 
            System.out.println("Total Harga Tiket: Rp " + hargaTiket);

            
        }else {
            System.out.println("--------------------------");
            System.out.println("Pemilik tidak diketahui atau data tidak ada"); 
            scanner.close();
        }
       
    }
    
}
