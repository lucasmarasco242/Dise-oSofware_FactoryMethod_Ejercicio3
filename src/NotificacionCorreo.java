public class NotificacionCorreo implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando correo electrónico: " + mensaje);
    }
}