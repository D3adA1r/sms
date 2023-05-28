import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class Main {
    LeftPanel leftPanel;
    RightPanel rightPanel;
    CenterPanel centerPanel;
    AddButton addButton;
    LinkedList<VBDLogic> vbdLogicLinkedList;
    JScrollPane scrollPane;

    public Main() {
        vbdLogicLinkedList=new LinkedList<>();
        leftPanel=new LeftPanel();
        rightPanel=new RightPanel();
        centerPanel=new CenterPanel();
        scrollPane=new JScrollPane(leftPanel.panel);
        addButton=new AddButton(leftPanel.panel);
        addButton.addActionListener(new AddButtonActionListener(leftPanel.panel,vbdLogicLinkedList));
        leftPanel.add(addButton);
    }

    public static void main(String[] args) {
        Main main=new Main();
    }
}
