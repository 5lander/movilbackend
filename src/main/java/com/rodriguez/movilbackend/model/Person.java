/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rodriguez.movilbackend.model;

import com.rodriguez.movilbackend.enums.EstadoCivil;
import com.rodriguez.movilbackend.enums.Sexo;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**I
 *
 * @author Usuario iTC
 */
@Entity
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    private String cedula;
    
    private String nombre;
    
    @Enumerated(EnumType.ORDINAL)
    private Sexo sexo;
    
    @Enumerated(EnumType.ORDINAL)
    private EstadoCivil estadoCivil;
    
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    
        public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }




    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the cedula fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        return !((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula)));
    }

    @Override
    public String toString() {
        return "com.rodriguez.movilbackend.model.Person[ id=" + cedula + " ]";
    }
    
}
