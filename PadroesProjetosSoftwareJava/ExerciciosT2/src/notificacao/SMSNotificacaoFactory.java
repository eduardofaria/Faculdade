package notificacao;

public class SMSNotificacaoFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new SMSNotificacao();
    }
    
}
