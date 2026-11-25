package ORGANIZADOR;

import SUPERclases.CanalMensajeria;

import java.util.ArrayList;
import java.util.List;

public class ServicioNotificaciones {

    public void notificacion(List<CanalMensajeria> mensajes){

        for (CanalMensajeria msg : mensajes) {
            System.out.println("-------------------");
            System.out.println("Nueva notificacion!");
        System.out.println(msg.enviarMensaje());
        }
    }
}
