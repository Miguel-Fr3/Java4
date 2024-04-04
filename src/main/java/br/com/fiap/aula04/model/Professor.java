package br.com.fiap.aula04.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="tb_professor")
@EntityListeners(AuditingEntityListener.class)
public class Professor {


    @Id
    @GeneratedValue
    @Column(name="cd_professor")
    private Long cd;

    @Column(name="nm_professor", length = 100, nullable = false)
    private String nome;

    @CreatedDate
    @Column(name="dt_contratacao", nullable = false)
    private LocalDateTime dataContratacao;

    @Column(name="vl_salario", nullable = false, precision = 9)
    private Double salario;

    public Professor(Long cd, String nome, LocalDateTime dataContratacao, Double salario) {
        this.cd = cd;
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
    }
}
