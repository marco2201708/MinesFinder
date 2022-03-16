import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoCampoMinado extends JButton {
    private int estado;
    private int linha;
    private int coluna;

    public BotaoCampoMinado(int linha, int coluna){
        this.estado = CampoMinado.TAPADO;
        this.linha = linha;
        this.coluna = coluna;
       /* this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/
    }

    public int getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
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



}
