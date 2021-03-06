import javax.swing.*;
//Swingをインポートする

public class SampleSwing {
    private static JFrame frame;
    private static ImageIcon image;
    private static JLabel label;

    public static void main(String[] args) {
        frame = new JFrame();                                      //JFrameのインスタンス「frame」を生成
        image = new ImageIcon("sample.jpg");
        label = new JLabel(image);

        frame.getContentPane().add(label);
        frame.getContentPane().setLayout(null);
        label.setBounds(0, 0, 640, 480);

        frame.setTitle("SampleSwing");                      //frameのタイトルを指定
        frame.setSize(640, 480);                    //frameのサイズ指定
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //フレームを閉じた時の動作を指定
        frame.setVisible(true);                                //フレームを表示
    }
}