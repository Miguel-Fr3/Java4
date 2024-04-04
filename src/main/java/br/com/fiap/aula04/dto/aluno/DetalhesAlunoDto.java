package br.com.fiap.aula04.dto.aluno;

import br.com.fiap.aula04.model.Aluno;
import br.com.fiap.aula04.model.NivelEscolaridade;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DetalhesAlunoDto(Long rm, String nome, Long cd) {

    public DetalhesAlunoDto(Aluno aluno){
        this(aluno.getRm(), aluno.getNome(), aluno.getCd());
    }

}
