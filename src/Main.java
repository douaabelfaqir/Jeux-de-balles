
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {

        setTitle("Jeu de balles");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        BallPanel panneau = new BallPanel();

        JButton ajouter = new JButton("Ajouter une balle");
        JButton reset = new JButton("Reinitialiser");

        ajouter.addActionListener(e -> {
            panneau.ajouterBalle();
        });

        reset.addActionListener(e -> {
            panneau.reinitialiser();
        });

        JPanel barre = new JPanel();
        barre.add(ajouter);
        barre.add(reset);

        add(barre, BorderLayout.NORTH);
        add(panneau, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
