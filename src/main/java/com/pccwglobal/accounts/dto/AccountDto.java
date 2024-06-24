package com.pccwglobal.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "User Registration or Updating Details",
        description = "Object that contains the account details for registration"
)
public class AccountDto {

    @Schema(
            description = "Username for the account to be created",
            example = "vincemarquez11"
    )
    @NotEmpty(message = "Username is empty. Please input username.")
    @Size(max=100, message = "Characters should be 100 or less.")
    private String userName;

    @Schema(
            description = "First name of the user",
            example = "Vince"
    )
    @NotEmpty(message = "First name is empty. Please input first name.")
    @Size(max=100, message = "Characters should be 100 or less.")
    private String firstName;

    @Schema(
            description = "Last name of the user",
            example = "Marquez"
    )
    @NotEmpty(message = "Last name is empty. Please input last name.")
    @Size(max=100, message = "Characters should be 100 or less.")
    private String lastName;

    @Schema(
            description = "Email address of the user",
            example = "vince.marquez@gmail.com"
    )
    @NotEmpty(message = "Email is empty. Please input email.")
    @Size(max=100, message = "Characters should be 100 or less.")
    @Email(message="Email address is invalid")
    private String email;

}
