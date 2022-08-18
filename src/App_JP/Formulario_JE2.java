/*
Estudiante: Josué Ignacio Paz Moran
No. de Carne: 1290-21-5213
Curso: Programación II
Catedrático: Armando Cardona Paiz
Fecha Entrega: 17/08/2022
Tarea: Java Escritorio 2
*/

package App_JP;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Normalizer;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */

public class Formulario_JE2 extends javax.swing.JFrame{
    JFileChooser seleccionar = new JFileChooser();
        File arch;
        FileInputStream entrada;
        FileOutputStream salida;
        
public Formulario_JE2() {
        initComponents();
    }
        
public String abrir_arch(File arch){
        String documento = "";
        try{
            entrada = new FileInputStream(arch);
            int ascci;
            while((ascci=entrada.read())!=-1){
                char caracter = (char)ascci;
                documento+=caracter;              
            }
        } catch (IOException e){
        }
        return documento;
    }
    
public String guardar_arch(File arch,String documento){
        String mensaje=null;
        try {
            salida=new FileOutputStream(arch);
            byte[] bytxt=documento.getBytes();
            salida.write(bytxt);
            mensaje="Archivo Guardado";
            
            } catch (IOException e) {
            }
        return mensaje;
    }
    
public static void main(String args[]) {
     
    java.awt.EventQueue.invokeLater(() -> {
            new Formulario_JE2().setVisible(true);
        });
    }
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        Texto1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Procesar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_traductor = new javax.swing.JTextArea();
        lbl_totalp = new javax.swing.JLabel();
        lbl_cantE = new javax.swing.JLabel();
        lbl_cantI = new javax.swing.JLabel();
        lbl_cantA = new javax.swing.JLabel();
        lbl_cantO = new javax.swing.JLabel();
        lbl_cantU = new javax.swing.JLabel();
        lbl_primerap = new javax.swing.JLabel();
        lbl_primerl = new javax.swing.JLabel();
        lbl_long = new javax.swing.JLabel();
        lbl_ultimal = new javax.swing.JLabel();
        lbl_ultimap = new javax.swing.JLabel();
        lbl_letrac = new javax.swing.JLabel();
        lbl_palabrac = new javax.swing.JLabel();
        lbl_cantimpar = new javax.swing.JLabel();
        lbl_cantpar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_palabra = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_abrir = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        btn_guardar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btn_cortar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btn_copiar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btn_pegar = new javax.swing.JMenuItem();

