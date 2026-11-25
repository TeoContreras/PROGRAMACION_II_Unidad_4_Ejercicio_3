package SUBclases;

import SUPERclases.CanalMensajeria;

public class CanalSMS extends CanalMensajeria {
    public CanalSMS(String destinatario, String texto){
        super(destinatario,texto);
    }

    @Override
    public String enviarMensaje() {
        return "Mensaje de "+getDestinatario()+"\n"+getTexto();
    }
}
