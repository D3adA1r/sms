import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinusButton extends JButton {
    CenterPanel centerPanel;
    PracaBSC pracaBSC;

    public MinusButton(CenterPanel centerPanel) {
        this.setText("-");
        this.centerPanel = centerPanel;
        pracaBSC=new PracaBSC();

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Component[] components=centerPanel.dodatPanel.getComponents();
               if(components.length>0) {
                   Component comp = components[components.length - 1];
                   centerPanel.dodatPanel.remove(comp);
                   revalidate();

               }
            }
        });
    }
}
