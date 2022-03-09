import javax.swing.*;

public class JanelaDeJogo extends JFrame {
    private JPanel painelJogo; // painel do jogo. O nome é definido no mod Design, em "field name"
    public JanelaDeJogo() {
        setContentPane(painelJogo);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(false); // opcional. Pode optar por fazer depois.
    }

}
