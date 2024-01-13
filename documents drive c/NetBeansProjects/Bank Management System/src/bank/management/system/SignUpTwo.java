package bank.management.system;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;



public class  SignUpTwo extends JFrame implements ActionListener{
   
    JTextField pannoTextField,adharnoTextField;
 
    JButton next;
    
    JRadioButton Syes,Sno,eyes,eno;
   
     JComboBox religion,category,occupation,education,income;
     
     String formno;
     
    SignUpTwo(String fromno)
    {   
        this.formno=formno;
        setLayout(null);
       
         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
     
       
        
        JLabel additionalldetails=new JLabel("Page 3 : Additional details ");
        additionalldetails.setFont(new Font("Raleway",Font.BOLD,22));
      additionalldetails.setBounds(290, 80, 400, 30);
        add(additionalldetails);
        
          
       
        
        
        JLabel name=new JLabel("Religion:");
       name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add( name);
        
         String Religion[]={"Hindu","Muslim","Sikh","Christisn","Other"};
        religion=new JComboBox(Religion);
        religion.setBackground(Color.WHITE);
         religion.setBounds(300, 140, 400, 30);
        add(religion);
       
        
       
       
        
        JLabel scategory=new JLabel("Category: ");
        scategory.setFont(new Font("Raleway",Font.BOLD,20));
        scategory.setBounds(100, 190, 200, 30);
        add(scategory);
        
         String Category[]={"General","OBC","SC","ST","Other"};
        category=new JComboBox(Category);
        category.setBackground(Color.WHITE);
        category.setBounds(300, 190, 400, 30);
        add(category);
        
            
        JLabel sincome=new JLabel("Income : ");
        sincome.setFont(new Font("Raleway",Font.BOLD,20));
        sincome.setBounds(100, 240, 200, 30);
        add( sincome);
        
        String incomecategory[]={"null","<50,000","<1,00,000","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
         income=new JComboBox(incomecategory);
        income.setBackground(Color.WHITE);
        income.setBounds(300, 240, 400, 30);
        add(income);
        
           
        
        JLabel seducation=new JLabel("Educational : ");
        seducation.setFont(new Font("Raleway",Font.BOLD,20));
       seducation.setBounds(100, 290, 200, 30);
        add(seducation);
       
        
        
        JLabel Qualfication=new JLabel("Qualfication : ");
        Qualfication.setFont(new Font("Raleway",Font.BOLD,20));
        Qualfication.setBounds(100, 315, 200, 30);
        add(Qualfication);
        
        String qualifications[]={"10th","12th","BE/B.Tech","MBA","BBA","BA","B.Sc","B.com","BCA","MBBS","Phd","Pharmacy","B.Pharmacy","B.sc Nursing","D Pharma","Diploma","ITI","non Graduate","not Educated","Post Graduate","Doctrate","Other"};
        education=new JComboBox(qualifications);
        education.setBackground(Color.WHITE);
        education.setBounds(300, 315, 400, 30);
        add(education);
        
       
        JLabel soccupation=new JLabel("Occupation : ");
       soccupation.setFont(new Font("Raleway",Font.BOLD,20));
       soccupation.setBounds(100, 390, 200, 30);
        add(soccupation);
        
         String Occupation[]={"Farmer","Labor","Private Employee","Government Employee","Student","Railway","Bank Manager","Engineer","Doctor","Teacher","Salaried","Self-Employed","Bussiness","Not Salaried","Other"};
        occupation=new JComboBox(Occupation);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300, 390, 400, 30);
        add(occupation);
       
        
        
        JLabel panno =new JLabel("Pan Number : ");
        panno.setFont(new Font("Raleway",Font.BOLD,20));
        panno.setBounds(100, 440, 200, 30);
        add(panno);
        
        pannoTextField=new JTextField();
        pannoTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pannoTextField.setBounds(300, 440, 400, 30);
        add(pannoTextField);
        
        JLabel adharno=new JLabel("Adhar Number: ");
        adharno.setFont(new Font("Raleway",Font.BOLD,20));
        adharno.setBounds(100, 490, 200, 30);
        add( adharno);
        
        
         adharnoTextField=new JTextField();
         adharnoTextField.setFont(new Font("Raleway",Font.BOLD,14));
         adharnoTextField.setBounds(300, 490, 400, 30);
        add( adharnoTextField);
        
           JLabel seniorcitizen=new JLabel("Senior Citezen: ");
       seniorcitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorcitizen.setBounds(100, 540, 200, 30);
        add(seniorcitizen);
        
        
        Syes= new JRadioButton("YES");
        Syes.setBounds(300,540,200,30);
         Syes.setBackground(Color.white);
        add( Syes);
        
        
        Sno= new JRadioButton("No");
        Sno.setBounds(500,540,200,30);
       Sno.setBackground(Color.white);
        add(Sno);
        
        ButtonGroup  seniorcitizengroup=new ButtonGroup();
        seniorcitizengroup.add(Syes);
        seniorcitizengroup.add(Sno);
        
        
      
        
        
        JLabel exist=new JLabel("Existing Account : ");
       exist.setFont(new Font("Raleway",Font.BOLD,20));
      exist.setBounds(100, 590, 200, 30);
        add(exist);
        
        
         eyes= new JRadioButton("YES");
        eyes.setBounds(300,590,200,30);
         eyes.setBackground(Color.white);
        add( eyes);
        
        
        eno= new JRadioButton("No");
        eno.setBounds(500,590,200,30);
       eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup  existgroup=new ButtonGroup();
        existgroup.add(eyes);
        existgroup.add(eno);
        
       
       
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
      
       String sreligion=(String)religion.getSelectedItem();
       String  scategory= (String)category.getSelectedItem();
         String  sincome= (String)category.getSelectedItem();
        String Education=(String)education.getSelectedItem();
       String Occupation=(String)occupation.getSelectedItem();
        String panno=pannoTextField.getText();
         String adharno=adharnoTextField.getText();
          
          
           String seniorcitizen=null;
       if(Syes.isSelected())
       {
           seniorcitizen="YES";
       }else if(Sno.isSelected())
       {
          seniorcitizen="No";
       }
          
      
      String exist=null;
       if(eyes.isSelected())
       {
          exist="YES";
       }else if(eno.isSelected())
       {
           exist="No";
       }
       
       try{
          conn c=new conn();
          String query="insert into SignUpTwo Values ('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+ Education +"','"+Occupation+"','"+panno+"','"+adharno+"','"+seniorcitizen+"','"+exist+"')";
          c.s.executeUpdate(query);
          
                setVisible(false);
                 new Signup4(formno).setVisible(true);
           
          
           
       }catch (Exception e)
       {
           System.out.println(e);
       }
       
   }
    public static void main(String args[]) {
        // TODO code application logic here
        new SignUpTwo("");
    }
}
