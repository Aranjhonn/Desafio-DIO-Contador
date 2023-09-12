import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = entrada.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = entrada.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);

        } catch (ParametroInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametroInvalidosException {
        if (primeiroParametro >= segundoParametro) {
            throw new ParametroInvalidosException("O segundo parâmetro não pode ser menor que o primeiro parâmetro");
        }

        int contador = segundoParametro - primeiroParametro;
        for (int i = 1; i <= contador; i++) {
            System.out.println("Iteração: " + i);
        }

    }
}




















