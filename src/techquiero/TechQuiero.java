
package techquiero;

import javax.swing.JFrame;


public class TechQuiero {


    public static void main(String[] args) {
        Tienda t = new Tienda("Proyecto :)");
        
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        t.setBounds(100, 30, 1000, 700);
        
        t.setVisible(true);
    }
    
}
