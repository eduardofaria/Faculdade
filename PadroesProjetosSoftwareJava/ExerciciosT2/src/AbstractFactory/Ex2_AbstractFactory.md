## Abstract Factory
Exercício passo a passo para ajudar a entender o padrão de projeto **Abstract Factory** usando o contexto de decodificadores de mensagens.

### Objetivo do Exercício

O objetivo é criar uma estrutura que utilize o padrão Abstract Factory para criar diferentes tipos de **decodificadores de mensagens** para três formatos de entrada diferentes: **XML**, **CSV**, e **Texto Fixo**. Cada tipo de decodificador será responsável por decodificar mensagens de cliente e de conta a partir dos formatos específicos.

### Estrutura do Exercício

1. **Defina a Fábrica Abstrata (`DecoderFactory`).**
2. **Implemente as Fábricas Concretas (`XMLDecoderFactory`, `CSVDecoderFactory`, `TextoFixoDecoderFactory`).**
3. **Defina os Produtos Abstratos (`RegistrarClienteDecoder`, `RegistrarContaDecoder`).**
4. **Implemente os Produtos Concretos (decodificadores específicos para cada formato).**
5. **Crie a classe Cliente para testar o padrão.**

### Passos do Exercício

#### Passo 1: Definir a Fábrica Abstrata `DecoderFactory`

**Tarefa:** Crie uma classe abstrata `DecoderFactory` que declare métodos abstratos para criar dois tipos de decodificadores:
- `createRegistrarClienteDecoder()`
- `createRegistrarContaDecoder()`

Esses métodos serão usados para criar os produtos (decodificadores) específicos.

#### Passo 2: Implementar as Fábricas Concretas

**Tarefa:** Crie três classes concretas que estendem `DecoderFactory`:

1. **`XMLDecoderFactory`**: Implementa os métodos para criar decodificadores de mensagens XML.
2. **`CSVDecoderFactory`**: Implementa os métodos para criar decodificadores de mensagens CSV.
3. **`TextoFixoDecoderFactory`**: Implementa os métodos para criar decodificadores de mensagens de Texto Fixo.

**Dica:** Cada fábrica concreta retornará um objeto que implementa as interfaces `RegistrarClienteDecoder` e `RegistrarContaDecoder` para o formato correspondente.

#### Passo 3: Definir os Produtos Abstratos

**Tarefa:** Crie duas interfaces abstratas que definem os métodos que todos os decodificadores de cliente e de conta devem implementar:

1. **`RegistrarClienteDecoder`**: Interface para o decodificador de mensagens de cliente.
2. **`RegistrarContaDecoder`**: Interface para o decodificador de mensagens de conta.

Cada decodificador concreto implementará uma dessas interfaces.

#### Passo 4: Implementar os Produtos Concretos

**Tarefa:** Implemente as classes concretas que representam os decodificadores específicos para cada formato de mensagem:

1. **Para XML:**
   - `RegistrarClienteXMLDecoder` implementa `RegistrarClienteDecoder`
   - `RegistrarContaXMLDecoder` implementa `RegistrarContaDecoder`

2. **Para CSV:**
   - `RegistrarClienteCSVDecoder` implementa `RegistrarClienteDecoder`
   - `RegistrarContaCSVDecoder` implementa `RegistrarContaDecoder`

3. **Para Texto Fixo:**
   - `RegistrarClienteTextoFixoDecoder` implementa `RegistrarClienteDecoder`
   - `RegistrarContaTextoFixoDecoder` implementa `RegistrarContaDecoder`

Cada classe concreta deve implementar métodos para "decodificar" uma mensagem (exemplo: um método `decodificar()` que imprime uma mensagem simulando a decodificação).

#### Passo 5: Criar a Classe Cliente para Testar o Padrão

**Tarefa:** Crie uma classe `Main` que utiliza a classe `DecoderFactory` para escolher a fábrica adequada com base em uma origem fornecida (`"X"`, `"Y"`, `"Z"`). Em seguida, use a fábrica selecionada para criar e usar os decodificadores de clientes e de contas.

**Dica:** Implemente um método `fabricaParaOrigem(String origem)` na classe `DecoderFactory` que retorna a fábrica correta com base no parâmetro de entrada.

### Passo a Passo Final

1. **Crie a classe abstrata `DecoderFactory` com métodos abstratos.**
2. **Implemente as fábricas concretas (`XMLDecoderFactory`, `CSVDecoderFactory`, `TextoFixoDecoderFactory`).**
3. **Crie interfaces para os produtos abstratos (`RegistrarClienteDecoder`, `RegistrarContaDecoder`).**
4. **Implemente os produtos concretos (`RegistrarClienteXMLDecoder`, `RegistrarContaXMLDecoder`, etc.).**
5. **Crie a classe `Main` para testar o padrão, criando objetos de fábrica concretos e utilizando os métodos de decodificação.**

