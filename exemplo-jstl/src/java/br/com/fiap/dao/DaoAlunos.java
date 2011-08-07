
package br.com.fiap.dao;

import br.com.fiap.bean.Alunos;
import java.util.ArrayList;
import java.util.List;


public class DaoAlunos extends Dao {
    private Alunos aluno;

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public List<Alunos> listarAlunos(){
        List<Alunos> lista = new ArrayList<Alunos>();
        if(abrirConexao())
        {
            try{
                stmt = cn.prepareStatement("select * from alunos");
                rs = stmt.executeQuery();
                while(rs.next()){
                    Alunos a = new Alunos();
                    a.setRm(rs.getInt("RM"));
                    a.setNome(rs.getString("nome"));
                    a.setCurso(rs.getString("Curso"));
                    lista.add(a);
                }
            }
            catch(Exception ex){

            }
            finally{
                fechaConexao();
            }

        }
        return lista;
    }
}
