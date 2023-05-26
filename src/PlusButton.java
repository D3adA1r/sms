

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlusButton extends JButton {
    protected CenterPanel centerPanel;
    protected PracaBSC praca;
    public PlusButton(CenterPanel centerPanel) {
        this.centerPanel=centerPanel;
        praca=new PracaBSC();
        this.setText("+");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                centerPanel.dodatPanel.add(praca.create());
                revalidate();
            }
        });


    }

}
