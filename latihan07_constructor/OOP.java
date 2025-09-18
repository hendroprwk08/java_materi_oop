package latihan07_constructor;
public class OOP {
    public static void main(String[] args) {
        // CARA 1
        // panggil class langsung set pada constructor
        Mobil m = new Mobil(4, 1200, "Honda", "City");
        System.out.println(m.getMerek());
        System.out.println(m.getSeri());
        System.out.println(m.getCc());
        System.out.println(m.getRoda());

        // CARA 2
        // tidak diset pada constructor
        Mobil mbl = new Mobil();

        // set
        mbl.setMerek("Nissan");
        mbl.setSeri("Fairlady");

        // get
        System.out.println(mbl.getMerek());
        System.out.println(mbl.getSeri());
    }
}
