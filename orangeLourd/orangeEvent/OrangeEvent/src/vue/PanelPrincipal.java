package vue;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class PanelPrincipal extends JPanel
{
    public PanelPrincipal(String message)
    {
        this.setBounds(10, 80, 860, 540);
        this.setLayout(null);
        this.setBackground(Color.gray);
        JLabel lbTitre = new JLabel(message);
        lbTitre.setBounds(350, 30, 200, 20);
        this.add(lbTitre);

        this.setVisible(false);
    }
}
