
package br.ntduva.model;

import java.util.Date;
import javax.persistence.ManyToOne;

/**
 *
 * @author Leno Mota
 */
public class ItemAtendimento {
    private Integer codigoItem;
    private Date dataFim;
    private CatergoriaServico servico;
    
    @ManyToOne
    private Atendimento atendimento;

    public Integer getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(Integer codigoItem) {
        this.codigoItem = codigoItem;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public CatergoriaServico getServico() {
        return servico;
    }

    public void setServico(CatergoriaServico servico) {
        this.servico = servico;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }
}