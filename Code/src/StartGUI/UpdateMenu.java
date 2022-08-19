package StartGUI;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UpdateMenu extends javax.swing.JFrame {

    
    public UpdateMenu() throws SQLException {        
        try {
            initComponents();
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","apple");
            Statement s1=con.createStatement();
            ResultSet rs=s1.executeQuery("Select SerialNo,Item,Price from menu");
            while(jta1.getRowCount() > 0)
            {
                ((DefaultTableModel) jta1.getModel()).removeRow(0);
            }
            int columns = rs.getMetaData().getColumnCount();
            while(rs.next())
            {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++)
                {
                    row[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) jta1.getModel()).insertRow(rs.getRow()-1,row);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
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
        additem = new javax.swing.JButton();
        changeprice = new javax.swing.JButton();
        deleteitem = new javax.swing.JButton();
        back = new javax.swing.JButton();
        back1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "S. No.", "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jta1);

        additem.setBackground(new java.awt.Color(0, 200, 200));
        additem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        additem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StartGUI/icons8-plus-48.png"))); // NOI18N
        additem.setText("Add Item");
        additem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemActionPerformed(evt);
            }
        });

        changeprice.setBackground(new java.awt.Color(0, 200, 200));
        changeprice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changeprice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StartGUI/icons8-edit-16.png"))); // NOI18N
        changeprice.setText("Change Price");
        changeprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepriceActionPerformed(evt);
            }
        });

        deleteitem.setBackground(new java.awt.Color(0, 200, 200));
        deleteitem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StartGUI/icons8-delete-30.png"))); // NOI18N
        deleteitem.setText("Delete Item");
        deleteitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitemActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 102, 102));
        back.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(51, 0, 51));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StartGUI/icons8-back-30.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        back1.setBackground(new java.awt.Color(0, 200, 200));
        back1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        back1.setText("Refresh");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(additem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteitem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changeprice, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(back1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {additem, deleteitem});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeprice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteitem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void additemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemActionPerformed
        JPanel myPanel=new JPanel();
        JTextField item = new JTextField(5);
        JTextField price = new JTextField(5);
        JTextField quantity = new JTextField(5);
        JTextField code = new JTextField(5);
        Object[] fields={
            "Enter the name of the item",item,
            "Enter the price of the item",price,
            "Enter the quantity of the item available",quantity,
            "Enter the item code",code
        };
        int n=JOptionPane.showConfirmDialog(null,fields,"Add Item to the Menu",JOptionPane.OK_CANCEL_OPTION);
        if(n==0){        
            String it=item.getText();
            if(item.getText().equals("") || price.getText().equals("") || quantity.getText().equals("") || code.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter valid details");
            }
            else
            {
                Double pri=Double.parseDouble(price.getText());
                int quan=Integer.parseInt(quantity.getText());
                String temp=price.getText()+"";
                String code2=(code.getText());
                if("".equals(temp) || "".equals(it) || pri<=0)
                {
                    JOptionPane.showMessageDialog(null,"Please enter valid details");
                }
                else
                {
                    try {
                        int ID=0;
                        Class.forName("java.sql.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","apple");
                        Statement s1=con.createStatement();
                        ResultSet rs=s1.executeQuery("Select count(*) from menu");
                        while(rs.next())
                        {
                            ID=rs.getInt(1)+1;
                        }
                        s1.executeUpdate("Insert into menu (`SerialNo`, `Item`, `Price`, `ItemCode`, `Quantity`) values ("+ID+",'"+it+"',"+pri+",'"+code2+"',"+quan+");");
                        JOptionPane.showMessageDialog(null,"New Item Successfully Added to the Menu");
                        back1ActionPerformed(null);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(UpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(UpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_additemActionPerformed

    private void changepriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepriceActionPerformed
        try {
            JPanel myPanel=new JPanel();
            JTextField jt=new JTextField(5);
            JComboBox cb=new JComboBox();
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","apple");
            Statement s1=con.createStatement();
            ResultSet rs=s1.executeQuery("Select SerialNo,Item,Price from menu");
            while(rs.next())
            {
                String item=rs.getString("Item");
                cb.addItem(item);
            }
            Object[] fields=
            {
                "Select the Item",cb,
                "Enter the new Price of the Item",jt,
            };
            int n=JOptionPane.showConfirmDialog(null,fields,"Change Price of an Item",JOptionPane.OK_CANCEL_OPTION);
            if(n==0){
                String x=cb.getSelectedItem()+"";
                Double pr=Double.parseDouble(jt.getText());            
                if(pr<=0)
                {
                    JOptionPane.showMessageDialog(null,"Please enter valid values");
                }
                else{
                    System.out.println("StartGUI.UpdateMenu.changepriceActionPerformed() " + "update menu set `Price` = "+pr+" where `Item`="+x+";");
                    int d=s1.executeUpdate("update menu set `Price` = "+pr+" where `Item`='"+x+"';");
                    JOptionPane.showMessageDialog(null,"Price of the Item changed Successfully!!!");
                    back1ActionPerformed(null);                    
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changepriceActionPerformed

    private void deleteitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitemActionPerformed
        try {
            JPanel myPanel=new JPanel();
            JComboBox cb=new JComboBox();
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","apple");
            Statement s1=con.createStatement();
            ResultSet rs=s1.executeQuery("Select SerialNo,Item,Price from menu");
            while(rs.next())
            {
                String item=rs.getString("Item");
                cb.addItem(item);
            }
            Object[] fields=
            {
                "Select the Item",cb,
            };
            int n=JOptionPane.showConfirmDialog(null,fields,"Delete an Item from the Menu",JOptionPane.OK_CANCEL_OPTION);
            if(n==0){
                String x=cb.getSelectedItem()+"";
                s1.executeUpdate("delete from menu where Item='"+x+"';");
                JOptionPane.showMessageDialog(null,"Item removed Successfully!!!");
                back1ActionPerformed(null);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteitemActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Manager().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        try {
            String itemname;
            Double price;
            int serialno;
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","apple");
            Statement s1=con.createStatement();
            ResultSet rs=s1.executeQuery("Select SerialNo,Item,Price from menu");
            while(jta1.getRowCount() > 0)
            {
                ((DefaultTableModel) jta1.getModel()).removeRow(0);
            }
            int columns = rs.getMetaData().getColumnCount();
            while(rs.next())
            {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++)
                {
                    row[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) jta1.getModel()).insertRow(rs.getRow()-1,row);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_back1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UpdateMenu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UpdateMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additem;
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JButton changeprice;
    private javax.swing.JButton deleteitem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jta1;
    // End of variables declaration//GEN-END:variables
}