

public class Operacoes {
    public static void main(String[] args) throws Exception {

        // Operações com inteiros
        int v1 = 100;
        int v2 = 250;

        int r1 = v1 + v2;
        int r2 = v2 - v1;
        int r3 = v1 * v2;
        int r4 = v2 / v1;
        int r5 = v2 % v1;

        System.out.println("Soma: " + r1);
        System.out.println("Subtração: " + r2);
        System.out.println("Multiplicação: " + r3);
        System.out.println("Divisão: " + r4);
        System.out.println("Módulo: " + r5 + "\n");


        // Operações com float
        float valor1 = 100;
        float valor2 = 250;

        float res1 = valor1 + valor2;
        float res2 = valor2 - valor1;
        float res3 = valor1 * valor2;
        float res4 = valor2 / valor1;
        float res5 = valor2 % valor1;

        System.out.println("Soma: " + res1);
        System.out.println("Subtração: " + res2);
        System.out.println("Multiplicação: " + res3);
        System.out.println("Divisão: " + res4);
        System.out.println("Módulo: " + res5 + "\n");


        // Operações de tipos diferentes
        // OBS: Quando se coloca um inteiro dentro de um float, pode haver perde de precisão, ou seja, por exemplo: se pegar 100.000 e converter para float ou colocar dentro de uma variável float, o resultado poderá ser 99.999.999....
        float val1 = 100;
        int val2 = 250;

        float result1 = val1 + val2;
        float result2 = val2 - val1;
        float result3 = val1 * val2;
        float result4 = val2 / val1;
        float result5 = val2 % val1;

        System.out.println("Soma: " + result1);
        System.out.println("Subtração: " + result2);
        System.out.println("Multiplicação: " + result3);
        System.out.println("Divisão: " + result4);
        System.out.println("Módulo: " + result5 + "\n");


        // Operadores de prefixo e posfixo
        int n1 = 10;
        int n2 = 5;
        int n3 = 2;
        int n4 = 8;

        // INCREMENTO
        System.out.println(n1++); // Operador posfixo (incremento), é aquele que coloca dois sinais de ++ depois da variável, aonde ele soma 1 ao valor da variável.
        // OBS: no prefixo 1º o println lê o valor da variável e depois é feito o incremento do valor na variável.
        System.out.println(n1);

        System.out.println(++n2); // Operador prefixo (incremento), é aquele que coloca dois sinais de ++ antes da variável, aonde ele soma 1 ao valor da variável. 
        // OBS: no prefixo 1º é feito o incremento e depois o println lê o valor da variável por isso o resultado é 6 neste caso.
        System.out.println(n2 + "\n");


        // DECREMENTO
        System.out.println(n3--); // Operador posfixo (decremento), é aquele que coloca dois sinais de -- depois da variável, aonde ele subtraí 1 ao valor da variável.
        // OBS: no prefixo 1º o println lê o valor da variável e depois é feito o decremento do valor na variável.
        System.out.println(n3);

        System.out.println(--n4); // Operador prefixo (decremento), é aquele que coloca dois sinais de -- antes da variável, aonde ele subtraí 1 ao valor da variável. 
        // OBS: no prefixo 1º é feito o decremento e depois o println lê o valor da variável por isso o resultado é 7 neste caso.
        System.out.println(n4 + "\n");


        // Operador Composto
        int n5 = 10;
        n5 += 5; // Temos também: -=, *=, /= e o %=, estes são operadores compostos possíveis.

        System.out.println(n5 + "\n");

        // Estudo de caso ordem de precedência
        int vA = 12;
        int vB = 9;
        int vC = 6;
        int vD = 3;

        int resultado1 = vA + vB / vC;
        int resultado2 = (vA + vB) / vC;
        int resultado3 = vA / vC * vD + vB;
        int resultado4 = vA / (vC * (vD + vB));

        // OBS: Não terá números quebrado pois estamos declarando INT
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4 + "\n");


        float vE = 12;
        float vF = 9;
        float vG = 6;
        float vH = 3;

        float resulta1 = vE + vF / vG;
        float resulta2 = (vE + vF) / vG;
        float resulta3 = vE / vG * vH + vF;
        float resulta4 = vE / (vG * (vH + vF));

        System.out.println(resulta1);
        System.out.println(resulta2);
        System.out.println(resulta3);
        System.out.println(resulta4 + "\n");

    }
}
