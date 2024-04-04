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

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="tb_turma")
@EntityListeners(AuditingEntityListener.class)
public class Turma {

    @Id
    @GeneratedValue
    @Column(name="cd_turma")
    private Long cd;

    @Column(name="nm_turma", length = 30, nullable = false)
    private String nome;

    @Column(name="qt_aula")
    private Long qtAula;

    @Enumerated(EnumType.STRING)
    @Column(name="ds_periodo", length = 30, nullable = false)
    private Periodo periodo;


    public Turma(Long cd, String nome, Long qtAula, Periodo periodo) {
        this.cd = cd;
        this.nome = nome;
        this.qtAula = qtAula;
        this.periodo = periodo;
    }
}
