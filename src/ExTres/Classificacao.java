package ExTres;

public class Classificacao {public static char classificarAluno(double notaAluno){

    if (notaAluno >= 9.00){
        return 'A';
    }else if (notaAluno>= 8.0 && notaAluno < 9.0){
        return 'B';
    }else if (notaAluno>= 7.0 && notaAluno < 8.0){
        return 'C';
    }else if (notaAluno>= 6.0 && notaAluno < 7.0){
        return 'D';
    }else {
        return 'E';
    }

}

}