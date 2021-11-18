/*
 * Clase principal menu que realiza el juego de pepito
 */
package clases;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Thomas Little
 */
public class pepito extends JFrame implements ActionListener {

    // Definicion de variables
    private JButton btnTirar;
    private JTabbedPane tbdPane;
    private JScrollPane scpScroll;
    private JPanel panInstrucciones, panJugar, panDados, panApuesta;
    private JTextArea txaInstrucciones;
    private JTextField txfApuesta;
    private JLabel lblDado1, lblDado2, lblBalance;
    private JRadioButton rdbMenor7, rdbIgual7, rdbMayor7;
    private ButtonGroup btgApuesta;
    private double balance = 1000;
    imagenesDados objDadoGif;
    int dado1;
    int dado2;

    public pepito() {
        initComponentes();
        initTabbedPane();
        initPanelInstrucciones();
        initJugar();

    }

    private void initJugar() {
        BoxLayout bl = new BoxLayout(panJugar, BoxLayout.Y_AXIS);

        panJugar.setLayout(bl);
        objDadoGif = new imagenesDados();

        panJugar.add(panDados);
        panJugar.add(panApuesta);

        panJugar.setBackground(Color.gray);
        panDados.setBackground(Color.gray);
        panDados.add(lblDado1);
        panDados.add(lblDado2);
        panDados.setBorder(BorderFactory.createTitledBorder("Dados"));
        lblDado1.setSize(93, 93);
        lblDado2.setSize(93, 93);

        panApuesta.setBackground(Color.lightGray);
        panApuesta.add(rdbMenor7);
        panApuesta.add(rdbIgual7);
        panApuesta.add(rdbMayor7);
        panApuesta.add(lblBalance);
        panApuesta.add(txfApuesta);

        rdbMenor7.setText("< 7");
        rdbIgual7.setText("7");
        rdbMayor7.setText("> 7");

        btgApuesta.add(rdbMenor7);
        btgApuesta.add(rdbIgual7);
        btgApuesta.add(rdbMayor7);
        panApuesta.setBorder(BorderFactory.createTitledBorder("Apostar"));

        lblDado1.setIcon(objDadoGif.gifDado(1));
        lblDado2.setIcon(objDadoGif.gifDado(1));

        panApuesta.add(btnTirar);
        btnTirar.addActionListener(this);

    }

    private void initPanelInstrucciones() {
        panInstrucciones.add(scpScroll);
        scpScroll.add(txaInstrucciones);
        txaInstrucciones.setEditable(false);
        txaInstrucciones.setColumns(38);
        txaInstrucciones.setRows(19);
        scpScroll.setViewportView(txaInstrucciones);
        txaInstrucciones.setText("1.Introducción\n"
                + "Tiempo de juego: indeterminado. Los participantes pueden entrar o salir del juego cuando así lo deseen.\n"
                + "Número de jugadores: variable. Tantos jugadores como puedan acomodarse junto a la mesa.\n"
                + "Número de dados: dos.\n"
                + "\n"
                + "Llamado también \"Over and Under Seven\", es un juego de casino de acción rápida en el cual las apuestas se determinan con un solo tiro de los dados. En el casino, algunos diagramas del \"Pase Inglés\" incluyen uno de este juego.\n"
                + "\n"
                + "2.Objetivo\n"
                + "Apostar a que saldrá un número mayor o menor de 7 o dicho número.\n"
                + "\n"
                + "3.Comienzo\n"
                + "Los jugadores se acomodan alrededor de la mesa sobre la cual hay un diagrama donde están marcadas las apuestas disponibles y lo que se paga por cada una de ellas.\n"
                + "\n"
                + "Para apostar, el jugador coloca una ficha en la sección del diagrama que indica la apuesta que desee hacer. Generalmente, el casino fija un límite en el monto de las apuestas.\n"
                + "\n"
                + "A continuación damos el ejemplo del diagrama de este juego:\n"
                + "\n"
                + "Menos: paga lo apostado\n"
                + "7: 3-1(ó 4-1)\n"
                + "Más: paga lo apostado\n"
                + "\n"
                + "4.Desarrollo\n"
                + "Los jugadores apuestan a Más, Menos o a 7. Si el resultado de un tiro es de Menos 7, el casino pagará una suma semejante a la apostada a todos los que jugaron a Menos y se llevará todas las apuestas de los que apostaron a 7 o a Más.\n"
                + "\n"
                + "Si el resultado del tiro es más de 7, el casino pagará una suma semejante a la apostada a todos los que jugaron a Más y se llevará todas las apuestas de los que jugaron al 7 o a Menos.\n"
                + "\n"
                + "Si sale un 7, el casino pagará 3 a 1 (o 4 a 1) lo apostado, a todos los que jugaron al 7 y se llevará todas las apuestas a Más y a Menos.\n"
                + "\n"
                + "5.Advertencia\n"
                + "Hay treinta y seis combinaciones posibles en un tiro de dos dados. De estas combinaciones, quince son de menos 7, quince de más 7 y seis resultados de 7.\n"
                + "\n"
                + "Nótese que hay veintiuna combinaciones perdedoras que se oponen a quince resultados ganadores, por una apuesta a Más o a Menos. Por lo tanto, el casino está pagando una suma igual a la apostada en una proporción que es realmente de 7 a 5 en contra del jugador. \n Las probabilidades de que no salga un 7, son de 5 a 1 (treinta resultados en que no aparece un 7 contra seis en que sí lo hace). Pero el casino paga solo 3 a 1 (o a veces 4 a 1) por esta apuesta.\n"
                + "\n"
                + "Cuando se juega entre amigos, se deberá pagar en las proporciones correctas o bien turnarse los jugadores para actuar de banqueros.\n"
                + "\n"
                + "Aunque algunos jugadores (o todos ellos) pueden apostar con el banquero en cada tiro, el procedimiento más sencillo es que el tirador apueste en su propio tiro. Los dados pasarán de jugador a jugador lo suficientemente rápido para que ninguno se sienta fuera de acción.");
    }

