package com.borapapila.the_papila_bank.service;

import com.borapapila.the_papila_bank.dto.BankResponse;
import com.borapapila.the_papila_bank.dto.CreditDebitRequest;
import com.borapapila.the_papila_bank.dto.EnquiryRequest;
import com.borapapila.the_papila_bank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest request);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
