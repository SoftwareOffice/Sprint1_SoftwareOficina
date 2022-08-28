package SoftwareOffice;

public class Empleado {
    protected String nombreEmpleado;
    protected String correoElectronico;
    protected String empresaEmpleado;

    
    public Empleado(String nombreEmpleado, String correoElectronico, String empresaEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoElectronico = correoElectronico;
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", correoElectronico=" + correoElectronico + ", empresaEmpleado=" + empresaEmpleado + '}';
    }


}
