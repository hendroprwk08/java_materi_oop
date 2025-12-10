package latihan09_overriding_jswing;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> {
            FormPerpustakaan form = new FormPerpustakaan();
            form.setVisible(true);
        });
    }
}
