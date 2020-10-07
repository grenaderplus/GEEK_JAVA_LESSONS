package JAVA_BASE.LESSON_8;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    static final int WINDOW_X = 500;
    static final int WINDOW_Y = 500;
    static final int WINDOW_W = 505;
    static final int WINDOW_H = 555;

    private BattleField battleField;
    private Menu menu;

    public GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(WINDOW_X, WINDOW_Y, WINDOW_W, WINDOW_H);
        setTitle("TicTacToe");

        battleField = new BattleField(this);
        add(battleField,BorderLayout.CENTER);

        menu = new Menu(this);

        JPanel jPanel = new JPanel(new GridLayout(1, 2));
        JButton buttonStart = new JButton("Start new game");
        JButton buttonExit = new JButton("Exit game");

        jPanel.add(buttonStart);
        jPanel.add(buttonExit);
        add(jPanel, BorderLayout.SOUTH);

        buttonStart.addActionListener(e -> {
           menu.setVisible(true);
        });

        buttonExit.addActionListener(e -> {
            System.exit(0);
        });

        setVisible(true);
    }

    public void startNewGame(int mode, int fieldSize, int winRowSize){
        battleField.startNewGame(mode, fieldSize, winRowSize);
    }
}
