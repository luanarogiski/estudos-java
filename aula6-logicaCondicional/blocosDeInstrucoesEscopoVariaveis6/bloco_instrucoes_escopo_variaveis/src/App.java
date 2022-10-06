public class App {
    public static void main(String[] args) throws Exception {
        /*
        int v1 = 10;
        int v2 = 15;
     //   int res = 0;

     // Podemos declarar variáveis dentro do bloco do if, como exemplo: a variável res que estava sendo declarada no escopo do código, agora está sendo declarada dentro do bloco
        if (v1 > v2) {
            int res = v1 -v2; // Quando uma variável é declarada dentro de um bloco ela é liberada assim que o bloco termina, ou seja, a variável em um bloco tem vida útil apenas dentro do bloco e quando o bloco termina ela é liberada da memória e não pode mais ser usada
            System.out.println("A variável v1 é maior.");
        }
            System.out.println("Saindo do programa.");  
        //    System.out.println("Saindo do programa. Resultado: " + res); // A variável res aqui não seria visível pelo fato dela ter sido declarada no bloco do if 
        */

            // Teste com o res no System.out.println("Saindo do programa. Resultado: " + res);
        int v1 = 10;
        int v2 = 15;
        int res = 0;

    
        if (v1 > v2) {
            res = v1 -v2; 
            System.out.println("A variável v1 é maior.");
        }
            System.out.println("Saindo do programa. Resultado: " + res); 
    }
}
