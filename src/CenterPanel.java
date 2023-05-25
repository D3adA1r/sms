
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CenterPanel extends JPanel {
    protected PlusButton plus;
    protected MinusButton minus;
    protected JPanel buttonPanel;
    protected JPanel dodatPanel;
    protected BTS btsleft;
    protected BTS btsright;
    protected BSCVisual bscVisual;

    public CenterPanel() {
        this.setLayout(new BorderLayout());
        //Plus
        plus = new PlusButton(this);
        //Minus
        minus = new MinusButton();

        //DodatPanel
        dodatPanel=new JPanel();
        dodatPanel.setLayout(new BoxLayout(dodatPanel,BoxLayout.X_AXIS));
        //ButtonPanel
        buttonPanel=new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(minus);
        buttonPanel.add(plus);


        btsleft=new BTS();
        btsright=new BTS();
        this.add(btsleft,BorderLayout.WEST);
        this.add(btsright,BorderLayout.EAST);

        this.add(buttonPanel,BorderLayout.SOUTH);
        this.add(dodatPanel);


    }
}
