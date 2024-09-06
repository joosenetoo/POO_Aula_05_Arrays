//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Arrays {
    public static void main(String[] args) {


        int[] numeros;  // Declaração de um array de inteiros
        numeros = new int[5];  // Inicializa um array de inteiros com tamanho 5

        int[] outrosNumeros = new int[5];  // Declaração e inicialização

        int[] valores = {10, 20, 30, 40, 50};  // Inicialização direta

        System.out.println(valores[0]);  // Saída: 10
        valores[1] = 25;  // Atribuindo novo valor ao índice 1

        for (int i = 0; i < valores.length; i++) {  // `length` retorna o tamanho do array
            System.out.println("Elemento no índice " + i + ": " + valores[i]);
        }

        for (int valor : valores) {
            System.out.println(valor);
        }

//        Loop Externo (i): Percorre as Linhas
//        i = 0: Primeira linha
//        i = 1: Segunda linha
//        i = 2: Terceira linha

//        Loop Interno (j): Percorre as Colunas
//        Para cada valor de i, j percorre todas as colunas da linha i.



        System.out.println("//");

        //int[][] matriz = new int[3][3];  // Cria uma matriz 3x3

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matriz[1][2]);  // Saída: 6

        System.out.println("//");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Elemento na posição (" + i + ", " + j + "): " + matriz[i][j]);
            }
        }

        System.out.println("//");


        matriz[2][1] = 10;  // Modificando o valor na posição (2,1)


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Elemento na posição (" + i + ", " + j + "): " + matriz[i][j]);
            }
        }

        //operacao();





    }


    public static void operacao(){
        int[] numeros = {3, 5, 7, 9, 11};
        int chave = 100;
        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == chave) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Elemento encontrado.");
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}