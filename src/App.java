import javax.imageio.plugins.jpeg.JPEGHuffmanTable;

public class App {
    public static void main(String[] args) throws Exception {

        // LN significa que vai ter quebra de linha no final
        System.out.println("Bem vindo ao JOGO DO DADO");
        System.out.println("-------------------------------------------------------");

        Dados dados = new Dados();

        Jogador jogador = new Jogador();

        dados.JogarDado();
}
}
