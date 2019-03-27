
package techquiero;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Tienda extends JFrame{ 
    //campos
    private DefaultListModel<String> num, dlm;
    private JList<String> jlt1, jlt;
    private JScrollPane jsp1,jsp;
    private JTextField jtf;
    private JPanel panelBotones;
    private JButton jbtAgregar;
    private JButton jbtComprar;
    public static  JTextArea agregados = new JTextArea();
    private JTextArea cantidad = new JTextArea();
    static JTextField cant = new JTextField(15);
    private String textNum = "";
    static int numero;
    private JLabel foto;
    
    // campos para los parametros d tipo font
    private String nombreFuente;
    private int estiloFuente;
    private int tamFuente; 

     // constructor
    public Tienda(String titulo){
        super(titulo);
        
        
        
        this.setLayout(new FlowLayout());
        
    this.setLayout(new FlowLayout());
    
    
    Tienda();
    Libro();
    
    cantidad.setBounds(new Rectangle(100, 300, 250, 70));
       cantidad.setText("Cuantos libros quieres?");
       cantidad.setEditable(false);
       
       this.add(cantidad);
       cantidad.setBackground(Color.lightGray);
       
    
 
 num = new DefaultListModel();
    
    //elementos de la lista
        num.addElement("1");num.addElement("2");num.addElement("3");
        num.addElement("4");num.addElement("5");num.addElement("6");
        num.addElement("7");num.addElement("8");num.addElement("9"); 
        num.addElement("10");num.addElement("11");num.addElement("12"); 
        num.addElement("13");num.addElement("14");num.addElement("15");

        jlt1 = new JList(num);
        jlt1.setFixedCellWidth(20);
        jlt1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jlt1.setVisibleRowCount(4);
        
        jsp1 = new JScrollPane(jlt1);
        this.add(jsp1);

    
    dlm = new DefaultListModel();
    
    //elementos de la lista
        dlm.addElement("Microservicios");
        dlm.addElement("Patrones de diseño");
        dlm.addElement("Programación Orientada a Objetos");
        dlm.addElement("Aprendiendo Java");
        dlm.addElement("Aprendiendo Python");
        dlm.addElement("Big Data con Hadoop");
        dlm.addElement("IOS con Swift");
        dlm.addElement("Programación reactiva");
        dlm.addElement("Programación con C");
        dlm.addElement("Diseño de sistemas");
        
        jlt = new JList(dlm);
        jlt.setFixedCellWidth(220);
        jlt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jlt.setVisibleRowCount(4);       

        jsp = new JScrollPane(jlt);
        this.add(jsp);
        
        jtf = new JTextField(26);
        jtf.setEditable(false);
        this.add(jtf);
        
        //  panel de botones 
        panelBotones = new JPanel(new GridLayout(1,2)); 
        
        jbtAgregar = new JButton("Agregar al carrito");
        jbtComprar = new JButton("Comprar");
        
        panelBotones.add(jbtAgregar);
        panelBotones.add(jbtComprar);
        
        this.add(panelBotones);
        
        jlt.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                jtf.setText(jlt.getSelectedValue());
            }
        });
                 
        jlt1.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                jtf.setText(jlt.getSelectedValue());
                 textNum = jlt1.getSelectedValue();
                 numero = Integer.parseInt(textNum);
            
            }
        });
         
         
         jbtAgregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if(jlt.getSelectedValue().equals("Microservicios")){
                    nombreFuente = "Calibli Ligth";
                    estiloFuente =Font.BOLD;
                    tamFuente = 30;
                    agregados.setVisible(true);    
                    agregados.setBounds(new Rectangle(200, 350, 610, 300));
                    agregados.setText("LIBRO: Microservicios\r\nAUTOR: Christian Posta\r\nPrecio: $45.98\r\nCantidad: " + numero + "\r\n----------------- \r\n Total:" +  ( numero *  45.98));
                    agregados.setEditable(false);
                    agregados.setForeground(Color.black);
                    agregados.setFont(new Font(nombreFuente, estiloFuente, tamFuente) );
                    add(agregados);
                    agregados.setBackground(Color.LIGHT_GRAY);              
                }
                
            if(jlt.getSelectedValue().equals("Patrones de diseño")){
                    nombreFuente = "Calibli Ligth";
                    estiloFuente =Font.BOLD;
                    tamFuente = 30;
                    agregados.setVisible(true);    
                    agregados.setBounds(new Rectangle(200, 350, 610, 300));
                    agregados.setText("LIBRO: Patrones de diseño\r\nAUTOR: Markus Eisele\r\nPrecio: $72.80\r\nCantidad: " + numero + "\r\n----------------- \r\n Total:" +  ( numero * 72.80 ));
                    agregados.setEditable(false);
                    agregados.setForeground(Color.black);
                    agregados.setFont(new Font(nombreFuente, estiloFuente, tamFuente) );
                    add(agregados);
                    agregados.setBackground(Color.LIGHT_GRAY);              
                }   
              
            if(jlt.getSelectedValue().equals("Programación Orientada a Objetos")){
                    nombreFuente = "Calibli Ligth";
                    estiloFuente =Font.BOLD;
                    tamFuente = 30;
                    agregados.setVisible(true);    
                    agregados.setBounds(new Rectangle(200, 350, 610, 300));
                    agregados.setText("LIBRO: Programación Orientada a Objetos\r\nAUTOR: Richard Warbuton\r\nPrecio: $36.72\r\nCantidad: " + numero + "\r\n----------------- \r\n Total:" +  ( numero *  36.72));
                    agregados.setEditable(false);
                    agregados.setForeground(Color.black);
                    agregados.setFont(new Font(nombreFuente, estiloFuente, tamFuente) );
                    add(agregados);
                    agregados.setBackground(Color.LIGHT_GRAY);              
                }
            
            if(jlt.getSelectedValue().equals("Aprendiendo Java")){
                    nombreFuente = "Calibli Ligth";
                    estiloFuente =Font.BOLD;
                    tamFuente = 30;
                    agregados.setVisible(true);    
                    agregados.setBounds(new Rectangle(200, 350, 610, 300));
                    agregados.setText("LIBRO: Aprendiendo Java\r\nAUTOR: Ben Evans\r\nPrecio: $66.81\r\nCantidad: " + numero + "\r\n----------------- \r\n Total:" +  ( numero * 66.81 ));
                    agregados.setEditable(false);
                    agregados.setForeground(Color.black);
                    agregados.setFont(new Font(nombreFuente, estiloFuente, tamFuente) );
                    add(agregados);
                    agregados.setBackground(Color.LIGHT_GRAY);              
                }
            
            if(jlt.getSelectedValue().equals("Aprendiendo Python")){
                    nombreFuente = "Calibli Ligth";
                    estiloFuente =Font.BOLD;
                    tamFuente = 30;
                    agregados.setVisible(true);    
                    agregados.setBounds(new Rectangle(200, 350, 610, 300));
                    agregados.setText("LIBRO: Aprendiendo Python\r\nAUTOR: David Mertz\r\nPrecio: $43.27\r\nCantidad: " + numero + "\r\n----------------- \r\n Total:" +  ( numero * 43.27 ));
                    agregados.setEditable(false);
                    agregados.setForeground(Color.black);
                    agregados.setFont(new Font(nombreFuente, estiloFuente, tamFuente) );
                    add(agregados);
                    agregados.setBackground(Color.LIGHT_GRAY);              
                }
            
            if(jlt.getSelectedValue().equals("Big Data con Hadoop")){
                    nombreFuente = "Calibli Ligth";
                    estiloFuente =Font.BOLD;
                    tamFuente = 30;
                    agregados.setVisible(true);    
                    agregados.setBounds(new Rectangle(200, 350, 610, 300));
                    agregados.setText("LIBRO: Big Data con Hadoop\r\nAUTOR: Donald Miner\r\nPrecio: $39.60\r\nCantidad: " + numero + "\r\n----------------- \r\n Total:" +  ( numero * 39.60 ));
                    agregados.setEditable(false);
                    agregados.setForeground(Color.black);
                    agregados.setFont(new Font(nombreFuente, estiloFuente, tamFuente) );
                    add(agregados);
                    agregados.setBackground(Color.LIGHT_GRAY);              
                }
            
            if(jlt.getSelectedValue().equals("IOS con Swift")){
                    nombreFuente = "Calibli Ligth";
                    estiloFuente =Font.BOLD;
                    tamFuente = 30;
                    agregados.setVisible(true);    
                    agregados.setBounds(new Rectangle(200, 350, 610, 300));
                    agregados.setText("LIBRO: IOS con Swift\r\nAUTOR: Tim Nugent\r\nPrecio: $24.18\r\nCantidad: " + numero + "\r\n----------------- \r\n Total:" +  ( numero *  24.18));
                    agregados.setEditable(false);
                    agregados.setForeground(Color.black);
                    agregados.setFont(new Font(nombreFuente, estiloFuente, tamFuente) );
                    add(agregados);
                    agregados.setBackground(Color.LIGHT_GRAY);              
                }
            
            if(jlt.getSelectedValue().equals("Programación reactiva")){
                    nombreFuente = "Calibli Ligth";
                    estiloFuente =Font.BOLD;
                    tamFuente = 30;
                    agregados.setVisible(true);    
                    agregados.setBounds(new Rectangle(200, 350, 610, 300));
                    agregados.setText("LIBRO: Programación reactiva\r\nAUTOR: Konrad Malawski:\r\nPrecio: $58.70\r\nCantidad: " + numero + "\r\n----------------- \r\n Total:" +  ( numero * 58.70 ));
                    agregados.setEditable(false);
                    agregados.setForeground(Color.black);
                    agregados.setFont(new Font(nombreFuente, estiloFuente, tamFuente) );
                    add(agregados);
                    agregados.setBackground(Color.LIGHT_GRAY);              
                }
            
            if(jlt.getSelectedValue().equals("Programación con C")){
                    nombreFuente = "Calibli Ligth";
                    estiloFuente =Font.BOLD;
                    tamFuente = 30;
                    agregados.setVisible(true);    
                    agregados.setBounds(new Rectangle(200, 350, 610, 300));
                    agregados.setText("LIBRO: Programación con C\r\nAUTOR: Joel Falcou\r\nPrecio: $67.93\r\nCantidad: " + numero + "\r\n----------------- \r\n Total:" +  ( numero * 67.93));
                    agregados.setEditable(false);
                    agregados.setForeground(Color.black);
                    agregados.setFont(new Font(nombreFuente, estiloFuente, tamFuente) );
                    add(agregados);
                    agregados.setBackground(Color.LIGHT_GRAY);              
                }
            
            if(jlt.getSelectedValue().equals("Diseño de sistemas")){
                    nombreFuente = "Calibli Ligth";
                    estiloFuente =Font.BOLD;
                    tamFuente = 30;
                    agregados.setVisible(true);    
                    agregados.setBounds(new Rectangle(200, 350, 610, 300));
                    agregados.setText("LIBRO: Diseño de sistemas\r\nAUTOR: Doug Davis\r\nPrecio: $55.67\r\nCantidad: " + numero + "\r\n----------------- \r\n Total:" +  ( numero * 55.67 ));
                    agregados.setEditable(false);
                    agregados.setForeground(Color.black);
                    agregados.setFont(new Font(nombreFuente, estiloFuente, tamFuente) );
                    add(agregados);
                    agregados.setBackground(Color.LIGHT_GRAY);              
                }
            
            
            }
             
         }); // agregar
         
         jbtComprar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    buy();
                } catch (IOException ex) {
                    Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
                }  
              
            }
             
         }); // caomprar
          
    }//constructor   
    
    
  public static void buy() throws IOException {
        String cadena = agregados.getText();
        FileWriter file2 = null;
        PrintWriter desk = null;
        try {
            file2 = new FileWriter("C:\\Users\\pc\\Documents\\NetBeansProjects\\TechQuiero\\guardado.txt");
            desk = new PrintWriter(file2);

                desk.println(cadena);

                desk.println("\n \n ");
                JOptionPane.showMessageDialog(null, "Your purchase has been made successfully!\n The ticket was generated in this route:\n"
                        + "\"C:\\Users\\pc\\Documents\\NetBeansProjects\\TechQuiero\\guardado.txt\"");
            
        } catch
     (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            file2.close();
        }

    }
    
    
  private void Tienda(){

        foto = new JLabel();
        foto.setIcon(new ImageIcon("Imagenes/tienda.png"));
        foto.setBounds(0, 250, 300, 300);
        this.add(foto);
        //imag = "flor";
        foto.setVisible(true);
      
        
    }// tienda
  
  
  private void Libro(){

        foto = new JLabel();
        foto.setIcon(new ImageIcon("Imagenes/libro.png"));
        foto.setBounds(0, 950, 300, 300);
        this.add(foto);
        //imag = "flor";
        foto.setVisible(true);
      
        
    }// fotos
}// class

