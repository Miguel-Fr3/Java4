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
@Table(name="tb_carteirinha")
@EntityListeners(AuditingEntityListener.class)
public class Carteirinha {

    @Id
    @GeneratedValue
    @Column(name="cd_carteirinha")
    private Long cd;

    @CreatedDate
    @Column(name="dt_emissao", nullable = false)
    private LocalDate dataEmissao;


    @CreatedDate
    @Column(name="dt_vencimento", nullable = false)
    private LocalDate dataVencimento;

    @Column(name="st_ativo", nullable = false)
    private boolean status;

    public Carteirinha(Long cd, LocalDate dataEmissao, LocalDate dataVencimento, boolean status) {
        this.cd = cd;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.status = status;
    }
}
