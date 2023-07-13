package com.example.Task.user;

import com.example.Task.task.Task;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Data
@Entity
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "registered_date", nullable = false)
    private LocalDate registeredDate;

    @Column(name = "status", nullable = false)
    private boolean status;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks;


}

