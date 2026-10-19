package com.edu.ec.tarea;

public class Reserva {

    private String cliente;
    private String habitacion;
    private int dias;
    private String telefono;
    
    public Reserva() {
    }

    public Reserva(String cliente, String habitacion, int dias, String telefono) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.dias = dias;
        this.telefono = telefono;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   
    

    



}
