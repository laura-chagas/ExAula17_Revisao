package ExUm;

import java.util.Scanner;

public class Principal {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Você deseja aumentar ou diminuir?");
        System.out.println("1 - PARA CONTROLAR O VOLUME \n 2 - PARA TROCAR DE CANAL \n 3- PARA CONSULTAR O VOLUME DO SOM E QUAL CANAL ESTÁ SELECIONADO");
        verDecisaoAcao(scan.nextInt());

        controlarVolume(); //teste

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
            default:
                System.out.println("INVÁLIDO");
        }

    }
    public static int volume = 0;


    public static void controlarVolume() {

        System.out.println("Informe o que você deseja? ");
        System.out.println("1 - PARA AUMENTAR \n 2- PARA DIMINUIR");
        int decisaoDois = scan.nextInt();

        switch (decisaoDois) {
            case 1:
                if (volume >=0 && volume <= 10 ){
                    System.out.println(volume++);
                }else {
                    System.out.println("Não foi possível realizar essa ação");
                }
                break;
            case 2:
                if (volume >= 0 && volume <=10){
                    System.out.println(volume--);
                }else {
                    System.out.println("Não foi possível realizar essa ação");
                }
                break;
            default:
                System.out.println("Inválido");


        }

    }

    public static void trocarDeCanal(){}

    public static void mostrarVolumeECanal(){}


}
