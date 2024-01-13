package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class  SignUpThree extends JFrame implements ActionListener{
   
    long random;
    JTextField stateTextField,pincodeTextField;
    JButton next,back;
    JRadioButton india,Other;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
     
     
    SignUpThree(String formno)
    {   
        this.formno=formno;
        setLayout(null);
         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
     
       
        
        JLabel additionalldetails=new JLabel("Page 2 : Additional details ");
        additionalldetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalldetails.setBounds(290, 80, 400, 30);
        add(additionalldetails);
        
        
         JLabel state=new JLabel("State : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 140, 200, 30);
        add(state);
        
        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300, 140, 400, 30);
        add(stateTextField);
        
        
        
        JLabel pincode=new JLabel("Pincode : ");
       pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100, 190, 200, 30);
        add(pincode);
        
       pincodeTextField=new JTextField();
       pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
       pincodeTextField.setBounds(300, 190, 400, 30);
        add(pincodeTextField);
        
        
        JLabel country=new JLabel("Country : ");
        country.setFont(new Font("Raleway",Font.BOLD,20));
        country.setBounds(100, 240, 200, 30);
        add(country);
      
        
        india= new JRadioButton("India");
        india.setBounds(310,240,200,30);
        india.setBackground(Color.white);
        add(india);
        
        
        Other= new JRadioButton("Other");
        Other.setBounds(510,240,200,30);
        Other.setBackground(Color.white);
        add(Other);
        
        ButtonGroup countrygroup=new ButtonGroup();
        countrygroup.add(india);
        countrygroup.add(Other);
        
       /* JLabel l1=new JLabel(" Account details ");
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setBounds(400, 290, 400, 30);
        add(l1);
        
        JLabel type=new JLabel(" Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(110, 330, 200, 30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,15));
        r1.setBackground(Color.WHITE);
        r1.setBounds(110,380,150,18);
        add(r1);
        
        r2=new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway",Font.BOLD,15));
        r2.setBackground(Color.WHITE);
        r2.setBounds(280,380,150,18);
        add(r2);
        
        r3=new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("Raleway",Font.BOLD,15));
        r3.setBackground(Color.WHITE);
        r3.setBounds(460,380,200,18);
        add(r3);
        
         r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,15));
        r4.setBackground(Color.WHITE);
        r4.setBounds(660,380,250,18);
        add(r4);
        
        
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
         JLabel card=new JLabel(" Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(110, 430, 200, 30);
        add(card);
        
        JLabel number=new JLabel("xxxx-xxxx-xxxx-5678");
        number.setFont(new Font("Raleway",Font.BOLD,19));
        number.setBounds(300, 430, 200, 30);
        add(number);
        
        JLabel carddetails=new JLabel("Your 16 Digit Card Number");
        carddetails.setFont(new Font("Raleway",Font.BOLD,12));
        carddetails.setBounds(120, 460, 200, 20);
        add(carddetails);
        
        
        JLabel pin=new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(120, 500, 200, 30);
        add(pin);
        
        JLabel pnumber=new JLabel("xxxx");
        pnumber.setFont(new Font("Raleway",Font.BOLD,20));
        pnumber.setBounds(310, 500, 400, 30);
        add(pnumber);
        
        JLabel pindetails=new JLabel("Your 4 Digit Password");
        pindetails.setFont(new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(120, 530, 200, 20);
        add(pindetails);
        
        JLabel services=new JLabel("Services Required");
       services.setFont(new Font("Raleway",Font.BOLD,20));
       services.setBounds(120, 570, 200, 30);
       add(services);
       
       c1=new JCheckBox("ATM CARD");
       c1.setBackground(Color.WHITE);
       c1.setFont(new Font("Raileway",Font.BOLD,15));
       c1.setBounds(120,600,200,30);
       add(c1);
       
        c2=new JCheckBox("Internet Banking");
       c2.setBackground(Color.WHITE);
       c2.setFont(new Font("Raileway",Font.BOLD,15));
       c2.setBounds(320,600,200,30);
       add(c2);
       
        c3=new JCheckBox("Mobaile Banking");
       c3.setBackground(Color.WHITE);
       c3.setFont(new Font("Raileway",Font.BOLD,15));
       c3.setBounds(520,600,200,30);
       add(c3);
       
        c4=new JCheckBox("Email & SMS Alerts");
       c4.setBackground(Color.WHITE);
       c4.setFont(new Font("Raileway",Font.BOLD,15));
       c4.setBounds(720,600,200,30);
       add(c4);
       
        c5=new JCheckBox("Cheque Book");
       c5.setBackground(Color.WHITE);
       c5.setFont(new Font("Raileway",Font.BOLD,15));
       c5.setBounds(120,630,200,30);
       add(c5);
       
        c6=new JCheckBox("E Stamtement");
       c6.setBackground(Color.WHITE);
       c6.setFont(new Font("Raileway",Font.BOLD,15));
       c6.setBounds(320,630,200,30);
       add(c6);
       
        c7=new JCheckBox("I hereby declared taht the above entered details are correct to the best of my Knowledge ");
       c7.setBackground(Color.WHITE);
       c7.setFont(new Font("Raileway",Font.BOLD,10));
       c7.setBounds(120,660,500,30);
       add(c7);*/
       
           
       
        next=new JButton(" Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(590, 500, 150, 30);
        next.addActionListener(this);    
        add(next);
        
        
        back=new JButton(" Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
         back.setFont(new Font("Raleway",Font.BOLD,14));
        back.setBounds(300, 500, 150, 30);
       back.addActionListener(this);
          
        add(back);
        
          
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(1000,1000);
        setLocation(350,10);
        setVisible(true);
    }

   public void actionPerformed(ActionEvent ae)
   {
      
       String state=stateTextField.getText();
       String pincode=pincodeTextField.getText();
       String country=null;
       if(india.isSelected())
       {
           country="India";
       }else if(Other.isSelected())
       {
           country="Other";
       }
    /*   else if(ae.getSource()==Next)
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
          
           String pinNumber="" + Math.abs((random.nextLong()%9000L))+1000L;
           
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
           }*/
     
            try{
           if(country.equals(""))
           {
               JOptionPane.showMessageDialog(null,"fill the empty place is Required");
           }else{
          
          conn conn=new conn();
          String query1="insert into SignUpThree Values ('"+formno+"','"+state+"','"+pincode+"','"+country+"')";
         
          
          conn.s.executeUpdate(query1);
           
               
          setVisible(false);
          new SignUpTwo(formno).setVisible(true);
          
           }
           
           
       }catch (Exception e)
       {
           System.out.println(e);
       }
                   
                   
                   
                   
       }
       
      
       
   
       public static void main(String args[]) {
        // TODO code application logic here
        new SignUpThree("");
    }
}
