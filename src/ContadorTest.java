import org.junit.jupiter.api.Test;

public class ContadorTest {
    // Teste 1: Parâmetros válidos (Deve fazer a contagem)
    @Test
    public void test1() {
        int primeiroParametro = 5;
        int segundoParametro = 10;
        try {
            Contador.contar(primeiroParametro, segundoParametro);

        } catch (ParametroInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    // Teste 2: Parâmnetros iguais (deve lancar ParametroInvalidosException)
    @Test
    public void test2() {
        int primeiroParametro = 10;
        int segundoParametro = 10;
        try {
            Contador.contar(primeiroParametro, segundoParametro);
        } catch (ParametroInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    // Teste 3: Parâmetros inválidos (segundo parâmetro menor que o primeiro, deve lancar ParametroInvalidosException)
    @Test
    public void test3() {
        int primeiroParametro = 10;
        int segundoParametro = 5;
        try {
            Contador.contar(primeiroParametro, segundoParametro);
        } catch (ParametroInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}



















