package set.OperaçoesBasicas;

import java.util.Objects;

public class Convidado {
    //Atributos
    private String nome;
    private int cogigoConvite;

    public Convidado(String nome, int cogigoConvite) {
        this.nome = nome;
        this.cogigoConvite = cogigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return cogigoConvite;
    }

    //Metodo para remover a duplicidade do codigoConvite
    public boolean equals(Object o ){ 
        if(this == o) return true;
        if(!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    public int hashCode(){
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", cogigoConvite=" + cogigoConvite + "]";
    }
    
    
    
}
