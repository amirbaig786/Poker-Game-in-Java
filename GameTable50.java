
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem56;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class GameTable50 extends javax.swing.JFrame {

    /**
     * Creates new form GameTable50
     */
    public GameTable50(int noofpl){
        initComponents();
        this.noofpl=noofpl;
    }
    static int noofpl;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Blinds $50");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(860, 570, 70, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(580, 280, 70, 17);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(490, 280, 52, 17);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(410, 280, 60, 16);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(330, 280, 70, 17);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(250, 277, 60, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Player 6");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(630, 520, 60, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Player 5");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 530, 60, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Player 4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 520, 60, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Player 3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 350, 60, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 160, 70, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 50, 60, 17);

        jButton1.setText("Deal");
        getContentPane().add(jButton1);
        jButton1.setBounds(440, 70, 57, 25);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Player 7");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(780, 370, 70, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Player 8");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(750, 170, 70, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Player 9");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(620, 50, 60, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sem56/table1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 600);

        setSize(new java.awt.Dimension(968, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
     static int n,rand;
    public static int randodo(int min,int max){
       if (min>=max){
           throw new IllegalArgumentException("max must be greater than min");
           
       }
       Random r =new Random();
       return r.nextInt((max-min)+1)+min;
    }
    public static String randcard(){
        String s[]=new String[52];
        s[0]="2 Hearts";
        s[1]="3 Hearts";
        s[2]="4 Hearts";
        s[3]="5 Hearts";
        s[4]="6 Hearts";
        s[5]="7 Hearts";
        s[6]="8 Hearts";
        s[7]="9 Hearts";
        s[8]="10 Hearts";
        s[9]="J Hearts";
        s[10]="Q Hearts";
        s[11]="K Hearts";
        s[12]="A Hearts";
        s[13]="2 Diamonds";
        s[14]="3 Diamonds";
        s[15]="4 Diamonds";
        s[16]="5 Diamonds";
        s[17]="6 Diamonds";
        s[18]="7 Diamonds";
        s[19]="8 Diamonds";
        s[20]="9 Diamonds";
        s[21]="10 Diamonds";
        s[22]="J Diamonds";
        s[23]="Q Diamonds";
        s[24]="K Diamonds";
        s[25]="A Diamonds";
        s[26]="2 Clubs";
        s[27]="3 Clubs";
        s[28]="4 Clubs";
        s[29]="5 Clubs";
        s[30]="6 Clubs";
        s[31]="7 Clubs";
        s[32]="8 Clubs";
        s[33]="9 Clubs";
        s[34]="10 Clubs";
        s[35]="J Clubs";
        s[36]="Q Clubs";
        s[37]="K Clubs";
        s[38]="A Clubs";
        s[39]="2 Spades";
        s[40]="3 Spades";
        s[41]="4 Spades";
        s[42]="5 Spades";
        s[43]="6 Spades";
        s[44]="7 Spades";
        s[45]="8 Spades";
        s[46]="9 Spades";
        s[47]="10 Spades";
        s[48]="J Spades";
        s[49]="Q Spades";
        s[50]="K Spades";
        s[51]="A Spades";
        return s[randodo(0,51)];
        
        
        
        
        
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameTable50.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameTable50.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameTable50.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameTable50.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameTable50(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
