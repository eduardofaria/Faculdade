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