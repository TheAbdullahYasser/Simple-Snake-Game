package frame;
import javax.swing.JFrame;
 
public class Frame{
    Screen screen = new Screen();
    public Frame() {
        JFrame frame = new JFrame();
        frame.add(screen);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Snake");
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
//    public static void main(String[] args) {
//        new Frame();
//    }
}
