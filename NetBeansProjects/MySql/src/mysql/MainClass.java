/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

/**
 *
 * @author ReemaM
 */
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass extends JFrame {

    static MainClass frame = new MainClass();
    static JPanel current;

    public static void main(String[] args) {
        frame.setLayout(new BorderLayout());
        current = new JPanel();
        MainPanel();

        frame.setSize(400, 275);
        frame.setLocationRelativeTo(null); // Center the frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    static void MainPanel() {
        frame.remove(current);
        current = new MainPanel();
        frame.add(current);
        frame.setTitle("Databases");
        frame.setSize(400, 275);
        frame.validate();
    }

    static void showMaterialCode() {
        frame.remove(current);
        current = new TCILForm();
        frame.add(current);
        frame.setTitle("Material Code");
        frame.setSize(500, 300);
        frame.validate();
    }

    static void showAllopment() {
        frame.remove(current);
        current = new TCILForm2();
        frame.add(current);
        frame.setTitle("Allopment");
        frame.setSize(590, 300);
        frame.validate();
    }

    static void showInventory() {
        frame.remove(current);
        current = new TCILForm3();
        frame.add(current);
        frame.setTitle("Inventory");
        frame.setSize(500, 300);
        frame.validate();
    }

}
