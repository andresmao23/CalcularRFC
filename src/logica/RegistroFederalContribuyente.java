package logica;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mao
 */
public class RegistroFederalContribuyente {

    public RegistroFederalContribuyente() {
    }

    //Mis métodos
    public String calcularRFC(Contribuyente c) {
        String fechaNacimiento = dateToString(c.getFechaNac());
        String cadena = c.getApellidoPaterno().substring(0, 2) + c.getApellidoMaterno().charAt(0) + c.getPrimerNombre().charAt(0) + "-" + fechaNacimiento.substring(8, fechaNacimiento.length()) + fechaNacimiento.substring(3, 5)+ fechaNacimiento.substring(0, 2);
        String rfc = cadena.toUpperCase();
        return rfc;
    }

    public String dateToString(Date fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        String fec = formatoFecha.format(fecha);
        return fec;
    }

}
