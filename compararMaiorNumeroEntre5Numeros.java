import java.util.Scanner;

public class compararMaiorNumeroEntre5Numeros {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Integer maiorValor,maiorPosicao;

        System.out.print("Informe o primeiro valor: ");
        Integer numero1 = prompt.nextInt();
        maiorValor= numero1;
        maiorPosicao=1;
        System.out.print("Informe o segundo valor: ");
        Integer numero2 = prompt.nextInt();
        if (numero2 > maiorValor){
            maiorValor= numero2;
            maiorPosicao=2;
        }
        System.out.print("Informe o terceiro valor: ");
        Integer numero3 = prompt.nextInt();
        if (numero3 > maiorValor){
            maiorValor= numero3;
            maiorPosicao=3;
        }
        System.out.print("Informe o quarto valor: ");
        Integer numero4 = prompt.nextInt();
        if (numero4 > maiorValor){
            maiorValor= numero4;
            maiorPosicao=4;
        }
        System.out.print("Informe o quinto valor: ");
        Integer numero5 = prompt.nextInt();
        if (numero5 > maiorValor){
            maiorValor= numero5;
            maiorPosicao=5;
        }

        System.out.println("O maior valor imformado foi: "+maiorValor+" informado na posição: "+maiorPosicao);

    }
}
