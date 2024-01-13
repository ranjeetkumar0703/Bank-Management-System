package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class  SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fnameTextField,dobTextField,phonenoTextField,emailTextField,addressTextField,cityTextField,distTextField;
    JButton next;
    JRadioButton male,female,Transgender,other,married,unmarried;
     JDateChooser dateChooser;
     
     String formno;
    SignupOne(String fromno)
    {    
        this.formno=formno;
        setLayout(null);
        Random ran=new Random();
        random=Math.abs((ran.nextLong()%9000l)+1000L);
        
        
        
      
        JLabel formno =new JLabel("APPLICATION FROM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personaldetails=new JLabel("Page 1 : Personla details ");
        personaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        personaldetails.setBounds(290, 80, 400, 30);
        add(personaldetails);
        
        JLabel Name=new JLabel("Name ");
        Name.setFont(new Font("Raleway",Font.BOLD,20));
        Name.setBounds(100, 140, 100, 30);
        add(Name);
        
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,13));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
       
        
        JLabel fname=new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,13));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
       
        
        JLabel dob=new JLabel("Date of Birth : ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300, 240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender=new JLabel("Gender : ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        male= new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male);
        
        female= new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);
        
        Transgender= new JRadioButton("TransGender");
        Transgender.setBounds(590,290,120,30);
        Transgender.setBackground(Color.white);
        add(Transgender);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(Transgender);
        
         JLabel phoneno=new JLabel("Mobaile No. : ");
        phoneno.setFont(new Font("Raleway",Font.BOLD,20));
      phoneno.setBounds(100, 340, 200, 30);
        add(phoneno);
        
        phonenoTextField=new JTextField();
         phonenoTextField.setFont(new Font("Raleway",Font.BOLD,14));
         phonenoTextField.setBounds(300, 340, 400, 30);
        add( phonenoTextField);
        
        
        
        JLabel email=new JLabel("Email Address : ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100, 390, 200, 30);
        add(email);
        
        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300, 390, 400, 30);
        add(emailTextField);
        
        
        
        JLabel marital =new JLabel("Martial Status : ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100, 440, 200, 30);
        add(marital);
        
        unmarried= new JRadioButton("Unmarried");
        unmarried.setBounds(300,440,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        married= new JRadioButton("Married");
        married.setBounds(450,440,100,30);
        married.setBackground(Color.white);
        add(married);
        
        other= new JRadioButton("Other");
        other.setBounds(630,440,120,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
        
        
        JLabel address =new JLabel("Address : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 490, 200, 30);
        add(address);
        
        addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300, 490, 400, 30);
        add(addressTextField);
        
        JLabel city=new JLabel("City : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 540, 200, 30);
        add(city);
        
        
        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300, 540, 400, 30);
        add(cityTextField);
        
        
        JLabel dist=new JLabel("District : ");
        dist.setFont(new Font("Raleway",Font.BOLD,20));
        dist.setBounds(100, 590, 200, 30);
        add(dist);
        
        distTextField=new JTextField();
        distTextField.setFont(new Font("Raleway",Font.BOLD,14));
        distTextField.setBounds(300, 590, 400, 30);
        add(distTextField);
        
      
        
        next=new JButton(" Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
          
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(1000,1000);
        setLocation(350,10);
        setVisible(true);
    }

   public void actionPerformed(ActionEvent ae)
   {
       String formno=""+ random;
       String name=nameTextField.getText();
       String fname=fnameTextField.getText();
       String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
  
       String gender=null;
       if(male.isSelected())
       {
           gender="Male";
       }
       else if(female.isSelected())
       {
           gender="Female";
       }else if(Transgender.isSelected())
       {
           gender="Transgender";
       }
       
        String phoneno=phonenoTextField.getText();
       String email=emailTextField.getText();
       String marital=null;
       if(married.isSelected())
       {
           marital="Married";
           
       }else if(unmarried.isSelected())
       {
           marital="Unmarried";
           
       }else if(other.isSelected())
       {
           marital="Other";
       }
       String address=addressTextField.getText();
       String city=cityTextField.getText();
       String dist=distTextField.getText();
      
       
       try{
           if(name.equals(""))
           {
               JOptionPane.showMessageDialog(null, "Fill the Name is Required ");
           }
           
          else if(fname.equals(""))
           {
               JOptionPane.showMessageDialog(null, "Father Name is Required ");
           }
           else if(dob.equals(""))
           {
               JOptionPane.showMessageDialog(null, "Choose the DOB is Required ");
           }
              else if(phoneno.equals(""))
           {
               JOptionPane.showMessageDialog(null, "Mobaile number  is Required ");
           }
        
             else if(email.equals(""))
           {
               JOptionPane.showMessageDialog(null, "Email  is Required ");
           }
          
           
             else if(address.equals(""))
           {
               JOptionPane.showMessageDialog(null, "address is Required ");
           }
           
             else if(city.equals(""))
           {
               JOptionPane.showMessageDialog(null, "city  is Required ");
           }
           
              else if(dist.equals(""))
           {
               JOptionPane.showMessageDialog(null, "District  is Required ");
           }
           
             else {
                 conn c=new conn();
                 String query="insert into SignupOne Values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+ gender +"','"+phoneno+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+dist+"')";
                 c.s.executeUpdate(query);
                 
                 setVisible(false);
                 new SignUpThree(formno).setVisible(true);
             }
            
           
           
       }catch (Exception e)
       {
           System.out.println(e);
       }
       
   }
    public static void main(String args[]) {
        // TODO code application logic here
        new SignupOne("");
    }
}
