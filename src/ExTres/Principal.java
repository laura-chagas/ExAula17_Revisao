package ExTres;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota do Aluno: ");
        System.out.println(Classificacao.classificarAluno(scanner.nextDouble()));


    }

}