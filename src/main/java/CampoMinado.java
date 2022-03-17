import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Random;

public class CampoMinado {
    public static final int VAZIO = 0;
    /* de 1 a 8 são o número de minas à volta */
    public static final int TAPADO = 9;
    public static final int DUVIDA = 10;
    public static final int MARCADO = 11;
    public static final int REBENTADO = 12;

    private boolean [][] minas;
    private int[][] estado;
    private final int largura;
    private final int altura;
    private final int numMinas;
    private boolean primeiraJogada;
    private boolean jogoTerminado;
    private boolean jogoDerrotado;

    public CampoMinado(int largura, int altura, int numMinas) {
        this.largura = largura;
        this.altura = altura;
        this.numMinas = numMinas;
        this.primeiraJogada = true;
        this.jogoDerrotado = false;
        this.jogoTerminado = false;
        minas = new boolean[largura][altura]; // Valores começam a false
        estado = new int[largura][altura]; // Valores começam a 0


        for (var x = 0; x < largura; ++x) {
            for (var y = 0; y < altura; ++y) {
                estado[x][y] = TAPADO;
            }
        }
    }

    private void colocarMinas(int exceptoX, int exceptoY) {
        var aleatorio = new Random();
        var x = 0;
        var y = 0;
        System.out.println("Coloca minas");
        for (var i = 0; i < numMinas; ++i) {
            do {
                System.out.println(i+" "+aleatorio);
                x = aleatorio.nextInt(largura);
                y = aleatorio.nextInt(altura);
            } while (minas[x][y] || (x == exceptoX && y == exceptoY));
            minas[x][y] = true;
        }
        System.out.println("Colocou todas as minas");
    }
    public boolean revelarQuadricula(int x, int y, BotaoCampoMinado botao) {

        if(x < 0 && y < 0){
            return false;
        }

        if (jogoTerminado || estado[x][y] < TAPADO) {
            return false;
        }
        if (primeiraJogada) {
            primeiraJogada = false;
            colocarMinas(x, y);
        }
        if(hasMina(x,y)){
            this.jogoTerminado = true;
            this.jogoDerrotado = true;
            botao.setEstado(CampoMinado.REBENTADO);
        }
        if(!hasMina(x,y)){
            estado[x][y] = CampoMinado.VAZIO;
            botao.setEstado(CampoMinado.VAZIO);
            botao.setText(contarMinasVizinhas(x,y)+"");
            if(contarMinasVizinhas(x,y) == 0){
                return true;
            }
        }
        return false;
        // Efetua jogada
        // TODO…
    }

    /*private int revelarMinasVizinhas(int x, int y, BotaoCampoMinado bt) {
        var numMinasVizinhas = 0;
        for (var i = Math.max(0, x - 1); i < Math.min(largura, x + 2); ++i) {
            for (var j = Math.max(0, y - 1); j < Math.min(altura, y + 2); ++j) {
                if (minas[i][j]) {
                    //mudar o estado do botão
                    // CRIAR UMA MATRIZ DE BOTÕES IGUAL Á MATRIZ DE BOTOES DA JANELA DE JOGO
                }
            }
        }
        return numMinasVizinhas;
    }*/

    private int contarMinasVizinhas(int x, int y) {
        var numMinasVizinhas = 0;
        for (var i = Math.max(0, x - 1); i < Math.min(largura, x + 2); ++i) {
            for (var j = Math.max(0, y - 1); j < Math.min(altura, y + 2); ++j) {
                if (minas[i][j]) {
                    ++numMinasVizinhas;
                }
            }
        }
        return numMinasVizinhas;
    }


    public boolean isJogoDerrotado() {
        return jogoDerrotado;
    }

    public boolean isJogoTerminado() {
        return jogoTerminado;
    }

    public int getEstadoQuadricula(int x, int y) {
        return estado[x][y];
    }

    public boolean hasMina(int x, int y) {
        return minas[x][y];
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

}
