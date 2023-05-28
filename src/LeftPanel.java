

import javax.swing.*;
import java.awt.*;
public class LeftPanel extends JPanel {
    JScrollPane scrollPanel;
     JPanel panel;

    public LeftPanel() {
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(230, 600));

        // Panel
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        scrollPanel = new JScrollPane(panel);



    }
}
