**Factory Method**. Vou guiá-lo passo a passo, e a cada etapa, você deverá implementar a parte correspondente. O objetivo é criar um sistema de notificações onde cada tipo de notificação (e.g., Email, SMS) seja criado usando o padrão Factory Method.

### Exercício: Sistema de Notificações

**Contexto:** Suponha que você está desenvolvendo um sistema que pode enviar notificações aos usuários. Atualmente, o sistema suporta notificações por **Email** e **SMS**, mas deve ser flexível para adicionar novos tipos de notificação no futuro. Você decidirá usar o padrão Factory Method para criar as instâncias de notificação.

### Passo a Passo

#### **Passo 1: Criar a Interface `Notificacao`**

1. **Tarefa:** Crie uma interface chamada `Notificacao` que tenha um método `enviar(String mensagem)`, que será responsável por enviar a notificação.
2. **Dica:** Este método será implementado por todas as classes concretas de notificação.

```java
// Interface de Notificação
public interface Notificacao {
    void enviar(String mensagem);
}
```

Depois de criar a interface, passe para o próximo passo.

#### **Passo 2: Implementar Classes Concretas de Notificação**

1. **Tarefa:** Crie duas classes concretas que implementam a interface `Notificacao`:
   - `EmailNotificacao`: que implementa o método `enviar` para enviar uma notificação por e-mail.
   - `SMSNotificacao`: que implementa o método `enviar` para enviar uma notificação por SMS.
2. **Dica:** Use o método `System.out.println()` para simular o envio da notificação.

```java
// Classe concreta de Notificação por E-mail
public class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação por Email: " + mensagem);
    }
}

// Classe concreta de Notificação por SMS
public class SMSNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação por SMS: " + mensagem);
    }
}
```

Após implementar essas classes, passe para o próximo passo.

#### **Passo 3: Criar a Classe Abstrata `NotificacaoFactory`**

1. **Tarefa:** Crie uma classe abstrata chamada `NotificacaoFactory` que declara um método abstrato `criarNotificacao()`, que deve retornar um objeto do tipo `Notificacao`.
2. **Dica:** Esse método será implementado pelas subclasses para criar instâncias de notificações específicas.

```java
// Classe Abstrata de Notificação Factory
public abstract class NotificacaoFactory {
    public abstract Notificacao criarNotificacao();
}
```

Após criar a classe abstrata, prossiga para o próximo passo.

#### **Passo 4: Implementar as Fábricas Concretas de Notificação**

1. **Tarefa:** Crie duas classes concretas que estendem `NotificacaoFactory`:
   - `EmailNotificacaoFactory`: Implementa o método `criarNotificacao` para retornar uma instância de `EmailNotificacao`.
   - `SMSNotificacaoFactory`: Implementa o método `criarNotificacao` para retornar uma instância de `SMSNotificacao`.

```java
// Fábrica concreta para Notificação por E-mail
public class EmailNotificacaoFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new EmailNotificacao();
    }
}

// Fábrica concreta para Notificação por SMS
public class SMSNotificacaoFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new SMSNotificacao();
    }
}
```

Depois de implementar as fábricas concretas, continue para o próximo passo.

#### **Passo 5: Testar o Sistema de Notificações**

1. **Tarefa:** Crie uma classe `Main` com o método `main()` onde você usará as fábricas concretas para criar diferentes tipos de notificações e enviá-las.
2. **Dica:** Teste criando instâncias de `EmailNotificacaoFactory` e `SMSNotificacaoFactory` e use o método `enviar()` para enviar uma mensagem.

```java
public class Main {
    public static void main(String[] args) {
        NotificacaoFactory emailFactory = new EmailNotificacaoFactory();
        Notificacao email = emailFactory.criarNotificacao();
        email.enviar("Olá, esta é uma notificação por Email!");

        NotificacaoFactory smsFactory = new SMSNotificacaoFactory();
        Notificacao sms = smsFactory.criarNotificacao();
        sms.enviar("Olá, esta é uma notificação por SMS!");
    }
}
```

#### **Passo 6: Refletir sobre o Exercício**

1. **Tarefa:** Pense sobre as seguintes questões:
   - Como o padrão Factory Method ajuda a adicionar novos tipos de notificações no futuro?
   - Quais são as vantagens e desvantagens de usar o padrão Factory Method neste cenário?

Parabéns! Você concluiu o exercício. O padrão Factory Method permite adicionar novos tipos de notificações facilmente, criando novas subclasses de `NotificacaoFactory` e implementações de `Notificacao`, sem modificar o código existente.

Se precisar de mais explicações ou tiver dúvidas sobre algum passo, é só me avisar!