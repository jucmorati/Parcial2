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
public class Faculty extends Employee{
    private String rango;

    public Faculty (String rango, int oficina, String fechacontratacion, String nombre, String apellido, int salario) {
        super(oficina, fechacontratacion, nombre, apellido, salario);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    
    
}
