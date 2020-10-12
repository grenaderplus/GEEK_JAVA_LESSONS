package JAVA_BASE.LESSON_7A;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setBounds(400,400, 800,600 );
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Window");

        setLayout(new BorderLayout());

        JButton button1 = new JButton("button 1");
//        button1.setPreferredSize(new Dimension(100,100));
        add(button1, BorderLayout.WEST);

        JButton button2 = new JButton("button 2");
        add(button2, BorderLayout.SOUTH);

        final JTextArea textArea = new JTextArea();
        add(textArea,BorderLayout.CENTER);

        JPanel topPanel = new JPanel(new GridLayout(1,4,10,5));
        for(int i = 0; i < 4; i++){
            JButton button = new JButton("Button " + i);
            button.setBackground(Color.GREEN);
            topPanel.add(button);
        }
        topPanel.setBackground(Color.BLUE);
        add(topPanel, BorderLayout.NORTH);

//        button2.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                textArea.append("Hello!\n");
//            }
//        });
//
//        button1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                textArea.append("Bye\n");
//            }
//        });

        button2.addActionListener(e -> {
                textArea.append("Hello!\n");
        });

        button1.addActionListener(e -> {
            textArea.append("Bye...\n");
        });

        setVisible(true);
    }
}
