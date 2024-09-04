import notificacao.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        NotificacaoFactory emailFactory = new EmailNotificacaoFactory();
        Notificacao email = emailFactory.criarNotificacao();
        email.enviar("Teste de envio de email!");

        NotificacaoFactory SMSFactory = new SMSNotificacaoFactory();
        Notificacao SMS = SMSFactory.criarNotificacao();
        SMS.enviar("Teste enviado por SMS!");
    }
}
