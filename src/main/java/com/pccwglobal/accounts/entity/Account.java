package com.pccwglobal.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "USER_NAME", updatable = false)
    private String userName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DATE_CREATED", updatable = false)
    private LocalDateTime dateCreated;

    @Column(name = "DATE_MODIFIED")
    private LocalDateTime dateModified;

    @Column(name = "DATE_DELETED", updatable = false)
    private LocalDateTime dateDeleted;

}
