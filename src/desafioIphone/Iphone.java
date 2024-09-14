package desafioIphone;
public class Iphone implements AparelhoCelular, NavegadorNaInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo conexão");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMúsica (String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public static void main(String[] args) {
      
        Iphone meuIphone = new Iphone();

    
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        meuIphone.exibirPagina("https://open.spotify.com/intl-pt/artist/4i0SjpbBjUgLY2QLzYliOP");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMúsica("Major RD");
    }
}
