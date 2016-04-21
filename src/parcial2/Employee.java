/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.Date;

/**
 *
 * @author Camilo
 */
public abstract class Employee extends Person {
    private int oficina;
    private String fechacontratacion;

    public Employee(int oficina, String fechacontratacion, String nombre, String apellido, int salario) {
        super(nombre, apellido, salario);
        this.oficina = oficina;
        this.fechacontratacion = fechacontratacion;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public String getFechacontratacion() {
        return fechacontratacion;
    }

    public void setFechacontratacion(String fechacontratacion) {
        this.fechacontratacion = fechacontratacion;
    }

    
   
    
}
