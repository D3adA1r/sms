import javax.swing.*;
import java.awt.*;

public class BTSVisualRight extends JPanel {
    protected JLabel numberBTS;
    protected JLabel iloscSMSDone;
    protected JLabel iloscSMSWait;

    public BTSVisualRight(BTSLogicRight btsLogicRight) {
        this.setPreferredSize(new Dimension(200,600));
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));


        //Number BTS
        numberBTS=new JLabel("Number: " + 0);
        numberBTS.setFont(new Font("NumerFont", Font.BOLD, 14));


        //iloscSMSDone
        iloscSMSDone=new JLabel("SMSDONE: " + 0);
        iloscSMSDone.setFont(new Font("NumerFont", Font.BOLD, 14));


        //iloscSMSWait
        iloscSMSWait=new JLabel("SMSWait:" + 0);
        iloscSMSWait.setFont(new Font("NumerFont", Font.BOLD, 14));

        this.add(numberBTS);
        this.add(iloscSMSDone);
        this.add(iloscSMSWait);
    }
}
