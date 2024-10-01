package org.project.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class VehicleOwner {

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

}
