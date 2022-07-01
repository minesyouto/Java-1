import javax.swing.*;
import java.awt.event.*;

public class SampleMouseEvent {
    public static void main(String[] args) {
        SampleFrame sampleFrame = new SampleFrame();

        sampleFrame.setTitle("SampleMouseEvent");
        sampleFrame.setSize(640, 480);

        sampleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sampleFrame.setVisible(true);
    }
}

class SampleFrame extends JFrame implements MouseListener{
    private static ImageIcon image;
    private static JLabel label;

    private int x = 0;
    private int y = 0;

    SampleFrame() {
        image = new ImageIcon("sample.gif");
        label = new JLabel(image);

        this.getContentPane().add(label);
        this.getContentPane().setLayout(null);
        this.getContentPane().addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e){
        x = e.getX();
        y = e.getY();
        label.setBounds(x, y, 64, 64);
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
}
