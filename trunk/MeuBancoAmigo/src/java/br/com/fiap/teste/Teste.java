/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fiap.teste;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.dao.PessoaDao;

/**
 *
 * @author rm61828
 */
public class Teste {

    public static void main(String args[]){
        Pessoa a = new Pessoa();
        a.setId(3);
        a.setNome("Joãozinho");

        PessoaDao dao = new PessoaDao();
        dao.inserir(a);

    }
}
