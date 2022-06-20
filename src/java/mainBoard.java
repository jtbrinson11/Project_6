import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class mainBoard extends JPanel{
    private static final int rows = 50;
    private static final int border = 10;
    private static final Color BackGround = Color.BLUE;
    private static final Color GrassLand = Color.GREEN;
    private static final Color FarmLand = Color.YELLOW;
    private static final Color Forest = new Color(0, 95,30);
    private static final Color Mountain = Color.GRAY;
    private static final Color WorkShop = Color.RED;
    private JTextField[][] gameGrid = new JTextField[rows][rows];

    public mainBoard(){
        JPanel mainGame = new JPanel(new GridLayout(rows, rows));

        mainGame.setBorder(BorderFactory.createEmptyBorder(border, border, border, border));
        mainGame.setBackground(BackGround);
    }

    public static void makeBoard()
    {
        //JPanel mainGame = new mainBoard();
        JFrame frame = new JFrame("Humans vs. Goblins");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000, 1000);

        JButton newGame = new JButton("New Game");
        JButton exitGame = new JButton("Exit Game");
        JButton help = new JButton("Help");

        frame.getContentPane().add(newGame);
        frame.getContentPane().add(exitGame);
        frame.getContentPane().add(help);

        //frame.getContentPane().add(mainGame);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        makeBoard();
    }
}
