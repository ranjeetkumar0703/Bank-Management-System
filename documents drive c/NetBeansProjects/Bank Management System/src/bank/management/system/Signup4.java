
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


 
public class Signup4 extends JFrame implements ActionListener{
    
    JButton Submit,Cancel;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    
    Signup4(String formno)
    {   
        this.formno=formno;
        setLayout(null);
         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 4");
      
        JLabel l1=new JLabel(" Page 4: Account details ");
        l1.setFont(new Font("Raleway",Font.BOLD,35));
        l1.setBounds(290, 60, 400, 30);
        add(l1);
        
        JLabel type=new JLabel(" Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,25));
        type.setBounds(100, 140, 400, 30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,17));
        r1.setBackground(Color.WHITE);
        r1.setBounds(120,200,200,30);
        add(r1);
        
        r2=new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway",Font.BOLD,17));
        r2.setBackground(Color.WHITE);
        r2.setBounds(370,200,200,30);
        add(r2);
        
        r3=new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("Raleway",Font.BOLD,17));
        r3.setBackground(Color.WHITE);
        r3.setBounds(120,250,200,30);
        add(r3);
        
         r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,17));
        r4.setBackground(Color.WHITE);
        r4.setBounds(370,250,400,30);
        add(r4);
        
        
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
         JLabel card=new JLabel(" Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,25));
        card.setBounds(100, 320, 400, 30);
        add(card);
        
        JLabel cardnumber=new JLabel("xxxx-xxxx-xxxx-5678");
        cardnumber.setFont(new Font("Raleway",Font.BOLD,20));
        cardnumber.setBounds(330, 320, 400, 30);
        add(cardnumber);
        
        JLabel carddetails=new JLabel("Your 16 Digit Card Number");
        carddetails.setFont(new Font("Raleway",Font.BOLD,12));
        carddetails.setBounds(115, 340, 400, 30);
        add(carddetails);
        
        
        JLabel pin=new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(110, 390, 400, 30);
        add(pin);
        
        JLabel pnumber=new JLabel("xxxx");
        pnumber.setFont(new Font("Raleway",Font.BOLD,20));
        pnumber.setBounds(330, 390, 400, 30);
        add(pnumber);
        
        JLabel pindetails=new JLabel("Your 4 Digit Password");
        pindetails.setFont(new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(110, 410, 400, 30);
        add(pindetails);
        
        JLabel services=new JLabel("Services Required");
       services.setFont(new Font("Raleway",Font.BOLD,25));
       services.setBounds(100, 460, 400, 30);
       add(services);
       
       c1=new JCheckBox("ATM CARD");
       c1.setBackground(Color.WHITE);
       c1.setFont(new Font("Raileway",Font.BOLD,18));
       c1.setBounds(120,510,200,30);
       add(c1);
       
        c2=new JCheckBox("Internet Banking");
       c2.setBackground(Color.WHITE);
       c2.setFont(new Font("Raileway",Font.BOLD,18));
       c2.setBounds(340,510,400,30);
       add(c2);
       
        c3=new JCheckBox("Mobaile Banking");
       c3.setBackground(Color.WHITE);
       c3.setFont(new Font("Raileway",Font.BOLD,18));
       c3.setBounds(120,550,200,30);
       add(c3);
       
        c4=new JCheckBox("Email & SMS Alerts");
       c4.setBackground(Color.WHITE);
       c4.setFont(new Font("Raileway",Font.BOLD,18));
       c4.setBounds(340,550,400,30);
       add(c4);
       
        c5=new JCheckBox("Cheque Book");
       c5.setBackground(Color.WHITE);
       c5.setFont(new Font("Raileway",Font.BOLD,18));
       c5.setBounds(120,590,200,30);
       add(c5);
       
        c6=new JCheckBox("E Stamtement");
       c6.setBackground(Color.WHITE);
       c6.setFont(new Font("Raileway",Font.BOLD,18));
       c6.setBounds(340,590,400,30);
       add(c6);
       
        c7=new JCheckBox("I hereby declared taht the above entered details are correct to the best of my Knowledge ");
       c7.setBackground(Color.WHITE);
       c7.setFont(new Font("Raileway",Font.BOLD,14));
       c7.setBounds(110,645,700,30);
       add(c7);
       
           
       
        Submit=new JButton(" Submit");
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.setFont(new Font("Raleway",Font.BOLD,14));
        Submit.setBounds(300, 700, 150, 30);
        Submit.addActionListener(this);    
        add(Submit);
        
        
       Cancel=new JButton(" Cancel");
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.setFont(new Font("Raleway",Font.BOLD,14));
        Cancel.setBounds(590, 700, 150, 30);
        Cancel.addActionListener(this);
          
        add(Cancel);
        
          
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(1000,1000);
        setLocation(350,10);
        setVisible(true);
    }

   public void actionPerformed(ActionEvent ae)
   {
     
    
        if(ae.getSource()==Submit)
       {
           String accountType=null;
           if(r1.isSelected())
           {
               accountType="Saving Account";
           }else if(r2.isSelected())
           {
               accountType="Fixed Deposit Account";
           }else if(r3.isSelected())
           {
               accountType="Current Account";
           }else if(r4.isSelected())
           {
               accountType="Recurring  Deposit Account";
           }
           
          Random random=new Random();
          String cardnumber="" + Math.abs((random.nextLong()%90000000L)+504093600000000L);
          
           String pinNumber="" + Math.abs((random.nextLong()%9000L)+1000L);
           
           String facility="";
           if(c1.isSelected())
           {
               facility=facility+"ATM CARD";
           }else if(c2.isSelected())
           {
              facility=facility+"Internet Banking"; 
           }else if(c3.isSelected())
           {
               facility=facility+"Mobaile Banking";
           }else if(c4.isSelected())
           {
               facility=facility+"Email & SMS Alerts";
           }else if(c5.isSelected())
           {
               facility=facility+"Cheque kBook";
           }else if(c6.isSelected())
           {
               facility=facility+"E Statement";
           }
           else if(c7.isSelected())
           {
               facility=facility+"I hereby declared taht the above entered details are correct to the best of my Knowledge ";
           }
     
            try{
           if(accountType.equals(""))
           {
               JOptionPane.showMessageDialog(null, "Account Type is Required");
           }else{
          
          conn conn=new conn();
          String query1="insert into Signup4 Values ('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinNumber+"','"+facility+"')";
         String query2="insert into login Values ('"+formno+"','"+cardnumber+"','"+pinNumber+"')";
          
          conn.s.executeUpdate(query1);
           conn.s.executeUpdate(query2);
               
         setVisible(false);
         new Signup4(formno).setVisible(true);
          
          JOptionPane.showMessageDialog(null, "Card Number:"+cardnumber+"\n Pin Number:"+pinNumber);
          
          setVisible(false);
           new Deposit(pinNumber).setVisible(false);
            
           }
           
           
       }catch (Exception e)
       {
           System.out.println(e);
       }
                   
                   
                   
                   
       }else if(ae.getSource()==Cancel)
       {
          setVisible(false);
          new Login(formno).setVisible(true);
       }
       
      
       
   }

  
    public static void main(String args[]) {
        // TODO code application logic here
          new Signup4("");
    }
}
