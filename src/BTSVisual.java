import javax.swing.*;
import java.awt.*;

public class BTSVisual extends JPanel {
    protected JLabel numberBTS;
    protected JLabel iloscSMSDone;
    protected JLabel iloscSMSWait;
    public BTSVisual(BTSLogic btsLogic) {
        this.setPreferredSize(new Dimension(200,600));
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        //Number BTS
        numberBTS=new JLabel("Number..");
        numberBTS.setFont(new Font("NumerFont", Font.BOLD, 14));


        //iloscSMSDone
        iloscSMSDone=new JLabel("SMSDONE...");
        iloscSMSDone.setFont(new Font("NumerFont", Font.BOLD, 14));


        //iloscSMSWait
        iloscSMSWait=new JLabel("SMSWait");
        iloscSMSWait.setFont(new Font("NumerFont", Font.BOLD, 14));

        this.add(numberBTS);
        this.add(iloscSMSDone);
        this.add(iloscSMSWait);
    }
}
