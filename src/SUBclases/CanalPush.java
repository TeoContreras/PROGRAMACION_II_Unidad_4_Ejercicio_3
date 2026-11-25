package SUBclases;

import SUPERclases.CanalMensajeria;

public class CanalPush extends CanalMensajeria {
    public CanalPush(String destinatario, String texto){
        super(destinatario,texto);
    }

    @Override
    public String enviarMensaje() {
        return "Push de "+getDestinatario()+"\n"+getTexto();
    }
}
