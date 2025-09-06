public class SomaPG {

    public double somarPG(double primeiroNumero, double multiplicador, int quantidadeTermos) {
        if (quantidadeTermos <= 0) {
            throw new IllegalArgumentException("Quantidade de termos deve ser positiva");
        }

        double somaTotal = 0;
        double numeroAtual = primeiroNumero;
        for (int i = 1; i <= quantidadeTermos; i++) {
            somaTotal += numeroAtual;
            numeroAtual *= multiplicador;

        }
        return somaTotal;

    }
    public void calcular(double primeiroNumero, double multiplicador, int quantidadeTermos) {

        double somaTotal = 0;
        double numeroAtual = primeiroNumero;
        String expressao = "";

        for (int i = 1; i <= quantidadeTermos; i++) {
            System.out.println("Iteração " + i + ": somando " + somaTotal + " + " + numeroAtual);
            somaTotal += numeroAtual;
            System.out.println("Resultado parcial da soma = " + somaTotal);

            expressao += numeroAtual;
            if (i < quantidadeTermos) expressao += " + ";

            System.out.println("Próximo número será: " + numeroAtual + " x " + multiplicador + " = " + (numeroAtual * multiplicador));
            System.out.println("------------------------------");
            numeroAtual *= multiplicador;

        }
        System.out.println("✅ " + expressao + " = " + somaTotal);

    }
}
