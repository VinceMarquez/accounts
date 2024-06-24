package com.pccwglobal.accounts.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Schema(
        name = "Account Details",
        description = "Object that contains the details of an existing account"
)
public class Account {

    @Schema(
            description = "User ID of the account",
            example = "1"
    )
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;

    @Schema(
            description = "Username of the account",
            example = "vincemarquez11"
    )
    @Column(name = "USER_NAME", updatable = false)
    private String userName;

    @Schema(
            description = "First name of the user",
            example = "Vince"
    )
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Schema(
            description = "Last name of the user",
            example = "Marquez"
    )
    @Column(name = "LAST_NAME")
    private String lastName;

    @Schema(
            description = "Email address of the account",
            example = "vince.marquez@gmail.com"
    )
    @Column(name = "EMAIL")
    private String email;

    @Schema(
            description = "Date when the account was created"
    )
    @Column(name = "DATE_CREATED", updatable = false)
    private LocalDateTime dateCreated;

    @Schema(
            description = "Date when the account was updated or modified"
    )
    @Column(name = "DATE_MODIFIED")
    private LocalDateTime dateModified;

    @Schema(
            description = "Date when the account was deleted"
    )
    @Column(name = "DATE_DELETED")
    private LocalDateTime dateDeleted;

    @Schema(
            description = "Indicator or flag if the account is already deleted"
    )
    @Column(name = "IS_DELETED")
    private Boolean isDeleted;

}
