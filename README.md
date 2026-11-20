Ejercicio 3 - Sistema de Notificaciones Multiplataforma Básico

Explicación del programa

En este ejercicio se implementó el patrón de diseño Factory Method para enviar notificaciones por correo electrónico y SMS a través de un contrato común, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz Notificacion con el método enviar(String mensaje).
- Dos clases concretas (NotificacionCorreo y NotificacionSMS) que implementan Notificacion.
- Una clase abstracta FabricaNotificacion que define el método de fábrica crearNotificacion().
- Dos factorías concretas (FabricaNotificacionCorreo y FabricaNotificacionSMS) que devuelven cada tipo de notificación.

Luego, dentro del método main, se utilizan las factorías para crear las notificaciones y enviar los mensajes.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común para los canales de notificación.
- Delegar la instanciación de cada notificador concreto a su respectiva factoría.
- Hacer que el código cliente interactúe únicamente con la interfaz Notificacion y el método de fábrica.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
Enviando correo electrónico: Tu código de acceso es 4821.
Enviando SMS: Recordatorio de turno mañana a las 09:00.

Captura de pantalla

<img width="604" height="162" alt="image" src="https://github.com/user-attachments/assets/0008c130-017f-4bfa-9800-60ca79001a8d" />
