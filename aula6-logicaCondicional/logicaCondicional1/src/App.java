
public class App {
    public static void main(String[] args) throws Exception {
        
        int v1 = 6;
        int v2 = 5;

        System.out.println(v1 + " >  " + v2 + " :: " + (v1 > v2));
        System.out.println(v1 + " >= " + v2 + " :: " + (v1 >= v2));
        System.out.println(v1 + " <  " + v2 + " :: " + (v1 < v2));
        System.out.println(v1 + " <= " + v2 + " :: " + (v1 <= v2));
        System.out.println(v1 + " == " + v2 + " :: " + (v1 == v2));
        System.out.println(v1 + " != " + v2 + " :: " + (v1 != v2));
        System.out.println();
        // %d representa um coringa de valores inteiros
        // %b representa um coringa de valores booleanos
        // %n representa um coringa que faz um quebra de linha
        System.out.format("%d > %d  :: %b%n", v1, v2, v1 > v2);
        System.out.format("%d >= %d :: %b%n", v1, v2, v1 >= v2);
        System.out.format("%d < %d  :: %b%n", v1, v2, v1 < v2);
        System.out.format("%d <= %d :: %b%n", v1, v2, v1 <= v2);
        System.out.format("%d == %d :: %b%n", v1, v2, v1 == v2);
        System.out.format("%d != %d :: %b%n", v1, v2, v1 != v2);
    }
}
