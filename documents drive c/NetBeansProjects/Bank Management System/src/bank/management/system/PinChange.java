
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField pin,repin;
    JButton change,back;
    String Pin;

    PinChange(String Pin)
    { 
        this.Pin=Pin;
    
        
    
        setLayout(null);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
       Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(0,0,900,900);
       add(image);
       
      
        JLabel text=new JLabel("CHANGE YOUR PIN");
       text.setForeground(Color.WHITE);
       text.setFont(new Font("System",Font.BOLD,16));
      text.setBounds(250,280,500,35);
      image.add(text);
      
      
        JLabel pintext=new JLabel("NEW PIN");
       pintext.setForeground(Color.WHITE);
       pintext.setFont(new Font("System",Font.BOLD,16));
      pintext.setBounds(165,320,180,35);
      image.add(pintext);
      
       pin=new JPasswordField();
      pin.setFont(new Font("Raleway",Font.BOLD,25));
      pin.setBounds(330, 320, 180, 25);
      image.add(pin);
      
       JLabel reptext=new JLabel("RE ENTER PIN");
       reptext.setForeground(Color.WHITE);
       reptext.setFont(new Font("System",Font.BOLD,16));
      reptext.setBounds(165,360,180,35);
      image.add(reptext);
      
      repin=new JPasswordField();
      repin.setFont(new Font("Raleway",Font.BOLD,25));
      repin.setBounds(330, 360, 180, 25);
      image.add(repin);
      
       change=new JButton("CHANGE");
      change.setBounds(355,510,130,30);
      change.addActionListener(this);
      image.add(change);
      
      back=new JButton("BACK");
      back.setBounds(200,510,130,30);
      back.addActionListener(this);
      image.add(back);
      
       
       setSize(900,900);
       setLocation(300,0);
       setUndecorated(true);
       setVisible(true);
    }
       
       public void actionPerformed(ActionEvent ae)
       {
           if(ae.getSource()==change)
           {
                try
                {
                    String npin=pin.getText();
                    String rpin=repin.getText();
             
                    if(!npin.equals(rpin))
                    {
                     JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                     return;
             
                    }
                    
                    if(npin.equals("")){
                        JOptionPane.showMessageDialog(null,"Please enter new PIN");
                         return;
                    
                    }   
                    if(npin.equals("")){
                        JOptionPane.showMessageDialog(null,"Please re-enter new PIN");
                         return;
                    }
                    conn c=new conn();
                    String query1="update bank set pin='"+rpin+"' where pin='"+Pin+"'";
                    String query2="update login set pin='"+rpin+"' where pin='"+Pin+"'";
                     String query3="update Signup4 set pin='"+rpin+"' where pin='"+Pin+"'";
                     
                     c.s.executeUpdate(query1);
                     c.s.executeUpdate(query2);
                     c.s.executeUpdate(query3);
                     
                        JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                        
                        setVisible(false);
                        new Transaction(rpin).setVisible(true);
                    
                }catch(Exception e){
                 System.out.println(e);
          
                } 
            }else
                {
                        
                setVisible(false);
                new Transaction(Pin).setVisible(true);
                }
          }
    public static void main(String args[]) {
        // TODO code application logic here
        new PinChange("").setVisible(true);
    }
}
