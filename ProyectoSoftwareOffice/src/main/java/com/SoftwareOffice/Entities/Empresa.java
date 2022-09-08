package com.SoftwareOffice.Entities;

import javax.persistence.*;

    @Entity
    @Table(name="empresa")
    public class Empresa {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer nit;
        @Column(name="nombres empresa", length = 100, nullable = false)
        private String nombre;
        @Column(name="direccion", length = 100, nullable = false)
        private String direccion;
        @Column(name="telefono", length = 100, nullable = false)
        private String  telefono;

        public Integer getNit() {
            return nit;
        }

        public void setNit(Integer nit) {
            this.nit = nit;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }
