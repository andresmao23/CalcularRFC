package logica;

/**
 *
 * @author Mao
 */
public class RegistroFederalContribuyente {

    public RegistroFederalContribuyente() {
    }
    
    //Mis métodos
    public String calcularRFC(Contribuyente c){
        String cadena = c.getApellidoPaterno().substring(0, 1)+c.getApellidoMaterno().charAt(0)+c.getPrimerNombre().charAt(0)+"-"+c.getFechaNac().getYear()+c.getFechaNac().getMonth()+c.getFechaNac().getDay();
        String rfc = cadena.toUpperCase();
        return rfc;
    }
    
}
