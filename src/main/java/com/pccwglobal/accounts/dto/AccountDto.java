package com.pccwglobal.accounts.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AccountDto {

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

}
