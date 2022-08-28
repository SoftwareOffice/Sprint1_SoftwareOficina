package SoftwareOffice;

public class MovimientoDinero {

    private float montoMovimiento;
    private String conceptoMovimiento;
    private String usuarioRegistraMovimiento;

    //metodo para montos negativos y positivos
    public float montoPositivoNegativo(float montoMovimiento){
        return montoMovimiento;
    }

    //metodo definir qué usuario fue encargado de registrar el movimiento.
    public String nombreUsuario(String usuarioRegistraMovimiento) {
        return usuarioRegistraMovimiento;
    }
    public float getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(float montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuarioRegistraMovimiento() {
        return usuarioRegistraMovimiento;
    }

    public void setUsuarioRegistraMovimiento(String usuarioRegistraMovimiento) {
        this.usuarioRegistraMovimiento = usuarioRegistraMovimiento;
    }
}
