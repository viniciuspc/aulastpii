/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.wui.cruds;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.dao.PessoaDao;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author rm61828
 */

@ManagedBean(name="telaPessoa")
@SessionScoped
public class PessoaBacingkBean {
    private PessoaDao dao = new PessoaDao();
    private Pessoa pessoa = new Pessoa();

    public PessoaDao getDao() {
        return dao;
    }

    public void setDao(PessoaDao dao) {
        this.dao = dao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String cadastrar(){
        dao.inserir(pessoa);
        return null;
    }
}
