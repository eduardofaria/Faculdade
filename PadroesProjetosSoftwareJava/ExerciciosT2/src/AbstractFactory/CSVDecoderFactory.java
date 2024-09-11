package AbstractFactory;

public class CSVDecoderFactory extends DecoderFactory {
    @Override
    public RegistrarClienteDecoder createRegistrarClienteDecoder(){
        return new RegistrarClienteCSVDecoder();
    }

    @Override
    public RegistrarContaDecoder createRegistrarContaDecoder() {
        return new RegistrarContaCSVDecoder();
    }
}
