
import java.awt.*;
import javax.swing.*;

public class CenterPanel extends JPanel {
    protected PlusButton plus;
    protected MinusButton minus;
    protected JPanel buttonPanel;
    protected JPanel dodatPanel;
    protected BTSLogic btsLogicLeft;
    protected BTSLogic btsLogicRight;
    protected BTSVisual btsleft;
    protected BTSVisual btsright;




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

        btsLogicLeft=new BTSLogic(1);
        btsLogicRight=new BTSLogic(2);

        btsleft=new BTSVisual(btsLogicLeft);
        btsright=new BTSVisual(btsLogicRight);
        this.add(btsleft,BorderLayout.WEST);
        this.add(btsright,BorderLayout.EAST);

        this.add(buttonPanel,BorderLayout.SOUTH);
        this.add(dodatPanel);



    }
}
