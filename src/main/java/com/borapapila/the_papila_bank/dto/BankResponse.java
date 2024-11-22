package com.borapapila.the_papila_bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankResponse {

    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}
