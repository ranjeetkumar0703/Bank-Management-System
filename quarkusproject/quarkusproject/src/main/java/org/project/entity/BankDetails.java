package org.project.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BankDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name = "Bank_Name")
    public String bankName;

    @Column(name = "IFSC_Code")
    public String ifscCode;

    @Column(name = "accountHolderName")
    public String accountHolderName;

    @Column(name = "balance")
    public double balance;

    @Column(name = "Bank_Email")
    public String bankEmail;

    @Column(name = "Bank_Account_Number", unique = true)
    public String bankAccountNumber;


}
