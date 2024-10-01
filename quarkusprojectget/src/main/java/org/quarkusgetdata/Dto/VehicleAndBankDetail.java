package org.quarkusgetdata.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.quarkusgetdata.entity.VehicleOwner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleAndBankDetail {
    public VehicleOwner vehicleOwner;
    public BankDetailsDto bankDetails;
}
