package com.borapapila.the_papila_bank.service;

import com.borapapila.the_papila_bank.dto.BankResponse;
import com.borapapila.the_papila_bank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
