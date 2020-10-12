package JAVA_BASE.LESSON_7A;

import javax.swing.*;
import java.awt.*;

public class MyWindow2 extends JFrame {
    public MyWindow2() {
        setBounds(400,400, 800,600 );
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Window");
//        setLayout(new FlowLayout());
//        setLayout(new GridLayout(3,3));
//
//        for(int i = 0; i < 15; i++){
//            JButton button = new JButton("Button " + i);
//            add(button);
//        }

        final JTextArea textArea = new JTextArea();
        add(textArea,BorderLayout.CENTER);

        final JTextField textField = new JTextField();
        add(textField, BorderLayout.SOUTH);

        JButton button = new JButton("button");
        add(button, BorderLayout.NORTH);

        button.addActionListener(e->{;
            textArea.append(textField.getText() + "\n");
            textField.setText("");
            textField.requestFocus();
        });

        setResizable(false);
        setVisible(true);
    }
}
