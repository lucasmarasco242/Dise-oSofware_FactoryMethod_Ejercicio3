public class FabricaNotificacionSMS extends FabricaNotificacion {
    public Notificacion crearNotificacion() {
        return new NotificacionSMS();
    }
}