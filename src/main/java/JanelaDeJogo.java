import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;

public class JanelaDeJogo extends JFrame {
    private JPanel painelJogo; // painel do jogo. O nome é definido no mod Design, em "field name"
    private JLabel l;

    public JanelaDeJogo() {
        setContentPane(painelJogo);
        l.setText("Jogo de um dado tipo");
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(false); // opcional. Pode optar por fazer depois
    }

    public JLabel getL() {
        return l;
    }
}
