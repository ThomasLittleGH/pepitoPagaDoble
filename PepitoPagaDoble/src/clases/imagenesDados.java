/*
 * Clase que recupera la imagen del numero del dado
 */
package clases;

import javax.swing.ImageIcon;

/**
 *
 * @author Thomas Little
 */
public class imagenesDados {

    public ImageIcon icono;
    public ImageIcon gifDado(int dado) {
        switch (dado) {
            case 1:
                icono = new ImageIcon(getClass().getResource("/imagenes/dado1.gif"));
                break;
            case 2:
                icono = new ImageIcon(getClass().getResource("/imagenes/dado2.gif"));
                break;
            case 3:
                icono = new ImageIcon(getClass().getResource("/imagenes/dado3.gif"));
                break;
            case 4:
                icono = new ImageIcon(getClass().getResource("/imagenes/dado4.gif"));
                break;
            case 5:
                icono = new ImageIcon(getClass().getResource("/imagenes/dado5.gif"));
                break;
            case 6:
                icono = new ImageIcon(getClass().getResource("/imagenes/dado6.gif"));
                break;
        }
        return icono;
    }

}
