package latihan02a_perkenalan_array_keyval;
import java.util.HashMap;
import java.util.Map;

public class Variabel {
    public static void main(String[] args) {
        String nama = "Yuanita";
        final String marga = "Siahaan";
        int usia = 23;

        // akan error, karena "final"
        // marga = "napitupulu";

        System.out.println(nama);
        System.out.println(marga);
        System.out.println(usia + " tahun");

        // array
        String[] mobil = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(mobil[2]);

        // atau menggunakan looping
        for (String x : mobil) {
            System.out.println(x);
        }

        // key value
        Map<String, String> map = new HashMap<>();
        map.put("ID001", "Rohan");
        map.put("ID002", "Kumar");
        System.out.println(map);

        // atau
        for (String i : map.values()) {
            System.out.println(i);
        }

        // menampilkan nilai "key" dan "value"
        for (String i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
        }
    }
}
