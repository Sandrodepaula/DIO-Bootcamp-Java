classDiagram
    Iphone --|> ReprodutorMusical
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegadorInternet
    NavegadorInternet <|-- GoogleMaps
    AparelhoTelefonico <|-- Whatsapp
    ReprodutorMusical <|-- Spotify
    
  
    class ReprodutorMusical{
      +selecionarMusica(String musica)
      +tocar()
      +pausar()
      
    }
    class AparelhoTelefonico{
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class NavegadorInternet{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
    class GoogleMaps{

    }
    class Whatsapp{

    }
    class Spotify{

    }
