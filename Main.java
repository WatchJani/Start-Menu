import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Game Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);

        JPanel buttonPanel = new JPanel();
        JPanel New = new JPanel();

        //New.setBackground(Color.RED);
        //New.setLayout(new FlowLayout(FlowLayout.CENTER));
        New.setPreferredSize(new Dimension(500, 500));
        //buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("PLAY");
        JButton button2 = new JButton("OPTION");

        button1.setPreferredSize(new Dimension(250, 70));
        button2.setPreferredSize(new Dimension(250, 70));

        New.add(button1);
        New.add(button2);

        New.setBorder(new EmptyBorder(30, 0, 0, 0)); //EmptyBorder(int top, int left,

        buttonPanel.add(New);
        frame.add(buttonPanel);

        frame.setVisible(true);
    }
}