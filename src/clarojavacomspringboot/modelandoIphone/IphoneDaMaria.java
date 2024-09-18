package clarojavacomspringboot.modelandoIphone;

import clarojavacomspringboot.modelandoIphone.iphone.Iphone;

public class IphoneDaMaria {

    public static void main(String[] args){

        Iphone iphoneDaMaria = new Iphone();

        iphoneDaMaria.ligar("João", "(61) 99999-1234");
        iphoneDaMaria.atender();
        iphoneDaMaria.iniciarCorreioVoz();

        iphoneDaMaria.exibirPagina("www.google.com");
        iphoneDaMaria.adicionarNovaAba();
        iphoneDaMaria.atualizarPagina();

        iphoneDaMaria.selecionarMusica("Joker And The Thief - Wolfmother");
        iphoneDaMaria.tocar();
        iphoneDaMaria.pausar();

    }
}