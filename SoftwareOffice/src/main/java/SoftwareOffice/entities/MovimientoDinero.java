package SoftwareOffice;

public class MovimientoDinero {

    private double montoMovimiento;
    private String conceptoMovimiento;
    private String usuarioRegistraMovimiento;

    //metodo para montos negativos y positivos
    public void montosPosNeg(){

    }
    //metodo para usuario encargado de registrar movimiento


    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
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
