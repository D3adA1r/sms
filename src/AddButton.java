import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends JButton {
    protected JPanel panel;
    protected  BTSLogicLeft btsLogicLeft;
    public AddButton(JPanel panel) {
        this.setText("Add");
        this.setPreferredSize(new Dimension(200, 50));
        this.panel = panel;


    }
}
