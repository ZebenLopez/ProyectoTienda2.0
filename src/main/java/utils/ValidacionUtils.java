package utils;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Zeben
 * @author Lorena
 * @version 1.0
 */
public class ValidacionUtils {
    public static void createJOptionPanel(String mensaje, String titulo, int type) {
        JOptionPane panelTemporal = new JOptionPane(mensaje, type);
        JDialog dialog = panelTemporal.createDialog(null, titulo);
        dialog.setVisible(true);
    }
}
