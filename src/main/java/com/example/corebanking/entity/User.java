package com.example.corebanking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User extends BaseEntiry {

    private String username;
    private String password;
    private String nationalCode;
    private String email;
    private String phoneNumber;
}
