package SUPERclases;

public abstract class CanalMensajeria {
    private String destinatario;
    private String texto;

    public CanalMensajeria(String destinatario, String texto){
        this.destinatario=destinatario;
        this.texto=texto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getTexto() {
        return texto;
    }

    public abstract String enviarMensaje();

}
