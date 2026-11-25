import ORGANIZADOR.ServicioNotificaciones;
import SUBclases.CanalEmail;
import SUBclases.CanalPush;
import SUBclases.CanalSMS;
import SUPERclases.CanalMensajeria;

import java.util.ArrayList;
import java.util.List;

public class MAIN {
    public static void main(String[] args) {
        List<CanalMensajeria> elemento = new ArrayList<>();
        elemento.add(new CanalEmail("Mariano bondar","Hola como estas"));
        elemento.add(new CanalSMS("Abuela","veni come"));
        elemento.add(new CanalPush("Jorge","que es esto?"));

        ServicioNotificaciones servi = new ServicioNotificaciones();
        servi.notificacion(elemento);
    }
}
