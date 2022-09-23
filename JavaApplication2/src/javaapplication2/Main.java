/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
/**
 *
 * @author Top Gun Maverick
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private int selectedrow, s=0, s1=0;
    private static double sum=0.0, sum1=0.0, res, res1;
    private Info profile;
    private ArrayList<Info> listofprofile =new ArrayList();
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        lb0 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbx = new javax.swing.JComboBox<>();
        bt1 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trình tính điểm SGU");

        jPanel1.setBackground(new java.awt.Color(45, 142, 206));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb0.setForeground(new java.awt.Color(255, 255, 255));
        lb0.setText("Đại Học Sài Gòn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(lb0)
                .addGap(366, 366, 366))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb0)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Môn học", "Số tính chỉ", "%GK", "%CK", "Điểm giữa kỳ", "Điểm cuối kỳ", "Tổng kết hệ 10", "Tổng kết hệ 4", "Xếp loại", "Đánh giá"
            }
        ));
        tb.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jScrollPane1.setViewportView(tb);

        jPanel2.setBackground(new java.awt.Color(45, 142, 206));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Điểm trung bình học kỳ hệ 10:");

        lb2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Điểm trung bình học kỳ hệ 4:");

        lb3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Số tín chỉ đạt:");

        tf1.setEditable(false);

        tf2.setEditable(false);

        tf3.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sắp xếp điểm:");

        cmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp xếp tăng", "Sắp xếp giảm" }));
        cmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxActionPerformed(evt);
            }
        });

        bt1.setText("Tính");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt3.setText("Làm mới");
        bt3.setActionCommand("Đặt lại");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt2.setText("Xóa bộ nhớ");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb2)
                            .addComponent(lb3))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lb1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(tf1)
                    .addComponent(tf3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt3)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2)
                    .addComponent(bt1)
                    .addComponent(bt2)
                    .addComponent(bt3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private char Ranking(double mark)       //Hàm xếp loại
    {
        char ranking='O';
        if(mark>=0.0 && mark <4.0)
            ranking='F';
        if(mark>=4.0 && mark<5.5)
            ranking='D';
        if(mark>=5.5 && mark<7.0)
            ranking='C';
        if(mark>=7.0 && mark<8.5)
            ranking='B';
        if(mark>=8.5 && mark<=10.0)
            ranking='A';
        return ranking;
    }
    public double Dec(double mark)      //Làm tròn 1 số thập phân
    {
        double res=0.0;
        if(mark-Math.floor(mark)>=0.0 && mark-Math.floor(mark)<0.5)
                res=Math.floor(mark*10)/10;
        else if(mark-Math.floor(mark)>=0.5 && mark-Math.floor(mark)<=1.0)
                res=Math.ceil(mark*10)/10;
        return res;
    }
    private void Set10(double res)        //Điểm HK hệ 10 làm tròn 2 chữ số thập phân
    {
        if(res-Math.floor(res)>=0.0 && res-Math.floor(res)<0.5)
                tf1.setText(String.valueOf(Math.floor(res*100)/100));
        else if(res-Math.floor(res)>=0.5 && res-Math.floor(res)<=1.0)
                tf1.setText(String.valueOf(Math.ceil(res*100)/100));
    }
    private void Set4(double res1)        //Điểm HK hệ 4 làm tròn 2 chữ số thập phân
    {
        if(res1-Math.floor(res1)>=0.0 && res1-Math.floor(res1)<0.5)
                tf2.setText(String.valueOf(Math.floor(res1*100)/100));
            else if(res1-Math.floor(res1)>=0.5 && res1-Math.floor(res1)<=1.0)
                tf2.setText(String.valueOf(Math.ceil(res1*100)/100));
    }
    private double TK10(double GK, double CK, double DGK, double DCK)
    {
        double gk=GK/100;
        double ck=CK/100;
        return DGK*gk+DCK*ck;
    }
    private double TK4(double mark)
    {
        double tk=0.0;
        if(mark>=0 && mark<4.0)
            tk=0.0;
        if(mark>=4.0 && mark<5.5)
            tk=1.0;
        if(mark>=5.5 && mark<7.0)
            tk=2.0;
        if(mark>=7.0 && mark<8.5)
            tk=3.0;
        if(mark>=8.5 && mark<=10.0)
            tk=4.0;
        return tk;
    }
    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        try
        {
            int stcdat=0;
            selectedrow=tb.getSelectedRowCount();
            for(int i=0;i<selectedrow;i++)  //Set điểm hệ 10 và 4 từng môn
            {
                double GK=Double.parseDouble(String.valueOf(tb.getValueAt(i, 2)));
                double CK=Double.parseDouble(String.valueOf(tb.getValueAt(i, 3)));
                double DGK=Double.parseDouble(String.valueOf(tb.getValueAt(i, 4)));
                double DCK=Double.parseDouble(String.valueOf(tb.getValueAt(i, 5)));
                tb.setValueAt(Dec(TK10(GK,CK,DGK,DCK)), i, 6);
                tb.setValueAt(TK4(TK10(GK,CK,DGK,DCK)), i, 7);
            }
            for(int i=0;i<selectedrow;i++)  //Điểm HK hệ 10 cả hk 
            {
                double stc=Double.parseDouble(String.valueOf(tb.getValueAt(i, 1)));
                double mark=Double.parseDouble(String.valueOf(tb.getValueAt(i, 6)));
                sum+=stc*mark;
                s+=stc;
                tb.setValueAt(Ranking(mark), i, 8);     //Xếp loại từng môn
                if(mark>=4)     //Đánh giá từng môn
                {
                    stcdat+=stc;
                    tb.setValueAt("Đạt", i, 9);
                }
                else
                    tb.setValueAt("Thi lại", i, 9);
            }
            res=sum/s;
            Set10(res);         //Điểm HK hệ 10      
            for(int i=0;i<selectedrow;i++)          //Điểm HK hệ 4 cả hk 
            {
                double stc=Double.parseDouble(String.valueOf(tb.getValueAt(i, 1)));
                double mark1=Double.parseDouble(String.valueOf(tb.getValueAt(i, 7)));
                sum1+=stc*mark1;
                s1+=stc;                   
            }
            res1=sum1/s1;
            Set4(res1);       
            tf3.setText(String.valueOf(stcdat));
        }
        catch(NumberFormatException ne)
        {
            if(selectedrow==0)
            {
                JOptionPane.showMessageDialog(new JFrame(), "Chọn hàng để tính", "Warning !",
                JOptionPane.ERROR_MESSAGE);
            }
            int flag=0;
            for(int i=0;i<selectedrow;i++)
            {
                String tc=String.valueOf(tb.getValueAt(i,1));
                String percentmid=String.valueOf(tb.getValueAt(i,2));
                String percentfin=String.valueOf(tb.getValueAt(i,3));
                String dgk=String.valueOf(tb.getValueAt(i,4));
                String dck=String.valueOf(tb.getValueAt(i,5));
                if(tc==null || percentmid==null || percentfin==null || dgk==null || dck==null)
                { 
                    flag=1;
                }
            }
            if(flag==1)
            {
                JOptionPane.showMessageDialog(new JFrame(), "Bạn cần nhập đầy đủ dữ liệu", "Warning !",
                JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        s=0;
        s1=0;
        sum=0.0;
        sum1=0.0;
        for(int i=0;i<selectedrow;i++)
        {
            tb.setValueAt("", i, 0);
            tb.setValueAt("", i, 1);
            tb.setValueAt("", i, 2);
            tb.setValueAt("", i, 3);
            tb.setValueAt("", i, 4);
            tb.setValueAt("", i, 5);
            tb.setValueAt("", i, 6);
            tb.setValueAt("", i, 7);
            tb.setValueAt("", i, 8);
            tb.setValueAt("", i, 9);
        }
    }//GEN-LAST:event_bt3ActionPerformed
    private Info []InsertionSortASC10(ArrayList <Info>listofprofile)
    {   
        int i,j;
        Info tempkey=new Info();
        Info infoarr[]=new Info[listofprofile.size()];
        listofprofile.toArray(infoarr);
        for(i=1;i<listofprofile.size();i++)
        {
            tempkey=infoarr[i];
            j=i-1;
            while (j >= 0 && infoarr[j].getMark() > tempkey.getMark())
            {
                infoarr[j+1] = infoarr[j];
                j = j-1;
            }
            infoarr[j+1] = tempkey;
        }
        return infoarr;
    }
    private Info []InsertionSortDESC10(ArrayList <Info>listofprofile)
    {   
        int i,j;
        Info tempkey=new Info();
        Info infoarr[]=new Info[listofprofile.size()];
        listofprofile.toArray(infoarr);
        for(i=1;i<listofprofile.size();i++)
        {
            tempkey=infoarr[i];
            j=i-1;
            while (j >= 0 && infoarr[j].getMark() < tempkey.getMark())
            {
                infoarr[j+1] = infoarr[j];
                j = j-1;
            }
            infoarr[j+1] = tempkey;
        }
        return infoarr;
    }
    private void cmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxActionPerformed
        selectedrow=tb.getSelectedRowCount();
            for(int i=0;i<selectedrow;i++)
            {
                String Subject=String.valueOf(tb.getValueAt(i, 0));
                int stc=Integer.parseInt(String.valueOf(tb.getValueAt(i,1)));
                double percentgk=Double.parseDouble(String.valueOf(tb.getValueAt(i,2)));
                double percentck=Double.parseDouble(String.valueOf(tb.getValueAt(i,3)));
                double dgk=Double.parseDouble(String.valueOf(tb.getValueAt(i,4)));
                double dck=Double.parseDouble(String.valueOf(tb.getValueAt(i,5)));
                double mark=Double.parseDouble(String.valueOf(tb.getValueAt(i,6)));
                double mark1=Double.parseDouble(String.valueOf(tb.getValueAt(i,7)));
                String Ranking=String.valueOf(tb.getValueAt(i, 8));
                String Rate=String.valueOf(tb.getValueAt(i, 9));
                profile=new Info(Subject,Rate,Ranking,percentgk,percentck,dgk,dck,mark,mark1,stc);
                listofprofile.add(profile);
            }
        Info []res=new Info[listofprofile.size()];
        if(cmbx.getSelectedIndex()==0)
        {
            res=InsertionSortASC10(listofprofile);
            for(int i=0;i<res.length;i++)
            {
                tb.setValueAt(res[i].getSubject(), i, 0);
                tb.setValueAt(res[i].getStc(), i, 1);
                tb.setValueAt(res[i].getPercentgk(), i, 2);
                tb.setValueAt(res[i].getPercentck(), i, 3);
                tb.setValueAt(res[i].getDgk(), i,4);
                tb.setValueAt(res[i].getDck(), i,5);
                tb.setValueAt(res[i].getMark(), i,6);
                tb.setValueAt(res[i].getMark1(), i,7);
                tb.setValueAt(res[i].getRanking(), i,8); 
                 tb.setValueAt(res[i].getRate(), i,9);
            }
        }
        if(cmbx.getSelectedIndex()==1)
        {
            res=InsertionSortDESC10(listofprofile);
            for(int i=0;i<res.length;i++)
            {
                tb.setValueAt(res[i].getSubject(), i, 0);
                tb.setValueAt(res[i].getStc(), i, 1);
                tb.setValueAt(res[i].getPercentgk(), i, 2);
                tb.setValueAt(res[i].getPercentck(), i, 3);
                tb.setValueAt(res[i].getDgk(), i,4);
                tb.setValueAt(res[i].getDck(), i,5);
                tb.setValueAt(res[i].getMark(), i,6);
                tb.setValueAt(res[i].getMark1(), i,7);
                tb.setValueAt(res[i].getRanking(), i,8); 
                tb.setValueAt(res[i].getRate(), i,9);
            }
        }
    }//GEN-LAST:event_cmbxActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
       tf1.setText("");
       tf2.setText("");
       tf3.setText("");
       s=0;
       s1=0;
       sum=0.0;
       sum1=0.0;
    }//GEN-LAST:event_bt2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JComboBox<String> cmbx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb0;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JTable tb;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}