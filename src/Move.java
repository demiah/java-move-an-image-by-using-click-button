import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Move extends JPanel implements ActionListener {
    int x=200, y=200;
    private JButton up,down,left,right;
    private ImageIcon image;
    public Move(){
        up = new JButton("UP");
        down = new JButton("DOWN");
        left = new JButton("LEFT");
        right = new JButton("RIGHT");
        add(up); add(down); add(left); add(right);
        up.addActionListener(this); down.addActionListener(this); left.addActionListener(this); right.addActionListener(this);
    }

    public void paintComponent(Graphics g)
    {   image=new ImageIcon("strawberry.jpg");
        super.paintComponent(g);
        image.paintIcon(this, g, x,y );
        this.setPreferredSize(new Dimension(100,100));
        setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent e) {
        if((e.getSource()==up)&&(y>30)){y-=10;}
        else if((e.getSource()==down)&&(y<400)){y+=10;}
        else if((e.getSource()==left)&&(x>0)){x-=10;}
        else if((e.getSource()==right)&&(x<400)){x+=10;}
        repaint();
    }
}
