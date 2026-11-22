
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BallPanel extends JPanel {

    ArrayList<Ball> balles = new ArrayList<>();

    Timer timer;

    public BallPanel() {

        setBackground(Color.WHITE);

        balles.add(new Ball(100, 100, Color.RED));

        timer = new Timer(10, e -> {
            for (Ball b : balles) {
                b.deplacer(getWidth(), getHeight());
            }

            repaint();
        });

        timer.start();
    }

    public void ajouterBalle() {
        int x = 50 + (int)(Math.random() * 400);
        int y = 50 + (int)(Math.random() * 250);

        Color couleur = new Color(
                (int)(Math.random() * 256),
                (int)(Math.random() * 256),
                (int)(Math.random() * 256)
        );

        balles.add(new Ball(x, y, couleur));
        repaint();
    }

    public void reinitialiser() {
        balles.clear();
        balles.add(new Ball(100, 100, Color.RED));
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Ball b : balles) {
            b.dessiner(g);
        }
    }
}
