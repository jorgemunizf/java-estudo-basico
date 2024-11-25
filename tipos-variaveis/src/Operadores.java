
public class Operadores {

    public static void main(String[] args) {


        /* // OPERADORES ARITIMETICOS


        double soma = 10.5 + 15.6;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 17 % 3;
        double expressao = (10 * 7) + (20 / 4);

        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + subtracao);
        System.out.println("Resultado da multiplicação: " + multiplicacao);
        System.out.println("Resultado da divisão: " + divisao);
        System.out.println("Resultado da modulo(Resto da divisão): " + modulo);
        System.out.println("Resultado da expresão: " + expressao);

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // Valor positivio
        int numero = 5;

        System.out.println(-numero);

        // Negando o número 
        numero = -numero;

        System.out.println(numero);

        // Voltar número para positivo
        numero = numero * -1;

        System.out.println(numero);
        
        
        // INCREMENTAR NUMEROS
        int numero = 5;

        // incrementar de 2 em 2
        // numero = numero + 2; //saida: 7
        // incrementar de 1 em 1
        // numero = numero + 1; //saida: 6
        // ou
        numero++; // saida: 6

        System.out.println(numero);

        boolean variavel = true;

        // O ! vai inverter o valor da variável se true vai ser false / false vai ser true.
        // O valor da variável não será alterado
        System.out.println(!variavel); //saida: false
        System.out.println(variavel); //saida: true

        //Para alterar o valor variável
        variavel = !variavel;
        System.out.println(variavel);

        // OPERADOR TERNANRIO
        int a, b;

        a = 5;
        b = 5;

        String resultado = "";

        //EXEMPLO DE CONDICIONAL USANDO IF/ELSE
        if (a == b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }

        System.out.println(resultado);

        //EXEMPLO USANDO TERNARIO
        String result = a == b ? "VERDADEIRO" : "FALSO";

        System.out.println(result);

        //RELACIONAIS (==, !=, > , <, >=, <=)
        String nome1 = "JORGE";

        String nome2 = "JORGE";
        String nome3 = new String("JORGE"); // Temos um novo objeto no valor da variável nome3

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome3));    // o metodo equals() compara se o conteúdo dos objetos são iguais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior que numero2? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numero1 é menor que numero2? " + simNao);

        if (numero1 > numero2) {
            System.out.println("Número 1 é maior que número 2");
        }

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }



         */
        //OPERADORES LOGICOS (&& - "E", || - "OU")
        boolean condicao1 = true;

        boolean condicao2 = false;

        // if (condicao1 && condicao2) {
        //     System.out.println("As duas condições são verdadeiras");
        // }
        // if (condicao1 || condicao2) {
        //     System.out.println("Uma das condições é verdadeira");
        // }
        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        }

        System.out.println("Fim");

    }
}
