public class App {
    public static void main(String[] args) throws Exception {

        int v1 = 10;
        int v2 = 0; 
        char op = 'd';

        if (op == 'a') {
            System.out.format("Soma: %d%n", v1 + v2);
        }
        else if (op == 's') {    
            System.out.format("Subtração: %d%n", v1 - v2);
        }
        else if (op == 'm') {    
            System.out.format("Multiplicação: %d%n", v1 * v2);
        }
        else if (op == 'd') {
            if (v2 != 0) {
                System.out.format("Divisão: %d%n", v1 / v2);
            }  
            else {
                System.out.println("Divisão por zero impossível.");
            }       
        }
        else {
            System.out.println("Operação não reconhecida.");
        }
        
    }
}
