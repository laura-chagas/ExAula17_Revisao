package ExUm;

import java.util.Scanner;

public class Principal {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        menuOpcoes();

    }

    public static void menuOpcoes() {
        System.out.println("O que você deseja?");
        System.out.println("1 - PARA CONTROLAR O VOLUME \n2 - PARA TROCAR DE CANAL \n3 - PARA CONSULTAR O VOLUME DO SOM E QUAL CANAL ESTÁ SELECIONADO \n4-PARA SAIR");
        verDecisaoAcao(scan.nextInt());
    }

    public static void verDecisaoAcao(int decisaoUm) {

        switch (decisaoUm) {
            case 1:
                controlarVolume();
                break;
            case 2:
                trocarDeCanal();
                break;
            case 3:
                mostrarVolumeECanal();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("INVÁLIDO");
                System.exit(0);
        }

    }

    static int volume = 0;

    public static void controlarVolume() {

        System.out.println("Informe o que você deseja? ");
        System.out.println("1 - PARA AUMENTAR \n2 - PARA DIMINUIR");
        int decisaoDois = scan.nextInt();

        switch (decisaoDois) {
            case 1:
                if (volume >= 0 && volume <= 10) {
                    volume++;
                    System.out.println("O volume atual foi alterado para " + volume);
                } else {
                    System.out.println("Volume já está no máximo");
                }
                menuOpcoes();
            case 2:
                if (volume > 0 && volume <= 10) {
                    volume--;
                    System.out.println("O volume atual foi alterado para " + volume);
                } else {
                    System.out.println("Volume está no mínimo");
                }
                menuOpcoes();
            default:
                System.out.println("Inválido");
                menuOpcoes();

        }

    }

    static int canal = 1;

    public static void trocarDeCanal() {
        System.out.println("Selecione o que você deseja: \n1- PARA TROCAR DE UM EM UM \n2- PARA DIGITAR O CANAL");
        int resp = scan.nextInt();

        switch (resp) {
            case 1:
                trocarCanalUmEmUm();
                menuOpcoes();
                break;
            case 2:
                trocarCanalDireto();
                menuOpcoes();
                break;
        }

    }

    public static void trocarCanalUmEmUm() {
        System.out.println("Selecione para onde você quer mudar: \n1- CANAL A FRENTE \n2- CANAL ANTERIOR");
        int respCanal = scan.nextInt();
        switch (respCanal) {
            case 1:
                if (canal > 0) {
                    canal++;
                    System.out.println("Você foi redirecionado para o canal: " + canal);
                }else {
                    System.out.println("O canal não existe");
                }
                break;
            case 2:
                if (canal > 0) {
                    canal--;
                    System.out.println("Você foi redirecionado para o canal: " + canal);
                }else {
                    System.out.println("O canal não existe");
                }
        }
    }

    public static void trocarCanalDireto() {
        System.out.println("Digite o número do canal que você deseja ir: ");
        canal = scan.nextInt();

        System.out.println("Você foi redirecionado para o canal: " + canal);
    }

    public static void mostrarVolumeECanal() {
        System.out.println("Você está no canal " + canal + " e seu volume está no " + volume);
    }


}
