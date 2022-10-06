/*  Para importar pacotes no java ou colocamos aqui em cima como um import, ou colocamos o nome de forma qualificada, podendo até utilizar as duas classes Aluno, por exemplo: 
com.maroquio.escola.Aluno a1 = new com.maroquio.escola.Aluno(); OU 
com.maroquio.curso.Aluno a2 = new com.maroquio.curso.Aluno(); 
OBS: o java suporta apenas um tipo de classe do mesmo nome como importação, por exemplo: 
import com.maroquio.escola.Aluno; OU 
import com.maroquio.curso.Aluno;
*/


//import com.maroquio.escola.Aluno;
//import com.maroquio.curso.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); // imprime na tela
        // este é outro método de saída
        System.out.println("Outro método.");

        com.maroquio.escola.Aluno a1 = new com.maroquio.escola.Aluno();
        a1.matricular();

        com.maroquio.curso.Aluno a2 = new com.maroquio.curso.Aluno();
        a2.matricular();
    }
}
