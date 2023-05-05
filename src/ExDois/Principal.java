package ExDois;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        System.out.println(Informacoes.dizerInformacaoNome(scan.next()));

        System.out.println("Informe sua idade: ");
        System.out.println(Informacoes.dizerInformacaoIdade(scan.nextInt()));

        System.out.println("Informe primeiro seu peso e depois sua altura: ");
        System.out.printf(Informacoes.dizerInformacaoPesoAltura(scan.nextDouble(), scan.nextDouble()));



    }









}
