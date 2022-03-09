import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesFinder extends JFrame {
    private JPanel painelPrincipal;
    private JLabel MinesFinder;
    private JButton btnFacil;
    private JButton jogoMédioButton;
    private JButton jogoDifícilButton;
    private JButton btnSair;
    private JLabel Recordes;
    private JanelaDeJogo jogoFacil;

    public MinesFinder(String title){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
        btnSair.addActionListener(this::btnSairActionPreformed);
        jogoFacil = new JanelaDeJogo();
        btnFacil.addActionListener(this::btnJogoFacil);
    }

    private void btnSairActionPreformed(ActionEvent e){
        System.exit(0);
    }

    private void btnJogoFacil(ActionEvent e){
        jogoFacil.setVisible(true);
    }

    public static void main(String args[]){
        new MinesFinder("MainsFinder").setVisible(true);
    }
}
