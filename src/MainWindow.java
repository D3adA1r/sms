

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private LeftPanel leftPanel;
    private CenterPanel centerPanel;
    private RightPanel rightPanel;
    private JScrollPane scrollPane;
    public MainWindow() throws HeadlessException {
        this.setTitle("SMSApp");
        setLayout(new BorderLayout());
        leftPanel=new LeftPanel();
        centerPanel=new CenterPanel();          //Inicjalizacja paneli
        rightPanel=new RightPanel();
        scrollPane=new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        this.getContentPane().add(leftPanel, BorderLayout.WEST);
        this.getContentPane().add(rightPanel,BorderLayout.EAST); // Dodanie paneli z ustawieniem BorderLayout
        this.getContentPane().add(centerPanel,BorderLayout.CENTER);


        pack();

        setVisible(true);
        this.setSize(1920,1080); // Ustawienia okna MainWindow
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow window=new MainWindow();
            }
        });
    }
}
