

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
                BSCLogic logic=new BSCLogic();
                BSCVisual visual=new BSCVisual(logic);
                centerPanel.dodatPanel.add(visual,BoxLayout.X_AXIS);

                revalidate();
            }
        });
    }
}
