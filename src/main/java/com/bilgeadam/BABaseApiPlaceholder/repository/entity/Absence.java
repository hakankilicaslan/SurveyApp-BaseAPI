package com.bilgeadam.BABaseApiPlaceholder.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
public class Absence extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    UUID studentId;
    String course;
    String courseGroup;
    int absenceDateTheo;
    int hourOfAbsenceTheo;
    int totalCourseHoursTheo;
    int hourOfAbsenceLimitTheo;
    int absenceDatePrac;
    int hourOfAbsencePrac;
    int totalCourseHoursPrac;
    int hourOfAbsenceLimitPrac;

}
