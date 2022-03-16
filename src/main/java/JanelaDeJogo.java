import jdk.jfr.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;

public class JanelaDeJogo extends JFrame {
    private JPanel painelJogo; // painel do jogo. O nome é definido no mod Design, em "field name

    private BotaoCampoMinado[][] botoes;
    private CampoMinado campoMinado;


    public JanelaDeJogo(CampoMinado campoMinado) {
        this.campoMinado = campoMinado;
        var largura = campoMinado.getLargura();
        var altura = campoMinado.getAltura();
        this.botoes = new BotaoCampoMinado[largura][altura];//nova matriz com [largura] por [altura] de botões
        painelJogo.setLayout(new GridLayout(altura, largura));
        // Criar e adicionar os botões à janela
        for (int linha = 0; linha < largura; ++linha) {
            for (int coluna = 0; coluna < altura; ++coluna){
                botoes[linha][coluna] = new BotaoCampoMinado();
                botoes[linha][coluna].setEstado(linha); //assinalar o estado com o seuvalor neste caso o valor da linha
                painelJogo.add(botoes[linha][coluna]);
            }
        }
        setContentPane(painelJogo);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layouts
        //of its subcomponents.
                pack();
        setVisible(true);
    }
}
