public class App {
    public static void main(String[] args) throws Exception {
        // 1. Estrutura minima
        // System -> classe padrão do Java
        // out -> objeto de saída padrão
        // println -> método que imprime e pula linha
        System.out.println("Hello, World!");

        // class -> Tudo em Java fica dentro de uma classe
        // App -> Nome da classe (deve corresponder ao nome do arquivo: App.java)
        // public -> visível para qualquer outro código
        // static -> permite rodar o método sem criar uma instância (objeto)
        // void -> não retorna nada
        // String[] args -> argumentos da linha de comando

        // 2. Variáveis e tipos
        // Em Java variáveis devem estar dentro de métodos ou como atributos de classe
        int idade = 18;                     // int -> inteiro
        double altura = 1.75;               // double -> número com vírgula
        char letra = 'A';                   // char -> caractere único, aspas simples
        boolean ativo = true;               // boolean -> true/false

        String nome = "Dlleon";           // String -> não é primitivo, usa aspas duplas

        // 3. Operadores
        int a = 10;
        int b = 3;

        int soma = a + b;                   // soma -> 13
        int sub = a - b;                    // sub -> 7
        int mult = a * b;                   // mult -> 30
        int div = a / b;                    // divisão inteira -> 3

        // para obter divisão (com casas decimais), convertemos um operando
        double resultado = (double) a / b;  // -> 3.3333333333333335

        // 4. Condicionais
        // () -> condição
        // {} -> bloco obrigatório (boa prática)
        if (idade >= 18) {                   // usa-se um operador relacional (>, >=, ==, etc.)
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // 5. Laços
        int i = 0;                           // variável de controle para o while
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        // 6. Métodos
        // parâmetros têm tipo
        // método tem tipo de retorno
        int resultadoSoma = somar(2, 3);    // chamando o método somar declarado abaixo
        System.out.println("Resultado da soma: " + resultadoSoma);

        // 7. Classes e objetos
        Pessoa p = new Pessoa("Davi", 20); // criação de objeto com o construtor
        p.apresentar();                      // chamamos o método do objeto

    }

    // método pertence à classe App
    public static int somar(int a, int b) {
        return a + b;
    }
}

// 7. Definição da classe Pessoa
// Só pode haver uma classe pública no arquivo; por isso Pessoa é package-private
class Pessoa {
    String nome;    // atributo de instância
    int idade;      

    // Construtor — usado para inicializar o objeto ao criá-lo
    public Pessoa(String nome, int idade) {
        this.nome = nome;   // 'this' refere-se ao atributo da instância
        this.idade = idade;
    }

    // Método de instância — pertence ao objeto
    void apresentar() {
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos.");
    }
}
