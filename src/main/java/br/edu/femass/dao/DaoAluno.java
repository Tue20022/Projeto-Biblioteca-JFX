package br.edu.femass.dao;

import br.edu.femass.model.Aluno;

import java.util.List;

public class DaoAluno extends Dao<Aluno>{
    public List<Aluno> buscarTodos(){
        return em.createQuery("select c from Aluno c order by id").getResultList();
    }
}
