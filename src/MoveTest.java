import javax.swing.*;

public class MoveTest {
    public static void main (String[] args){
        JFrame j1 = new JFrame();
        Move m1 = new Move();
        j1.setContentPane(m1);
        j1.setVisible(true);
        j1.setSize(500,520);
        j1.setResizable(false);
        j1.setTitle("Move An Image By Using Click Button");

    }
}
