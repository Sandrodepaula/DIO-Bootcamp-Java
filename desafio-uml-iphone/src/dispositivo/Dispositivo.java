package dispositivo;

import aparelho.iphone.Iphone;
import aparelho.reprodutormusical.ReprodutorMusical;

public class Dispositivo {
    public static void main(String[] args){
        Iphone em = new Iphone();

        ReprodutorMusical reprodutormusical = em;

        reprodutormusical.tocar();
    }
}
