package com.example.JsonData;

import javax.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@Setter
@ToString(of= {"reportdate","hospital","dphcategory","covidstatuts","patientcount","data_loaded_at"})
@Entity
@Table(name = "hospitalization")
public class Hospitalization {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "reportdate")
    private String reportdate;

    @Column(name = "hospital")
    private String hospital;

    @Column(name = "dphcategory")
    private String dphcategory;

    @Column(name = "covidstatus")
    private String covidstatus;

    @Column(name = "patientcount")
    private String patientcount;

    @Column(name = "data_loaded_at")
    private String data_loaded_at;



}