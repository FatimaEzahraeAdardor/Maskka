package org.example.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_adhesion")
    private String membershipNumber;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "identification_document")
    private String identificationDocument;

    private String nationality;

    @Column(name = "membership_date")
    private LocalDate membershipDate;

    @Column(name = "date_licence_expiration")
    private LocalDate licenseExpirationDate;



}
