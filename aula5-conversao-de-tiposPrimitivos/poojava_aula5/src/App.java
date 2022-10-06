public class App {
    public static void main(String[] args) throws Exception {
        /* 
        // OCORRÊNCIA DE MODO IMPLÍCITO
        // Maneira implícita ocorre sem interferência de um programador ou pessoa.

        int v1 = 50;
        long v2 = v1; // aqui ocorre uma conversão de maneira implícita para long
        System.out.println(v2 + "\n");

        byte v3 = 5;
        short v4 = 6;
        int v5 = 23423;
        long v6 = 231452345;

        long r1 = v3 + v4 + v5 + v6; // aqui também ocorre uma conversão de maneira implícita para long
        System.out.println(r1 + "\n");

        float f1 = 34.56f;
        double d1 = 567.234;

        float r2 = f1 * f1; 
        // double r2 = f1 * f1; // poderia ser colocado de tipo double sem problema nenhum, pois neste caso estou pegando um valor de ponto flutuante de 32bits e armazenando em uma variável de 64bits ela comporta tranquilamente.
        System.out.println(r2 + "\n");

        double r3 = f1 + d1; // aqui também ocorre uma conversão de maneira implícita para double
        System.out.println(r3 + "\n");

        double r4 = f1 + d1 + v6; // aqui também ocorre uma conversão de maneira implícita para double
        System.out.println(r4 + "\n");
        */

        // OCORRÊNCIA DE MODO EXPLÍCITO
        // Para realizar uma conversão de maneira explícita, basta preceder o valor da variável a ser convertida pelo tipo alvo da conversão entre parenteses, por exemplo como feito no exercício abaixo: short r1 = (short)vLong;

        float vFloat = 5.0f;
        double vDouble = 2.5d;
        byte vByte = 8;
        short vShort = 12;
        int vInt = 41;
        //long vLong = 10; // este cabe em uma variável do tipo short
        long vLong = 58465; // este não cabe em uma variável do tipo short

        short r1 = (short)vLong; // Aqui temos uma primeira atribuição aonde teoricamente poderia ser feito uma conversão implícita, porém isso não ocorre, porque a variável vLong é do tipo long, e uma variável do tipo long não cabe dentro de uma variável do tipo short, o que podemos fazer aqui é 'forçar' uma conversão para o tipo short, mas sabendo que isso pode provocar uma perda de resultado, para fazer isso basta colocar uma conversão explícita, desta forma: short r1 = (short) vLong, mas fazendo isso pode acontecer do valor que está sendo convertido mudar, pelo fato do valor não caber em uma variável de 16bits que é o caso do short, sendo que long tem 64bits. 
        System.out.println(vLong + "\n");
        System.out.println(r1 + "\n");
    }
}

