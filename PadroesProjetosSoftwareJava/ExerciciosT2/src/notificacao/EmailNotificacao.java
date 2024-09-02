package notificacao;

public class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando notificação por Email:" + mensagem);
    }
}
