public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual:" + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo canal:" + smartTv.canal);

        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("TV ligada?" + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
    }
}
