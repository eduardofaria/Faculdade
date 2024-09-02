package notificacao;

public class SMSNotificacao implements Notificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Mensagem Enviada por SMS: " + mensagem);
    }
}
