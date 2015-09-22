package vista;

import com.toedter.calendar.JDateChooser;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import logica.Contribuyente;
import logica.RegistroFederalContribuyente;

/**
 *
 * @author Mao
 */
public class PanelDatos extends JPanel implements ActionListener {
    
    private InterfazContribuyente ic;

    private JLabel lblPrimerNombre;
    private JLabel lblSegundoNombre;
    private JLabel lblApellidoPaterno;
    private JLabel lblApellidoMaterno;
    private JLabel lblFechaNacimiento;

    private JTextField txtPrimerNombre;
    private JTextField txtSegundoNombre;
    private JTextField txtApellidoPaterno;
    private JTextField txtApellidoMaterno;

    private JDateChooser dateChooser;

    private JButton btnAceptar;
    private JButton btnCancelar;

    public PanelDatos(InterfazContribuyente ic) {
        lblPrimerNombre = new JLabel("Primer nombre:");
        lblSegundoNombre = new JLabel("Segundo nombre:");
        lblApellidoPaterno = new JLabel("Apellido paterno:");
        lblApellidoMaterno = new JLabel("Apellido materno:");
        lblFechaNacimiento = new JLabel("Fecha de nacimiento:");

        txtPrimerNombre = new JTextField(30);
        txtSegundoNombre = new JTextField(30);
        txtApellidoPaterno = new JTextField(30);
        txtApellidoMaterno = new JTextField(30);

        dateChooser = new JDateChooser();
        dateChooser.getDateEditor().setEnabled(false);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(this);
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(this);

        setLayout(new GridLayout(7, 2));
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
        add(lblFechaNacimiento);
        add(dateChooser);
        add(new JLabel(""));
        add(new JLabel(""));
        add(btnAceptar);
        add(btnCancelar);
        
        this.ic = ic;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {

            if (txtPrimerNombre.getText() == "" || txtSegundoNombre.getText() == "" || txtApellidoPaterno.getText() == "" || txtApellidoMaterno.getText() == "" || dateChooser.getDate() == null) {
                JOptionPane.showMessageDialog(this, "No se aceptan campos nulos", "Datos", JOptionPane.ERROR_MESSAGE);
            } else {
                Contribuyente contribuyente = new Contribuyente(txtPrimerNombre.getText(), txtSegundoNombre.getText(), txtApellidoPaterno.getText(), txtApellidoMaterno.getText(), dateChooser.getDate());
                RegistroFederalContribuyente rfc = new RegistroFederalContribuyente();
                
                ic.getPr().setLblResultado(rfc.calcularRFC(contribuyente));
            }

        } else if (e.getSource() == btnCancelar) {
            txtPrimerNombre.setText("");
            txtSegundoNombre.setText("");
            txtApellidoPaterno.setText("");
            txtApellidoMaterno.setText("");
            dateChooser.setDate(null);
        }
    }

}
