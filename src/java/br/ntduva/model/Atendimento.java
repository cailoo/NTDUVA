package br.ntduva.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Leno Mota
 */
public class Atendimento {
    private Date dataInicio;
        
    @Id
    private Integer codigo;
    
    @ManyToOne
    private Professor professor;
    
    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "atendimento")
    private List<Aluno> listaAluno = new ArrayList<Aluno>();

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }
}