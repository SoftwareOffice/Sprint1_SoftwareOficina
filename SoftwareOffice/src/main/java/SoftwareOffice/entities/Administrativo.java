package SoftwareOffice;

public class Administrativo  extends Empleado{

    private String rol;

    public Administrativo(String nombreEmpleado, String correoElectronico, String empresaEmpleado, String rol) {
        super(nombreEmpleado,correoElectronico,empresaEmpleado);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return super.toString() + "Administrativo{" + "rol=" + rol + '}';
    }

    
}

