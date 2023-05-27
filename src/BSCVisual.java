

import javax.swing.*;
import java.awt.*;

public class BSCVisual extends JPanel {
    protected JLabel numberBSC;
    protected JLabel iloscSMSDone;
    protected JLabel iloscSMSWait;
    protected JPanel dodatPanelBSC;
    public BSCVisual(BSCLogic logic) {

        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        //Number BTS
        numberBSC=new JLabel("Number..");
        numberBSC.setFont(new Font("NumerFont", Font.BOLD, 14));

        //dodatPanelBSC
        dodatPanelBSC=new JPanel();
        dodatPanelBSC.setLayout(new BoxLayout(dodatPanelBSC,BoxLayout.Y_AXIS));
        //iloscSMSDone
        iloscSMSDone=new JLabel("SMSDONE...");
        iloscSMSDone.setFont(new Font("NumerFont", Font.BOLD, 14));


        //iloscSMSWait
        iloscSMSWait=new JLabel("SMSWait");
        iloscSMSWait.setFont(new Font("NumerFont", Font.BOLD, 14));

        dodatPanelBSC.add(numberBSC);
        dodatPanelBSC.add(iloscSMSDone);
        dodatPanelBSC.add(iloscSMSWait);
        this.add(dodatPanelBSC);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setPreferredSize(new Dimension(200,600));

    }
}
