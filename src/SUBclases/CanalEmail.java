package SUBclases;

import SUPERclases.CanalMensajeria;

public class CanalEmail extends CanalMensajeria {


    public CanalEmail(String destinatario, String texto){
        super(destinatario,texto);
    }

    @Override
    public String enviarMensaje() {
        return "Email\nDestinatario:@"+getDestinatario()+"\n"+getTexto();
    }
}
