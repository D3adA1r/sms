

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class RightPanel extends JPanel {
    protected JButton add;
   protected JScrollPane scrollPane;
   protected JPanel panel;
   protected LinkedList<VRDLogic> vrdLogicLinkedList;


    public RightPanel() {

        this.setLayout(new BorderLayout());
        vrdLogicLinkedList=new LinkedList<>();

        //Dodanie JScrollPane
        panel=new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        scrollPane=new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane,BorderLayout.CENTER);

        //Dodanie JButton add
        add=new JButton("Add");
        add.setPreferredSize(new Dimension(200,50));
        this.add(add,BorderLayout.SOUTH);
        //Dodanie checkBox

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VRDLogic vrdLogic=new VRDLogic();
                vrdLogicLinkedList.add(vrdLogic);
                VRDVisual vrdVisual=new VRDVisual(vrdLogic);
                Border border = BorderFactory.createLineBorder(Color.BLACK);
                vrdVisual.setBorder(border);
                panel.add(vrdVisual);
                revalidate();
            }
        });

            revalidate();

        //Elementy rightPanel
        this.setBackground(Color.YELLOW);
        this.setPreferredSize(new Dimension(200,600));


    }
    public LinkedList<VRDLogic> getVrdLogicLinkedList(){
        return  vrdLogicLinkedList;
    }
}
