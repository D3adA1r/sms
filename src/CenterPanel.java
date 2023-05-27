
import java.awt.*;
import javax.swing.*;

public class CenterPanel extends JPanel {
    protected PlusButton plus;
    protected MinusButton minus;
    protected JPanel buttonPanel;
    protected JPanel dodatPanel;
    protected BTSLogicLeft btsLogicLeft;
    protected BTSLogicRight btsLogicRight;
    protected BTSVisualLeft btsleft;
    protected BTSVisualRight btsright;




    public CenterPanel() {
        this.setLayout(new BorderLayout());
        //Plus
        plus = new PlusButton(this);
        //Minus
        minus = new MinusButton(this);

        //DodatPanel
        dodatPanel=new JPanel();
        dodatPanel.setLayout(new BoxLayout(dodatPanel,BoxLayout.X_AXIS));
        //ButtonPanel
        buttonPanel=new JPanel();

        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(minus);
        buttonPanel.add(plus);

        btsLogicLeft=new BTSLogicLeft();
        btsLogicRight=new BTSLogicRight();

        btsleft=new BTSVisualLeft(btsLogicLeft);
        btsright=new BTSVisualRight(btsLogicRight);
        this.add(btsleft,BorderLayout.WEST);
        this.add(btsright,BorderLayout.EAST);

        this.add(buttonPanel,BorderLayout.SOUTH);
        this.add(dodatPanel);



    }
}
