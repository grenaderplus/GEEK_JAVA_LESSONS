package JAVA_BASE.LESSON_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleField extends JPanel {
    private GameWindow gameWindow;

    private int mode;
    private int fieldSize;
    private int winRowSize;

    private boolean isInit;

    int cellWidth;
    int cellHeight;

    public BattleField(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeight;

                System.out.println(cellY + " " + cellX);

                if(!GameLogic.isGameFinished){
                    GameLogic.humanTurn(cellX, cellY);

//                    if(GameLogic.isGameFinished){
//                        result;
//                    }
                }
                repaint();
            }
        });
    }

    public void startNewGame(int mode, int fieldSize, int winRowSize) {
        this.mode = mode;
        this.fieldSize = fieldSize;
        this.winRowSize = winRowSize;

        isInit = true;

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (!isInit) {
            return;
        }

        cellWidth = getWidth() / fieldSize;
        cellHeight = getHeight() / fieldSize;

        for (int i = 0; i < fieldSize; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, getWidth(), y);
        }

        for (int i = 0; i < fieldSize; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, getHeight());
        }

        for (int i = 0; i < GameLogic.SIZE; i++) {
            for (int j = 0; j < GameLogic.SIZE; j++) {
                if (GameLogic.map[i][j] == GameLogic.DOT_X) {
                    drawX(g, j, i);
                }
                if (GameLogic.map[i][j] == GameLogic.DOT_O) {
                    drawO(g, j, i);
                }
            }
        }
    }

    private void drawO(Graphics g, int cellX, int cellY) {
        g = (Graphics2D)g;
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.setColor(Color.red);
        g.drawOval(cellX*cellWidth,cellY*cellHeight,cellWidth,cellHeight);
    }

    private void drawX(Graphics g, int cellX, int cellY) {
        g = (Graphics2D)g;
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.setColor(Color.blue);
        g.drawLine(cellX * cellWidth, cellY * cellHeight, (cellX + 1) * cellHeight, (cellY + 1) * cellHeight);
        g.drawLine((cellX + 1) * cellWidth, cellY * cellHeight, cellX * cellWidth, (cellY + 1) * cellHeight);
    }
}
