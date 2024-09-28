package Desafio04;

public class Desafio04 {

    public static void main(String[] args) {

        int[] sequenciaA = {1, 3, 5, 7};
        System.out.println("Próximo elemento da sequência a: " + (sequenciaA[sequenciaA.length - 1] + 2));

        int[] sequenciaB = {2, 4, 8, 16, 32, 64};
        System.out.println("Próximo elemento da sequência b: " + (sequenciaB[sequenciaB.length - 1] * 2));

        int[] sequenciaC = {0, 1, 4, 9, 16, 25, 36};
        int proximoC = (int) Math.pow(sequenciaC.length, 2);
        System.out.println("Próximo elemento da sequência c: " + proximoC);


        int[] sequenciaD = {4, 16, 36, 64};
        int proximoD = (int) Math.pow((sequenciaD.length + 1) * 2, 2);
        System.out.println("Próximo elemento da sequência d: " + proximoD);

        int[] sequenciaE = {1, 1, 2, 3, 5, 8};
        int proximoE = sequenciaE[sequenciaE.length - 1] + sequenciaE[sequenciaE.length - 2];
        System.out.println("Próximo elemento da sequência e: " + proximoE);

        int[] sequenciaF = {2, 10, 12, 16, 17, 18, 19};
        int proximoF = (sequenciaF[sequenciaF.length - 1] == 19) ? 20 : sequenciaF[sequenciaF.length - 1] + 1;
        System.out.println("Próximo elemento da sequência f: " + proximoF);
    }
}