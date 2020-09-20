package LESSON_8;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    private GameWindow gameWindow;

    static final int WINDOW_X = GameWindow.WINDOW_X + 50;
    static final int WINDOW_Y = GameWindow.WINDOW_Y + 50;
    static final int WINDOW_W = 405;
    static final int WINDOW_H = 400;
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;

    static final int MODE_H_VS_AI = 0;
    static final int MODE_H_VS_H = 1;

    private JRadioButton jrbHumVsAi;
    private JRadioButton jrbHumVsHum;
    private ButtonGroup gameModeGroup;

    private JSlider slFieldSize;
    private JSlider slWinRowSize;

    public Menu(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBounds(WINDOW_X, WINDOW_Y, WINDOW_W, WINDOW_H);
        setTitle("Game settings");

        setLayout(new GridLayout(8,1));
        add(new JLabel("Choose game mode:"));

        jrbHumVsAi = new JRadioButton("Human VS AI",true);
        jrbHumVsHum = new JRadioButton("Human VS Human");
        jrbHumVsHum.setEnabled(false);

        gameModeGroup = new ButtonGroup();
        gameModeGroup.add(jrbHumVsAi);
        gameModeGroup.add(jrbHumVsHum);

        add(jrbHumVsAi);
        add(jrbHumVsHum);

        add(new JLabel("Choose field size:"));
        slFieldSize = new JSlider(MIN_FIELD_SIZE,MAX_FIELD_SIZE,MIN_FIELD_SIZE);
        slFieldSize.setMajorTickSpacing(1);
        slFieldSize.setPaintLabels(true);
        slFieldSize.setPaintTicks(true);
        add(slFieldSize);

        add(new JLabel("Choose win row size:"));
        slWinRowSize = new JSlider(MIN_FIELD_SIZE,MIN_FIELD_SIZE,MIN_FIELD_SIZE);
        slWinRowSize.setMajorTickSpacing(1);
        slWinRowSize.setPaintLabels(true);
        slWinRowSize.setPaintTicks(true);
        add(slWinRowSize);

        slFieldSize.addChangeListener(e ->{
            slWinRowSize.setMaximum(slFieldSize.getValue());
        });

        JButton buttonStartGame = new JButton("START GAME");
        add(buttonStartGame);
        buttonStartGame.addActionListener(e->{
            int mode;
            if(jrbHumVsAi.isSelected()) {
                mode = MODE_H_VS_AI;
            } else {
                mode = MODE_H_VS_H;
            }
            int fieldSize = slFieldSize.getValue();
            int winRowSize = slWinRowSize.getValue();

            GameLogic.SIZE = fieldSize;
            GameLogic.DOTS_TO_WIN = winRowSize;
            GameLogic.initMap();
            GameLogic.isGameFinished = false;

            gameWindow.startNewGame(mode,fieldSize,winRowSize);

            setVisible(false);
        });

        setVisible(false);
    }
}
