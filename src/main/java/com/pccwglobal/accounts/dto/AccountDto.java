package com.pccwglobal.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AccountDto {

    @NotEmpty(message = "Username is empty. Please input username.")
    @Size(max=100, message = "Characters should be 100 or less.")
    private String userName;

    @NotEmpty(message = "First name is empty. Please input first name.")
    @Size(max=100, message = "Characters should be 100 or less.")
    private String firstName;

    @NotEmpty(message = "Last name is empty. Please input last name.")
    @Size(max=100, message = "Characters should be 100 or less.")
    private String lastName;

    @NotEmpty(message = "Email is empty. Please input email.")
    @Size(max=100, message = "Characters should be 100 or less.")
    @Email(message="Email address is invalid")
    private String email;

}
