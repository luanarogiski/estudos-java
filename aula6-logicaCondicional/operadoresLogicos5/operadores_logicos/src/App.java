public class App {
    public static void main(String[] args) throws Exception {

        // Para não termos que fazer como nos operadores compostos, ou seja, utilizando uma condição / if dentro do outro, podemos utilizar os operadores lógicos para eliminar o uso de uma condição dentro de outra

        // Aqui c1 e c2 equivalem a uma condição/expressão condicional que retornam um valor booleano
    /*    boolean c1 = true;
        boolean c2 = true;
        
        System.out.format("c1 & c2 : %b & %b = %b%n", c1, c2, c1 & c2); // E
        System.out.format("c1 | c2 : %b | %b = %b%n", c1, c2, c1 | c2); // OU
        System.out.format("c1 ^ c2 : %b ^ %b = %b%n", c1, c2, c1 ^ c2); // OU EXCLUSIVO (ou exclusivo precisa apenas um dos lados serem verdadeiros)
        System.out.format("!c1     : !%b     = %b%n", c1, !c1); // NEGAÇÃO (negação de verdadeiro é falso)
    */
    
    
                // OPERADOR LÓGICO CONDICIONAL BÁSICO &
    /*    int pessoas = 30;
        float areaM2 = 100;
        
        if ((pessoas > 0) & (areaM2 / pessoas < 4)) { // Neste caso ele faz a verificação da primeira, quando ele for realizar a segunda condição ele faz a divisão e daí retornaria o erro
            System.out.println("Risco de contágio está alto.");
        }
        else {
            System.out.println("Risco de contágio está baixo.");
        }
    */  
    
                // OPERADOR LÓGICO CONDICIONAL &&
    int pessoas = 30;
    float areaM2 = 100;
    
    if ((pessoas > 0) && (areaM2 / pessoas < 4)) { // Se a primeira condição for falsa, a segunda nem será verificada, neste caso o erro nem acontecerá
        System.out.println("Risco de contágio está alto.");
    }
    else {
        System.out.println("Risco de contágio está baixo.");
    }
    }
}
