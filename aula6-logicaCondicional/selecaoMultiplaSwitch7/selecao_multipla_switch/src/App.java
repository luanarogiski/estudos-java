public class App {
    public static void main(String[] args) throws Exception {

        int v1 = 10;
        int v2 = 2;
        char op = 'u';

        // OBS.: Só podemos colocar aqui no paranteses do switch expressões que retornem valores ordinais
        switch (op) { // A expressão dentro do paranteses pode ser uma constante, variável ou uma expressão mais complexa, aonde irá procurar uma correspondência do resultado da expressão nos casos/cases abaixo 
            case 'a':
                System.out.format("Soma: %d%n", v1 + v2);
                break;
            case 's':
                System.out.format("Subtração: %d%n", v1 - v2);    
                break;
            case 'm':
                System.out.format("Multiplicação: %d%n", v1 * v2);
                break;
            case 'd':
                if (v2 != 0) 
                    System.out.format("Divisão: %d%n", v1 / v2);
                else 
                    System.out.println("Divisão por zero impossível");
                break;
            default:  // Este é o caso padrão, ou seja, não encontrou nenhum dos cases especificados acima, eles não foram atingidos, retorna o default
            System.out.println("Operação não reconhecida.");        
        }
        
    }
}
