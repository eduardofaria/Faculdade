package AbstractFactory;
//Fábrica Abstrata de Decodificadores
public abstract class DecoderFactory {
    public abstract RegistrarClienteDecoder createRegistrarClienteDecoder();
    public abstract RegistrarContaDecoder createRegistrarContaDecoder();

    //método estático que determinará a fábrica correta
    public static DecoderFactory fabricaParaOrigem(String origem){
        if ("X".equals(origem)){
            return new XMLDecoderFactory();
        } else if ("Y".equals(origem)) {
            return new CSVDecoderFactory();
        } else if ("Z".equals(origem)) {
            return new TextoFixoDecoderFactory();
        } else {
            throw new IllegalArgumentException("Origem desconhecida: " + origem);
        }
    }
}
