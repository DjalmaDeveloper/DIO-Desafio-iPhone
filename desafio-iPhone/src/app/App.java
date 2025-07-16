package app;

import java.util.Scanner;

import models.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciando iPhone");
        Iphone iphone = new Iphone();
        
        while (true){
            System.out.println("Escolha uma função:");
            System.out.println("1 - Navegador de Internet");
            System.out.println("2 - Aparelho Telefônico");
            System.out.println("3 - Reprodutor Musical");
            System.out.println("0 - Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a URL da página:");
                    String url = sc.next();
                    iphone.exibirPagina(url);
                    iphone.adicionarAba();
                    iphone.atualizarPagina();
                break;
                case 2:
                    System.out.println("Digite o número para ligar:");
                    String numero = sc.next();
                    iphone.ligar(numero);
                    iphone.atender();
                    iphone.iniciarCorreioVoz();
                break;
                case 3:
                    System.out.println("Digite o nome da música:");
                    sc.nextLine(); // Consumir a quebra de linha pendente
                    String musica = sc.nextLine();
                    iphone.selecionarMusica(musica);
                    iphone.tocar();
                    iphone.pausar();
                break;
                case 0:
                    System.out.println("Saindo do iPhone...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
