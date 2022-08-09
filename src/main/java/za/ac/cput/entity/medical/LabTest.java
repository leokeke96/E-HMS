package za.ac.cput.entity.medical;
/*
LabTest.java
Author:Kevin Lionel Mombo Ndinga(218180500)
Date: 09 August 2022;
*/

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "lab_test")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class LabTest {
    @Id
    @Column(name = "test_id")
    private long testId;
    private String testName;
    private LocalDate testSampleDate;
    private BigDecimal testFee;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LabTest labTest = (LabTest) o;
        return false;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

