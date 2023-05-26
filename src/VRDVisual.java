import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VRDVisual extends JPanel {
    protected JButton off;
    protected JLabel size;
    protected JCheckBox checkBox;
    protected JTextField number;
    protected VRDLogic vrdLogic;


    public VRDVisual(VRDLogic vrdLogic){
        this.vrdLogic=vrdLogic;
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        size=new JLabel("Size");

        //Tworzenie number
        number=new JTextField(vrdLogic.toStringNumber());
        number.setEditable(false);
        number.setPreferredSize(new Dimension(200,20));
        number.setFont(new Font("NumerFont", Font.BOLD, 14));

        //Tworzenie JButton off
        off =new JButton("Off");
        checkBox=new JCheckBox("delete every 10 sekund");
        off.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(size);
                remove(off);
                remove(checkBox);
                revalidate();
            }
        });
        this.add(number);
        this.add(size);
        this.add(checkBox);
        this.add(off);
    }
}
