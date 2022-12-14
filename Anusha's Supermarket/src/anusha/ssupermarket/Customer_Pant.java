/*
f * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package anusha.ssupermarket;


import static anusha.ssupermarket.Customer_Jewel.user;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.*;
import java.awt.*;
import java.io.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author faraz
 */
public class Customer_Pant extends javax.swing.JFrame {

    /**
     * Creates new form CustomreUI
     */
    public static String user;
    public Customer_Pant(String Userinfo,cartThread t1,int counts) {
        initComponents(); 
    user = Userinfo;
    cartt1 = t1;
    count = counts;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        sidebar = new javax.swing.JPanel();
        shirt = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        All = new javax.swing.JPanel();
        name2 = new javax.swing.JLabel();
        pant = new javax.swing.JPanel();
        name3 = new javax.swing.JLabel();
        jewellery = new javax.swing.JPanel();
        name4 = new javax.swing.JLabel();
        Cart = new javax.swing.JPanel();
        name5 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        name7 = new javax.swing.JLabel();
        edible = new javax.swing.JPanel();
        name6 = new javax.swing.JLabel();
        TopBar = new javax.swing.JPanel();
        closewindow = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        minimize = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        shopping = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        allitems3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        allitems2 = new javax.swing.JPanel();
        ILLVZNblck = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mvrkRed = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        mvrckblck = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(23, 35, 51));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shirt.setBackground(new java.awt.Color(23, 35, 51));
        shirt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                shirtMousePressed(evt);
            }
        });
        shirt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name1.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        name1.setForeground(new java.awt.Color(242, 242, 242));
        name1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anusha/ssupermarket/imgs/icons8_shirt_30px.png"))); // NOI18N
        name1.setText("Shirts");
        shirt.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 73, 34));

        sidebar.add(shirt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 50));

        All.setBackground(new java.awt.Color(23, 35, 51));
        All.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AllMousePressed(evt);
            }
        });
        All.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name2.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        name2.setForeground(new java.awt.Color(242, 242, 242));
        name2.setText("ALL");
        All.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 73, 34));

        sidebar.add(All, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 50));

        pant.setBackground(new java.awt.Color(41, 57, 80));
        pant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pantMousePressed(evt);
            }
        });
        pant.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name3.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        name3.setForeground(new java.awt.Color(242, 242, 242));
        name3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anusha/ssupermarket/imgs/icons8_pajama_pants_30px.png"))); // NOI18N
        name3.setText("Pants");
        pant.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 73, 34));

        sidebar.add(pant, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 110, 50));

        jewellery.setBackground(new java.awt.Color(23, 35, 51));
        jewellery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jewelleryMousePressed(evt);
            }
        });
        jewellery.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name4.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        name4.setForeground(new java.awt.Color(242, 242, 242));
        name4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anusha/ssupermarket/imgs/icons8_ring_side_view_30px.png"))); // NOI18N
        name4.setText("Jewellery");
        jewellery.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 34));

        sidebar.add(jewellery, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 110, 50));

        Cart.setBackground(new java.awt.Color(23, 35, 51));
        Cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CartMousePressed(evt);
            }
        });
        Cart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name5.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        name5.setForeground(new java.awt.Color(242, 242, 242));
        name5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anusha/ssupermarket/imgs/icons8_Shopping_Cart_30px.png"))); // NOI18N
        name5.setText("Cart");
        Cart.add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 34));

        sidebar.add(Cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 110, 50));

        logout.setBackground(new java.awt.Color(23, 35, 51));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
        });
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name7.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        name7.setForeground(new java.awt.Color(242, 242, 242));
        name7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anusha/ssupermarket/imgs/icons8_logout_30px.png"))); // NOI18N
        logout.add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 50));

        sidebar.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 90, 50));

        edible.setBackground(new java.awt.Color(23, 35, 51));
        edible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                edibleMousePressed(evt);
            }
        });
        edible.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name6.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        name6.setForeground(new java.awt.Color(242, 242, 242));
        name6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anusha/ssupermarket/imgs/icons8_group_of_fruits_30px.png"))); // NOI18N
        name6.setText("Edible");
        edible.add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 10, 80, 34));

        sidebar.add(edible, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 110, 50));

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, -1));

        TopBar.setBackground(new java.awt.Color(77, 128, 216));
        TopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closewindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closewindowMousePressed(evt);
            }
        });
        closewindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anusha/ssupermarket/imgs/icons8_close_window_45px.png"))); // NOI18N
        closewindow.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 50, 50));

        TopBar.add(closewindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 30, 30));

        minimize.setInheritsPopupMenu(true);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizeMousePressed(evt);
            }
        });
        minimize.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anusha/ssupermarket/imgs/icons8_minimize_window_45px_1.png"))); // NOI18N
        minimize.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 50, 50));

        TopBar.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 30, 30));

        getContentPane().add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        allitems3.setBackground(new java.awt.Color(62, 120, 207));

        allitems2.setBackground(new java.awt.Color(62, 120, 207));
        allitems2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ILLVZNblck.setOpaque(false);
        ILLVZNblck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ILLVZNblckMousePressed(evt);
            }
        });
        ILLVZNblck.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(62, 120, 207));

        jLabel43.setIcon(new javax.swing.ImageIcon("C:\\Users\\faraz\\OneDrive\\Documents\\NetBeansProjects\\Anusha'sSupermarket\\src\\anusha\\ssupermarket\\blackpants.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ILLVZNblck.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, -1));

        jLabel11.setFont(new java.awt.Font("Google Sans", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ILLVZN Black Pants");
        ILLVZNblck.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 142, 130, 16));

        jLabel12.setFont(new java.awt.Font("Google Sans", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Rs: 2400");
        ILLVZNblck.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 164, 130, 16));

        allitems2.add(ILLVZNblck, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        mvrkRed.setOpaque(false);
        mvrkRed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mvrkRedMousePressed(evt);
            }
        });
        mvrkRed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(62, 120, 207));

        jLabel44.setIcon(new javax.swing.ImageIcon("C:\\Users\\faraz\\OneDrive\\Documents\\NetBeansProjects\\Anusha'sSupermarket\\src\\anusha\\ssupermarket\\maverickredpant.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mvrkRed.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, -1));

        jLabel13.setFont(new java.awt.Font("Google Sans", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Maverick Red Pants");
        mvrkRed.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 142, 130, 16));

        jLabel14.setFont(new java.awt.Font("Google Sans", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Rs: 1800");
        mvrkRed.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 164, 130, 16));

        allitems2.add(mvrkRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        mvrckblck.setOpaque(false);
        mvrckblck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mvrckblckMousePressed(evt);
            }
        });
        mvrckblck.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(62, 120, 207));

        jLabel46.setIcon(new javax.swing.ImageIcon("C:\\Users\\faraz\\OneDrive\\Documents\\NetBeansProjects\\Anusha'sSupermarket\\src\\anusha\\ssupermarket\\maverickpant.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mvrckblck.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, -1));

        jLabel17.setFont(new java.awt.Font("Google Sans", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Maverick Black Pants");
        mvrckblck.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 16));

        jLabel18.setFont(new java.awt.Font("Google Sans", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Rs: 1600");
        mvrckblck.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 164, 130, 16));

        allitems2.add(mvrckblck, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jScrollPane6.setViewportView(allitems2);

        javax.swing.GroupLayout allitems3Layout = new javax.swing.GroupLayout(allitems3);
        allitems3.setLayout(allitems3Layout);
        allitems3Layout.setHorizontalGroup(
            allitems3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );
        allitems3Layout.setVerticalGroup(
            allitems3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );

        jScrollPane7.setViewportView(allitems3);

        javax.swing.GroupLayout shoppingLayout = new javax.swing.GroupLayout(shopping);
        shopping.setLayout(shoppingLayout);
        shoppingLayout.setHorizontalGroup(
            shoppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        shoppingLayout.setVerticalGroup(
            shoppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shoppingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );

        getContentPane().add(shopping, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMousePressed
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMousePressed

    private void closewindowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closewindowMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closewindowMousePressed

    private void shirtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shirtMousePressed
        // TODO add your handling code here:
      shirtpage();
    }//GEN-LAST:event_shirtMousePressed

    private void AllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllMousePressed
        // TODO add your handling code here:
        allpage();
    }//GEN-LAST:event_AllMousePressed

    private void pantMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pantMousePressed
        // TODO add your handling code here:
        pantpage();
    }//GEN-LAST:event_pantMousePressed

    private void jewelleryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jewelleryMousePressed
        // TODO add your handling code here:
        jewellerypage();
    }//GEN-LAST:event_jewelleryMousePressed

    private void CartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartMousePressed
        // TODO add your handling code here:
        cartpage();
    }//GEN-LAST:event_CartMousePressed

    private void edibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edibleMousePressed
        // TODO add your handling code here:
        ediblepage();
    }//GEN-LAST:event_edibleMousePressed

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        // TODO add your handling code here:
        new Signin_Up().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMousePressed

    private void ILLVZNblckMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ILLVZNblckMousePressed
  String Input=JOptionPane.showInputDialog(this,"Enter Quantity");    
     int Amount = Integer.parseInt(Input);
                  
     if (Amount>0 && count<10 ){
                     cartt1.additem(Amount, "Illvzn Pant(blck)",2400,count );
               count++;
           }
           else if (count<10){
                JOptionPane.showMessageDialog(this,"Your Cart is filled.","Out of Space",JOptionPane.WARNING_MESSAGE);     
           }        // TODO add your handling code here:
    }//GEN-LAST:event_ILLVZNblckMousePressed

    private void mvrckblckMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvrckblckMousePressed
        // TODO add your handling code here:
          String Input=JOptionPane.showInputDialog(this,"Enter Quantity");    
     int Amount = Integer.parseInt(Input);
                  
     if (Amount>0 && count<10 ){
                     cartt1.additem(Amount, "Maverick Pant(blck)", 1600,count );
               count++;
           }
           else if (count<10){
                JOptionPane.showMessageDialog(this,"Your Cart is filled.","Out of Space",JOptionPane.WARNING_MESSAGE);     
           }
    }//GEN-LAST:event_mvrckblckMousePressed

    private void mvrkRedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvrkRedMousePressed
        // TODO add your handling code here:
          String Input=JOptionPane.showInputDialog(this,"Enter Quantity");    
    int Amount = Integer.parseInt(Input);
                   
     if (Amount>0 && count<10 ){
                     cartt1.additem(Amount, "Maverick Pant(red)",1800,count );
               count++;
           }
           else if (count<10){
                JOptionPane.showMessageDialog(this,"Your Cart is filled.","Out of Space",JOptionPane.WARNING_MESSAGE);     
           }
    }//GEN-LAST:event_mvrkRedMousePressed

    

  public void shirtpage(){
    
new Customer_Shirt(user,cartt1,count).setVisible(true);     
this.dispose();
 }
 
 public void jewellerypage(){
 new Customer_Jewel(user,cartt1,count).setVisible(true);     
this.dispose();


 }
 
 
 public void ediblepage(){
   new Customer_edible(user,cartt1,count).setVisible(true);     
this.dispose();
 }
 public void cartpage(){
        new Cart(user,cartt1,count).setVisible(true);
        this.dispose();
 }
 
 public void allpage(){
    new Customer_UI(user,cartt1,count).setVisible(true);
 }
 public void pantpage(){

 }        
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
            java.util.logging.Logger.getLogger(Customer_Pant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Pant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Pant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Pant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Pant(user,cartt1,count).setVisible(true);
            }
        });
    }
    
     private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } 
        
    }
    
    public static cartThread  cartt1 = new cartThread();
    public static int count;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel All;
    private javax.swing.JPanel Cart;
    private javax.swing.JPanel ILLVZNblck;
    private javax.swing.JPanel TopBar;
    private javax.swing.JPanel allitems2;
    private javax.swing.JPanel allitems3;
    private javax.swing.JPanel closewindow;
    private javax.swing.JPanel edible;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel jewellery;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel minimize;
    private javax.swing.JPanel mvrckblck;
    private javax.swing.JPanel mvrkRed;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JPanel pant;
    private javax.swing.JPanel shirt;
    private javax.swing.JPanel shopping;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
