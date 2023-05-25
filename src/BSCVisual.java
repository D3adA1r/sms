

import javax.swing.*;
import java.awt.*;

public class BSCVisual extends JPanel {
    public BSCVisual(BSCLogic logic) {
        this.setBackground(new Color(
                (int)(Math.random()*255),
                (int)(Math.random()*255),
        (int)(Math.random()*255)));
        this.setPreferredSize(new Dimension(200,600));
    }
}
