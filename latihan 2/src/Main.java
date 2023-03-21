import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Hewan dan menambahkan data hewan
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Kucing");
        Hewan.add("Anjing");
        Hewan.add("Kelinci");
        Hewan.add("Sapi");
        Hewan.add("Kambing");
        
       
        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Putih");
        DeleteHewan.add("Hitam");
        
        // Menghapus data hewan yang memiliki warna yang sama dengan data pada objek DeleteHewan
        for (String warna : DeleteHewan) {
            for (int i = 0; i < Hewan.size(); i++) {
                if (Hewan.get(i).toLowerCase().contains(warna.toLowerCase())) {
                    Hewan.remove(i);
                    i--;
                }
            }
        }
        
       
        System.out.println("Data Hewan setelah dihapus:");
        for (String hewan : Hewan) {
            System.out.println(hewan);
        }
    }
}