    private void initComponentes() {
        // Instanciaciones
        txfApuesta = new JTextField("Ingrese apuesta");
        panInstrucciones = new JPanel();
        panJugar = new JPanel();
        panDados = new JPanel();
        panApuesta = new JPanel();
        tbdPane = new JTabbedPane();
        scpScroll = new JScrollPane();
        btnTirar = new JButton("Tirar");
        txaInstrucciones = new JTextArea();
        lblDado1 = new JLabel(" ");
        lblDado2 = new JLabel(" ");
        lblBalance = new JLabel("Balance: " + balance);
        rdbMenor7 = new JRadioButton();
        rdbIgual7 = new JRadioButton();
        rdbMayor7 = new JRadioButton();
        btgApuesta = new ButtonGroup();
    }

    private void initTabbedPane() {
        // Agrego el tbdPane al JFrame
        this.add(tbdPane);
        // Agrego los paneles al tbdPane
        tbdPane.add(panInstrucciones);
        tbdPane.add(panJugar);
        // Le doy un titulo a los paneles
        tbdPane.addTab("Instrucciones", panInstrucciones);
        tbdPane.addTab("Jugar", panJugar);

    }

    public static void main(String[] args) {
        pepito ventana = new pepito();
        ventana.setVisible(true);
        ventana.setSize(500, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dado1 = objDadoGif.generarNumero();
        dado2 = objDadoGif.generarNumero();
        lblDado1.setIcon(objDadoGif.gifDado(dado1));
        lblDado2.setIcon(objDadoGif.gifDado(dado2));
        balance = balance - Double.parseDouble(txfApuesta.getText());

        if ((rdbMenor7.isSelected()) && (dado1 + dado2 < 7)) {
            JOptionPane.showMessageDialog(null, "gano");
            if (Double.parseDouble(txfApuesta.getText()) > 0 && Double.parseDouble(txfApuesta.getText()) < balance) {
                balance = balance + (Double.parseDouble(txfApuesta.getText()) * 1.5);
            }
        }
        else if ((rdbIgual7.isSelected()) && (dado1 + dado2 == 7)) {
            JOptionPane.showMessageDialog(null, "gano");
            if (Double.parseDouble(txfApuesta.getText()) > 0 && Double.parseDouble(txfApuesta.getText()) < balance) {
                balance = balance + (Double.parseDouble(txfApuesta.getText()) * 2);
            }
        }
        else if ((rdbMayor7.isSelected()) && (dado1 + dado2 > 7)) {
            JOptionPane.showMessageDialog(null, "gano");
            if (Double.parseDouble(txfApuesta.getText()) > 0 && Double.parseDouble(txfApuesta.getText()) < balance) {
                balance = balance + (Double.parseDouble(txfApuesta.getText()) * 1.5);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "perdio");
        }
        lblBalance.setText("Balance: " + balance);

    }

}
