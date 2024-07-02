package aparelho.reprodutormusical;

public class Spotify implements ReprodutorMusical{
    public void tocar(){
        System.out.println("tocando a musica");
    }
    public void pausar(){
        System.out.println("Pausando a musica");
    }    
    public void selecionarMusica(){
        System.out.println("Selecionar musica");
    }
    
}
