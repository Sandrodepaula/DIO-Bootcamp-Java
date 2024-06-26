import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class Computador {
    public static void main(String[] args) throws Exception {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "fbm";

        if (appEscolhido.equals ("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();
        
        smi.enviarMensagem();
        smi.receberMensagem();
        
    }
}
