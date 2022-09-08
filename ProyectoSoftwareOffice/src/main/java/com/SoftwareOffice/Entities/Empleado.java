package com.SoftwareOffice.Entities;
@Table(name="empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idEmpleado;

    @Column(name="nombresEmpleado", length = 100, nullable = false)
    protected String nombreEmpleado;
    @Column(name="Email", length = 100, nullable = false)
    protected String correoElectronico;
    @Column(name=" NombreEmpresa", length = 100, nullable = false)
    protected String empresaEmpleado;
    @Column(name="rol", length = 100, nullable = false)
    private String rol;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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