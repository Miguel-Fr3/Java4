package br.com.fiap.aula04.model;

import br.com.fiap.aula04.dto.aluno.CadastroAlunoDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor

@Entity
@Table(name="tb_aluno")
@EntityListeners(AuditingEntityListener.class)
public class Aluno {

    @Id
    @GeneratedValue
    @Column(name="nr_rm")
    private Long rm;

    @Column(name="nm_aluno", length = 100, nullable = false)
    private String nome;

    @Column(name="cd_turma",nullable = false)
    private Long cd;

    public Aluno(Long rm, String nome, Long cd) {
        this.rm = rm;
        this.nome = nome;
        this.cd = cd;
    }

    public Aluno(CadastroAlunoDto alunoDto) {
    }
}
