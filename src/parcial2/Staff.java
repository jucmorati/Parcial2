/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Camilo
 */
public class Staff extends Employee{
    private String titulo;

    public Staff(String titulo, int oficina, String fechacontratacion, String nombre, String apellido, int salario) {
        super(oficina, fechacontratacion, nombre, apellido, salario);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
