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
public class GameTable50_3 extends javax.swing.JFrame {

    /**
     * Creates new form GameTable50
     */
    public GameTable50_3(int noofpl,int amt[]){
        initComponents();
        this.noofpl=noofpl;
        this.amt=amt;
    }
    static int noofpl,amt[];
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Blinds $50");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(860, 570, 70, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("10 diamonds");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(610, 280, 90, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("10 diamonds");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(510, 280, 80, 20);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("10 diamonds");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(410, 280, 90, 20);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("10 diamonds");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(320, 280, 80, 17);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("10 diamonds");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(230, 280, 90, 20);

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
        jButton1.setBounds(420, 80, 57, 25);

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
                int arr[]=new int[5];
                new GameTable50_3(1,arr).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
