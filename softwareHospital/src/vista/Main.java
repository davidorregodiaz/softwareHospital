
package vista;

import controladora.Hospital;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    VentanaPrincipal obj = new VentanaPrincipal();
                    obj.setVisible(true);
                }
            });
    }
}
