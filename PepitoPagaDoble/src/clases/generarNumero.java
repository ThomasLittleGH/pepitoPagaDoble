/*
 * Clase que permite generar los numeros al alzar.
 */

package clases;

import java.util.Random;

/**
 * @author Thomas Little
 */
public class generarNumero {
    public int generarNumero() {
        Random numeroAleatoreo = new Random();
        return numeroAleatoreo.nextInt(6)+1;
    }    
}
