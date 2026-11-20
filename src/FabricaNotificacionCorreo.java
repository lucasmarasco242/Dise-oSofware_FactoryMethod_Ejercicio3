public class FabricaNotificacionCorreo extends FabricaNotificacion {
    public Notificacion crearNotificacion() {
        return new NotificacionCorreo();
    }
}