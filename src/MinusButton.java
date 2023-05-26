import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinusButton extends JButton {
    CenterPanel centerPanel;

    public MinusButton(CenterPanel centerPanel) {
        this.setText("-");
        this.centerPanel = centerPanel;

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                centerPanel.bscLogic=new BSCLogic();
                centerPanel.bscVisual=new BSCVisual(centerPanel.bscLogic);
                centerPanel.dodatPanel.remove(centerPanel.bscVisual);
                revalidate();
                //ewfwfwfe
            }
        });
    }
}
