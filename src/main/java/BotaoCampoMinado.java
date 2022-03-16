import javax.swing.*;
import java.awt.*;

public class BotaoCampoMinado extends JButton {
    private int estado;

    public BotaoCampoMinado(){
        this.estado = CampoMinado.TAPADO;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        switch (estado) {
            case CampoMinado.VAZIO:
                setText("");
                setBackground(Color.LIGHT_GRAY);
                break;
            case CampoMinado.TAPADO:
                setText("");
                setBackground(null);
                break;
            // Complete o código que falta …
            case CampoMinado.DUVIDA:
                setText("?");
                setBackground(Color.yellow);
                break;
            case CampoMinado.MARCADO:
                setText("!");
                setBackground(Color.red);
                break;
            default:
                setText(String.valueOf(estado));
                //OU//setText(estado+"");
                setBackground(Color.LIGHT_GRAY);
        }
    }

    /*public void revelarQuadricula(int x, int y) {
        if (estado[x][y] < TAPADO) {
            return;
        }
        if (primeiraJogada) {
            primeiraJogada = false;
            colocarMinas(x, y);
        }
        // TODO…
    }*/

}
