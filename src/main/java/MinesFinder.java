import com.sun.nio.sctp.MessageInfo;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MinesFinder extends JFrame {
    private JPanel painelPrincipal;
    private JLabel MinesFinder;
    private JButton btnFacil;
    private JButton btnMedio;
    private JButton jogoDifícilButton;
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
        jogoFacil = new JanelaDeJogo();
        jogoFacil.setSize(800,600);
        btnFacil.addActionListener(this::btnJogoFacil);
        jogoMedio = new JanelaDeJogo();
        jogoMedio.setSize(800,600);
        btnMedio.addActionListener(this::btnJogoMedio);

    }

    private void btnSairActionPreformed(ActionEvent e){
        System.exit(0);
    }

    private void btnJogoFacil(ActionEvent e){
        jogoFacil.setVisible(true);
    }
    private void btnJogoMedio(ActionEvent e){
        jogoMedio.setVisible(true);
    }

    public static void main(String args[]){
        new MinesFinder("MainsFinder").setVisible(true);
    }
}
