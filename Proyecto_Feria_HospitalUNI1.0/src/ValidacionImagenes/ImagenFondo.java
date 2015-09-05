package ValidacionImagenes;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class ImagenFondo extends JDesktopPane {

    public BufferedImage back;

    private final Image IMG = new ImageIcon(getClass().getResource("/Imagenes/fondo_clinica2.jpg")).getImage();

    @Override
    public void paintChildren(Graphics g) {
        g.drawImage(IMG, 0, 0, getWidth(), getHeight(), this);
        super.paintChildren(g);
    }

}
