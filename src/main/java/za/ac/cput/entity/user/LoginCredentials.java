package za.ac.cput.entity.user;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
LoginCredentials.java
Author:Kevin Lionel Mombo Ndinga(218180500)
Date: 09 August 2022;
*/
@Entity
@Table(name="login_credentials")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class LoginCredentials {
    @Id
    @Column(name ="ID")
    private long id;
    private String email;
    private String password;





