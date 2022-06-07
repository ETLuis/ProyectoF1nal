package ProyectoFinal;


import com.dam.lectura.LecturaFichero;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import javax.swing.JOptionPane;

public class Ahorcado extends javax.swing.JFrame{



    public Ahorcado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1050,750);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Introduce una letra");
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 17));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 17));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, 38));

        jTextField1.setMargin(new java.awt.Insets(0, 47, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 104, 70));

        jButton1.setBackground(new java.awt.Color(255, 174, 0));
        jButton1.setText("Comprobar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 160, 50));

        jTextField2.setMargin(new java.awt.Insets(0, 95, 0, 0));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 290, 101));

        jButton2.setBackground(new java.awt.Color(25, 233, 228));
        jButton2.setText("Escribir Palabra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 147, 39));

        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 124, 50));

        jButton3.setBackground(new java.awt.Color(13, 113, 254));
        jButton3.setText("Generar Palabra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 160, 30));

        jButton4.setBackground(new java.awt.Color(254, 1, 181));
        jButton4.setText("Menú Principal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 140, 50));

        jButton5.setBackground(new java.awt.Color(251, 255, 0));
        jButton5.setText("Comprobar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, -1, -1));

        jLabel2.setText("Fallos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, -1, -1));

        jLabel3.setText("0");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 30, -1));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0Fallos.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1Fallo.png"))); // NOI18N
        jLabel5.setVisible(false);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2Fallos.png"))); // NOI18N
        jLabel6.setVisible(false);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3Fallos.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4Fallos.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5Fallos.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6Fallos.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7Fallos.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel13.setText("Puntuación:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, -1));

        jLabel14.setText("0");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    List<Character> jugadores = new ArrayList<>();
    String palabraJuego="";
    int intentos=0;
    int fallo=0;
    int puntuacion=0;

    public static boolean letra(String palabraJuego, List<Character> jugadores,int fallo){
        String letra = jTextField1.getText();


        try{
            jugadores.add(letra.charAt(0));
            Ahorcado.verPalabras(palabraJuego,jugadores,letra, fallo);
        }
        catch(StringIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "Tienes que introducir una letra");
        }

        if(palabraJuego.equals("")){
            JOptionPane.showMessageDialog(null, "Tienes que generar una palabra");
        }

        return palabraJuego.contains(letra);
    }



    public static void verPalabras(String palabraJuego, List<Character> jugadores,String letra, int fallos){
        String concatena = "";
        boolean clean=false;


        for (int i = 0; i < palabraJuego.length(); i++) {
            if (letra.equalsIgnoreCase(""+palabraJuego.charAt(i))) {


                clean=true;
            }
        }

        for (int i = 0; i < palabraJuego.length(); i++) {
            if (jugadores.contains(palabraJuego.charAt(i))) {


                concatena = concatena + palabraJuego.charAt(i);

            } else {
                concatena = concatena + " - ";

            }

            jTextField2.setText(concatena);
        }



        if(!clean){
            fallos++;
        }



        if(fallos>=1){
            int i=Integer.parseInt(jLabel3.getText());

            jLabel3.setText(String.valueOf(i+1));

            if(i==0){
                jLabel4.setVisible(false);
                jLabel5.setVisible(true);
            }else{
                jLabel5.setVisible(false);

            }
            if(i==1){
                jLabel6.setVisible(true);
            }else{
                jLabel6.setVisible(false);
            }

            if(i==2){
                jLabel8.setVisible(true);
            }else{
                jLabel8.setVisible(false);
            }

            if(i==3){
                jLabel7.setVisible(true);
            }else{
                jLabel7.setVisible(false);

            }

            if(i==4){
                jLabel10.setVisible(true);
            }else{
                jLabel10.setVisible(false);

            }

            if(i==5){
                jLabel11.setVisible(true);
            }else{
                jLabel11.setVisible(false);

            }

            if(i==6){
                jLabel12.setVisible(true);
                JOptionPane.showMessageDialog(null, "Has perdido :(");
                jTextField2.setText(palabraJuego);
                palabraJuego=null;


            }else{

            }


            if(palabraJuego.equals("")){
                palabraJuego="ñ";
            }
        }
        if(palabraJuego.equalsIgnoreCase(concatena)){
            JOptionPane.showMessageDialog(null, "Has ganado :)");

            jugadores.clear();
            jTextField1.setText("");
            jTextField2.setText("");
            int u = Integer.parseInt(jLabel14.getText());
            int puntuacion=0;
            puntuacion++;
            u = u + puntuacion;
            jLabel14.setText(String.valueOf(u));
            jLabel4.setVisible(true);

        }


    }



    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:s
        Ahorcado.letra(palabraJuego, jugadores,fallo);
        jTextField1.setText("");


    }

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {

        if (jTextField1.getText().length() >= 1) {

            evt.consume();
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        Ahorcado.letra(palabraJuego, jugadores,fallo);
        jTextField1.setText("");


    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        jTextField3.enable();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {


        List<String> palabras = new ArrayList<>();
        LecturaFichero.crearPalabra(palabras);

        Random rand = new Random();
        palabraJuego = palabras.get(rand.nextInt(palabras.size()));
        System.out.println(palabraJuego);

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();





    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String palabraComprob=jTextField3.getText();


        if(palabraComprob.equals(palabraJuego)){
            JOptionPane.showMessageDialog(null,"Palabra correcta");
            JOptionPane.showMessageDialog(null,"Has ganado :)");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            puntuacion++;
            jLabel14.setText(String.valueOf(puntuacion));

        }
        else{
            JOptionPane.showMessageDialog(null,"Palabra incorrecta");
            jTextField3.setText("");
            intentos++;
            String i=String.valueOf(intentos);

            jLabel3.setText(i);

            if(intentos==1){
                jLabel4.setVisible(false);
                jLabel5.setVisible(true);
            }else{
                jLabel5.setVisible(false);
            }

            if(intentos==2){
                jLabel6.setVisible(true);
            }else{
                jLabel6.setVisible(false);
            }

            if(intentos==3){
                jLabel8.setVisible(true);
            }else{
                jLabel8.setVisible(false);
            }

            if(intentos==4){
                jLabel7.setVisible(true);
            }else{
                jLabel7.setVisible(false);

            }

            if(intentos==5){
                jLabel10.setVisible(true);
            }else{
                jLabel10.setVisible(false);

            }

            if(intentos==6){
                jLabel11.setVisible(true);
            }else{
                jLabel11.setVisible(false);

            }

            if(intentos==7){
                jLabel12.setVisible(true);
                JOptionPane.showMessageDialog(null, "Has perdido :(");
                jTextField2.setText(palabraJuego);
                palabraJuego=null;
                intentos=0;
                i=String.valueOf(intentos);
                jLabel3.setText(i);

            }else{
                jLabel12.setVisible(false);

            }

        }
    }


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String palabraComprob=jTextField3.getText();


        if(palabraComprob.equals(palabraJuego)){
            JOptionPane.showMessageDialog(null,"Palabra correcta");
            JOptionPane.showMessageDialog(null,"Has ganado :)");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            puntuacion++;
            jLabel14.setText(String.valueOf(puntuacion));

        }
        else{
            JOptionPane.showMessageDialog(null,"Palabra incorrecta");
            jTextField3.setText("");
            intentos++;
            String i=String.valueOf(intentos);

            jLabel3.setText(i);

            if(intentos==1){
                jLabel4.setVisible(false);
                jLabel5.setVisible(true);
            }else{
                jLabel5.setVisible(false);
            }

            if(intentos==2){
                jLabel6.setVisible(true);
            }else{
                jLabel6.setVisible(false);
            }

            if(intentos==3){
                jLabel8.setVisible(true);
            }else{
                jLabel8.setVisible(false);
            }

            if(intentos==4){
                jLabel7.setVisible(true);
            }else{
                jLabel7.setVisible(false);

            }

            if(intentos==5){
                jLabel10.setVisible(true);
            }else{
                jLabel10.setVisible(false);

            }

            if(intentos==6){
                jLabel11.setVisible(true);
            }else{
                jLabel11.setVisible(false);

            }

            if(intentos==7){
                jLabel12.setVisible(true);
                JOptionPane.showMessageDialog(null, "Has perdido :(");
                jTextField2.setText(palabraJuego);
                palabraJuego=null;
                intentos=0;
                i=String.valueOf(intentos);
                jLabel3.setText(i);

            }else{
                jLabel12.setVisible(false);

            }

        }

    }



    public void imagenes(){
        intentos++;
        String i=String.valueOf(intentos);

        jLabel3.setText(i);

        if(intentos==1){
            jLabel4.setVisible(false);
            jLabel5.setVisible(true);
        }else{
            jLabel5.setVisible(false);
        }

        if(intentos==2){
            jLabel6.setVisible(true);
        }else{
            jLabel6.setVisible(false);
        }

        if(intentos==3){
            jLabel8.setVisible(true);
        }else{
            jLabel8.setVisible(false);
        }

        if(intentos==4){
            jLabel7.setVisible(true);
        }else{
            jLabel7.setVisible(false);

        }

        if(intentos==5){
            jLabel10.setVisible(true);
        }else{
            jLabel10.setVisible(false);

        }

        if(intentos==6){
            jLabel11.setVisible(true);
        }else{
            jLabel11.setVisible(false);

        }

        if(intentos==7){
            jLabel12.setVisible(true);
            JOptionPane.showMessageDialog(null, "Has perdido :(");
            jTextField2.setText(palabraJuego);
            palabraJuego=null;
            intentos=0;
            i=String.valueOf(intentos);
            jLabel3.setText(i);

        }else{
            jLabel12.setVisible(false);

        }


    }




    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ahorcado().setVisible(true);


            }
        });
    }





    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel10;
    private static javax.swing.JLabel jLabel11;
    private static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private static javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration


}