### Exemplo de Uso Esperado

Quando o cliente (classe `Main`) solicitar uma fábrica para a origem `"X"` (XML), o sistema deverá criar uma instância de `XMLDecoderFactory` e usar os decodificadores de XML correspondentes.

### Resultado Esperado

Ao finalizar o exercício, você terá uma compreensão mais profunda de como o padrão **Abstract Factory** pode ser aplicado para criar famílias de objetos relacionados de maneira consistente e flexível, utilizando o exemplo de decodificadores de mensagens.




Vamos entender de forma abstrata o que está acontecendo no exercício, qual é a necessidade do cliente, o que é um "decodificador" e o que esse exercício representa no mundo real.

### Visão Geral do Exercício

**O que estamos fazendo de fato?**

No exercício, estamos aplicando o padrão de projeto **Abstract Factory** para criar uma estrutura flexível que permita a criação de diferentes tipos de "decodificadores" de mensagens para diferentes formatos de entrada (XML, CSV, Texto Fixo). Estamos criando uma "fábrica" que é responsável por criar objetos (neste caso, decodificadores) que pertencem a uma **família** de tipos de objetos relacionados.

### O Que o Cliente Precisa?

O **cliente** (a aplicação principal) precisa de um mecanismo para **decodificar mensagens** que podem vir em diferentes formatos (por exemplo, XML, CSV, Texto Fixo). Essas mensagens podem conter dados diferentes, como informações de clientes ou contas, e o cliente quer processar esses dados de forma adequada de acordo com o formato da mensagem.

### O Que é um Decodificador?

Um **decodificador** (ou **parser**) é um componente de software que **interpreta** e **converte** dados de um formato específico em uma estrutura de dados utilizável. Por exemplo, um decodificador de XML interpreta uma mensagem XML e a converte em um objeto ou estrutura que pode ser usada pela aplicação.

**No contexto deste exercício, um decodificador é:**
- Uma classe que "entende" um formato de mensagem específico (XML, CSV, Texto Fixo).
- Ele possui a lógica para extrair e processar dados a partir desse formato.

### Exemplo do Mundo Real Representado pelo Exercício

Vamos considerar um exemplo do mundo real para entender melhor o propósito do exercício.

**Exemplo do Mundo Real: Processamento de Arquivos de Importação de Dados**

Imagine um sistema que precisa importar dados de diferentes fontes de entrada. Os dados podem ser fornecidos por diferentes sistemas externos, cada um usando um formato específico para seus arquivos de exportação. Por exemplo:

1. **Sistema A** exporta dados de clientes e contas no formato **XML**.
2. **Sistema B** exporta dados no formato **CSV**.
3. **Sistema C** usa um formato **Texto Fixo** (onde cada campo tem um comprimento fixo).

O seu sistema precisa **importar** esses dados, **decodificá-los** para entender o conteúdo e **processá-los**. Como o formato de entrada varia, o sistema precisa de **decodificadores específicos** para cada formato. É aqui que entra o padrão Abstract Factory.

### Abstraindo o Exercício

No exercício:

- **Fábricas Concretas (Concrete Factories):** `XMLDecoderFactory`, `CSVDecoderFactory`, `TextoFixoDecoderFactory` são responsáveis por criar decodificadores específicos que entendem como interpretar dados em seus formatos.
- **Produtos Concretos:** `RegistrarClienteXMLDecoder`, `RegistrarContaXMLDecoder`, etc., são os decodificadores que fazem o trabalho real de converter os dados de entrada no formato desejado para uma estrutura interna de dados.
- **Cliente:** O código do cliente simplesmente pede à fábrica apropriada o decodificador certo e não precisa se preocupar com os detalhes de como o decodificador faz seu trabalho.

### O Que o Cliente Precisa?

O cliente precisa de uma forma **genérica** e **flexível** de decodificar diferentes tipos de mensagens sem precisar conhecer os detalhes específicos de cada formato. Isso permite que o cliente mude a fábrica ou suporte novos formatos de entrada no futuro sem precisar modificar o código existente.

### Resumindo: O Que Estamos Criando?

- **Estamos criando um sistema flexível e extensível para importar dados de diferentes formatos.**
- **O cliente precisa de uma maneira de decodificar dados de diferentes formatos sem se preocupar com os detalhes de implementação.**
- **Um decodificador é um componente que transforma um formato de entrada específico em um formato utilizável pelo sistema.**

### Esperança para Clareza

Com esse entendimento, o exercício deve fazer mais sentido. A aplicação do padrão Abstract Factory permite que o sistema cresça e se adapte a novos requisitos de entrada de dados sem quebrar a lógica existente. Este é o poder do design orientado a objetos e dos padrões de projeto!