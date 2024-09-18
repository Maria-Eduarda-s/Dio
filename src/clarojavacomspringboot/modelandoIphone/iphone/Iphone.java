package clarojavacomspringboot.modelandoIphone.iphone;

import clarojavacomspringboot.modelandoIphone.aparelhotelefonico.AparelhoTelefonico;
import clarojavacomspringboot.modelandoIphone.aparelhotelefonico.Contato;
import clarojavacomspringboot.modelandoIphone.navegadorinternet.NavegadorInternet;
import clarojavacomspringboot.modelandoIphone.reprodutormusical.Musica;
import clarojavacomspringboot.modelandoIphone.reprodutormusical.ReprodutorMusical;

public class Iphone extends Contato implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private Musica musica;

    public Iphone() {
        musica = new Musica();
    }
    @Override
    public void selecionarMusica(String nome){
        musica.setNome(nome);
        System.out.println("Música >" + nome + "< selecionada");
    }

    @Override
    public void tocar(){
        System.out.println("Tocando música >" + musica.getNome() + "<");
    }

    @Override
    public void pausar(){
        System.out.println("Música >" + musica.getNome() + "< pausada");
    }


    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar(String nome, String numero){
        setNome(nome);
        setNumero(numero);
        System.out.println("Ligando para " + nome + " " + numero);
    }

    @Override
    public void atender(){
        System.out.println("Atender a ligação");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de voz");
    }
}
