import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class AddButtonActionListener implements ActionListener {
    protected  BTSLogicLeft btsLogicLeft;
    protected JPanel panel;
    protected LinkedList<VBDLogic> vbdLogicLinkedList;

    public AddButtonActionListener(JPanel panel,LinkedList<VBDLogic> vbdLogicLinkedList) {
        this.vbdLogicLinkedList=vbdLogicLinkedList;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                makeVBD();
            }
        });
        thread.start();

    }
    public void makeVBD() {
        String message = JOptionPane.showInputDialog(this, "");
        if (message != null && !message.isEmpty()) {
            VBDLogic vbdLogic = new VBDLogic(message);
           // vbdLogic.setNumber();
            vbdLogicLinkedList.add(vbdLogic);
            System.out.println(vbdLogicLinkedList.size());

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    VBDVisual vbdVisual = new VBDVisual(vbdLogic);
                    btsLogicLeft = new BTSLogicLeft();
                    btsLogicLeft.codeVBD(vbdLogic);
                    panel.add(vbdVisual);
                    panel.revalidate();

                }
            });
            thread.start();
        }
    }
    public LinkedList<VBDLogic> getVbdLogicLinkedList(){
        return vbdLogicLinkedList;
    }
}






