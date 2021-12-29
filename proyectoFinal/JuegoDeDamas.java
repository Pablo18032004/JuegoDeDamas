
package proyectoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JuegoDeDamas extends JFrame{
    public static final int ANCHO = 500;
    public static final int ALTO = 500;
    
    private String jugador1;
    private String jugador2;
    
    private static String port;
    
    private static int mov = 0;
    
    //Botones
    
    private JButton b11;
    private JButton b12;
    private JButton b13;
    private JButton b14;
    private JButton b15;
    private JButton b16;
    private JButton b17;
    private JButton b18;
    private JButton b21;
    private JButton b22;
    private JButton b23;
    private JButton b24;
    private JButton b25;
    private JButton b26;
    private JButton b27;
    private JButton b28;
    private JButton b31;
    private JButton b32;
    private JButton b33;
    private JButton b34;
    private JButton b35;
    private JButton b36;
    private JButton b37;
    private JButton b38;
    private JButton b41;
    private JButton b42;
    private JButton b43;
    private JButton b44;
    private JButton b45;
    private JButton b46;
    private JButton b47;
    private JButton b48;
    private JButton b51;
    private JButton b52;
    private JButton b53;
    private JButton b54;
    private JButton b55;
    private JButton b56;
    private JButton b57;
    private JButton b58;
    private JButton b61;
    private JButton b62;
    private JButton b63;
    private JButton b64;
    private JButton b65;
    private JButton b66;
    private JButton b67;
    private JButton b68;
    private JButton b71;
    private JButton b72;
    private JButton b73;
    private JButton b74;
    private JButton b75;
    private JButton b76;
    private JButton b77;
    private JButton b78;
    private JButton b81;
    private JButton b82;
    private JButton b83;
    private JButton b84;
    private JButton b85;
    private JButton b86;
    private JButton b87;
    private JButton b88;
    
    // Imágenes
    
    private ImageIcon damaBlanca = new ImageIcon("C:\\Users\\VICTOR1\\Documents\\NetBeansProjects\\LabFP2\\src\\imagenes\\circle_white_16_ns.png");
    private ImageIcon damaRoja = new ImageIcon("C:\\Users\\VICTOR1\\Documents\\NetBeansProjects\\LabFP2\\src\\imagenes\\circle_red (1).png");
    
    // Contador
    
    public static int fichasBlancas = 12;
    public static int fichasRojas = 12;
    
    public static void setFichasBlancas(int n){
        fichasBlancas -= 1;
    }
    public static void setFichasRojas(int n){
        fichasRojas -= 1;
    }
    public static int getFichasBlancas(){
        return fichasBlancas;
    }
    public static int getFichasRojas(){
        return fichasRojas;
    }
    
    
    
    public JuegoDeDamas(){
        setTitle("TABLERO DE JUEGO");
        setSize(ANCHO, ALTO);
        setLayout(new GridLayout(8, 8, 0, 0));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearContenido();
        setVisible(true);
    }
    
    private void crearContenido(){
        JOptionPane.showMessageDialog(null, "Este juego se llama DAMAS AGUSTINAS" , "PRESENTACIÓN", JOptionPane.WARNING_MESSAGE);
        jugador1 = JOptionPane.showInputDialog("Escribe tu nombre (Jugador 1)");
        jugador2 = JOptionPane.showInputDialog("Escribe tu nombre (Jugador 2)");
        JOptionPane.showMessageDialog(null, "Bienvenidos!!! \n" + jugador1 + " y " + jugador2 + ", comenzamos el juego\n" 
                + jugador1 + " usa las blancas y " + jugador2 + " usa las rojas", "", JOptionPane.WARNING_MESSAGE);
        
        // JUEGO
        
        b11 = new JButton(damaBlanca);
        b12 = new JButton("   ");
        b13 = new JButton(damaBlanca);
        b14 = new JButton("   ");
        b15 = new JButton(damaBlanca);
        b16 = new JButton("   ");
        b17 = new JButton(damaBlanca);
        b18 = new JButton("   ");
        b21 = new JButton("   ");
        b22 = new JButton(damaBlanca);
        b23 = new JButton("   ");
        b24 = new JButton(damaBlanca);
        b25 = new JButton("   ");
        b26 = new JButton(damaBlanca);
        b27 = new JButton("   ");
        b28 = new JButton(damaBlanca);
        b31 = new JButton(damaBlanca);
        b32 = new JButton("   ");
        b33 = new JButton(damaBlanca);
        b34 = new JButton("   ");
        b35 = new JButton(damaBlanca);
        b36 = new JButton("   ");
        b37 = new JButton(damaBlanca);
        b38 = new JButton("   ");
        b41 = new JButton("   ");
        b42 = new JButton("   ");
        b43 = new JButton("   ");
        b44 = new JButton("   ");
        b45 = new JButton("   ");
        b46 = new JButton("   ");
        b47 = new JButton("   ");
        b48 = new JButton("   ");
        b51 = new JButton("   ");
        b52 = new JButton("   ");
        b53 = new JButton("   ");
        b54 = new JButton("   ");
        b55 = new JButton("   ");
        b56 = new JButton("   ");
        b57 = new JButton("   ");
        b58 = new JButton("   ");
        b61 = new JButton("   ");
        b62 = new JButton(damaRoja);
        b63 = new JButton("   ");
        b64 = new JButton(damaRoja);
        b65 = new JButton("   ");
        b66 = new JButton(damaRoja);
        b67 = new JButton("   ");
        b68 = new JButton(damaRoja);
        b71 = new JButton(damaRoja);
        b72 = new JButton("   ");
        b73 = new JButton(damaRoja);
        b74 = new JButton("   ");
        b75 = new JButton(damaRoja);
        b76 = new JButton("   ");
        b77 = new JButton(damaRoja);
        b78 = new JButton("   ");
        b81 = new JButton("   ");
        b82 = new JButton(damaRoja);
        b83 = new JButton("   ");
        b84 = new JButton(damaRoja);
        b85 = new JButton("   ");
        b86 = new JButton(damaRoja);
        b87 = new JButton("   ");
        b88 = new JButton(damaRoja);
        
        b11.setBackground(Color.BLACK);        
        b11.setText("11");
        b13.setBackground(Color.BLACK);
        b13.setText("13");
        b15.setBackground(Color.BLACK);
        b15.setText("15");
        b17.setBackground(Color.BLACK);
        b17.setText("17");
        b22.setBackground(Color.BLACK);
        b22.setText("22");
        b24.setBackground(Color.BLACK);
        b24.setText("24");
        b26.setBackground(Color.BLACK);
        b26.setText("26");
        b28.setBackground(Color.BLACK);
        b28.setText("28");
        b31.setBackground(Color.BLACK);
        b31.setText("31");
        b33.setBackground(Color.BLACK);
        b33.setText("33");
        b35.setBackground(Color.BLACK);
        b35.setText("35");
        b37.setBackground(Color.BLACK);
        b37.setText("37");
        b42.setBackground(Color.BLACK);
        b42.setText("42");
        b44.setBackground(Color.BLACK);
        b44.setText("44");
        b46.setBackground(Color.BLACK);
        b46.setText("46");
        b48.setBackground(Color.BLACK);
        b48.setText("48");
        b51.setBackground(Color.BLACK);
        b51.setText("51");
        b53.setBackground(Color.BLACK);
        b53.setText("53");
        b55.setBackground(Color.BLACK);
        b55.setText("55");
        b57.setBackground(Color.BLACK);
        b57.setText("57");
        b62.setBackground(Color.BLACK);
        b62.setText("62");
        b64.setBackground(Color.BLACK);
        b64.setText("64");
        b66.setBackground(Color.BLACK);
        b66.setText("66");
        b68.setBackground(Color.BLACK);
        b68.setText("68");
        b71.setBackground(Color.BLACK);
        b71.setText("71");
        b73.setBackground(Color.BLACK);
        b73.setText("73");
        b75.setBackground(Color.BLACK);
        b75.setText("75");
        b77.setBackground(Color.BLACK);
        b77.setText("77");
        b82.setBackground(Color.BLACK);
        b82.setText("82");
        b84.setBackground(Color.BLACK);
        b84.setText("84");
        b86.setBackground(Color.BLACK);
        b86.setText("86");
        b88.setBackground(Color.BLACK);
        b88.setText("88");
        
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(b17);
        add(b18);
        add(b21);
        add(b22);
        add(b23);
        add(b24);
        add(b25);
        add(b26);
        add(b27);
        add(b28);
        add(b31);
        add(b32);
        add(b33);
        add(b34);
        add(b35);
        add(b36);
        add(b37);
        add(b38);
        add(b41);
        add(b42);
        add(b43);
        add(b44);
        add(b45);
        add(b46);
        add(b47);
        add(b48);
        add(b51);
        add(b52);
        add(b53);
        add(b54);
        add(b55);
        add(b56);
        add(b57);
        add(b58);
        add(b61);
        add(b62);
        add(b63);
        add(b64);
        add(b65);
        add(b66);
        add(b67);
        add(b68);
        add(b71);
        add(b72);
        add(b73);
        add(b74);
        add(b75);
        add(b76);
        add(b77);
        add(b78);
        add(b81);
        add(b82);
        add(b83);
        add(b84);
        add(b85);
        add(b86);
        add(b87);
        add(b88);
        
        //  Listeners
        
        b11.addActionListener(new b11Listener());
        b13.addActionListener(new b13Listener());
        b15.addActionListener(new b15Listener());
        b17.addActionListener(new b17Listener());
        b22.addActionListener(new b22Listener());
        b24.addActionListener(new b24Listener());
        b26.addActionListener(new b26Listener());
        b28.addActionListener(new b28Listener());
        b31.addActionListener(new b31Listener());
        b33.addActionListener(new b33Listener());
        b35.addActionListener(new b35Listener());
        b37.addActionListener(new b37Listener());
        b42.addActionListener(new b42Listener());
        b44.addActionListener(new b44Listener());
        b46.addActionListener(new b46Listener());
        b48.addActionListener(new b48Listener());
        b51.addActionListener(new b51Listener());
        b53.addActionListener(new b53Listener());
        b55.addActionListener(new b55Listener());
        b57.addActionListener(new b57Listener());
        b62.addActionListener(new b62Listener());
        b64.addActionListener(new b64Listener());
        b66.addActionListener(new b66Listener());
        b68.addActionListener(new b68Listener());
        b71.addActionListener(new b71Listener());
        b73.addActionListener(new b73Listener());
        b75.addActionListener(new b75Listener());
        b77.addActionListener(new b77Listener());
        b82.addActionListener(new b82Listener());
        b84.addActionListener(new b84Listener());
        b86.addActionListener(new b86Listener());
        b88.addActionListener(new b88Listener());
        
    }
    
    
    public static void main(String[] args){
        new JuegoDeDamas();
    }
    
    private class b11Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b11.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b11.getIcon() == damaBlanca){
                    if(b22.getIcon() == null){
                        b22.setBackground(Color.GREEN);
                        port = b11.getText();
                        mov = 1;
                    }
                    else if(b22.getIcon() == damaRoja && b33.getIcon() == null){
                        b33.setBackground(Color.GREEN);
                        port = b11.getText();
                        mov = 1;
                    }
                    else if((b22.getIcon() == damaBlanca) || (b22.getIcon() != null && b33.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b11.getBackground() == Color.GREEN){
                    if(port.equals(b22.getText())){
                        b11.setBackground(Color.BLACK);
                        b22.setIcon(null);
                        b13.setBackground(Color.BLACK);
                        
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                    }
                    else if(port.equals(b33.getText())){
                        b11.setBackground(Color.BLACK);
                        b33.setIcon(null);
                        b22.setIcon(null);
                        b22.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b15.setBackground(Color.BLACK);
                        
                        fichasBlancas -= 1;
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }    
    private class b13Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b13.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b13.getIcon() == damaBlanca){
                    if(b22.getIcon() == null){
                        b22.setBackground(Color.GREEN);
                        port = b13.getText();
                        mov = 1;
                    }
                    if(b24.getIcon() == null){
                        b24.setBackground(Color.GREEN);
                        port = b13.getText();
                        mov = 1;
                    }
                    if(b22.getIcon() == damaRoja && b31.getIcon() == null){
                        b31.setBackground(Color.GREEN);
                        port = b13.getText();
                        mov = 1;
                    }
                    if(b24.getIcon() == damaRoja && b35.getIcon() == null){
                        b35.setBackground(Color.GREEN);
                        port = b13.getText();
                        mov = 1;
                    }
                    else if((b22.getIcon() == damaBlanca && b24.getIcon() == damaBlanca) || (b22.getIcon() != null && b31.getIcon() != null && b24.getIcon() != null && b35.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b13.getBackground() == Color.GREEN){
                    if(port.equals(b22.getText())){
                        b13.setBackground(Color.BLACK);
                        b22.setIcon(null);
                        b11.setBackground(Color.BLACK);
                        
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                    }
                    else if(port.equals(b24.getText())){
                        b13.setBackground(Color.BLACK);
                        b15.setBackground(Color.BLACK);
                        b24.setIcon(null);
                        
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                    }
                    else if(port.equals(b31.getText())){
                        b13.setBackground(Color.BLACK);
                        b22.setBackground(Color.BLACK);
                        
                        b31.setIcon(null);
                        b22.setIcon(null);
                        fichasBlancas -= 1;
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b35.getText())){
                        b13.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b17.setBackground(Color.BLACK);
                        b35.setIcon(null);
                        b24.setIcon(null);
                        fichasBlancas -= 1;
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b15Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b15.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b15.getIcon() == damaBlanca){
                    if(b24.getIcon() == null){
                        b24.setBackground(Color.GREEN);
                        port = b15.getText();
                        mov = 1;
                    }
                    if(b26.getIcon() == null){
                        b26.setBackground(Color.GREEN);
                        port = b15.getText();
                        mov = 1;
                    }
                    if(b24.getIcon() == damaRoja && b33.getIcon() == null){
                        b33.setBackground(Color.GREEN);
                        port = b15.getText();
                        mov = 1;
                    }
                    if(b26.getIcon() == damaRoja && b37.getIcon() == null){
                        b37.setBackground(Color.GREEN);
                        port = b15.getText();
                        mov = 1;
                    }
                    else if((b24.getIcon() == damaBlanca && b26.getIcon() == damaBlanca) || (b24.getIcon() != null && b33.getIcon() != null && b26.getIcon() != null && b37.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b15.getBackground() == Color.GREEN){
                    if(port.equals(b24.getText())){
                        b13.setBackground(Color.BLACK);
                        b24.setIcon(null);
                        b15.setBackground(Color.BLACK);
                        
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                    }
                    else if(port.equals(b26.getText())){
                        b17.setBackground(Color.BLACK);
                        b15.setBackground(Color.BLACK);
                        b26.setIcon(null);
                        
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                    }
                    else if(port.equals(b33.getText())){
                        b11.setBackground(Color.BLACK);
                        b22.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b15.setBackground(Color.BLACK);
                        
                        b33.setIcon(null);
                        b24.setIcon(null);
                        fichasBlancas -= 1;
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b37.getText())){
                        b15.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b28.setBackground(Color.BLACK);
                        b37.setIcon(null);
                        b26.setIcon(null);
                        fichasBlancas -= 1;
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b17Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b17.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b17.getIcon() == damaBlanca){
                    if(b26.getIcon() == null){
                        b26.setBackground(Color.GREEN);
                        port = b17.getText();
                        mov = 1;
                    }
                    if(b28.getIcon() == null){
                        b28.setBackground(Color.GREEN);
                        port = b17.getText();
                        mov = 1;
                    }
                    if(b26.getIcon() == damaRoja && b35.getIcon() == null){
                        b35.setBackground(Color.GREEN);
                        port = b17.getText();
                        mov = 1;
                    }
                    else if((b26.getIcon() == damaBlanca && b26.getIcon() == damaBlanca) || (b26.getIcon() != null && b35.getIcon() != null && b28.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b17.getBackground() == Color.GREEN){
                    if(port.equals(b26.getText())){
                        b15.setBackground(Color.BLACK);
                        b26.setIcon(null);
                        b17.setBackground(Color.BLACK);
                        
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                    }
                    else if(port.equals(b28.getText())){
                        b17.setBackground(Color.BLACK);
                        b28.setIcon(null);
                        
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                    }
                    else if(port.equals(b35.getText())){
                        b13.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b17.setBackground(Color.BLACK);
                        
                        b35.setIcon(null);
                        b26.setIcon(null);
                        fichasBlancas -= 1;
                        if(b82.getIcon() == null){
                            b82.setIcon(damaRoja);
                        }
                        else if(b84.getIcon() == null){
                            b84.setIcon(damaRoja);
                        }
                        else if(b86.getIcon() == null){
                            b86.setIcon(damaRoja);
                        }
                        else if(b88.getIcon() == null){
                            b88.setIcon(damaRoja);
                        }
                        else if(b71.getIcon() == null){
                            b71.setIcon(damaRoja);
                        }
                        else if(b73.getIcon() == null){
                            b73.setIcon(damaRoja);
                        }
                        else if(b75.getIcon() == null){
                            b75.setIcon(damaRoja);
                        }
                        else if(b77.getIcon() == null){
                            b77.setIcon(damaRoja);
                        }
                        else if(b62.getIcon() == null){
                            b62.setIcon(damaRoja);
                        }
                        else if(b64.getIcon() == null){
                            b64.setIcon(damaRoja);
                        }
                        else if(b66.getIcon() == null){
                            b66.setIcon(damaRoja);
                        }
                        else if(b68.getIcon() == null){
                            b68.setIcon(damaRoja);
                        }
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b22Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b22.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b22.getIcon() == damaBlanca){
                    if(b31.getIcon() == null){
                        b31.setBackground(Color.GREEN);
                        port = b22.getText();
                        mov = 1;
                    }
                    if(b33.getIcon() == null){
                        b33.setBackground(Color.GREEN);
                        port = b22.getText();
                        mov = 1;
                    }
                    if(b33.getIcon() == damaRoja && b44.getIcon() == null){
                        b44.setBackground(Color.GREEN);
                        port = b22.getText();
                        mov = 1;
                    }
                    else if((b31.getIcon() == damaBlanca && b33.getIcon() == damaBlanca) || (b33.getIcon() != null && b44.getIcon() != null && b31.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b22.getIcon() == damaRoja){
                    if(b11.getIcon() == null){
                        b11.setBackground(Color.GREEN);
                        port = b22.getText();
                        mov = 1;
                    }
                    if(b13.getIcon() == null){
                        b13.setBackground(Color.GREEN);
                        port = b22.getText();
                        mov = 1;
                    }
                    else if(b11.getIcon() != null && b13.getIcon() != null){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b22.getBackground() == Color.GREEN){
                    if(port.equals(b31.getText())){
                        b13.setBackground(Color.BLACK);
                        b22.setBackground(Color.BLACK);
                        b31.setIcon(null);
                        b22.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b11.getText())){
                        b22.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b11.setIcon(null);
                        b22.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b13.getText())){
                        b22.setBackground(Color.BLACK);
                        b31.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b13.setIcon(null);
                        b22.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b33.getText())){
                        b11.setBackground(Color.BLACK);
                        b22.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b15.setBackground(Color.BLACK);
                        b33.setIcon(null);
                        b22.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b44.getText())){
                        b22.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        
                        b33.setIcon(null);
                        b44.setIcon(null);
                        b22.setIcon(damaRoja);
                        fichasBlancas -= 1;
                        
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b24Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b24.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b24.getIcon() == damaBlanca){
                    if(b33.getIcon() == null){
                        b33.setBackground(Color.GREEN);
                        port = b24.getText();
                        mov = 1;
                    }
                    if(b35.getIcon() == null){
                        b35.setBackground(Color.GREEN);
                        port = b24.getText();
                        mov = 1;
                    }
                    if(b33.getIcon() == damaRoja && b42.getIcon() == null){
                        b42.setBackground(Color.GREEN);
                        port = b24.getText();
                        mov = 1;
                    }
                    if(b35.getIcon() == damaRoja && b46.getIcon() == null){
                        b46.setBackground(Color.GREEN);
                        port = b24.getText();
                        mov = 1;
                    }
                    else if((b33.getIcon() == damaBlanca && b35.getIcon() == damaBlanca) || (b33.getIcon() != null && b42.getIcon() != null && b35.getIcon() != null && b46.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b24.getIcon() == damaRoja){
                    if(b13.getIcon() == null){
                        b13.setBackground(Color.GREEN);
                        port = b24.getText();
                        mov = 1;
                    }
                    if(b15.getIcon() == null){
                        b15.setBackground(Color.GREEN);
                        port = b24.getText();
                        mov = 1;
                    }
                    else if(b13.getIcon() != null && b15.getIcon() != null){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b24.getBackground() == Color.GREEN){
                    if(port.equals(b33.getText())){
                        b11.setBackground(Color.BLACK);
                        b22.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b15.setBackground(Color.BLACK);
                        b33.setIcon(null);
                        b24.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    
                    else if(port.equals(b13.getText())){
                        b22.setBackground(Color.BLACK);
                        b31.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b13.setIcon(null);
                        b24.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b15.getText())){
                        b24.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b15.setIcon(null);
                        b24.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b35.getText())){
                        b13.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b17.setBackground(Color.BLACK);
                        b35.setIcon(null);
                        b24.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b42.getText())){
                        b31.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        
                        b33.setIcon(null);
                        b42.setIcon(null);
                        b24.setIcon(damaRoja);
                        fichasBlancas -= 1;
                        
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b46.getText())){
                        b24.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b28.setBackground(Color.BLACK);
                        
                        b35.setIcon(null);
                        b46.setIcon(null);
                        b24.setIcon(damaRoja);
                        fichasBlancas -= 1;
                        
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b26Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b26.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b26.getIcon() == damaBlanca){
                    if(b35.getIcon() == null){
                        b35.setBackground(Color.GREEN);
                        port = b26.getText();
                        mov = 1;
                    }
                    if(b37.getIcon() == null){
                        b37.setBackground(Color.GREEN);
                        port = b26.getText();
                        mov = 1;
                    }
                    if(b35.getIcon() == damaRoja && b44.getIcon() == null){
                        b44.setBackground(Color.GREEN);
                        port = b26.getText();
                        mov = 1;
                    }
                    if(b37.getIcon() == damaRoja && b48.getIcon() == null){
                        b48.setBackground(Color.GREEN);
                        port = b26.getText();
                        mov = 1;
                    }
                    else if((b35.getIcon() == damaBlanca && b37.getIcon() == damaBlanca) || (b35.getIcon() != null && b44.getIcon() != null && b37.getIcon() != null && b48.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b26.getIcon() == damaRoja){
                    if(b15.getIcon() == null){
                        b15.setBackground(Color.GREEN);
                        port = b26.getText();
                        mov = 1;
                    }
                    if(b17.getIcon() == null){
                        b17.setBackground(Color.GREEN);
                        port = b26.getText();
                        mov = 1;
                    }
                    else if(b15.getIcon() != null && b17.getIcon() != null){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b26.getBackground() == Color.GREEN){
                    if(port.equals(b35.getText())){
                        b13.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b17.setBackground(Color.BLACK);
                        b35.setIcon(null);
                        b26.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b15.getText())){
                        b24.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b15.setIcon(null);
                        b26.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b17.getText())){
                        b26.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b28.setBackground(Color.BLACK);
                        b17.setIcon(null);
                        b26.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b37.getText())){
                        b15.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b28.setBackground(Color.BLACK);
                        b37.setIcon(null);
                        b26.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b44.getText())){
                        b22.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        
                        b44.setIcon(null);
                        b35.setIcon(null);
                        b26.setIcon(damaRoja);
                        fichasBlancas -= 1;
                        
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b48.getText())){
                        b37.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        
                        b37.setIcon(null);
                        b48.setIcon(null);
                        b26.setIcon(damaRoja);
                        fichasBlancas -= 1;
                        
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b28Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b28.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b28.getIcon() == damaBlanca){
                    if(b37.getIcon() == null){
                        b37.setBackground(Color.GREEN);
                        port = b28.getText();
                        mov = 1;
                    }
                    if(b37.getIcon() == damaRoja && b46.getIcon() == null){
                        b46.setBackground(Color.GREEN);
                        port = b28.getText();
                        mov = 1;
                    }
                    else if((b37.getIcon() == damaBlanca) || (b37.getIcon() != null && b46.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b28.getIcon() == damaRoja){
                    if(b17.getIcon() == null){
                        b17.setBackground(Color.GREEN);
                        port = b28.getText();
                        mov = 1;
                    }
                    else if(b17.getIcon() != null){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b28.getBackground() == Color.GREEN){
                    if(port.equals(b37.getText())){
                        b15.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b28.setBackground(Color.BLACK);
                        b37.setIcon(null);
                        b28.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b17.getText())){
                        b26.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b28.setBackground(Color.BLACK);
                        b17.setIcon(null);
                        b28.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b46.getText())){
                        b24.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b28.setBackground(Color.BLACK);
                        
                        b46.setIcon(null);
                        b37.setIcon(null);
                        b28.setIcon(damaRoja);
                        fichasBlancas -= 1;
                        
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b31Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b31.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b31.getIcon() == damaBlanca){
                    if(b42.getIcon() == null){
                        b42.setBackground(Color.GREEN);
                        port = b31.getText();
                        mov = 1;
                    }
                    if(b42.getIcon() == damaRoja && b53.getIcon() == null){
                        b53.setBackground(Color.GREEN);
                        port = b31.getText();
                        mov = 1;
                    }
                    else if((b42.getIcon() == damaBlanca) || (b42.getIcon() != null && b53.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b31.getIcon() == damaRoja){
                    if(b22.getIcon() == null){
                        b22.setBackground(Color.GREEN);
                        port = b31.getText();
                        mov = 1;
                    }
                    if(b22.getIcon() == damaBlanca && b13.getIcon() == null){
                        b13.setBackground(Color.GREEN);
                        port = b31.getText();
                        mov = 1;
                    }
                    else if((b22.getIcon() == damaRoja) || (b22.getIcon() != null && b13.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b31.getBackground() == Color.GREEN){
                    if(port.equals(b22.getText())){
                        b31.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b22.setIcon(null);
                        b31.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b42.getText())){
                        b31.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b42.setIcon(null);
                        b31.setIcon(damaRoja);
                        
                        mov = 0;
                    }       
                    else if(port.equals(b13.getText())){
                        b22.setBackground(Color.BLACK);
                        b31.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b13.setIcon(null);
                        b22.setIcon(null);
                        b31.setIcon(damaBlanca);
                        
                        fichasRojas =- 1;
                        
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }             
                    else if(port.equals(b53.getText())){
                        b42.setBackground(Color.BLACK);
                        b31.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b53.setIcon(null);
                        b42.setIcon(null);
                        b31.setIcon(damaRoja);
                        
                        fichasBlancas =- 1;
                        
                        mov = 0;
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b33Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b33.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b33.getIcon() == damaBlanca){
                    if(b42.getIcon() == null){
                        b42.setBackground(Color.GREEN);
                        port = b33.getText();
                        mov = 1;
                    }
                    if(b44.getIcon() == null){
                        b44.setBackground(Color.GREEN);
                        port = b33.getText();
                        mov = 1;
                    }
                    if(b42.getIcon() == damaRoja && b51.getIcon() == null){
                        b51.setBackground(Color.GREEN);
                        port = b33.getText();
                        mov = 1;
                    }
                    if(b44.getIcon() == damaRoja && b55.getIcon() == null){
                        b55.setBackground(Color.GREEN);
                        port = b33.getText();
                        mov = 1;
                    }
                    else if((b42.getIcon() == damaBlanca && b44.getIcon() == damaBlanca) || (b42.getIcon() != null && b51.getIcon() != null && b44.getIcon() != null && b55.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b33.getIcon() == damaRoja){
                    if(b22.getIcon() == null){
                        b22.setBackground(Color.GREEN);
                        port = b33.getText();
                        mov = 1;
                    }
                    if(b24.getIcon() == null){
                        b24.setBackground(Color.GREEN);
                        port = b33.getText();
                        mov = 1;
                    }
                    if(b22.getIcon() == damaBlanca && b11.getIcon() == null){
                        b11.setBackground(Color.GREEN);
                        port = b33.getText();
                        mov = 1;
                    }
                    if(b24.getIcon() == damaBlanca && b15.getIcon() == null){
                        b15.setBackground(Color.GREEN);
                        port = b33.getText();
                        mov = 1;
                    }
                    
                    else if((b22.getIcon() == damaRoja && b24.getIcon() == damaRoja) || (b22.getIcon() != null && b11.getIcon() != null && b24.getIcon() != null && b15.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b33.getBackground() == Color.GREEN){
                    if(port.equals(b22.getText())){
                        b31.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b22.setIcon(null);
                        b33.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b24.getText())){
                        b33.setBackground(Color.BLACK);
                        b42.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b24.setIcon(null);
                        b33.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b42.getText())){
                        b31.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b42.setIcon(null);
                        b33.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b44.getText())){
                        b22.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b44.setIcon(null);
                        b33.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b11.getText())){
                        b22.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b11.setIcon(null);
                        b22.setIcon(null);
                        b33.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b15.getText())){
                        b24.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b15.setIcon(null);
                        b24.setIcon(null);
                        b33.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b51.getText())){
                        b42.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b51.setIcon(null);
                        b42.setIcon(null);
                        b33.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b55.getText())){
                        b44.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b55.setIcon(null);
                        b44.setIcon(null);
                        b33.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b35Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b35.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b35.getIcon() == damaBlanca){
                    if(b44.getIcon() == null){
                        b44.setBackground(Color.GREEN);
                        port = b35.getText();
                        mov = 1;
                    }
                    if(b46.getIcon() == null){
                        b46.setBackground(Color.GREEN);
                        port = b35.getText();
                        mov = 1;
                    }
                    if(b44.getIcon() == damaRoja && b53.getIcon() == null){
                        b53.setBackground(Color.GREEN);
                        port = b35.getText();
                        mov = 1;
                    }
                    if(b46.getIcon() == damaRoja && b57.getIcon() == null){
                        b57.setBackground(Color.GREEN);
                        port = b35.getText();
                        mov = 1;
                    }
                    else if((b44.getIcon() == damaBlanca && b46.getIcon() == damaBlanca) || (b44.getIcon() != null && b53.getIcon() != null && b46.getIcon() != null && b57.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b35.getIcon() == damaRoja){
                    if(b24.getIcon() == null){
                        b24.setBackground(Color.GREEN);
                        port = b35.getText();
                        mov = 1;
                    }
                    if(b26.getIcon() == null){
                        b26.setBackground(Color.GREEN);
                        port = b35.getText();
                        mov = 1;
                    }
                    if(b24.getIcon() == damaBlanca && b13.getIcon() == null){
                        b13.setBackground(Color.GREEN);
                        port = b35.getText();
                        mov = 1;
                    }
                    if(b26.getIcon() == damaBlanca && b17.getIcon() == null){
                        b17.setBackground(Color.GREEN);
                        port = b35.getText();
                        mov = 1;
                    }
                    
                    else if((b24.getIcon() == damaRoja && b26.getIcon() == damaRoja) || (b24.getIcon() != null && b13.getIcon() != null && b26.getIcon() != null && b17.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b35.getBackground() == Color.GREEN){
                    if(port.equals(b24.getText())){
                        b33.setBackground(Color.BLACK);
                        b42.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b24.setIcon(null);
                        b35.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b26.getText())){
                        b35.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b26.setIcon(null);
                        b35.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b44.getText())){
                        b33.setBackground(Color.BLACK);
                        b22.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b44.setIcon(null);
                        b35.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b46.getText())){
                        b24.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b28.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b46.setIcon(null);
                        b35.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b13.getText())){
                        b22.setBackground(Color.BLACK);
                        b31.setBackground(Color.BLACK);
                        b24.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b13.setIcon(null);
                        b24.setIcon(null);
                        b35.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b17.getText())){
                        b26.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b28.setBackground(Color.BLACK);
                        b17.setIcon(null);
                        b26.setIcon(null);
                        b35.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b53.getText())){
                        b31.setBackground(Color.BLACK);
                        b42.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b53.setIcon(null);
                        b44.setIcon(null);
                        b35.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b57.getText())){
                        b35.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b57.setIcon(null);
                        b46.setIcon(null);
                        b35.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b37Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b37.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b37.getIcon() == damaBlanca){
                    if(b46.getIcon() == null){
                        b46.setBackground(Color.GREEN);
                        port = b37.getText();
                        mov = 1;
                    }
                    if(b48.getIcon() == null){
                        b48.setBackground(Color.GREEN);
                        port = b37.getText();
                        mov = 1;
                    }
                    if(b46.getIcon() == damaRoja && b55.getIcon() == null){
                        b55.setBackground(Color.GREEN);
                        port = b37.getText();
                        mov = 1;
                    }
                    else if((b46.getIcon() == damaBlanca && b48.getIcon() == damaBlanca) || (b46.getIcon() != null && b55.getIcon() != null && b48.getIcon() == null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b37.getIcon() == damaRoja){
                    if(b26.getIcon() == null){
                        b26.setBackground(Color.GREEN);
                        port = b37.getText();
                        mov = 1;
                    }
                    if(b28.getIcon() == null){
                        b28.setBackground(Color.GREEN);
                        port = b37.getText();
                        mov = 1;
                    }
                    if(b26.getIcon() == damaBlanca && b15.getIcon() == null){
                        b15.setBackground(Color.GREEN);
                        port = b37.getText();
                        mov = 1;
                    }
                    else if((b46.getIcon() == damaRoja && b48.getIcon() == damaRoja) || (b46.getIcon() != null && b55.getIcon() != null && b48.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b37.getBackground() == Color.GREEN){
                    if(port.equals(b26.getText())){
                        b35.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b26.setIcon(null);
                        b37.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b28.getText())){
                        b37.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b28.setIcon(null);
                        b37.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b46.getText())){
                        b24.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b28.setBackground(Color.BLACK);
                        b46.setIcon(null);
                        b37.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b48.getText())){
                        b37.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b48.setIcon(null);
                        b37.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b15.getText())){
                        b24.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b26.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b15.setIcon(null);
                        b26.setIcon(null);
                        b37.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b55.getText())){
                        b33.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b55.setIcon(null);
                        b46.setIcon(null);
                        b37.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b42Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b42.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b42.getIcon() == damaBlanca){
                    if(b51.getIcon() == null){
                        b51.setBackground(Color.GREEN);
                        port = b42.getText();
                        mov = 1;
                    }
                    if(b53.getIcon() == null){
                        b53.setBackground(Color.GREEN);
                        port = b42.getText();
                        mov = 1;
                    }
                    if(b53.getIcon() == damaRoja && b64.getIcon() == null){
                        b64.setBackground(Color.GREEN);
                        port = b42.getText();
                        mov = 1;
                    }
                    else if((b51.getIcon() == damaBlanca && b53.getIcon() == damaBlanca) || (b53.getIcon() != null && b64.getIcon() != null && b51.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b42.getIcon() == damaRoja){
                    if(b31.getIcon() == null){
                        b31.setBackground(Color.GREEN);
                        port = b42.getText();
                        mov = 1;
                    }
                    if(b33.getIcon() == null){
                        b33.setBackground(Color.GREEN);
                        port = b42.getText();
                        mov = 1;
                    }
                    if(b33.getIcon() == damaBlanca && b24.getIcon() == null){
                        b24.setBackground(Color.GREEN);
                        port = b42.getText();
                        mov = 1;
                    }
                    else if((b31.getIcon() == damaRoja && b33.getIcon() == damaRoja) || (b33.getIcon() != null && b24.getIcon() != null && b31.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b42.getBackground() == Color.GREEN){
                    if(port.equals(b31.getText())){
                        b42.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b31.setIcon(null);
                        b42.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b33.getText())){
                        b42.setBackground(Color.BLACK);
                        b51.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b33.setIcon(null);
                        b42.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b51.getText())){
                        b42.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b51.setIcon(null);
                        b42.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b53.getText())){
                        b31.setBackground(Color.BLACK);
                        b42.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b53.setIcon(null);
                        b42.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b24.getText())){
                        b42.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b24.setIcon(null);
                        b33.setIcon(null);
                        b42.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b64.getText())){
                        b42.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b64.setIcon(null);
                        b53.setIcon(null);
                        b42.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b44Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b44.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b44.getIcon() == damaBlanca){
                    if(b53.getIcon() == null){
                        b53.setBackground(Color.GREEN);
                        port = b44.getText();
                        mov = 1;
                    }
                    if(b55.getIcon() == null){
                        b55.setBackground(Color.GREEN);
                        port = b44.getText();
                        mov = 1;
                    }
                    if(b53.getIcon() == damaRoja && b62.getIcon() == null){
                        b62.setBackground(Color.GREEN);
                        port = b44.getText();
                        mov = 1;
                    }
                    if(b55.getIcon() == damaRoja && b66.getIcon() == null){
                        b66.setBackground(Color.GREEN);
                        port = b44.getText();
                        mov = 1;
                    }
                    else if((b53.getIcon() == damaBlanca && b55.getIcon() == damaBlanca) || (b53.getIcon() != null && b62.getIcon() != null && b55.getIcon() != null && b66.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b44.getIcon() == damaRoja){
                    if(b33.getIcon() == null){
                        b33.setBackground(Color.GREEN);
                        port = b44.getText();
                        mov = 1;
                    }
                    if(b35.getIcon() == null){
                        b35.setBackground(Color.GREEN);
                        port = b44.getText();
                        mov = 1;
                    }
                    if(b33.getIcon() == damaBlanca && b22.getIcon() == null){
                        b22.setBackground(Color.GREEN);
                        port = b44.getText();
                        mov = 1;
                    }
                    if(b35.getIcon() == damaBlanca && b26.getIcon() == null){
                        b26.setBackground(Color.GREEN);
                        port = b44.getText();
                        mov = 1;
                    }
                    else if((b33.getIcon() == damaRoja && b35.getIcon() == damaRoja) || (b33.getIcon() != null && b22.getIcon() != null && b35.getIcon() != null && b26.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b44.getBackground() == Color.GREEN){
                    if(port.equals(b33.getText())){
                        b42.setBackground(Color.BLACK);
                        b51.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b33.setIcon(null);
                        b44.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b35.getText())){
                        b53.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b35.setIcon(null);
                        b44.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b53.getText())){
                        b31.setBackground(Color.BLACK);
                        b42.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b53.setIcon(null);
                        b44.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b55.getText())){
                        b33.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b55.setIcon(null);
                        b44.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b22.getText())){
                        b31.setBackground(Color.BLACK);
                        b33.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b22.setIcon(null);
                        b33.setIcon(null);
                        b44.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b26.getText())){
                        b35.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b26.setIcon(null);
                        b35.setIcon(null);
                        b44.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b62.getText())){
                        b51.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b62.setIcon(null);
                        b53.setIcon(null);
                        b44.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b66.getText())){
                        b44.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b66.setIcon(null);
                        b55.setIcon(null);
                        b44.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b46Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b46.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b46.getIcon() == damaBlanca){
                    if(b55.getIcon() == null){
                        b55.setBackground(Color.GREEN);
                        port = b46.getText();
                        mov = 1;
                    }
                    if(b57.getIcon() == null){
                        b57.setBackground(Color.GREEN);
                        port = b46.getText();
                        mov = 1;
                    }
                    if(b55.getIcon() == damaRoja && b64.getIcon() == null){
                        b64.setBackground(Color.GREEN);
                        port = b46.getText();
                        mov = 1;
                    }
                    if(b57.getIcon() == damaRoja && b68.getIcon() == null){
                        b68.setBackground(Color.GREEN);
                        port = b46.getText();
                        mov = 1;
                    }
                    else if((b55.getIcon() == damaBlanca && b57.getIcon() == damaBlanca) || (b55.getIcon() != null && b64.getIcon() != null && b57.getIcon() != null && b68.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b46.getIcon() == damaRoja){
                    if(b35.getIcon() == null){
                        b35.setBackground(Color.GREEN);
                        port = b46.getText();
                        mov = 1;
                    }
                    if(b37.getIcon() == null){
                        b37.setBackground(Color.GREEN);
                        port = b46.getText();
                        mov = 1;
                    }
                    if(b35.getIcon() == damaBlanca && b24.getIcon() == null){
                        b24.setBackground(Color.GREEN);
                        port = b46.getText();
                        mov = 1;
                    }
                    if(b37.getIcon() == damaBlanca && b28.getIcon() == null){
                        b28.setBackground(Color.GREEN);
                        port = b46.getText();
                        mov = 1;
                    }
                    else if((b35.getIcon() == damaRoja && b37.getIcon() == damaRoja) || (b35.getIcon() != null && b24.getIcon() != null && b37.getIcon() != null && b28.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b46.getBackground() == Color.GREEN){
                    if(port.equals(b35.getText())){
                        b44.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b35.setIcon(null);
                        b46.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b37.getText())){
                        b55.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b37.setIcon(null);
                        b46.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b55.getText())){
                        b33.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b55.setIcon(null);
                        b46.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b57.getText())){
                        b35.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b57.setIcon(null);
                        b46.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b24.getText())){
                        b33.setBackground(Color.BLACK);
                        b35.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b42.setBackground(Color.BLACK);
                        b24.setIcon(null);
                        b35.setIcon(null);
                        b46.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b28.getText())){
                        b37.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b28.setIcon(null);
                        b37.setIcon(null);
                        b46.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b64.getText())){
                        b53.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b42.setBackground(Color.BLACK);
                        b64.setIcon(null);
                        b55.setIcon(null);
                        b46.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b68.getText())){
                        b46.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b68.setIcon(null);
                        b57.setIcon(null);
                        b46.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b48Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b48.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b48.getIcon() == damaBlanca){
                    if(b57.getIcon() == null){
                        b57.setBackground(Color.GREEN);
                        port = b48.getText();
                        mov = 1;
                    }
                    if(b57.getIcon() == damaRoja && b66.getIcon() == null){
                        b66.setBackground(Color.GREEN);
                        port = b48.getText();
                        mov = 1;
                    }
                    else if((b57.getIcon() == damaBlanca) || (b57.getIcon() != null && b66.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b48.getIcon() == damaRoja){
                    if(b37.getIcon() == null){
                        b37.setBackground(Color.GREEN);
                        port = b48.getText();
                        mov = 1;
                    }
                    if(b37.getIcon() == damaBlanca && b26.getIcon() == null){
                        b26.setBackground(Color.GREEN);
                        port = b48.getText();
                        mov = 1;
                    }
                    else if((b37.getIcon() == damaRoja) || (b37.getIcon() != null && b26.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b48.getBackground() == Color.GREEN){
                    if(port.equals(b37.getText())){
                        b46.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b37.setIcon(null);
                        b48.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b57.getText())){
                        b35.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b57.setIcon(null);
                        b48.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b26.getText())){
                        b35.setBackground(Color.BLACK);
                        b37.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b26.setIcon(null);
                        b37.setIcon(null);
                        b48.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b66.getText())){
                        b55.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b66.setIcon(null);
                        b57.setIcon(null);
                        b48.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b51Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b51.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b51.getIcon() == damaBlanca){
                    if(b62.getIcon() == null){
                        b62.setBackground(Color.GREEN);
                        port = b51.getText();
                        mov = 1;
                    }
                    if(b62.getIcon() == damaRoja && b73.getIcon() == null){
                        b73.setBackground(Color.GREEN);
                        port = b51.getText();
                        mov = 1;
                    }
                    else if((b62.getIcon() == damaBlanca) || (b62.getIcon() != null && b73.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b51.getIcon() == damaRoja){
                    if(b42.getIcon() == null){
                        b42.setBackground(Color.GREEN);
                        port = b51.getText();
                        mov = 1;
                    }
                    if(b42.getIcon() == damaBlanca && b33.getIcon() == null){
                        b33.setBackground(Color.GREEN);
                        port = b51.getText();
                        mov = 1;
                    }
                    else if((b42.getIcon() == damaRoja) || (b42.getIcon() != null && b33.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b51.getBackground() == Color.GREEN){
                    if(port.equals(b42.getText())){
                        b51.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b42.setIcon(null);
                        b51.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b62.getText())){
                        b51.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b62.setIcon(null);
                        b51.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b33.getText())){
                        b42.setBackground(Color.BLACK);
                        b51.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b33.setIcon(null);
                        b42.setIcon(null);
                        b51.setIcon(damaBlanca);
                        
                        fichasRojas =- 1;
                        
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }             
                    else if(port.equals(b73.getText())){
                        b62.setBackground(Color.BLACK);
                        b51.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b73.setIcon(null);
                        b62.setIcon(null);
                        b51.setIcon(damaRoja);
                        
                        fichasBlancas =- 1;
                        
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b53Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b53.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b53.getIcon() == damaBlanca){
                    if(b62.getIcon() == null){
                        b62.setBackground(Color.GREEN);
                        port = b53.getText();
                        mov = 1;
                    }
                    if(b64.getIcon() == null){
                        b64.setBackground(Color.GREEN);
                        port = b53.getText();
                        mov = 1;
                    }
                    if(b62.getIcon() == damaRoja && b71.getIcon() == null){
                        b71.setBackground(Color.GREEN);
                        port = b53.getText();
                        mov = 1;
                    }
                    if(b64.getIcon() == damaRoja && b75.getIcon() == null){
                        b75.setBackground(Color.GREEN);
                        port = b53.getText();
                        mov = 1;
                    }
                    else if((b62.getIcon() == damaBlanca && b64.getIcon() == damaBlanca) || (b62.getIcon() != null && b71.getIcon() != null && b64.getIcon() != null && b75.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b53.getIcon() == damaRoja){
                    if(b42.getIcon() == null){
                        b42.setBackground(Color.GREEN);
                        port = b53.getText();
                        mov = 1;
                    }
                    if(b44.getIcon() == null){
                        b44.setBackground(Color.GREEN);
                        port = b53.getText();
                        mov = 1;
                    }
                    if(b42.getIcon() == damaBlanca && b31.getIcon() == null){
                        b31.setBackground(Color.GREEN);
                        port = b53.getText();
                        mov = 1;
                    }
                    if(b44.getIcon() == damaBlanca && b35.getIcon() == null){
                        b35.setBackground(Color.GREEN);
                        port = b53.getText();
                        mov = 1;
                    }
                    
                    else if((b42.getIcon() == damaRoja && b44.getIcon() == damaRoja) || (b42.getIcon() != null && b31.getIcon() != null && b44.getIcon() != null && b35.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b53.getBackground() == Color.GREEN){
                    if(port.equals(b42.getText())){
                        b51.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b42.setIcon(null);
                        b53.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b44.getText())){
                        b53.setBackground(Color.BLACK);
                        b62.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b44.setIcon(null);
                        b53.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b62.getText())){
                        b51.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b62.setIcon(null);
                        b53.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b64.getText())){
                        b42.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b64.setIcon(null);
                        b53.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b31.getText())){
                        b42.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b31.setIcon(null);
                        b42.setIcon(null);
                        b53.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b35.getText())){
                        b44.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b35.setIcon(null);
                        b44.setIcon(null);
                        b53.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b71.getText())){
                        b62.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b71.setIcon(null);
                        b62.setIcon(null);
                        b53.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b75.getText())){
                        b64.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b75.setIcon(null);
                        b64.setIcon(null);
                        b53.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b55Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b55.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b55.getIcon() == damaBlanca){
                    if(b64.getIcon() == null){
                        b64.setBackground(Color.GREEN);
                        port = b55.getText();
                        mov = 1;
                    }
                    if(b66.getIcon() == null){
                        b66.setBackground(Color.GREEN);
                        port = b55.getText();
                        mov = 1;
                    }
                    if(b64.getIcon() == damaRoja && b73.getIcon() == null){
                        b73.setBackground(Color.GREEN);
                        port = b55.getText();
                        mov = 1;
                    }
                    if(b66.getIcon() == damaRoja && b77.getIcon() == null){
                        b77.setBackground(Color.GREEN);
                        port = b55.getText();
                        mov = 1;
                    }
                    else if((b64.getIcon() == damaBlanca && b66.getIcon() == damaBlanca) || (b64.getIcon() != null && b73.getIcon() != null && b66.getIcon() != null && b77.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b55.getIcon() == damaRoja){
                    if(b44.getIcon() == null){
                        b44.setBackground(Color.GREEN);
                        port = b55.getText();
                        mov = 1;
                    }
                    if(b46.getIcon() == null){
                        b46.setBackground(Color.GREEN);
                        port = b55.getText();
                        mov = 1;
                    }
                    if(b44.getIcon() == damaBlanca && b33.getIcon() == null){
                        b33.setBackground(Color.GREEN);
                        port = b55.getText();
                        mov = 1;
                    }
                    if(b46.getIcon() == damaBlanca && b37.getIcon() == null){
                        b37.setBackground(Color.GREEN);
                        port = b55.getText();
                        mov = 1;
                    }
                    
                    else if((b44.getIcon() == damaRoja && b46.getIcon() == damaRoja) || (b44.getIcon() != null && b33.getIcon() != null && b46.getIcon() != null && b37.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b55.getBackground() == Color.GREEN){
                    if(port.equals(b44.getText())){
                        b53.setBackground(Color.BLACK);
                        b62.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b44.setIcon(null);
                        b55.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b46.getText())){
                        b55.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b46.setIcon(null);
                        b55.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b64.getText())){
                        b53.setBackground(Color.BLACK);
                        b42.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b64.setIcon(null);
                        b55.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b66.getText())){
                        b44.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b66.setIcon(null);
                        b55.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b33.getText())){
                        b42.setBackground(Color.BLACK);
                        b51.setBackground(Color.BLACK);
                        b44.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b33.setIcon(null);
                        b44.setIcon(null);
                        b55.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b37.getText())){
                        b46.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b37.setIcon(null);
                        b46.setIcon(null);
                        b55.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b73.getText())){
                        b51.setBackground(Color.BLACK);
                        b62.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b73.setIcon(null);
                        b64.setIcon(null);
                        b55.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b77.getText())){
                        b55.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b77.setIcon(null);
                        b66.setIcon(null);
                        b55.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b57Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b57.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b57.getIcon() == damaBlanca){
                    if(b66.getIcon() == null){
                        b66.setBackground(Color.GREEN);
                        port = b57.getText();
                        mov = 1;
                    }
                    if(b68.getIcon() == null){
                        b68.setBackground(Color.GREEN);
                        port = b57.getText();
                        mov = 1;
                    }
                    if(b66.getIcon() == damaRoja && b75.getIcon() == null){
                        b75.setBackground(Color.GREEN);
                        port = b57.getText();
                        mov = 1;
                    }
                    else if((b66.getIcon() == damaBlanca && b68.getIcon() == damaBlanca) || (b66.getIcon() != null && b75.getIcon() != null && b68.getIcon() == null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b57.getIcon() == damaRoja){
                    if(b46.getIcon() == null){
                        b46.setBackground(Color.GREEN);
                        port = b57.getText();
                        mov = 1;
                    }
                    if(b48.getIcon() == null){
                        b48.setBackground(Color.GREEN);
                        port = b57.getText();
                        mov = 1;
                    }
                    if(b46.getIcon() == damaBlanca && b35.getIcon() == null){
                        b35.setBackground(Color.GREEN);
                        port = b57.getText();
                        mov = 1;
                    }
                    else if((b46.getIcon() == damaRoja && b48.getIcon() == damaRoja) || (b46.getIcon() != null && b35.getIcon() != null && b48.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b57.getBackground() == Color.GREEN){
                    if(port.equals(b46.getText())){
                        b55.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b46.setIcon(null);
                        b57.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b48.getText())){
                        b57.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b48.setIcon(null);
                        b57.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b66.getText())){
                        b44.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b48.setBackground(Color.BLACK);
                        b66.setIcon(null);
                        b57.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b68.getText())){
                        b57.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b68.setIcon(null);
                        b57.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b35.getText())){
                        b44.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b46.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b35.setIcon(null);
                        b46.setIcon(null);
                        b57.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b75.getText())){
                        b53.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b75.setIcon(null);
                        b66.setIcon(null);
                        b57.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b62Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b62.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b62.getIcon() == damaBlanca){
                    if(b71.getIcon() == null){
                        b71.setBackground(Color.GREEN);
                        port = b62.getText();
                        mov = 1;
                    }
                    if(b73.getIcon() == null){
                        b73.setBackground(Color.GREEN);
                        port = b62.getText();
                        mov = 1;
                    }
                    if(b73.getIcon() == damaRoja && b84.getIcon() == null){
                        b84.setBackground(Color.GREEN);
                        port = b62.getText();
                        mov = 1;
                    }
                    else if((b71.getIcon() == damaBlanca && b73.getIcon() == damaBlanca) || (b71.getIcon() != null && b73.getIcon() != null && b84.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b62.getIcon() == damaRoja){
                    if(b51.getIcon() == null){
                        b51.setBackground(Color.GREEN);
                        port = b62.getText();
                        mov = 1;
                    }
                    if(b53.getIcon() == null){
                        b53.setBackground(Color.GREEN);
                        port = b62.getText();
                        mov = 1;
                    }
                    if(b53.getIcon() == damaBlanca && b44.getIcon() == null){
                        b44.setBackground(Color.GREEN);
                        port = b62.getText();
                        mov = 1;
                    }
                    
                    else if((b51.getIcon() == damaRoja && b53.getIcon() == damaRoja) || (b51.getIcon() != null && b53.getIcon() != null && b44.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b62.getBackground() == Color.GREEN){
                    if(port.equals(b51.getText())){
                        b62.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b51.setIcon(null);
                        b62.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b53.getText())){
                        b62.setBackground(Color.BLACK);
                        b71.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b53.setIcon(null);
                        b62.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b71.getText())){
                        b62.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b71.setIcon(null);
                        b62.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b73.getText())){
                        b51.setBackground(Color.BLACK);
                        b62.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b73.setIcon(null);
                        b62.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b44.getText())){
                        b62.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b44.setIcon(null);
                        b53.setIcon(null);
                        b62.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b84.getText())){
                        b73.setBackground(Color.BLACK);
                        b62.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b84.setIcon(null);
                        b73.setIcon(null);
                        b62.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b64Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b64.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b64.getIcon() == damaBlanca){
                    if(b73.getIcon() == null){
                        b73.setBackground(Color.GREEN);
                        port = b64.getText();
                        mov = 1;
                    }
                    if(b75.getIcon() == null){
                        b75.setBackground(Color.GREEN);
                        port = b64.getText();
                        mov = 1;
                    }
                    if(b73.getIcon() == damaRoja && b82.getIcon() == null){
                        b82.setBackground(Color.GREEN);
                        port = b64.getText();
                        mov = 1;
                    }
                    if(b75.getIcon() == damaRoja && b86.getIcon() == null){
                        b86.setBackground(Color.GREEN);
                        port = b64.getText();
                        mov = 1;
                    }
                    else if((b73.getIcon() == damaBlanca && b75.getIcon() == damaBlanca) || (b73.getIcon() != null && b75.getIcon() != null && b82.getIcon() != null && b86.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b64.getIcon() == damaRoja){
                    if(b53.getIcon() == null){
                        b53.setBackground(Color.GREEN);
                        port = b64.getText();
                        mov = 1;
                    }
                    if(b55.getIcon() == null){
                        b55.setBackground(Color.GREEN);
                        port = b64.getText();
                        mov = 1;
                    }
                    if(b53.getIcon() == damaBlanca && b42.getIcon() == null){
                        b42.setBackground(Color.GREEN);
                        port = b64.getText();
                        mov = 1;
                    }
                    if(b55.getIcon() == damaBlanca && b46.getIcon() == null){
                        b46.setBackground(Color.GREEN);
                        port = b64.getText();
                        mov = 1;
                    }
                    
                    else if((b53.getIcon() == damaRoja && b55.getIcon() == damaRoja) || (b42.getIcon() != null && b53.getIcon() != null && b55.getIcon() != null && b46.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b64.getBackground() == Color.GREEN){
                    if(port.equals(b53.getText())){
                        b62.setBackground(Color.BLACK);
                        b71.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b53.setIcon(null);
                        b64.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b55.getText())){
                        b64.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b55.setIcon(null);
                        b64.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b73.getText())){
                        b51.setBackground(Color.BLACK);
                        b62.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b73.setIcon(null);
                        b64.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b75.getText())){
                        b53.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b75.setIcon(null);
                        b64.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b42.getText())){
                        b51.setBackground(Color.BLACK);
                        b53.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b42.setIcon(null);
                        b53.setIcon(null);
                        b64.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b46.getText())){
                        b55.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b46.setIcon(null);
                        b55.setIcon(null);
                        b64.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b82.getText())){
                        b71.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b82.setIcon(null);
                        b73.setIcon(null);
                        b64.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b86.getText())){
                        b64.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b86.setIcon(null);
                        b75.setIcon(null);
                        b64.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b66Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b66.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b66.getIcon() == damaBlanca){
                    if(b75.getIcon() == null){
                        b75.setBackground(Color.GREEN);
                        port = b66.getText();
                        mov = 1;
                    }
                    if(b77.getIcon() == null){
                        b77.setBackground(Color.GREEN);
                        port = b66.getText();
                        mov = 1;
                    }
                    if(b75.getIcon() == damaRoja && b84.getIcon() == null){
                        b84.setBackground(Color.GREEN);
                        port = b66.getText();
                        mov = 1;
                    }
                    if(b77.getIcon() == damaRoja && b88.getIcon() == null){
                        b88.setBackground(Color.GREEN);
                        port = b66.getText();
                        mov = 1;
                    }
                    else if((b75.getIcon() == damaBlanca && b77.getIcon() == damaBlanca) || (b75.getIcon() != null && b77.getIcon() != null && b84.getIcon() != null && b88.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b66.getIcon() == damaRoja){
                    if(b55.getIcon() == null){
                        b55.setBackground(Color.GREEN);
                        port = b66.getText();
                        mov = 1;
                    }
                    if(b57.getIcon() == null){
                        b57.setBackground(Color.GREEN);
                        port = b66.getText();
                        mov = 1;
                    }
                    if(b55.getIcon() == damaBlanca && b44.getIcon() == null){
                        b44.setBackground(Color.GREEN);
                        port = b66.getText();
                        mov = 1;
                    }
                    if(b57.getIcon() == damaBlanca && b48.getIcon() == null){
                        b48.setBackground(Color.GREEN);
                        port = b66.getText();
                        mov = 1;
                    }
                    
                    else if((b55.getIcon() == damaRoja && b57.getIcon() == damaRoja) || (b44.getIcon() != null && b55.getIcon() != null && b57.getIcon() != null && b48.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b66.getBackground() == Color.GREEN){
                    if(port.equals(b55.getText())){
                        b64.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b55.setIcon(null);
                        b66.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b57.getText())){
                        b66.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b57.setIcon(null);
                        b66.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b75.getText())){
                        b53.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b75.setIcon(null);
                        b66.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b77.getText())){
                        b55.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b77.setIcon(null);
                        b66.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b44.getText())){
                        b53.setBackground(Color.BLACK);
                        b55.setBackground(Color.BLACK);
                        b62.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b44.setIcon(null);
                        b55.setIcon(null);
                        b66.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b48.getText())){
                        b57.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b48.setIcon(null);
                        b57.setIcon(null);
                        b66.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b84.getText())){
                        b73.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b62.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b84.setIcon(null);
                        b75.setIcon(null);
                        b66.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b88.getText())){
                        b66.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b88.setIcon(null);
                        b77.setIcon(null);
                        b66.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b68Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b68.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b68.getIcon() == damaBlanca){
                    if(b77.getIcon() == null){
                        b77.setBackground(Color.GREEN);
                        port = b68.getText();
                        mov = 1;
                    }
                    if(b77.getIcon() == damaRoja && b86.getIcon() == null){
                        b86.setBackground(Color.GREEN);
                        port = b68.getText();
                        mov = 1;
                    }
                    else if((b77.getIcon() == damaBlanca) || (b77.getIcon() != null && b86.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b68.getIcon() == damaRoja){
                    if(b57.getIcon() == null){
                        b57.setBackground(Color.GREEN);
                        port = b68.getText();
                        mov = 1;
                    }
                    if(b57.getIcon() == damaBlanca && b46.getIcon() == null){
                        b46.setBackground(Color.GREEN);
                        port = b68.getText();
                        mov = 1;
                    }
                    else if((b57.getIcon() == damaRoja) || (b46.getIcon() != null && b57.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b68.getBackground() == Color.GREEN){
                    if(port.equals(b57.getText())){
                        b66.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b57.setIcon(null);
                        b68.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b77.getText())){
                        b55.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b77.setIcon(null);
                        b68.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b46.getText())){
                        b55.setBackground(Color.BLACK);
                        b57.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b46.setIcon(null);
                        b57.setIcon(null);
                        b68.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b86.getText())){
                        b75.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b86.setIcon(null);
                        b77.setIcon(null);
                        b68.setIcon(damaRoja);
                        
                        fichasBlancas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b71Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b71.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b71.getIcon() == damaBlanca){
                    if(b82.getIcon() == null){
                        b82.setBackground(Color.GREEN);
                        port = b71.getText();
                        mov = 1;
                    }
                    else if(b82.getIcon() != null){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b71.getIcon() == damaRoja){
                    if(b62.getIcon() == null){
                        b62.setBackground(Color.GREEN);
                        port = b71.getText();
                        mov = 1;
                    }
                    if(b62.getIcon() == damaBlanca && b53.getIcon() == null){
                        b53.setBackground(Color.GREEN);
                        port = b71.getText();
                        mov = 1;
                    }
                    else if((b62.getIcon() == damaRoja) || (b62.getIcon() != null && b53.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b71.getBackground() == Color.GREEN){
                    if(port.equals(b62.getText())){
                        b71.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b84.setBackground(Color.BLACK);
                        b62.setIcon(null);
                        b71.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b82.getText())){
                        b71.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b82.setIcon(null);
                        b71.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b53.getText())){
                        b62.setBackground(Color.BLACK);
                        b71.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b53.setIcon(null);
                        b62.setIcon(null);
                        b71.setIcon(damaBlanca);
                        
                        fichasRojas =- 1;
                        
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }    
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b73Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b73.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b73.getIcon() == damaBlanca){
                    if(b82.getIcon() == null){
                        b82.setBackground(Color.GREEN);
                        port = b73.getText();
                        mov = 1;
                    }
                    if(b84.getIcon() == null){
                        b84.setBackground(Color.GREEN);
                        port = b73.getText();
                        mov = 1;
                    }
                    else if(b82.getIcon() != null && b84.getIcon() != null){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b73.getIcon() == damaRoja){
                    if(b62.getIcon() == null){
                        b62.setBackground(Color.GREEN);
                        port = b73.getText();
                        mov = 1;
                    }
                    if(b64.getIcon() == null){
                        b64.setBackground(Color.GREEN);
                        port = b73.getText();
                        mov = 1;
                    }
                    if(b62.getIcon() == damaBlanca && b51.getIcon() == null){
                        b51.setBackground(Color.GREEN);
                        port = b73.getText();
                        mov = 1;
                    }
                    if(b64.getIcon() == damaBlanca && b55.getIcon() == null){
                        b55.setBackground(Color.GREEN);
                        port = b73.getText();
                        mov = 1;
                    }
                    
                    else if((b62.getIcon() == damaRoja && b64.getIcon() == damaRoja) || (b62.getIcon() != null && b51.getIcon() != null && b64.getIcon() != null && b55.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b73.getBackground() == Color.GREEN){
                    if(port.equals(b62.getText())){
                        b71.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b84.setBackground(Color.BLACK);
                        b62.setIcon(null);
                        b73.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b64.getText())){
                        b73.setBackground(Color.BLACK);
                        b82.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b86.setBackground(Color.BLACK);
                        b64.setIcon(null);
                        b73.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b82.getText())){
                        b71.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b82.setIcon(null);
                        b73.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b84.getText())){
                        b62.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b84.setIcon(null);
                        b73.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b51.getText())){
                        b62.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b51.setIcon(null);
                        b62.setIcon(null);
                        b73.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b55.getText())){
                        b64.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b55.setIcon(null);
                        b64.setIcon(null);
                        b73.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b75Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b75.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b75.getIcon() == damaBlanca){
                    if(b84.getIcon() == null){
                        b84.setBackground(Color.GREEN);
                        port = b75.getText();
                        mov = 1;
                    }
                    if(b86.getIcon() == null){
                        b86.setBackground(Color.GREEN);
                        port = b75.getText();
                        mov = 1;
                    }
                    else if(b84.getIcon() != null && b86.getIcon() != null){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b75.getIcon() == damaRoja){
                    if(b64.getIcon() == null){
                        b64.setBackground(Color.GREEN);
                        port = b75.getText();
                        mov = 1;
                    }
                    if(b66.getIcon() == null){
                        b66.setBackground(Color.GREEN);
                        port = b75.getText();
                        mov = 1;
                    }
                    if(b64.getIcon() == damaBlanca && b53.getIcon() == null){
                        b53.setBackground(Color.GREEN);
                        port = b75.getText();
                        mov = 1;
                    }
                    if(b66.getIcon() == damaBlanca && b57.getIcon() == null){
                        b57.setBackground(Color.GREEN);
                        port = b75.getText();
                        mov = 1;
                    }
                    
                    else if((b64.getIcon() == damaRoja && b66.getIcon() == damaRoja) || (b64.getIcon() != null && b53.getIcon() != null && b66.getIcon() != null && b57.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b75.getBackground() == Color.GREEN){
                    if(port.equals(b64.getText())){
                        b73.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b82.setBackground(Color.BLACK);
                        b86.setBackground(Color.BLACK);
                        b64.setIcon(null);
                        b75.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b66.getText())){
                        b75.setBackground(Color.BLACK);
                        b84.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b88.setBackground(Color.BLACK);
                        b66.setIcon(null);
                        b75.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b84.getText())){
                        b73.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b62.setBackground(Color.BLACK);
                        b66.setBackground(Color.BLACK);
                        b84.setIcon(null);
                        b75.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b86.getText())){
                        b64.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b86.setIcon(null);
                        b75.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b53.getText())){
                        b64.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b62.setBackground(Color.BLACK);
                        b71.setBackground(Color.BLACK);
                        b53.setIcon(null);
                        b64.setIcon(null);
                        b75.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b57.getText())){
                        b66.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b57.setIcon(null);
                        b66.setIcon(null);
                        b75.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b77Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b77.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b77.getIcon() == damaBlanca){
                    if(b86.getIcon() == null){
                        b86.setBackground(Color.GREEN);
                        port = b77.getText();
                        mov = 1;
                    }
                    if(b88.getIcon() == null){
                        b88.setBackground(Color.GREEN);
                        port = b77.getText();
                        mov = 1;
                    }
                    else if(b86.getIcon() != null && b88.getIcon() != null){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if(b77.getIcon() == damaRoja){
                    if(b66.getIcon() == null){
                        b66.setBackground(Color.GREEN);
                        port = b77.getText();
                        mov = 1;
                    }
                    if(b68.getIcon() == null){
                        b68.setBackground(Color.GREEN);
                        port = b77.getText();
                        mov = 1;
                    }
                    if(b66.getIcon() == damaBlanca && b55.getIcon() == null){
                        b55.setBackground(Color.GREEN);
                        port = b77.getText();
                        mov = 1;
                    }
                    
                    else if((b66.getIcon() == damaRoja && b68.getIcon() == damaRoja) || (b66.getIcon() != null && b55.getIcon() != null && b68.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b77.getBackground() == Color.GREEN){
                    if(port.equals(b66.getText())){
                        b75.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b84.setBackground(Color.BLACK);
                        b88.setBackground(Color.BLACK);
                        b66.setIcon(null);
                        b77.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b68.getText())){
                        b77.setBackground(Color.BLACK);
                        b86.setBackground(Color.BLACK);
                        b68.setIcon(null);
                        b77.setIcon(damaBlanca);
                        
                        mov = 0;
                    }
                    else if(port.equals(b86.getText())){
                        b75.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b68.setBackground(Color.BLACK);
                        b86.setIcon(null);
                        b77.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b88.getText())){
                        b66.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b88.setIcon(null);
                        b77.setIcon(damaRoja);
                        
                        mov = 0;
                    }
                    else if(port.equals(b55.getText())){
                        b66.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b64.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b55.setIcon(null);
                        b66.setIcon(null);
                        b77.setIcon(damaBlanca);
                        
                        fichasRojas -= 1;
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b82Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b82.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b82.getIcon() == damaRoja){
                    if(b71.getIcon() == null){
                        b71.setBackground(Color.GREEN);
                        port = b82.getText();
                        mov = 1;
                    }
                    if(b73.getIcon() == null){
                        b73.setBackground(Color.GREEN);
                        port = b82.getText();
                        mov = 1;
                    }
                    if(b73.getIcon() == damaBlanca && b64.getIcon() == null){
                        b64.setBackground(Color.GREEN);
                        port = b82.getText();
                        mov = 1;
                    }
                    else if((b71.getIcon() == damaRoja && b73.getIcon() == damaRoja) || (b71.getIcon() != null && b73.getIcon() != null && b64.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b82.getBackground() == Color.GREEN){
                    if(port.equals(b71.getText())){
                        b82.setBackground(Color.BLACK);
                        b71.setIcon(null);
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                    }
                    else if(port.equals(b73.getText())){
                        b82.setBackground(Color.BLACK);
                        b84.setBackground(Color.BLACK);
                        b73.setIcon(null);
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                    }                    
                    else if(port.equals(b64.getText())){
                        b73.setBackground(Color.BLACK);
                        b82.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b86.setBackground(Color.BLACK);
                        
                        b64.setIcon(null);
                        b73.setIcon(null);
                        fichasRojas -= 1;
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b84Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b84.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b84.getIcon() == damaRoja){
                    if(b73.getIcon() == null){
                        b73.setBackground(Color.GREEN);
                        port = b84.getText();
                        mov = 1;
                    }
                    if(b75.getIcon() == null){
                        b75.setBackground(Color.GREEN);
                        port = b84.getText();
                        mov = 1;
                    }
                    if(b73.getIcon() == damaBlanca && b62.getIcon() == null){
                        b62.setBackground(Color.GREEN);
                        port = b84.getText();
                        mov = 1;
                    }
                    if(b75.getIcon() == damaBlanca && b66.getIcon() == null){
                        b66.setBackground(Color.GREEN);
                        port = b84.getText();
                        mov = 1;
                    }
                    else if((b73.getIcon() == damaRoja && b75.getIcon() == damaRoja) || (b73.getIcon() != null && b75.getIcon() != null && b62.getIcon() != null && b66.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b84.getBackground() == Color.GREEN){
                    if(port.equals(b73.getText())){
                        b82.setBackground(Color.BLACK);
                        b84.setBackground(Color.BLACK);
                        b73.setIcon(null);
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                    }
                    else if(port.equals(b75.getText())){
                        b84.setBackground(Color.BLACK);
                        b86.setBackground(Color.BLACK);
                        b75.setIcon(null);
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                    }                    
                    else if(port.equals(b62.getText())){
                        b71.setBackground(Color.BLACK);
                        b73.setBackground(Color.BLACK);
                        b84.setBackground(Color.BLACK);
                        
                        b62.setIcon(null);
                        b73.setIcon(null);
                        
                        fichasRojas -= 1;
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b66.getText())){
                        b75.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b84.setBackground(Color.BLACK);
                        b88.setBackground(Color.BLACK);
                        
                        b66.setIcon(null);
                        b75.setIcon(null);
                        
                        fichasRojas -= 1;
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b86Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b86.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b86.getIcon() == damaRoja){
                    if(b75.getIcon() == null){
                        b75.setBackground(Color.GREEN);
                        port = b86.getText();
                        mov = 1;
                    }
                    if(b77.getIcon() == null){
                        b77.setBackground(Color.GREEN);
                        port = b86.getText();
                        mov = 1;
                    }
                    if(b75.getIcon() == damaBlanca && b64.getIcon() == null){
                        b64.setBackground(Color.GREEN);
                        port = b86.getText();
                        mov = 1;
                    }
                    if(b77.getIcon() == damaBlanca && b68.getIcon() == null){
                        b68.setBackground(Color.GREEN);
                        port = b86.getText();
                        mov = 1;
                    }
                    else if((b75.getIcon() == damaRoja && b77.getIcon() == damaRoja) || (b75.getIcon() != null && b77.getIcon() != null && b64.getIcon() != null && b68.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b86.getBackground() == Color.GREEN){
                    if(port.equals(b75.getText())){
                        b84.setBackground(Color.BLACK);
                        b86.setBackground(Color.BLACK);
                        b75.setIcon(null);
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                    }
                    else if(port.equals(b77.getText())){
                        b86.setBackground(Color.BLACK);
                        b88.setBackground(Color.BLACK);
                        b77.setIcon(null);
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                    }                    
                    else if(port.equals(b64.getText())){
                        b73.setBackground(Color.BLACK);
                        b75.setBackground(Color.BLACK);
                        b86.setBackground(Color.BLACK);
                        b82.setBackground(Color.BLACK);
                        
                        b64.setIcon(null);
                        b75.setIcon(null);
                        
                        fichasRojas -= 1;
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else if(port.equals(b68.getText())){
                        b77.setBackground(Color.BLACK);
                        b86.setBackground(Color.BLACK);
                        
                        b68.setIcon(null);
                        b77.setIcon(null);
                        
                        fichasRojas -= 1;
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private class b88Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(mov==0){
                if(b88.getIcon() == null){
                    JOptionPane.showMessageDialog(null, "NO HAY NINGUNA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(b88.getIcon() == damaRoja){
                    if(b77.getIcon() == null){
                        b77.setBackground(Color.GREEN);
                        port = b88.getText();
                        mov = 1;
                    }
                    if(b77.getIcon() == damaBlanca && b66.getIcon() == null){
                        b66.setBackground(Color.GREEN);
                        port = b88.getText();
                        mov = 1;
                    }
                    else if((b77.getIcon() == damaRoja) || (b77.getIcon() != null && b66.getIcon() != null)){
                        JOptionPane.showMessageDialog(null, "ESTA FICHA NO SE PUEDE MOVER!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
            }
            else{
                if(b88.getBackground() == Color.GREEN){
                    if(port.equals(b77.getText())){
                        b86.setBackground(Color.BLACK);
                        b88.setBackground(Color.BLACK);
                        b77.setIcon(null);
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                    }          
                    else if(port.equals(b66.getText())){
                        b75.setBackground(Color.BLACK);
                        b77.setBackground(Color.BLACK);
                        b88.setBackground(Color.BLACK);
                        b84.setBackground(Color.BLACK);
                        
                        b66.setIcon(null);
                        b77.setIcon(null);
                        
                        fichasRojas -= 1;
                        
                        if(b11.getIcon() == null){
                            b11.setIcon(damaBlanca);
                        }
                        else if(b13.getIcon() == null){
                            b13.setIcon(damaBlanca);
                        }
                        else if(b15.getIcon() == null){
                            b15.setIcon(damaBlanca);
                        }
                        else if(b17.getIcon() == null){
                            b17.setIcon(damaBlanca);
                        }
                        else if(b22.getIcon() == null){
                            b22.setIcon(damaBlanca);
                        }
                        else if(b24.getIcon() == null){
                            b24.setIcon(damaBlanca);
                        }
                        else if(b26.getIcon() == null){
                            b26.setIcon(damaBlanca);
                        }
                        else if(b28.getIcon() == null){
                            b28.setIcon(damaBlanca);
                        }
                        else if(b31.getIcon() == null){
                            b31.setIcon(damaBlanca);
                        }
                        else if(b33.getIcon() == null){
                            b33.setIcon(damaBlanca);
                        }
                        else if(b35.getIcon() == null){
                            b35.setIcon(damaBlanca);
                        }
                        else if(b37.getIcon() == null){
                            b37.setIcon(damaBlanca);
                        }
                        mov = 0;
                        
                        if(fichasRojas == 0){
                            JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                        else if(fichasBlancas == 0){
                            JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "NO PUEDE MOVER LA FICHA AQUÍ!!", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(fichasRojas == 0){
                JOptionPane.showMessageDialog(null, jugador1.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
            else if(fichasBlancas == 0){
                JOptionPane.showMessageDialog(null, jugador2.toUpperCase() + " GANÓ, FELICITACIONES!!", "FIN DE LA PARTIDA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
