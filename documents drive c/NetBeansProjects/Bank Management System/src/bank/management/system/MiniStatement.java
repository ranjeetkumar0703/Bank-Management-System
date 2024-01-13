
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class MiniStatement extends JFrame {
    String Pin;
    
    MiniStatement(String Pin)
    {
        this.Pin=Pin;
        setTitle("Mini Statement");
        
        setLayout(null);
        JLabel mini=new JLabel();
        add(mini);
        
        
        JLabel bank=new JLabel("Indian Bank");
        bank.setBounds(150,20,100,20);
        add(bank);
        
         JLabel card=new JLabel();
        card.setBounds(20,80,100,20);
        add(card);
        JLabel balance=new JLabel();
        balance.setBounds(20,400,320,20);
        add(balance);
        
       
        try{
            conn c=new conn();
           ResultSet rs= c.s.executeQuery("select * from login where pin='"+Pin+"'");
           
           while(rs.next())
           {
               card.setText("Card Number: "+rs.getString("Card_Number").substring(0,4)+"xxxxxxxx"+rs.getString("Card_Number").substring(12));
           }
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
        try{
            conn c=new conn();
            int bal=0;
            ResultSet rs=c.s.executeQuery("select * from  bank where pin= '"+Pin+"'");
            while(rs.next())
            {
                mini.setText(mini.getText()+"<html>"+ rs.getString("date_time")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
            if(rs.getString("type").equals("Deposit"))
              {
                bal+=Integer.parseInt(rs.getString("amount"));
              }else
              {
                        bal-=Integer.parseInt(rs.getString("amount"));
              }
            
            }
            balance.setText("Your Current account balance is Rs "+bal);
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
        mini.setBounds(20,140,400,200);
        
        
       /* ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
       Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(0,0,900,900);
       add(image);*/
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
    }

    public static void main(String args[]) {
        // TODO code application logic here
        new MiniStatement("");
    }
}
