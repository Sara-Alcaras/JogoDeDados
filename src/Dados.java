import java.util.Scanner;

public class Dados {

    public int dadoUm;
    public int dadoDois;
    
    public static void JogarDado() throws InterruptedException
    {

       // Cria uma variavel
       char opcao = 's';

        // Cria um objeto para ler valores digitados no teclado
        Scanner teclado = new Scanner(System.in);

        // Laço de repetição = vai repetir a mensagem enquanto a opção for igual a S 
        while (opcao == 's')
        {
            System.out.println("Lançando o dado");
            System.out.println(".");
            Thread.sleep(2000);
            System.out.println(".");
            Thread.sleep(2000);
            System.out.println(".");
            Thread.sleep(2000);

            // Faz um CAST convertando Math para inteiro
            // Gera 6 números aleatórios
            int dadoUm = (int)(Math.random()*6 + 1);
            int dadoDois = (int)(Math.random()*6 + 1);
            
            // Vai mostrar na tela o valor sorteado
            System.out.println("Face do dado:"  +  dadoUm);
            System.out.println("Face do dado:"  +  dadoDois);
            if (dadoUm == dadoDois)
            {
                System.out.println("Parbéns, você ganhou");
 
            }else 
            {
                System.out.println("Poxa que pena, você perdeu!");
            }
 
            System.out.println("Deseja jogar o dado novamente?(s/n)");
 
            // Vai capturar apenas a primeira letra digitada
            opcao = teclado.next().charAt(0);
        }
    }
}