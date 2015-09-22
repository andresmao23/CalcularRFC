package vista;

import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author Mao
 */
public class InterfazContribuyente extends JFrame{
    
    private PanelDatos pd;
    
    public InterfazContribuyente(){
        setTitle("CALCULAR RFC");
        setSize(400, 450);
        //setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(2, 1));
        pd = new PanelDatos();
        add(pd);
    }
    
    public static void main(String[] args){
        InterfazContribuyente ic = new InterfazContribuyente();
        ic.setVisible(true);
    }
    
}
