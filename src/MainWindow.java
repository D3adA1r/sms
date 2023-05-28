

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    Main main;
    public MainWindow() throws HeadlessException {
        this.setTitle("SMSApp");
        setLayout(new BorderLayout());
        main=new Main();
        this.add(main.leftPanel);
        this.add(main.centerPanel);
        this.add(main.rightPanel);
        main.leftPanel.add(main.addButton,BorderLayout.SOUTH);
        main.leftPanel.add(main.scrollPane);
        main.addButton.setPreferredSize(new Dimension(200, 50));
        main.scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        this.getContentPane().add(main.leftPanel, BorderLayout.WEST);
        this.getContentPane().add(main.rightPanel,BorderLayout.EAST); // Dodanie paneli z ustawieniem BorderLayout
        this.getContentPane().add(main.centerPanel,BorderLayout.CENTER);

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
