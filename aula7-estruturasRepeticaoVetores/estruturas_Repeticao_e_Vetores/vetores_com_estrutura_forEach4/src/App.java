public class App {
    public static void main(String[] args) throws Exception {
        
                // FOR-EACH
                
        // Estrutura de repetição especifica para se processar individualmente os elementos de um vetor, por exemplo: Estrutura for-each: para-cada

        // Aonde a estrutura for-each, percorre os elementos de um vetor e permite que processamos cada elemento individualmente

        int[] vetor = {10, 20, 30, 40, 50};
        int soma = 0;
        // for-each : para-cada
        // aqui abaixo fazemos a seguinte leitura: para-cada (elemento do tipo int ':' -> que esta dentro de vetor) faça { soma receber o que ela já tem MAIS esse elemento que esta dentro do vetor }
        for (int elemento : vetor) {
            soma += elemento;
            //   0 =   0 + 10  = 10
            //  10 =  10 + 20 =  30
            //  30 =  30 + 30 =  60
            //  60 =  60 + 40 = 100 
            // 100 = 100 + 50 = 150
        }
        System.out.println(soma);
    }
}