        Texto1.setColumns(20);
        Texto1.setRows(5);
        jScrollPane3.setViewportView(Texto1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANEJO DE CADENAS - PROGRAMACIÓN II");

        Procesar.setBackground(new java.awt.Color(153, 255, 204));
        Procesar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Procesar.setText("PROCESAR");
        Procesar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Longitud del Texto:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total de Palabras: ");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Primer Letra del Texto:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Última Letra del Texto:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Letra Central del Texto:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Primera Palabra:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Palabra Central:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Última Palabra:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Repetición de \"E\", \"e\" ó \"é\":");

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Repetición de \"A\", \"a\" ó \"á\":");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Repeticion de \"I\", \"i\" ó \"í\":");

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Repeticion de \"O\", \"o\" ó \"ó\":");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Repeticion de \"U\", \"u\" ó \"ú\":");

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Palabra con cantidad de caracteres par:");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Palabra con cantidad de caracteres impar:");

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 255, 204));
        jLabel17.setText("TRADUCCIÓN A CLAVE MURCIELAGO");

        txt_traductor.setBackground(new java.awt.Color(204, 204, 204));
        txt_traductor.setColumns(20);
        txt_traductor.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_traductor.setRows(5);
        jScrollPane2.setViewportView(txt_traductor);

        lbl_totalp.setBackground(new java.awt.Color(205, 255, 212));
        lbl_totalp.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_totalp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_totalp.setToolTipText("");

        lbl_cantE.setBackground(new java.awt.Color(205, 255, 212));
        lbl_cantE.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_cantE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cantE.setToolTipText("");

        lbl_cantI.setBackground(new java.awt.Color(205, 255, 212));
        lbl_cantI.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_cantI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cantI.setToolTipText("");

        lbl_cantA.setBackground(new java.awt.Color(205, 255, 212));
        lbl_cantA.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_cantA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cantA.setToolTipText("");

        lbl_cantO.setBackground(new java.awt.Color(205, 255, 212));
        lbl_cantO.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_cantO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cantO.setToolTipText("");

        lbl_cantU.setBackground(new java.awt.Color(205, 255, 212));
        lbl_cantU.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_cantU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cantU.setToolTipText("");

        lbl_primerap.setBackground(new java.awt.Color(205, 255, 212));
        lbl_primerap.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_primerap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_primerap.setToolTipText("");

        lbl_primerl.setBackground(new java.awt.Color(205, 255, 212));
        lbl_primerl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_primerl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_primerl.setToolTipText("");

        lbl_long.setBackground(new java.awt.Color(204, 255, 204));
        lbl_long.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_long.setForeground(new java.awt.Color(255, 255, 255));
        lbl_long.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_long.setToolTipText("");

        lbl_ultimal.setBackground(new java.awt.Color(205, 255, 212));
        lbl_ultimal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_ultimal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ultimal.setToolTipText("");

        lbl_ultimap.setBackground(new java.awt.Color(205, 255, 212));
        lbl_ultimap.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_ultimap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ultimap.setToolTipText("");

        lbl_letrac.setBackground(new java.awt.Color(205, 255, 212));
        lbl_letrac.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_letrac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_letrac.setToolTipText("");

        lbl_palabrac.setBackground(new java.awt.Color(205, 255, 212));
        lbl_palabrac.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_palabrac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_palabrac.setToolTipText("");

        lbl_cantimpar.setBackground(new java.awt.Color(205, 255, 212));
        lbl_cantimpar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_cantimpar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cantimpar.setToolTipText("");

        lbl_cantpar.setBackground(new java.awt.Color(205, 255, 212));
        lbl_cantpar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_cantpar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cantpar.setToolTipText("");

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt_palabra.setBackground(new java.awt.Color(204, 204, 204));
        txt_palabra.setColumns(20);
        txt_palabra.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_palabra.setRows(5);
        jScrollPane1.setViewportView(txt_palabra);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(76, 76, 76)
                                            .addComponent(lbl_long, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(81, 81, 81)
                                            .addComponent(lbl_totalp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(21, 21, 21)
                                            .addComponent(lbl_primerl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(38, 38, 38)
                                            .addComponent(lbl_ultimal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(32, 32, 32)
                                            .addComponent(lbl_letrac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(13, 13, 13)
                                            .addComponent(lbl_primerap, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(lbl_palabrac, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(25, 25, 25)
                                            .addComponent(lbl_ultimap, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(89, 89, 89)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(42, 42, 42)
                                                .addComponent(lbl_cantO, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbl_cantU, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                                        .addComponent(lbl_cantI, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel10)
                                                            .addComponent(jLabel11))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lbl_cantA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lbl_cantE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel16)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbl_cantpar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_cantimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(21, 21, 21)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lbl_long, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lbl_totalp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lbl_primerl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lbl_ultimal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lbl_letrac, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(lbl_primerap, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lbl_palabrac, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(lbl_ultimap, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(lbl_cantA, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_cantE, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_cantI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(8, 8, 8)
                                .addComponent(jLabel13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbl_cantO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(lbl_cantU, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(lbl_cantimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel15))
                            .addComponent(lbl_cantpar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu1.setText("Archivo");

        btn_abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btn_abrir.setText("Abrir");
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });
        jMenu1.add(btn_abrir);
        jMenu1.add(jSeparator4);

        btn_guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jMenu1.add(btn_guardar);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setText("Editar");

        btn_cortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btn_cortar.setText("Cortar");
        btn_cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cortarActionPerformed(evt);
            }
        });
        jMenu2.add(btn_cortar);
        jMenu2.add(jSeparator1);

        btn_copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btn_copiar.setText("Copiar");
        btn_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_copiarActionPerformed(evt);
            }
        });
        jMenu2.add(btn_copiar);
        jMenu2.add(jSeparator2);

        btn_pegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btn_pegar.setText("Pegar");
        btn_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pegarActionPerformed(evt);
            }
        });
        jMenu2.add(btn_pegar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pegarActionPerformed
        // TODO add your handling code here:
        txt_palabra.paste();
    }//GEN-LAST:event_btn_pegarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        if(seleccionar.showDialog(null, "Guardar")==JFileChooser.APPROVE_OPTION){
            arch=seleccionar.getSelectedFile();
            if(arch.getName().endsWith("txt")){
                String doc=txt_palabra.getText();
                String mensaje=guardar_arch(arch, doc);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Guardar documento de texto");
            }
        }  
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirActionPerformed
        if(seleccionar.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION){
            arch=seleccionar.getSelectedFile();
            if(arch.canRead()){
                if(arch.getName().endsWith("txt")){
                    String documento=abrir_arch(arch);
                    txt_palabra.setText(documento);
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        }
    }//GEN-LAST:event_btn_abrirActionPerformed

    private void btn_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_copiarActionPerformed
        txt_palabra.copy();
    }//GEN-LAST:event_btn_copiarActionPerformed

    private void btn_cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cortarActionPerformed
        txt_palabra.cut();
    }//GEN-LAST:event_btn_cortarActionPerformed

    private void ProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesarActionPerformed
        lbl_long.setBackground(Color.green);
        String palabra = txt_palabra.getText();
        String letraU = palabra.substring(palabra.length()-1);
        String[] palabraarray;
        palabraarray = txt_palabra.getText().split(" ");
        String[] chararray = palabra.split("");
        int tamaño = 0;

        StringTokenizer st = new StringTokenizer(palabra);
        lbl_totalp.setForeground(Color.green);
        lbl_totalp.setText(""+st.countTokens());

        StringTokenizer tokens = new StringTokenizer(palabra);
        String primeraPalabra = tokens.nextToken();
        lbl_primerap.setForeground(Color.green);
        lbl_primerap.setText(primeraPalabra);

        char letra1 = palabra.charAt(0);
        lbl_primerl.setForeground(Color.green);
        lbl_primerl.setText(""+letra1);

        int stringLength = palabra.length();
        lbl_long.setForeground(Color.green);
        lbl_long.setText(""+stringLength);

        char []letra2 = letraU.toCharArray();
        lbl_ultimal.setForeground(Color.green);
        lbl_ultimal.setText(""+letra2[letra2.length -1]);

        String strLastToken = null;
        while( st.hasMoreTokens() ) {
            strLastToken = st.nextToken();
        }
        lbl_ultimap.setForeground(Color.green);
        lbl_ultimap.setText("" + strLastToken);

        int centro1 = stringLength/2;
        lbl_letrac.setForeground(Color.green);
        lbl_letrac.setText(chararray[centro1]);

        int centro2 = tamaño/2;
        lbl_palabrac.setForeground(Color.green);
        lbl_palabrac.setText(palabraarray[centro2]);

        String[] valorarray = palabra.split(" ");
        int sumPar=0;
        int sumImp=0;

        for (String parimpar : valorarray) {
            int contar = parimpar.length();

            if (contar % 2 == 0 ){
                sumPar = sumPar + 1;

            }else {
                sumImp = sumImp + 1;
            }
        }
        lbl_cantpar.setForeground(Color.green);
        lbl_cantpar.setText(Integer.toString(sumPar));
        lbl_cantimpar.setForeground(Color.green);
        lbl_cantimpar.setText(Integer.toString(sumImp));

        int cantA=0;
        int cantE=0;
        int cantI=0;
        int cantO=0;
        int cantU=0;
        
        for (int x = 0 ; x < palabra.length(); x++){
            if (palabra.charAt(x)== 'A' || palabra.charAt(x)== 'a' || palabra.charAt(x)== 'Á' || palabra.charAt(x)== 'á'){
                cantA++;
            }
        }
        lbl_cantA.setForeground(Color.green);
        lbl_cantA.setText(""+cantA);
        
        
        for (int x = 0 ; x < palabra.length(); x++){
            if (palabra.charAt(x)== 'E' || palabra.charAt(x)== 'e' || palabra.charAt(x)== 'É' || palabra.charAt(x)== 'é'){
                cantE++;
            }
        }
        lbl_cantE.setForeground(Color.green);
        lbl_cantE.setText(""+cantE);
    
         for (int x = 0 ; x < palabra.length(); x++){
            if (palabra.charAt(x)== 'I' || palabra.charAt(x)== 'i' || palabra.charAt(x)== 'Í' || palabra.charAt(x)== 'í'){
                cantI++;
            }
        }
        lbl_cantI.setForeground(Color.green);
        lbl_cantI.setText(""+cantI);
        

        for (int x = 0 ; x < palabra.length(); x++){
            if (palabra.charAt(x)== 'O' || palabra.charAt(x)== 'o' || palabra.charAt(x)== 'Ó' || palabra.charAt(x)== 'ó'){
                cantO++;
            }
        }
        lbl_cantO.setForeground(Color.green);
        lbl_cantO.setText(""+cantO);

        for (int x = 0 ; x < palabra.length(); x++){
            if (palabra.charAt(x)== 'U' || palabra.charAt(x)== 'u' || palabra.charAt(x)== 'Ú' || palabra.charAt(x)== 'ú'){
                cantU++;
            }
        }
        lbl_cantU.setForeground(Color.green);
        lbl_cantU.setText(""+cantU);

        String cadenaNormalize = Normalizer.normalize(palabra, Normalizer.Form.NFD);
        String val = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        String s= val.toLowerCase();

        String abc="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        String conv="7,B,3,D,5,F,8,H,4,J,K,6,0,N,9,P,Q,2,S,T,1,V,W,X,Y,Z";
        String[] alfabeto=abc.split(",");
        String[] convertir= conv.split(",");

        for (String alfa : alfabeto) {
            System.out.println(alfa);
        }

        for (String conver : convertir) {
            System.out.println(conver);
        }

        for (int i = 0; i <26; i++){
            s = s.replace(alfabeto[i], convertir[i]);
        }
        txt_traductor.setText(s);
    }//GEN-LAST:event_ProcesarActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Procesar;
    private javax.swing.JTextArea Texto1;
    private javax.swing.JMenuItem btn_abrir;
    private javax.swing.JMenuItem btn_copiar;
    private javax.swing.JMenuItem btn_cortar;
    private javax.swing.JMenuItem btn_guardar;
    private javax.swing.JMenuItem btn_pegar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lbl_cantA;
    private javax.swing.JLabel lbl_cantE;
    private javax.swing.JLabel lbl_cantI;
    private javax.swing.JLabel lbl_cantO;
    private javax.swing.JLabel lbl_cantU;
    private javax.swing.JLabel lbl_cantimpar;
    private javax.swing.JLabel lbl_cantpar;
    private javax.swing.JLabel lbl_letrac;
    private javax.swing.JLabel lbl_long;
    private javax.swing.JLabel lbl_palabrac;
    private javax.swing.JLabel lbl_primerap;
    private javax.swing.JLabel lbl_primerl;
    private javax.swing.JLabel lbl_totalp;
    private javax.swing.JLabel lbl_ultimal;
    private javax.swing.JLabel lbl_ultimap;
    private javax.swing.JTextArea txt_palabra;
    private javax.swing.JTextArea txt_traductor;
    // End of variables declaration//GEN-END:variables
}