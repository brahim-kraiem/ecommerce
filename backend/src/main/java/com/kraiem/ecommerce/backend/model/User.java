package com.kraiem.ecommerce.backend.model;
import jakarta.persistence.*;
import lombok.*;
/**
 * @author : Kraiem Brahim
 * @Project: backend
 * @Date : 17 3/17/2026 8:11 AM
 **/


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role {
        USER, VENDOR, ADMIN
    }
}
