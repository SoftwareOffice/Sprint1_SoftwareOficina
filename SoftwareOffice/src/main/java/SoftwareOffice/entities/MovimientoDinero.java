package SoftwareOffice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="movimientoDinero ")


public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMovimientoDinero;

    @Column(name="montoMovimiento", length = 100, nullable = false)
    private double montoMovimiento;
    @Column(name="conceptoMovimiento", length = 100, nullable = false)
    private String conceptoMovimiento;
    @Column(name="usuarioRegistraMovimiento", length = 100, nullable = false)
    private String usuarioRegistraMovimiento;

    //metodo para montos negativos y positivos
    /*public void montosPosNeg(){

    }*/
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
