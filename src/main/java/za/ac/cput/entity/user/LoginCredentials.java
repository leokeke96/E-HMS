package za.ac.cput.entity.user;

import lombok.*;
import org.hibernate.Hibernate;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LoginCredentials loginCredentials = (LoginCredentials) o;
        return false;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}



