package com.example.sistemadeimobliaria.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "imovel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //tipo= se é uma casa, apartamento, etc
    @Column(name = "tipo", length = 150)
    private String tipo;

    @Column(name = "status", length = 150)
    private String status;

    @Column(name = "valor", length = 150)
    private Double valor;

    @Column(name = "tipo", length = 150)
    private String tipo;

    @Column(name = "numeroQuartos", length = 150)
    private Integer numeroQuartos;






}
