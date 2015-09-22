package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Mao
 */
public class PanelDatos extends JPanel implements ActionListener{
    
    private JLabel lblPrimerNombre;
    private JLabel lblSegundoNombre;
    private JLabel lblApellidoPaterno;
    private JLabel lblApellidoMaterno;
    
    private JTextField txtPrimerNombre;
    private JTextField txtSegundoNombre;
    private JTextField txtApellidoPaterno;
    private JTextField txtApellidoMaterno;
    
    private JButton btnAceptar;
    private JButton btnCancelar;

    public PanelDatos() {
        lblPrimerNombre = new JLabel("Primer nombre:");
        lblSegundoNombre = new JLabel("Segundo nombre:");
        lblApellidoPaterno = new JLabel("Apellido paterno:");
        lblApellidoMaterno = new JLabel("Apellido materno:");
        
        txtPrimerNombre = new JTextField(30);
        txtSegundoNombre = new JTextField(30);
        txtApellidoPaterno = new JTextField(30);
        txtApellidoMaterno = new JTextField(30);
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(this);
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(this);
        
        setLayout(new GridLayout(5, 2));
        TitledBorder border = BorderFactory.createTitledBorder("Panel Datos");
        setBorder(border);
        
        //Adicionando los elementos al panel
        add(lblPrimerNombre);
        add(txtPrimerNombre);
        add(lblSegundoNombre);
        add(txtSegundoNombre);
        add(lblApellidoPaterno);
        add(txtApellidoPaterno);
        add(lblApellidoMaterno);
        add(txtApellidoMaterno);
        add(btnAceptar);
        add(btnCancelar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            System.out.println("Presionaste aceptar");
        }else if (e.getSource() == btnCancelar) {
            System.out.println("Presionaste cancelar");
        }
    }
    
    
    
}
