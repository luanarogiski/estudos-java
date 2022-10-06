public class App {
    public static void main(String[] args) throws Exception {

            // WHILE
    /*    
        int valor = 5;
        int fatorial = 1;

        // while -> enquanto condição for alguma coisa, continue executando
        while (valor > 1) {
            fatorial *= valor;
            valor--;
        }
        System.out.println(fatorial);   
    */


            // DO WHILE
        int numero = 8;
        int limite = 10;
        int i = 1;
        System.out.println("Tabuada do " + numero);

        // aqui o teste condicional é realizando no final com o while
        do {
            System.out.format("%d X %d = %d%n", numero, i, numero * i);
            i++;
        } while (i <= limite); // condição de parada sendo executada aqui
    }   

}
