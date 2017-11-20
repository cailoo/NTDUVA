package br.ntduva.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;

/**
 *
 * @author Leno Mota
 */
class Aluno extends Pessoa {
    private long matricula;

    @OneToMany(mappedBy = "aluno")
    private List<Atendimento> listaAtendimento = new ArrayList<Atendimento>();

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public List<Atendimento> getListaAtendimento() {
        return listaAtendimento;
    }

    public void setListaAtendimento(List<Atendimento> listaAtendimento) {
        this.listaAtendimento = listaAtendimento;
    }
}
