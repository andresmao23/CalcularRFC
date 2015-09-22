package vista;

import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author Mao
 */
public class InterfazContribuyente extends JFrame{
    
    private PanelDatos pd;
    private PanelResultado pr;
    
    public InterfazContribuyente(){
        setTitle("CALCULAR RFC");
        setSize(400, 450);
        //setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(2, 1));
        pd = new PanelDatos(this);
        add(pd);
        
        pr = new PanelResultado(this);
        add(pr);
    }

    //Getters and Setters
    public PanelDatos getPd() {
        return pd;
    }

    public void setPd(PanelDatos pd) {
        this.pd = pd;
    }

    public PanelResultado getPr() {
        return pr;
    }

    public void setPr(PanelResultado pr) {
        this.pr = pr;
    }
    
    
    
    public static void main(String[] args){
        InterfazContribuyente ic = new InterfazContribuyente();
        ic.setVisible(true);
    }
    
}
