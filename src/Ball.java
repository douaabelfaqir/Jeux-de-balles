
import java.awt.*;

public class Ball {

    int x, y;
    int dx, dy;
    int taille = 30;
    Color couleur;

    public Ball(int x, int y, Color couleur) {
        this.x = x;
        this.y = y;
        this.couleur = couleur;

        dx = 3;
        dy = 3;
    }

    public void deplacer(int largeur, int hauteur) {

        x = x + dx;
        y = y + dy;

        if (x <= 0 || x + taille >= largeur) {
            dx = -dx;
        }

        if (y <= 0 || y + taille >= hauteur) {
            dy = -dy;
        }
    }

    public void dessiner(Graphics g) {
        g.setColor(couleur);
        g.fillOval(x, y, taille, taille);
    }
}
