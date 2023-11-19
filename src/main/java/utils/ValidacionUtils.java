/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Zeben
 */
public class ValidacionUtils {

    public static void createJOptionPanel(String mensaje, String titulo, int type) {
        JOptionPane panelTemporal = new JOptionPane(mensaje, type);
        JDialog dialog = panelTemporal.createDialog(null, titulo);
        dialog.setVisible(true);
    }

}
