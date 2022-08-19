/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StartGUI;
import java.sql.*;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Geetesh Challur
 */
public class SellItem extends javax.swing.JFrame {
    
    public SellItem() {
        initComponents();
        while(jta1.getRowCount() > 0)
        {
            ((DefaultTableModel) jta1.getModel()).removeRow(0);
        }        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jta1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        deleterow = new javax.swing.JButton();
        addrow = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        printbill = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "S.No", "Item Name", "Quantity", "Rate", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jta1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jta1ComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(jta1);
        if (jta1.getColumnModel().getColumnCount() > 0) {
            jta1.getColumnModel().getColumn(0).setResizable(false);
            jta1.getColumnModel().getColumn(1).setResizable(false);
            jta1.getColumnModel().getColumn(2).setResizable(false);
            jta1.getColumnModel().getColumn(3).setResizable(false);
            jta1.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("Enter the Item Code:");

        jLabel2.setText("Enter the quantity Sold:");

        deleterow.setText("Made a Mistake?\nClick here to Delete \nthe selected row");
        deleterow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleterowActionPerformed(evt);
            }
        });

        addrow.setText("Add the above Item to Bill");
        addrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrowActionPerformed(evt);
            }
        });

        jLabel3.setText("Bill Amount");

        tf3.setText("0.0");

        printbill.setText("Confirm/Print the Bill");
        printbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbillActionPerformed(evt);
            }
        });

        jButton1.setText("GO BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleterow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf1)
                            .addComponent(tf2)))
                    .addComponent(addrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printbill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(addrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleterow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(printbill, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tf1, tf2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jta1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jta1ComponentHidden
        
    }//GEN-LAST:event_jta1ComponentHidden

    private void addrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrowActionPerformed
        try {
            if(tf1.getText().equals("")||tf2.getText().equals("")||(Integer.parseInt(tf2.getText()))<=0)
            {
                JOptionPane.showMessageDialog(null,"Please Enter valid inputs");
            }
            else
            {
                String itemcode=tf1.getText()+"";
                String name="",itemname="";
                Double pr=0.0;
                int quan=Integer.parseInt(tf2.getText());
                int available=0;
                Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","apple");
                Statement s1=con.createStatement();
                ResultSet rs=s1.executeQuery("Select SerialNo,Item,Price,Quantity,ItemCode from menu");
                while(rs.next())
                { 
                    name=rs.getString("ItemCode");                                
                    available=rs.getInt("Quantity");
                    itemname=rs.getString("Item");
                    pr=rs.getDouble("Price");
                    if(name.equals(itemcode)) break;
                }
                if(available<quan)
                {                    
                    JOptionPane.showMessageDialog(null, "Avalibale quantity less than desired quantity");
                }
                else
                {                    
                    int columns=5;
                    Object[] row={jta1.getRowCount()+1,itemname,quan,pr,pr*quan};
                    DefaultTableModel model=(DefaultTableModel) jta1.getModel();
                    model.insertRow(jta1.getRowCount(),row);
                    tf3.setText((Double.parseDouble(tf3.getText())+pr*quan)+"");
                }                    
            }            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SellItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SellItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addrowActionPerformed

    private void printbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbillActionPerformed
        int choice=JOptionPane.showConfirmDialog(null,"Are you sure you want to confirm and print the Bill?");
        if(choice==0)
        {
            try 
            {
                Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","apple");
                Statement s1=con.createStatement();   
                ResultSet rs1=s1.executeQuery("Select max(BillNo) from bill");
                int nextbillno=0;
                while(rs1.next())
                {
                nextbillno=rs1.getInt(1)+1;            
                }
                java.util.Date dat=new java.util.Date();
                MessageFormat header =new MessageFormat("Bill No.: "+nextbillno);                
                MessageFormat footer =new MessageFormat(dat.toString());
                try
                {
                    jta1.print(JTable.PrintMode.NORMAL, header, footer);
                }
                catch(java.awt.print.PrinterException e)
                {
                    System.err.format("cannot print %s%b",e.getMessage());
                }         
                s1.executeUpdate("Insert into bill (BillNo,Total) values ("+nextbillno+","+Double.parseDouble(tf3.getText()+"")+");");
                for(int i=0;i<jta1.getRowCount();i++)   
                {                    
                    int z2=0;                    
                    Object temp=jta1.getModel().getValueAt(i,2);
                    int temp1=Integer.parseInt(temp+"");
                    String itemname=jta1.getModel().getValueAt(i,1)+"";
                    Double pr=Double.parseDouble(jta1.getModel().getValueAt(i,3)+"");
                    ResultSet rs=s1.executeQuery("Select * from menu where Item= '"+itemname+"';");
                    while(rs.next())
                    {
                        z2=rs.getInt("Quantity");
                    }
                    int z=Integer.parseInt(temp+"");
                    int d=s1.executeUpdate("update menu set `Quantity` = "+(z2-temp1)+" where `Item`='"+itemname+"';");                    
                    s1.executeUpdate("Insert into billitems (BillNo,Item,Quantity,Price) values ("+nextbillno+",'"+itemname+"',"+temp1+","+pr+");");
                }
                dispose();
                new Clerk().setVisible(true);
            } catch (    ClassNotFoundException | SQLException ex) {
                Logger.getLogger(SellItem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_printbillActionPerformed
    
    private void deleterowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterowActionPerformed
        if(jta1.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(null,"Please select a row to delete it");
        }
        else
        {
            int choice=JOptionPane.showConfirmDialog(null,"Are you sure you want to remove the selected row?");
            if(choice==0)
            {
                Object temp=jta1.getModel().getValueAt(jta1.getSelectedRow(),4);
                DefaultTableModel model=(DefaultTableModel) jta1.getModel();
                model.removeRow(jta1.getSelectedRow());
                for(int i=0;i<jta1.getRowCount();i++)
                {
                    jta1.setValueAt(i+1, i, 0);
                }
                tf3.setText(Double.parseDouble(tf3.getText()+"")-Double.parseDouble(temp+"")+"");
            }
        }
    }//GEN-LAST:event_deleterowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new Clerk().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addrow;
    private javax.swing.JButton deleterow;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jta1;
    private javax.swing.JButton printbill;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
