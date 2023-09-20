package com.apientregas.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "available_period")
public class AvailablePeriod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "day")
    private String day;
    @Column(name = "start_time")
    private String starTime;
    @Column(name = "end_time")
    private String endTime;
    @Column(name = "available_holiday")
    private String isAvailableHoliday;

}
