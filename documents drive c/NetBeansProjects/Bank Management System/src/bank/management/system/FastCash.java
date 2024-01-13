
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    
    JButton onehundred,twohundred,fivehundred,onethousand,twothousand,fivethousand,tenthousand,exit; 
    String Pin;
    FastCash(String Pin)
    {
        this.Pin=Pin;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        onehundred=new JButton(" Rs 100");
        onehundred.setBounds(170,415,150,30);
        onehundred.addActionListener(this);
        image.add(onehundred);
        
         twohundred=new JButton("Rs 200");
        twohundred.setBounds(355,415,150,30);
         twohundred.addActionListener(this);
        image.add(twohundred);
        
         fivehundred=new JButton("Rs 500");
         fivehundred.setBounds(170,450,150,30);
          fivehundred.addActionListener(this);
        image.add( fivehundred);
        
         onethousand=new JButton("Rs 1000");
        onethousand.setBounds(355,450,150,30);
         onethousand.addActionListener(this);
        image.add(onethousand);
        
         twothousand=new JButton("Rs 2000");
        twothousand.setBounds(170,485,150,30);
         twothousand.addActionListener(this);
        image.add(twothousand);
        
        fivethousand=new JButton("Rs 5000");
        fivethousand.setBounds(355,485,150,30);
        fivethousand.addActionListener(this);
        image.add(fivethousand);
        
        tenthousand=new JButton("Rs 10000");
        tenthousand.setBounds(170,520,150,30);
        tenthousand.addActionListener(this);
        image.add(tenthousand);
        
         exit=new JButton("BACK");
         exit.setBounds(355,520,150,30);
         exit.addActionListener(this);
        image.add(exit);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit){
           setVisible(false);
           new Transaction(Pin).setVisible(true);
        }
        else 
        {
            String amount=((JButton)ae.getSource()).getText().substring(3);
            conn c=new conn();
            try{
                ResultSet rs=c.s.executeQuery("select * from bank where Pin= '"+Pin+"' ");
                int balance=0;
                while(rs.next())
                {
                    if(rs.getString("type").equals("Deposit"))
                    {
                        balance+=Integer.parseInt(rs.getString("amount"));
                    }else
                    {
                        balance-=Integer.parseInt(rs.getString("amount"));
                    }
                }
                 if(ae.getSource()!=exit && balance < Integer.parseInt(amount))
                 {
                 JOptionPane.showMessageDialog(null, "Insufficient Balance");
                 return;
                 }
                 Date date_time=new Date();
                 String query="insert into bank values('"+Pin+"','"+date_time+"','withdrawl','"+amount+"')";
                 c.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null, "Rs " +amount+ " Debited Successfully");
                 setVisible(false);
                 new Transaction(Pin).setVisible(true);
            } catch(Exception e){
                        System.out.println(e);
                        }
        }
    }

  
    public static void main(String args[]) {
        // TODO code application logic here
        new FastCash("");
    }
}
