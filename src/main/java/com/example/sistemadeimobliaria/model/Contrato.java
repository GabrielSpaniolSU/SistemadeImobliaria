package com.example.sistemadeimobliaria.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "contrato")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cliente", length = 150)
    private String cliente;

    @Column(name = "imovel", length = 150)
    private String imovel;

    @Column(name = "dataInicio", length = 150)
    private Date dataInicio;

    @Column(name = "dataFim", length = 150)
    private Date dataFim;

    @Column(name = "valor", length = 150)
    private Double valor;

    @Column(name = "tipoContrato", length = 150)
    private String tipoContrato;

    @Column(name = "status", length = 150)
    private String status;

    @OneToMany(mappedBy = "contrato",
            targetEntity = Imovel.class,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Contrato> Contrato;



}
