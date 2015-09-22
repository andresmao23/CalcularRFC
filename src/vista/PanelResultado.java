package vista;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Mao
 */
public class PanelResultado extends JPanel{
    
    private InterfazContribuyente ic;
    
    private JLabel lblResultado;
    
    public PanelResultado(InterfazContribuyente ic){
        lblResultado = new JLabel("Aqui su RFC", SwingConstants.CENTER);
        
        setLayout(new GridLayout(1, 1));
        TitledBorder border = BorderFactory.createTitledBorder("Panel Resultado");
        setBorder(border);

        //Adicionando los elementos al panel
        add(lblResultado);
        
        this.ic = ic;
    }

    public String getLblResultado() {
        return lblResultado.getText();
    }

    public void setLblResultado(String lblResultado) {
        this.lblResultado.setText(lblResultado);
    }    

}
