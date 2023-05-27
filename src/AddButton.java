import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends JButton implements Runnable {
    protected JPanel panel;
    protected  BTSLogicLeft btsLogicLeft;


    public AddButton(JPanel panel) {
        this.btsLogicLeft=btsLogicLeft;
        this.setText("Add");
        this.setPreferredSize(new Dimension(200, 50));
        this.panel = panel;

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread thread=new Thread(new AddButton(panel));
                thread.start();
            }
        });
    }
    @Override
    public void run() {
        String message = JOptionPane.showInputDialog(this, "");
        if (message != null && !message.isEmpty()) {
            VBDLogic vbdLogic = new VBDLogic(message);
            vbdLogic.setNumber();

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    VBDVisual vbdVisual = new VBDVisual(vbdLogic);
                    panel.add(vbdVisual);
                    panel.revalidate();
                    btsLogicLeft=new BTSLogicLeft();
                    btsLogicLeft.getVBD(vbdLogic);


                    //Тут буде метод який буде відправляти повідемлення,принаймні тут він мусить виконуватись щоб
                    //працювати в окремому потоці
                }
            });

            thread.start();
        }
    }
    }




