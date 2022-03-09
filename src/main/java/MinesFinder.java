import javax.swing.*;
import java.awt.event.ActionEvent;

public class MinesFinder extends JFrame {
    private JPanel painelPrincipal;
    private JLabel MinesFinder;
    private JButton btnFacil;
    private JButton btnMedio;
    private JButton btnDificil;
    private JButton btnSair;
    private JLabel Recordes;
    private JanelaDeJogo jogoFacil;
    private JanelaDeJogo jogoMedio;
    private JanelaDeJogo jogoDificil;

    public MinesFinder(String title){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
        btnSair.addActionListener(this::btnSairActionPreformed);
        btnFacil.addActionListener(this::btnJogoFacil);
        btnMedio.addActionListener(this::btnJogoMedio);
        btnDificil.addActionListener(this::btnJogoDificil);
    }

    private void btnSairActionPreformed(ActionEvent e){
        System.exit(0);
    }

    private void btnJogoFacil(ActionEvent e){
        jogoFacil = new JanelaDeJogo();
        jogoFacil.setVisible(true);
        jogoFacil.setSize(800,600);
        jogoFacil.getL().setText("Jogo Fácil");
    }
    private void btnJogoMedio(ActionEvent e){
        jogoMedio = new JanelaDeJogo();
        jogoMedio.setVisible(true);
        jogoMedio.setSize(800,600);
        jogoMedio.getL().setText("Jogo Médio");
    }
    private void btnJogoDificil(ActionEvent e){
        jogoDificil = new JanelaDeJogo();
        jogoDificil.setVisible(true);
        jogoDificil.setSize(800,600);
        jogoDificil.getL().setText("Jogo Difícil");
    }

    public static void main(String args[]){
        new MinesFinder("MainsFinder").setVisible(true);
    }
}
