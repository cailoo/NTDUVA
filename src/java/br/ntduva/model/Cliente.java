package br.ntduva.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Leno Mota
 */
@Entity
public class Cliente extends Pessoa implements Serializable {
    @Id
    private Integer codigo;

    @OneToMany(mappedBy = "cliente")
    private List<Atendimento> listaAtendimento = new ArrayList<Atendimento>();

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public List<Atendimento> getListaAtendimento() {
        return listaAtendimento;
    }

    public void setListaAtendimento(List<Atendimento> listaAtendimento) {
        this.listaAtendimento = listaAtendimento;
    }
}