package org.quarkusgetdata.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BankDetailsDto {
    @JsonProperty("bankAccountNumber")
    public Long bankAccountNumber;

    @JsonProperty("bankName")
    public String bankName;

    @JsonProperty("branchName")
    public String branchName;

    @JsonProperty("ifscCode")
    public String ifscCode;

    @JsonProperty("accountHolderName")
    public String accountHolderName;

    @JsonProperty("balance")
    public double balance;
}
