package com.example.sistemadeimobliaria.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "proprietario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
