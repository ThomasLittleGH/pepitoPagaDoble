/*
 * Clase que recupera el numero del resultado final del dado.
 */
package clases;

import javax.swing.ImageIcon;

/**
 * @author Thomas Little
 */
public class ImagenesResultadosDados {

    public ImageIcon iconoPng;

    public ImageIcon pngDado(int dado) {
        switch (dado) {
            case 1:
                iconoPng = new ImageIcon(getClass().getResource("/imagenes/dado1.png"));
                break;
            case 2:
                iconoPng = new ImageIcon(getClass().getResource("/imagenes/dado2.png"));
                break;
            case 3:
                iconoPng = new ImageIcon(getClass().getResource("/imagenes/dado3.png"));
                break;
            case 4:
                iconoPng = new ImageIcon(getClass().getResource("/imagenes/dado4.png"));
                break;
            case 5:
                iconoPng = new ImageIcon(getClass().getResource("/imagenes/dado5.png"));
                break;
            case 6:
                iconoPng = new ImageIcon(getClass().getResource("/imagenes/dado6.png"));
                break;
        }
        return iconoPng;
    }
}
