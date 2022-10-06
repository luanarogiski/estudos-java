public class App {
    public static void main(String[] args) throws Exception {
        
        // FOR
        int numero = 7;
        int limite = 10;
        System.out.println("Tabuada do " + numero);

        // Conjunto de instrucoes for (1º contador; 2º condicao de parada; 3º incremento do contador)
        for (int i = 1; i <= limite; i++) {
            System.out.format("%d X %d = %d%n", numero, i, numero * i);
        }
    }
}
