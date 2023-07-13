package com.example.Task.task;

import com.example.Task.user.User;
//import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
@Table(name="TASKS")
public class Task {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "id")
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "date", nullable = false)
    private LocalDate date;


    @ManyToOne(fetch = FetchType.LAZY)
//    @JsonProperty("user_id")
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}


