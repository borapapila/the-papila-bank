package com.borapapila.the_papila_bank.service;

import com.borapapila.the_papila_bank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
