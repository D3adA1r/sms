

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinusButton extends JButton {
    public MinusButton() {
        this.setText("-");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //   remove(dodatPanel);
                revalidate();
            }
        });
    }
}
