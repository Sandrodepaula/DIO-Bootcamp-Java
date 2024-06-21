package classes;


public class SistemaCadastro{
    public static void main(String[] args){
        //Criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("123", "Marcos");

        //definimos o endereço de marcos
        marcos.setEndereco("Rua das Marias");
        System.out.println(marcos.getNome() );
    }
} 

