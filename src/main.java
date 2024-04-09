import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Domino");
        frame.setContentPane(new Domino().cbLinks.getParent());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(frame.getPreferredSize());
        frame.setVisible(true);
    }
}
