import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        System.out.println("hello word");

        System.out.println(buscarNome());
    }

//      1                  2                    3                   4
//tipo de acesso     Tipo de retorno        Nome do Metodo      Parâmetros
// publi ou priva    String, int, flout..   nomeDoMetodo();     (Parâmetro)

/* - Metodos precisão ter retorno.   - Essses Retornos tem que ter os mesmos tipos de dados (se é uma String os dados,
Retorno e o Metodo tem que ser Tipo String)  */
    public static String buscarNome(){
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite seu Primeiro Nome: ");
        String nome = ler.next();

        System.out.printf("Digite o seu sobre nome: ");
        String sobrenome = ler.next();

        String nomeCompleto = "Nome Completo: " + nome + " " + sobrenome;

        return nomeCompleto;

    }


}
