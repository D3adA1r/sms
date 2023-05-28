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
    AddButtonActionListener addButtonActionListener;
    LinkedList<VRDLogic> vrdLogicLinkedList;

    public Main() {
        vbdLogicLinkedList=new LinkedList<>();
        vrdLogicLinkedList=new LinkedList<>();
        leftPanel=new LeftPanel();
        rightPanel=new RightPanel();
        centerPanel=new CenterPanel();
        scrollPane=new JScrollPane(leftPanel.panel);
        addButton=new AddButton(leftPanel.panel);
        addButtonActionListener=new AddButtonActionListener(leftPanel.panel,vbdLogicLinkedList);
        addButton.addActionListener(addButtonActionListener);
        vbdLogicLinkedList=addButtonActionListener.getVbdLogicLinkedList();
        leftPanel.add(addButton);
        vrdLogicLinkedList=rightPanel.getVrdLogicLinkedList();
    }

    public static void main(String[] args) {
        Main main=new Main();
    }
}
