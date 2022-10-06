public class App {
    public static void main(String[] args) throws Exception {
        
        // VETORES

/*        
        // um vetor é um conjunto indexado de dados, os elementos de um vetor podem ser acessados através de um indice, no java o 1º elemento do vetor tem indice ZERO, e o ultimo vai ter o indice igual ao tamanho do vetor MENOS 1, por exemplo: se tiver um vetor de 10 elementos, esses elementos estarao indexados de 0 a 9.
    //    int[] vetor1; // apenas indica um vetor de inteiros.
        int[] vetor2 = new int[3]; // aqui indica ter um vetor de inteiros, e uma inicializacao com um vetor de inteiros de 3 posicoes, neste caso uma memoria para armazenar 3 numeros inteiros foram reservadas para este vetor. 
        int[] vetor3 = {10,20,30}; // declarado também como um vetor de inteiros, e ja inicializado com valores.

    //    vetor1[0] = 1; // acusa um erro porque o vetor1 não foi inicializado, então não se pode atribuir o valor 1 a primeira posicao do vetor1 e não pode atribuir nenhum outro valor, porque não existe memória reservada para guardar valor na primeira posicao do vetor1.
        vetor2[0] = 1; // foi inicializado, porém não foi preenchido, sendo um vetor que possui valores vazios ou que possui espaços reservados mas são vazios, e aqui digo que a posicao do vetor2 recebe o valor 1.
        vetor3[0] = 1; // também esta sendo atribuido valor 1, então neste caso ele substituira o valor 10 da primeira posicao por 1.

        // aqui abaixo possui uma estrutura de repetição for que faz a soma dos elementos do vetor3.
        int soma = 0; // variavel soma inicializado com o valor zero
        // a condicao for abaixo diz: para ir de zero; até o tamanho do vetor3; de um em um,faça { soma receber o que ela já tem mais o valor da posicao [i] do vetor3 }
        for (int i = 0; i < vetor3.length; i++) { // length é uma propriedade do vetor3
            soma += vetor3[i];
            // 0 = 0 + posicao [i] = 0 do vetor3 = 10 mas que passou a valer 1 porque foi substituido acima
            // 1 = 1 + posicao [i] = 1 do vetor3 = 20 que somado a 1 é = 21
            // 21 = 21 + posicao [i] = 2 do vetor3 = 30 que somado a 21 = 51
        }
        System.out.println(soma); // o resultado será 51, isso porque: int[] vetor3 = {10,20,30} -> porque o 10 foi substituido pelo 1, ficando {1 + 20 + 30 = 51}

*/

                // Exemplo do acima limpo de comentários

                int[] vetor1; 
                int[] vetor2 = new int[3]; 
                int[] vetor3 = {10,20,30}; 
        
            //    vetor1[0] = 1; 
                vetor2[0] = 1; 
                vetor3[0] = 1; 
        
               
                int soma = 0; 
                for (int i = 0; i < vetor3.length; i++) {
                    soma += vetor3[i];

                    // 0 = 0 + posicao i vetor (i = 0), onde posicao i que era 10 mas que passou a valer 1 porque foi atribuido o valor 1 na linha 37

                    // 1 = 1 + posicao i vetor (i = 1), onde posicao i que era 1 mas que passou a valer 21 porque foi feito a soma na linha 42

                    // 2 = 2 + posicao i vetor (i = 2), onde posicao i que era 21 mas que passou a valer 51 porque foi feito a soma na linha 42
                }
                System.out.println(soma); 

    }
}
