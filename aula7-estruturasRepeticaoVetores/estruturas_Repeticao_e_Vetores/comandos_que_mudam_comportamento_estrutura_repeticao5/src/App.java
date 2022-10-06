public class App {
    public static void main(String[] args) throws Exception {
        
        // Dois Comandos que são capazes de mudar o Comportamento de uma Estrutura de Repetição, que são os comandos: BREAK e CONTINUE

        
        System.out.println("Break");

        // A chamada ao comando BREAK, neste caso, ocorre mediante a uma condição if (i == 5), e quando (i == 5) o BREAK é que será chamado e a estrutura de repetição vai ser abandonada.
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
                // i é igual a 0; 0 é MENOR que 10; então incrementa 1, i vale 0
                // se (i == 5) -> NÃO (i == 0), então voltar ao for 

                // i incrementou 1 e passou a valer 1; 1 é MENOR que 10; então incrementa 1, i passa valer 1
                // se (i == 5) -> NÃO (i == 1), então voltar ao for

                // i incrementou 1 e passou a valer 2; 2 é MENOR que 10; então incrementa 1, i passa valer 2
                // se (i == 5) -> NÃO (i == 2), então voltar ao for

                // i incrementou 1 e passou a valer 3; 3 é MENOR que 10; então incrementa 1, i passa valer 3
                // se (i == 5) -> NÃO (i == 3), então voltar ao for

                // i incrementou 1 e passou a valer 4; 4 é MENOR que 10; então incrementa 1, i passa valer 4
                // se (i == 5) -> NÃO (i == 4), então voltar ao for

                // i incrementou 1 e passou a valer 5; 5 é MENOR que 10; então incrementa 1, i passa valer 5
                // se (i == 5) -> SIM (i == 5), então PARAR, porque a condição i == 5 se tornou verdadeira
            }
            System.out.format("%d, ", i);
        }

        System.out.println("\nContinue");

        // A chamada ao comando CONTINUE, neste caso, também ocorre mediante a uma condição if (i == 5), e quando (i == 5) o CONTINUE é que será chamado e a iteração atual vai ser abandonada ao invés de ser a estrutura de repetição, ou seja, a estrutura de repetição segue para a próxima iteração, isso vai fazer com que o valor 5 não seja impresso no: System.out.format("%d, ", i); Porque quando (i == 5) essa iteração será ABANDONADA, e uma NOVA  iteração será iniciada já com (i == 6), fazendo com que o valor 6 seja impresso.
        // OBS.: o CONTINUE volta para o inicio da iteração ao invés da próxima linha, de dentro da estrutura de repetição. 
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
                // i é igual a 0; 0 é MENOR que 10; então incrementa 1, i vale 0
                // se (i == 5) -> NÃO (i == 0), então imprimir e voltar ao for

                // i incrementou 1 e passou a valer 1; 1 é MENOR que 10; então incrementa 1, i passa valer 1
                // se (i == 5) -> NÃO (i == 1), então imprimir e voltar ao for

                // i incrementou 1 e passou a valer 2; 2 é MENOR que 10; então incrementa 1, i passa valer 2
                // se (i == 5) -> NÃO (i == 2), então imprimir e voltar ao for

                // i incrementou 1 e passou a valer 3; 3 é MENOR que 10; então incrementa 1, i passa valer 3
                // se (i == 5) -> NÃO (i == 3), então imprimir e voltar ao for

                // i incrementou 1 e passou a valer 4; 4 é MENOR que 10; então incrementa 1, i passa valer 4
                // se (i == 5) -> NÃO (i == 4), então imprimir e voltar ao for

                /** -----------------------------------------------------------
                // i incrementou 1 e passou a valer 5; 5 é MENOR que 10; então incrementa 1, i passa valer 5
                // se (i == 5) -> SIM (i == 5), então está estrutura é ABANDONADA e NÃO imprime o 5 na tela, e uma NOVA iteração é INICIADA
                --------------------------------------------------------------- */

                // i incrementou 1 e passou a valer 6; 6 é MENOR que 10; então incrementa 1, i passa valer 6
                // se (i == 5) -> É MENOR DO QUE (i == 6), então imprimir e voltar ao for

                // i incrementou 1 e passou a valer 7; 7 é MENOR que 10; então incrementa 1, i passa valer 7
                // se (i == 5) -> É MENOR DO QUE (i == 7), então imprimir e voltar ao for

                // i incrementou 1 e passou a valer 8; 8 é MENOR que 10; então incrementa 1, i passa valer 8
                // se (i == 5) -> É MENOR DO QUE (i == 8), então imprimir e voltar ao for

                // i incrementou 1 e passou a valer 9; 9 é MENOR que 10; então incrementar 1, i passa valer 9
                // se (i == 5) -> É MENOR DO QUE (i == 9), então imprimir e voltar ao for

                // i incrementou 1 e passou a valer 10; 10 é IGUAL 10; então finalizar o for
            }
            System.out.format("%d, ", i);
        }

        
    }
}
