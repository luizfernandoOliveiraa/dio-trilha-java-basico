package iphone;

import java.util.InputMismatchException;
import java.util.Scanner;

import apps.Iphone;


public class Iphone7 {
	public static void main(String[] args) {
	Iphone iphone = new Iphone();
    Scanner scanner = new Scanner(System.in);
    int opcao = -1;

    while (opcao != 0) {
        iphone.inicio();  // Exibe o menu principal
        try {
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            // Limpa o buffer do scanner para evitar problemas de leitura de linha completa
            scanner.nextLine();

            // Verifica se a opção está dentro do intervalo esperado
            if (opcao < 0 || opcao > 3) {
                System.out.println("Opção inválida. Por favor, selecione uma opção entre 0 e 3.");
                continue;  // Volta ao início do loop
            }

            if (opcao == 1) {
                // Menu de Músicas
                System.out.println("Escolha uma música para ouvir:");
                String nomeMusica = scanner.nextLine();
                iphone.selecionarMusica(nomeMusica);
                iphone.tocar();
                iphone.pausar();
            } else if (opcao == 2) {
                // Menu de Ligações
                System.out.println("Digite o número para ligar:");
                String numeroLigacao = scanner.nextLine();
                iphone.ligar(numeroLigacao);
                iphone.atender();
                iphone.correioVoz();
            } else if (opcao == 3) {
                // Menu de Internet
                System.out.println("Digite a URL do site que deseja acessar:");
                String urlSite = scanner.nextLine();
                iphone.exibirPagina(urlSite);

                System.out.println("Digite a URL do novo site que deseja abrir:");
                String novoUrl = scanner.nextLine();
                iphone.adicionarAba(novoUrl);
                iphone.atualizarPagina();
            } else {
                // Opção 0 - Sair
                System.out.println("Saindo do sistema...");
            }

        } catch (InputMismatchException e) {
            // Captura a exceção quando um tipo de dado incorreto é inserido
            System.out.println("Entrada inválida. Por favor, insira um número.");
            scanner.nextLine();  // Limpa o buffer do scanner para descartar a entrada incorreta
        }
    }

    scanner.close();  // Fecha o Scanner ao sair do loop
}
	}
