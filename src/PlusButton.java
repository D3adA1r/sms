

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlusButton extends JButton {
    CenterPanel centerPanel;
    public PlusButton(CenterPanel centerPanel) {
        this.centerPanel=centerPanel;
        this.setText("+");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                centerPanel.bscLogic=new BSCLogic();
                centerPanel.bscVisual=new BSCVisual(centerPanel.bscLogic);
                centerPanel.dodatPanel.add(centerPanel.bscVisual,BoxLayout.X_AXIS);

                revalidate();
            }
        });
    }
}
