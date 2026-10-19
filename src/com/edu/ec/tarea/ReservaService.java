package com.edu.ec.tarea;

public class ReservaService {

    public void reservar(Reserva reserva) {
        System.out.println("Procesando reserva de hotel");
        System.out.println("Cliente: " + reserva.getCliente());
        System.out.println("Habitación: " + reserva.getHabitacion());
        System.out.println("Dias: " + reserva.getDias());
        System.out.println("Teléfono: " + reserva.getTelefono());
        System.out.println("Reserva procesada con exito");

        SmsService smsService = new SmsService();
        String mensaje = "Estimado " + reserva.getCliente() + ", su reserva para la habitacion " + 
                reserva.getHabitacion() + " por " + reserva.getDias() + " dias ha sido confirmada.";
        
        smsService.enviarSms(reserva.getTelefono(), mensaje);
    }

}
