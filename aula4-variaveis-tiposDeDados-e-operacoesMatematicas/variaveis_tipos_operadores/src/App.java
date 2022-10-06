public class App {
    public static void main(String[] args) throws Exception {

        // Como podemos declarar variáveis em Java
        //int numero;
        //numero = 50;
        //final int numeroDePessoas = 50; // final define o valor final de uma variável, como se a variável fosse uma constante, ou seja, não pode ser alterado seu valor. 
        int numero = 50;
        int _n1 = 30;
        System.out.println(numero + _n1 + "\n");



        // Tipos de Dados Inteiros:
        byte v8 = 30; // Comporta até 8 bits
        short v16 = 60; // Comporta até 16 bits
        int v32 = 50; // Comporta até 32 bits
        long v64 = -8; // Comporta até 64 bits. 
        // Detalhe quando se declara uma variável do tipo Long e atribui a ela um valor muito longo, devemos colocar um sufixo nesse valor que é a letra L, por exemplo abaixo:
        long populacao = 6254358487L;
        System.out.println(populacao);

        // Serão usadas as letras maiusculas devido ao uso das classes dos tipos de dados
        System.out.println("Byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE + "\n");


        // Tipos de Ponto Flutuante
        // Parte fracionária ou decimal
        float f1 = 54.84f; // quando se coloca um valor numérico com ponto é entendido como double, por isso devemos acrescentar ao final do valor numérico o f para representar o float
        // FLOAT tem 32 bits
        double d1 = 54.43; // DOUBLE tem 64 bits

        System.out.println("Float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE + "\n");


        // Tipo Character / Caractere ou Char
        // O tipo char armazena um caracter unicode, que é um caracter de 16 bits
        char letra = 'A';
        char letraAcentuada = '\u00DA'; // Representa a letra Ú
        System.out.println(letra);
        System.out.println(letraAcentuada + "\n");


        // Tipo Boolean ou lógico
        // Normalmente são utilizadas em estruturas condicionais
        boolean concederDesconto = false;
        System.out.println(concederDesconto + "\n");
        


        // Utilizando os tipos primitivos vistos acima
        int v1 = 100;
        int v2 = v1;
        v1 = 200;
        System.out.println(v1);
        System.out.println(v2);

    }
}
