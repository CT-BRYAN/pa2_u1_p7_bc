package com.edu.ec.tarea;

public class SmsService {

    public void enviarSms(String telefono, String mensaje) {
        System.out.println("Enviando SMS al número: " + telefono);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("sms enviado con éxito");
    }

}
