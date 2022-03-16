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
        for (var i = 0; i < numMinas; ++i) {
            do {
                x = aleatorio.nextInt(largura);
                y = aleatorio.nextInt(altura);
            } while (minas[x][y] || (x == exceptoX && y == exceptoY));
            minas[x][y] = true;
        }
    }
    public void revelarQuadricula(int x, int y) {
        if (estado[x][y] < TAPADO) {
            return;
        }
        if (primeiraJogada) {
            primeiraJogada = false;
            colocarMinas(x, y);
        }
        if(hasMina(x,y) || getEstadoQuadricula(x,y) == REBENTADO){
            //terminar o jogo

        }
        // Efetua jogada
        // TODO…
    }

    public int getEstadoQuadricula(int x, int y) {
        return estado[x][y];
    }

    public boolean hasMina(int x, int y) {
        return minas[x][y];
    }


    /*public void revelarQuadricula(int x, int y) {
        if (estado[x][y] < TAPADO) {
            return;
        }
        this.estado[altura][largura] = TAPADO;
    }

    private void colocarMinas(int exceptoX, int exceptoY) {
        var aleatorio = new Random();
        var x = 0;
        var y = 0;
        for (var i = 0; i < numMinas; ++i) {
            do {
                x = aleatorio.nextInt(largura);
                y = aleatorio.nextInt(altura);
            } while (minas[x][y] || (x == exceptoX && y == exceptoY));
            minas[x][y] = true;
        }
    }*/

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

}
