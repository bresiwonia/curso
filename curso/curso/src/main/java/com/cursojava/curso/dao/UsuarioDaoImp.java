package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{
@PersistenceContext
EntityManager entityManager;



    @Override
    public List<Usuario> getUsuarios(){
        String query="FROM Usuario";
        entityManager.createQuery(query).getResultList();
    }
}
