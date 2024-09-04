package notificacao;
//Concrete Creator
public class EmailNotificacaoFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new EmailNotificacao();
    }
}
