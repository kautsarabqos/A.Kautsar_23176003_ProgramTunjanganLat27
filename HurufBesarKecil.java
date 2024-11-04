public class HurufBesarKecil {

    public static void main(String[] args) {
        // Input dari pengguna
        String kalimat = "aPA aku dI MArs?";
        
        // Memanggil fungsi formatKalimat
        formatKalimat(kalimat);
        
        // Simulasi BUILD SUCCESSFUL
        System.out.println("BUILD SUCCESSFUL time: 2 menit");
    }

    public static void formatKalimat(String input) {
        // Mengubah ke huruf besar
        String hurufBesar = input.toUpperCase();
        
        // Mengubah ke huruf kecil
        String hurufKecil = input.toLowerCase();
        
        // Menampilkan hasil
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar: " + hurufBesar);
        System.out.println("Huruf Kecil: " + hurufKecil);
    }
}