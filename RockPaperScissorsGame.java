//package NetBeansProjects;
import java.util.*;
public class RockPaperScissorsGame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RockPaperScissorsGame.class.getName());
    public RockPaperScissorsGame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        popupMenu1 = new java.awt.PopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jFrame2 = new javax.swing.JFrame();
        popupMenu2 = new java.awt.PopupMenu();
        computerPoints = new javax.swing.JLabel();
        computerValue = new javax.swing.JLabel();
        playerPoints = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        setResizable(false);

        computerPoints.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        computerPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerPoints.setText("computer:   ");

        computerValue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        computerValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        playerPoints.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        playerPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerPoints.setText("Player: 0");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("STONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("PAPER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("SCISSORS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(computerPoints)
                            .addComponent(computerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(playerPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38)
                .addComponent(jButton3)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(computerPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(computerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(playerPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        Random rand = new Random(); 
        int randomNum = rand.nextInt(3);
        if(randomNum==0)
        {
            computerValue.setText("Stone");
        }
        if(randomNum==1)
        {
            computerValue.setText("Paper");
        }
        if(randomNum==2)
        {
            computerValue.setText("Scissors");
        }
        
        if(computerValue.getText().equals("Stone"))
        {
          RunResult resultWindow = new RunResult("tie match");
          
          resultWindow.setVisible(true);
          //this.setVisible(false);
          //this.dispose();
        
        }
        if(computerValue.getText().equals("Paper"))
        {
           RunResult resultWindow = new RunResult("Computer won");
           
           
           resultWindow.setVisible(true);
           //this.setVisible(false);
           //this.dispose();
        
        }
        if(computerValue.getText().equals("Scissors"))
        {
           RunResult resultWindow = new RunResult("Player won");
           
           resultWindow.setVisible(true);
           //this.setVisible(false);
           //this.dispose();
        
        }
        
        
        
        // TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        Random rand = new Random(); 
        int randomNum = rand.nextInt(3);
        if(randomNum==0)
        {
            computerValue.setText("Stone");
        }
        if(randomNum==1)
        {
            computerValue.setText("Paper");
        }
        if(randomNum==2)
        {
            computerValue.setText("Scissors");
        }
        
        if(computerValue.getText().equals("Stone"))
        {
           RunResult resultWindow = new RunResult("Player won");
           
           resultWindow.setVisible(true);
           //this.setVisible(false);
           //this.dispose();
        }
        if(computerValue.getText().equals("Paper"))
        {
          RunResult resultWindow = new RunResult("tie match");
          
          resultWindow.setVisible(true);
          //this.setVisible(false);
           //this.dispose();
        }
        if(computerValue.getText().equals("Scissors"))
        {
           RunResult resultWindow = new RunResult("Computer won");
          
           resultWindow.setVisible(true);
            //this.setVisible(false);
            //this.dispose();
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Random rand = new Random(); 
        int randomNum = rand.nextInt(3);
        if(randomNum==0)
        {
            computerValue.setText("Stone");
        }
        if(randomNum==1)
        {
            computerValue.setText("Paper");
        }
        if(randomNum==2)
        {
            computerValue.setText("Scissors");
        }        // TODO add your handling code here:
        if(computerValue.getText().equals("Stone"))
        {
           RunResult resultWindow = new RunResult("Computer won");
           
           resultWindow.setVisible(true);
           //this.setVisible(false);
           //this.dispose();
           
             
        }
        if(computerValue.getText().equals("Paper"))
        {
           RunResult resultWindow = new RunResult("Player won");
           
           resultWindow.setVisible(true);
           //this.setVisible(false);
           //this.dispose();
        }
        if(computerValue.getText().equals("Scissors"))
        {
          RunResult resultWindow = new RunResult("tie match");
          
          resultWindow.setVisible(true);
          //this.setVisible(false);
          //this.dispose();
        }
    }                                        

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new RockPaperScissorsGame().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel computerPoints;
    private javax.swing.JLabel computerValue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel playerPoints;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration                   
}
