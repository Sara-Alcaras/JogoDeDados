import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) throws Exception {

        // LN significa que vai ter quebra de linha no final
        System.out.println("Bem vindo ao JOGO DO DADO");
        System.out.println("-------------------------------------------------------");
        
        // Cria uma variavel
        char opcao = 's';

        // Cria um objeto para ler valores digitados no teclado
        Scanner teclado = new Scanner(System.in);

        // Laço de repetição = vai repetir a mensagem enquanto a opção for igual a S
        while (opcao == 's')
        {
            System.out.println("Lançando o dado...");
            
            // Faz um CAST convertando Math para inteiro
            // Gera 6 números aleatórios
            int dado = (int)(Math.random()*6 + 1);

            // Vai mostrar na tela o valor sorteado
            System.out.println("Face do dado:"  +  dado);

            System.out.println("Deseja lançar o dado novamente?(s/n)");

            // Vai capturar apenas a primeira letra digitada
            opcao = teclado.next().charAt(0);
        }
    }
}
