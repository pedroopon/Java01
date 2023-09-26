import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        //System.out.println("hello word");

        // System.out.println(buscarNome()); OU

       /* String inserirNome = buscarNome();

        System.out.println(inserirNome); */

       // double imc = calcularIMC();

       // System.out.println("Seu IMC é: " + imc);

      /*  String dica = dicas();
        System.out.println(dica);

        int idade = calculoDeIdade();

        System.out.println("Sua Idade é: " + idade); */


        // sempre colocar um metodo ou varias informções dentro de uma variavel
        // quando usar o tipo de variavel: List, mudar o tipo dela em todos os lugares
       List<String> resumopessoa = resumoDaPessoa();

        System.out.println(resumopessoa);

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

        if (idade < 18) {
            System.out.println("Voce é Menor de Idade");
        } else {
            System.out.println("Voce é Maior de Idade");
        }

        return idade;
    }

    // muda o tipo do metodo para: List
    public static List<String> resumoDaPessoa(){

    // List <o tipo de variavel que vai aqui é a do tipo do retorno do metodo>
        List<String> nomesResumos = new ArrayList<>();

        for (int i = 1; i < 4; i++){
            Scanner ler = new Scanner(System.in);

            String tipoDePessoa;

            System.out.printf("Digite seu Primeiro Nome: ");
            String nome = ler.next();

            System.out.printf("Digite o seu sobrenome: ");
            String sobrenome = ler.next();

            System.out.printf("Digite o sua idade: ");
            int idade = ler.nextInt();

            String nomeCompleto = nome + " " + sobrenome;

            if(idade <= 17){
                tipoDePessoa = "Menor De Idade";
            } else {
                tipoDePessoa = "Maior De Idade";
            }
        // sempre juntas varias informações ou variaveis em uma só variavel
            String resumo = "O Nome Completo é: " + nomeCompleto + ", e tem:  " + idade + " Anos de Idade, e è " + tipoDePessoa;

            // nome da lista + .add(adicionar 1 laço por lista), .all(adicionar tudo de uma vez)  (variavel que juntou/ agrupou tudo)=
            nomesResumos.add(resumo);

        }

    // retornar o nome da List (lista)
        return (nomesResumos);

    }







    public static String dicas() {
        return "Dica de Site Para Treinar a Logica de Estrurura de Metodos: https://silentteacher.toxicode.fr/ ";
    }





}
