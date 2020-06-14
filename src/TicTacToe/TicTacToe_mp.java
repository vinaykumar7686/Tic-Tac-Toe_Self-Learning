/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TicTacToe;
import DB.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Vinay Kr
 */
public class TicTacToe_mp extends javax.swing.JFrame {
    static String p1="",p2="",p22="",player1="",player2="";
    static int counter=0;
    public TicTacToe_mp() {
        initComponents();
    }
    public void updateintodb()
    {
        try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("insert into history (result,moves1,moves2) values(?,?,?)");
            db.pstmt.setString(1,getwinner());
            db.pstmt.setString(2,player1);
            db.pstmt.setString(3,player2);
            int i=db.pstmt.executeUpdate();
            if(i>0)
            {
                System.out.println("Updated");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public String getwinner()
    {
        //horizontal
        if((a1.getText()).equals(a2.getText())&&(a3.getText()).equals(a2.getText()))
        {
            if(a1.getText().equals("*"))
            {
                return "win";
            }
            else if(a1.getText().equals("-"))
            {
                return "lose";
            }
        }
        else if((b1.getText()).equals(b2.getText())&&(b3.getText()).equals(b2.getText()))
        {
            if(b1.getText().equals("*"))
            {
                return "win";
            }
            else if(b1.getText().equals("-"))
            {
                return "lose";
            }
        }
        else if((c1.getText()).equals(c2.getText())&&(c3.getText()).equals(c2.getText()))
        {
            if(c1.getText().equals("*"))
            {
                return "win";
            }
            else if(c1.getText().equals("-"))
            {
                return "lose";
            }
        }
        //Vertical
        else if((a1.getText()).equals(b1.getText())&&(b1.getText()).equals(c1.getText()))
        {
            if(a1.getText().equals("*"))
            {
                return "win";
            }
            else if(a1.getText().equals("-"))
            {
                return "lose";
            }
        }
        else if((a2.getText()).equals(b2.getText())&&(c2.getText()).equals(b2.getText()))
        {
            if(b2.getText().equals("*"))
            {
                return "win";
            }
            else if(b2.getText().equals("-"))
            {
                return "lose";
            }
        }
        else if((a3.getText()).equals(b3.getText())&&(b3.getText()).equals(c3.getText()))
        {
            if(a3.getText().equals("*"))
            {
                return "win";
            }
            else if(a3.getText().equals("-"))
            {
                return "lose";
            }
        }
        //diagonal
        else if((a1.getText()).equals(b2.getText())&&(b2.getText()).equals(c3.getText()))
        {
            if(a1.getText().equals("*"))
            {
                return "win";
            }
            else if(a1.getText().equals("-"))
            {
                return "lose";
            }
        }
        else if((a3.getText()).equals(b2.getText())&&(b2.getText()).equals(c1.getText()))
        {
            if(a3.getText().equals("*"))
            {
                return "win";
            }
            else if(a3.getText().equals("-"))
            {
                return "lose";
            }
        }
        else
        {
            return "tie";
        }
            
        return "continue";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Tic-Tac-Toe");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 31, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 437, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 437, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 10, 290));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 10, 290));

        a1.setBackground(new java.awt.Color(21, 21, 21));
        a1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 36)); // NOI18N
        a1.setForeground(new java.awt.Color(204, 204, 204));
        a1.setToolTipText("");
        a1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1MouseClicked(evt);
            }
        });
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 146, 80, 60));

        a2.setBackground(new java.awt.Color(21, 21, 21));
        a2.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 36)); // NOI18N
        a2.setForeground(new java.awt.Color(204, 204, 204));
        a2.setToolTipText("");
        a2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a2MouseClicked(evt);
            }
        });
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 146, 80, 60));

        a3.setBackground(new java.awt.Color(21, 21, 21));
        a3.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 36)); // NOI18N
        a3.setForeground(new java.awt.Color(204, 204, 204));
        a3.setToolTipText("");
        a3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a3MouseClicked(evt);
            }
        });
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 146, 80, 60));

        b1.setBackground(new java.awt.Color(21, 21, 21));
        b1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 36)); // NOI18N
        b1.setForeground(new java.awt.Color(204, 204, 204));
        b1.setToolTipText("");
        b1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 256, 80, 60));

        b2.setBackground(new java.awt.Color(21, 21, 21));
        b2.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 36)); // NOI18N
        b2.setForeground(new java.awt.Color(204, 204, 204));
        b2.setToolTipText("");
        b2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 256, 80, 60));

        b3.setBackground(new java.awt.Color(21, 21, 21));
        b3.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 36)); // NOI18N
        b3.setForeground(new java.awt.Color(204, 204, 204));
        b3.setToolTipText("");
        b3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 256, 80, 60));

        c1.setBackground(new java.awt.Color(21, 21, 21));
        c1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 36)); // NOI18N
        c1.setForeground(new java.awt.Color(204, 204, 204));
        c1.setToolTipText("");
        c1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1MouseClicked(evt);
            }
        });
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 356, 80, 60));

        c2.setBackground(new java.awt.Color(21, 21, 21));
        c2.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 36)); // NOI18N
        c2.setForeground(new java.awt.Color(204, 204, 204));
        c2.setToolTipText("");
        c2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2MouseClicked(evt);
            }
        });
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 356, 80, 60));

        c3.setBackground(new java.awt.Color(21, 21, 21));
        c3.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 36)); // NOI18N
        c3.setForeground(new java.awt.Color(204, 204, 204));
        c3.setToolTipText("");
        c3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c3MouseClicked(evt);
            }
        });
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 356, 90, 60));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void reset()
{
    counter=0;
    player1=player2="";
        a1.setText("");
        a2.setText("");
        a3.setText("");
        b1.setText("");
        b2.setText("");
        b3.setText("");
        c1.setText("");
        c2.setText("");
        c3.setText("");
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        reset();
        setVisible(false);
        again();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseClicked
        // TODO add your handling code here:
        if (counter++%2==0)
        {
            player1+="a1";
            a1.setText("*");
            a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png")));
        }
        else
        {
            player2+="a1";
            a1.setText("-");
            a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
        }
        if(getwinner()=="win")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            reset();
        }
        else if (getwinner()=="lose")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            reset();
        }
        if(counter==9)
        {
            if(getwinner()=="win")
            {
                JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            }
            else if (getwinner()=="lose")
            {
                JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            }
            else if (getwinner()=="tie")
            {
                JOptionPane.showMessageDialog(this,"DRAW");
            }
            updateintodb();
            reset();
        }
    }//GEN-LAST:event_a1MouseClicked

    private void a2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseClicked
        // TODO add your handling code here:
        if (counter++%2==0)
        {
            player1+="a2";
            a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png")));
            a2.setText("*");
        }
        else
        {
            player2+="a2";
            a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
            a2.setText("-");
        }
        if(getwinner()=="win")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            reset();
        }
        else if (getwinner()=="lose")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            reset();
        }
        if(counter==9)
        {
            if(getwinner()=="win")
            {
                JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            }
            else if (getwinner()=="lose")
            {
                JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            }
            else if (getwinner()=="tie")
            {
                JOptionPane.showMessageDialog(this,"DRAW");
            }
            updateintodb();
            reset();
        }
    }//GEN-LAST:event_a2MouseClicked

    private void a3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseClicked
        // TODO add your handling code here:
        if (counter++%2==0)
        {
            player1+="a3";
            a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png")));
            a3.setText("*");
        }
        else
        {
            player2+="a3";
            a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
            a3.setText("-");
        }
        if(getwinner()=="win")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            reset();
        }
        else if (getwinner()=="lose")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            reset();
        }
        if(counter==9)
        {
            if(getwinner()=="win")
            {
                JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            }
            else if (getwinner()=="lose")
            {
                JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            }
            else if (getwinner()=="tie")
            {
                JOptionPane.showMessageDialog(this,"DRAW");
            }
            updateintodb();
            reset();
        }
    }//GEN-LAST:event_a3MouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
        if (counter++%2==0)
        {
            player1+="b1";
            b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png")));
            b1.setText("*");
        }
        else
        {
            player2+="b1";
            b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
            b1.setText("-");
        }
        if(getwinner()=="win")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            reset();
        }
        else if (getwinner()=="lose")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            reset();
        }
        if(counter==9)
        {
            if(getwinner()=="win")
            {
                JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            }
            else if (getwinner()=="lose")
            {
                JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            }
            else if (getwinner()=="tie")
            {
                JOptionPane.showMessageDialog(this,"DRAW");
            }
            updateintodb();
            reset();
        }
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        // TODO add your handling code here:
        if (counter++%2==0)
        {
            player1+="b2";
            b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png")));
            b2.setText("*");
        }
        else
        {
            player2+="b2";
            b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
            b2.setText("-");
        }
        if(getwinner()=="win")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            reset();
        }
        else if (getwinner()=="lose")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            reset();
        }
        if(counter==9)
        {
            if(getwinner()=="win")
            {
                JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            }
            else if (getwinner()=="lose")
            {
                JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            }
            else if (getwinner()=="tie")
            {
                JOptionPane.showMessageDialog(this,"DRAW");
            }
            updateintodb();
            reset();
        }
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        // TODO add your handling code here:
        if (counter++%2==0)
        {
            player1+="b3";
            b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png")));
            b3.setText("*");
        }
        else
        {
            player2+="b3";
            b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
            b3.setText("-");
        }
        if(getwinner()=="win")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            reset();
        }
        else if (getwinner()=="lose")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            reset();
        }
        if(counter==9)
        {
            if(getwinner()=="win")
            {
                JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            }
            else if (getwinner()=="lose")
            {
                JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            }
            else if (getwinner()=="tie")
            {
                JOptionPane.showMessageDialog(this,"DRAW");
            }
            updateintodb();
            reset();
        }
    }//GEN-LAST:event_b3MouseClicked

    private void c1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseClicked
        // TODO add your handling code here:
        if (counter++%2==0)
        {
            player1+="c1";
            c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png")));
            c1.setText("*");
        }
        else
        {
            player2+="c1";
            c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
            c1.setText("-");
        }
        if(getwinner()=="win")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            reset();
        }
        else if (getwinner()=="lose")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            reset();
        }
        if(counter==9)
        {
            if(getwinner()=="win")
            {
                JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            }
            else if (getwinner()=="lose")
            {
                JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            }
            else if (getwinner()=="tie")
            {
                JOptionPane.showMessageDialog(this,"DRAW");
            }
            updateintodb();
            reset();
        }
    }//GEN-LAST:event_c1MouseClicked

    private void c2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseClicked
        // TODO add your handling code here:
        if (counter++%2==0)
        {
            player1+="c2";
            c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png")));
            c2.setText("*");
        }
        else
        {
            player2+="c2";
            c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
            c2.setText("-");
        }
        if(getwinner()=="win")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            reset();
        }
        else if (getwinner()=="lose")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            reset();
        }
        if(counter==9)
        {
            if(getwinner()=="win")
            {
                JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            }
            else if (getwinner()=="lose")
            {
                JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            }
            else if (getwinner()=="tie")
            {
                JOptionPane.showMessageDialog(this,"DRAW");
            }
            updateintodb();
            reset();
        }
    }//GEN-LAST:event_c2MouseClicked

    private void c3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3MouseClicked
        // TODO add your handling code here:
        if (counter++%2==0)
        {
            player1+="c3";
            c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png")));
            c3.setText("*");
        }
        else
        {
            player2+="c3";
            c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
            c3.setText("-");
        }
        if(getwinner()=="win")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            reset();
        }
        else if (getwinner()=="lose")
        {
            updateintodb();
            JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            reset();
        }
        if(counter==9)
        {
            if(getwinner()=="win")
            {
                JOptionPane.showMessageDialog(this,"Player 1 Wins !!");
            }
            else if (getwinner()=="lose")
            {
                JOptionPane.showMessageDialog(this,"Player 2 Wins !!");
            }
            else if (getwinner()=="tie")
            {
                JOptionPane.showMessageDialog(this,"DRAW");
            }
            updateintodb();
            reset();
        }
        
    }//GEN-LAST:event_c3MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TicTacToe_mp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_mp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_mp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_mp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_mp().setVisible(true);
            }
        });
    }
    public static void again() {
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
            java.util.logging.Logger.getLogger(TicTacToe_mp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_mp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_mp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_mp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_mp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
