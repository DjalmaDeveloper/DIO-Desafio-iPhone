package models;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.printf("\nAcessando página %s\n", url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando nova aba ao navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador");
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("\nLigando para o número %s\n", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("\nSelecionando música %s\n", musica);
    }
    
}
