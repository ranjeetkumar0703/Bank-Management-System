
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login, signup,clear;
     JTextField cardTextField;
     JPasswordField pinTextField;
     
     String formno;
    
    Login(String formno)
    {
        this.formno=formno;
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
         
        add(label);
        
        
        JLabel text=new JLabel("Welcome to ATM");
        text.setBounds(200, 40, 400, 40);
        text.setFont(new Font("Osward",Font.BOLD,38));
        add(text);
        
        JLabel cardno=new JLabel("Card No:");
        cardno.setBounds(120, 150, 150, 30);
        cardno.setFont(new Font("Raleway",Font.BOLD,30));
        add(cardno);
        
        cardTextField=new JTextField();
        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        JLabel pin=new JLabel("PIN :");
        pin.setBounds(130, 220, 250, 30);
        pin.setFont(new Font("Raleway",Font.BOLD,30));
        add(pin);
                
        pinTextField=new  JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
         login=new JButton("SIGN IN");
        login.setBounds(300, 300, 120, 30);
        login.setBackground(Color.BLACK);
         login.setForeground(Color.WHITE);
         login.addActionListener(this);
         add(login);
        
         clear=new JButton("CLEAR");
         clear.setBounds(430, 300, 120, 30);
         clear.setBackground(Color.BLACK);
         clear.setForeground(Color.WHITE);
         clear.addActionListener(this);
         add(clear);
         
         signup=new JButton("SIGN UP");
         signup.setBounds(300, 350, 250, 30);
         signup.setBackground(Color.BLACK);
         signup.setForeground(Color.WHITE);
         signup.addActionListener(this);
         add(signup);
         
        getContentPane().setBackground(Color.white);
        
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String formno="";
        if(ae.getSource()==clear)
        {
            cardTextField.setText("");
            pinTextField.setText("");
            
        }
        else if(ae.getSource()==login)
        {
            conn conn=new conn();
            String Card_Number=cardTextField.getText();
            String  Pin=pinTextField.getText();
            String query="Select * from login where Card_Number ='"+formno+"' '"+Card_Number+"' and Pin = '"+Pin+"'";
            try{
              ResultSet rs = conn.s.executeQuery(query);
              if(rs.next())
              {
                setVisible(false);
                new Transaction(Pin).setVisible(true);
              }else
              {
                 JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
              }
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource()==signup)
        {
          setVisible(false);
           new SignupOne(formno).setVisible(true);
        }
    }
            
    public static void main(String args[])
    {
        new Login("");
    }
    
}
