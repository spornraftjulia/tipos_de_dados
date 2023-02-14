import java.util.Scanner;
public class operadorcalc {
    public static void main(String[] Julia) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;

        int soma;
        int multiplicacao;
        double divisao;
        int subtraçao;
        double resto;

        System.out.println("Digite um número");
        numero1=entrada.nextInt();

        System.out.println("Digite um número");
        numero2=entrada.nextInt();

        soma=numero1+numero2;
        System.out.println("A soma dos dois números é:" + soma);

        multiplicacao=numero1*numero2;
        System.out.println("A multiplicação dos dois números é:" + multiplicacao);

        divisao=numero1/numero2;
        System.out.println("A divisão dos dois números é:" + divisao);

        subtraçao=numero1-numero2;
        System.out.println("A subtração dos dois números é:" + subtraçao);

        resto=numero1%numero2;
        divisao=numero1/numero2;
        System.out.println("O resto dos dois números é:" + resto);
}
}


