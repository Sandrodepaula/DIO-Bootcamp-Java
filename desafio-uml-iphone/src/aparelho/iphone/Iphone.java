package aparelho.iphone;

import aparelho.aparelhotelefonico.AparelhoTelefonico;
import aparelho.navegadorinternet.NavegadorInternet;
import aparelho.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical  {
    public void tocar(){

    }
    public void pausar(){

    }
    public void selecionarMusica(){

    }
    
    public void exibirPagina() {
       
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }
    
    public void adicionarNovaAba() {
        
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
    }
    
    public void atualizarPagina() {
      
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }
    
    public void iniciarCorreioVoz() {
       
        throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioVoz'");
    }
    
    public void ligar() {
        
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }
    
    public void atender() {
       
        throw new UnsupportedOperationException("Unimplemented method 'atender'");
    }
}