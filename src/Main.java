import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ReprodutorMusical reprodutor = new ReprodutorMusical();
    private static final NavegadorInternet navegador = new NavegadorInternet();
    private static final AparelhoTelefonico telefone = new AparelhoTelefonico();

    public static void main(String[] args) {
        int opcao;

        do {
            opcao = menuPrincipal();
            switch (opcao) {
                case 1 -> menuReprodutor();
                case 2 -> menuNavegador();
                case 3 -> menuTelefone();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static int menuPrincipal() {
        System.out.println("\n------ MENU PRINCIPAL ------");
        System.out.println("1: Reprodutor de Música");
        System.out.println("2: Navegador de Internet");
        System.out.println("3: Telefone");
        System.out.println("0: Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    private static void menuReprodutor() {
        int opcao;
        do {
            System.out.println("\n------ REPRODUTOR DE MÚSICA ------");
            System.out.println("1: Tocar música");
            System.out.println("2: Selecionar música");
            System.out.println("3: Pausar música");
            System.out.println("0: Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1 -> reprodutor.tocar();
                case 2 -> {
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    System.out.println(reprodutor.selecionarMusica(musica));
                }
                case 3 -> reprodutor.pausar();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void menuNavegador() {
        int opcao;
        do {
            System.out.println("\n------ NAVEGADOR DE INTERNET ------");
            System.out.println("1: Exibir páginas abertas");
            System.out.println("2: Adicionar nova aba");
            System.out.println("3: Atualizar página");
            System.out.println("0: Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> System.out.println("Páginas abertas: " + navegador.exibirPaginas());
                case 2 -> {
                    System.out.print("Digite a URL da nova aba: ");
                    String novaAba = scanner.nextLine();
                    navegador.adicionarNovaAba(novaAba);
                    System.out.println("Nova aba adicionada.");
                }
                case 3 -> {
                    try {
                        navegador.atualizarPagina();
                    } catch (InterruptedException e) {
                        System.out.println("Erro ao atualizar página.");
                    }
                }
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void menuTelefone() {
        int opcao;
        do {
            System.out.println("\n------ TELEFONE ------");
            System.out.println("1: Fazer ligação");
            System.out.println("2: Atender ligação");
            System.out.println("3: Iniciar correio de voz");
            System.out.println("0: Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o número para ligar: ");
                    String numero = scanner.nextLine();
                    telefone.telefonar(numero);
                }
                case 2 -> telefone.atender();
                case 3 -> telefone.iniciarCorreioVoz();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
