public class App {
    public static void main(String[] args) throws Exception {
       // IF E ELSE
        /*        
        int v1 = 10;
        int v2 = 0;
        int r = 0;
        
        if (v2 != 0)
            r = v1 / v2;

        else
        r = Integer.MAX_VALUE; // O maior número inteiro possível   

        System.out.format("Resultado: %d%n", r); // Essa linha é executada indiferente do resultado da condição
    */
    
    
     // Caso queira executar mais de uma linha de código em um estrutura condicional para fazer validação, utilizamos os blocos que são delimitados por chaves'{}'
     int v1 = 10;
     int v2 = 0;
     int r = 0;
  
     if (v2 != 0) { // Aqui é necessário definir um bloco
         r = v1 / v2;
         System.out.format("Resultado: %d%n", r);
     }
     else { // Devido aqui ter somente uma linha de validação do código não é necessário delimitar como se o else fosse um bloco  
         System.out.println("Divisão Impossível!");
     }
    }
}
