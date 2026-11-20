public class Main {
    public static void main(String[] args) {
        FabricaNotificacion fabricaCorreo = new FabricaNotificacionCorreo();
        Notificacion notifCorreo = fabricaCorreo.crearNotificacion();
        notifCorreo.enviar("Tu código de acceso es 4821.");

        FabricaNotificacion fabricaSMS = new FabricaNotificacionSMS();
        Notificacion notifSMS = fabricaSMS.crearNotificacion();
        notifSMS.enviar("Recordatorio de turno mañana a las 09:00.");
    }
}