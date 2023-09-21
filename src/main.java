import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        System.out.println("hello word");

        // System.out.println(buscarNome()); OU

       /* String inserirNome = buscarNome();

        System.out.println(inserirNome); */

       /* double imc = calcularIMC();

        System.out.println("Seu IMC é: " + imc); */

        String dica = dicas();
        System.out.println(dica);

        int idade = calculoDeIdade();

        System.out.println("Sua Idade é: " + idade);

    }

//      1                  2                    3                   4
//tipo de acesso     Tipo de retorno        Nome do Metodo      Parâmetros
// publi ou priva    String, int, flout..   nomeDoMetodo();     (Parâmetro)

    /* - Metodos precisão ter retorno.   - Essses Retornos tem que ter os mesmos tipos de dados (se é uma String os dados,
    Retorno e o Metodo tem que ser Tipo String)  */
    public static String buscarNome() {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite seu Primeiro Nome: ");
        String nome = ler.next();

        System.out.printf("Digite o seu sobre nome: ");
        String sobrenome = ler.next();

        String nomeCompleto = "Nome Completo: " + nome + " " + sobrenome;

        return nomeCompleto;
    }


    public static double calcularIMC() {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite Seu Peso: ");
        double peso = ler.nextDouble();

        System.out.printf("Digite sua Altura: ");
        double altura = ler.nextDouble();

        double imc = peso / (altura * altura);


        if (imc < 19) {
            System.out.println("Você está Abaixo do Peso");
        } else {
            System.out.println("Você está Acima do Peso");
        }

        return imc;
    }

    //criar metodo que recebe o ano de nascimento, fazer o calculo da idade.
    // imprimir na tela se a pessoa é maior ou menor do que 18 anos.

    public static int calculoDeIdade() {
        Scanner ler = new Scanner(System.in);
        int ano = 2023;

        System.out.printf("Digite sua idade de Nascimento: ");
        int nascimento = ler.nextInt();

        int idade = ano - nascimento;

        if (idade < 18){
            System.out.println("Voce é Menor de Idade");
        } else {
            System.out.println("Voce é Maior de Idade");
        }

        return idade ;
    }

    public static String dicas(){
        return "Dica de Site Para Treinar a Logica de Estrurura de Metodos: https://silentteacher.toxicode.fr/ ";
    }





}
