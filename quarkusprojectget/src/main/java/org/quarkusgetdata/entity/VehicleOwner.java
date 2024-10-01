package org.quarkusgetdata.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class VehicleOwner extends PanacheEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "mobile_number")
    private Long mobileNumber;

    @Column(name = "Vehicle_Number", unique = true)
    private Integer vehicleNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "owner")
    private VehicleOwner owner;

    @Column(name = "bank_account_number")
    private String bankAccountNumber;


    public static Long getbankAccountNumber() {
        return null;
    }
}
