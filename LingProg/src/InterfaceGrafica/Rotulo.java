package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class Rotulo extends JFrame {

    private JLabel jLabel1; // JLabel só com texto
    private JLabel jLabel2; // JLabel contruído com texto e ícone
    private JLabel jLabel3; // JLabel com texto e icone adicionados

    public Rotulo(){
        super("Testando JLabel");
        setLayout(new FlowLayout());

        jLabel1 = new JLabel("Label com texto");
        jLabel1.setToolTipText("Esta é a Label 1");
        add(jLabel1);

        Icon bug = new ImageIcon(getClass().getResource("img/bug.gif"));
        jLabel2 = new JLabel("Label com texto e icon", bug, SwingConstants.LEFT);
        jLabel2.setToolTipText("Esta é a label 2");
        add(jLabel2);

        jLabel3 = new JLabel();
        jLabel3.setText("Label com texto e icone abaixo");
        jLabel3.setIcon(bug);
        jLabel3.setVerticalTextPosition(SwingConstants.BOTTOM);
        jLabel3.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabel3.setToolTipText("Esta é a label 3");
        add(jLabel3);
    }
}
