package SoftwareOffice;

public class Empleado {

    private String nombreEmpleado;
    private String correoElectronico;
    private String rolEmpleado;
    private String empresaEmpelado;

    public Empleado() {

    }

    public Empleado(String nombreEmpleado, String correoElectronico, String rolEmpleado, String empresaEmpelado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoElectronico = correoElectronico;
        this.rolEmpleado = rolEmpleado;
        this.empresaEmpelado = empresaEmpelado;
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

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public String getEmpresaEmpelado() {
        return empresaEmpelado;
    }

    public void setEmpresaEmpelado(String empresaEmpelado) {
        this.empresaEmpelado = empresaEmpelado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.nombreEmpleado, other.nombreEmpleado)) {
            return false;
        }
        if (!Objects.equals(this.correoElectronico, other.correoElectronico)) {
            return false;
        }
        if (!Objects.equals(this.rolEmpleado, other.rolEmpleado)) {
            return false;
        }
        if (!Objects.equals(this.empresaEmpelado, other.empresaEmpelado)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", correoElectronico=" + correoElectronico + ", rolEmpleado=" + rolEmpleado + ", empresaEmpelado=" + empresaEmpelado + '}';
    }

}
