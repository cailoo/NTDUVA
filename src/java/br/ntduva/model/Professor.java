
package br.ntduva.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Leno Mota
 */
@Entity
public class Professor extends Pessoa implements Serializable{
    @OneToMany(mappedBy = "professor")
    private List<Atendimento> listaAtendimento = new ArrayList<Atendimento>();

    public List<Atendimento> getListaAtendimento() {
        return listaAtendimento;
    }

    public void setListaAtendimento(List<Atendimento> listaAtendimento) {
        this.listaAtendimento = listaAtendimento;
    }
}