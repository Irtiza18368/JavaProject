import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;


class Window extends JFrame{
    private static final int Width = 600;
    private static final int Height = 400;
    public Window(){
        setTitle("Snake Game");
        setSize(Width, Height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        setContentPane(contentPane);
    }

    public static void main(String[] args) {
        Window window = new Window();
        window.setVisible(true);
    }
}

