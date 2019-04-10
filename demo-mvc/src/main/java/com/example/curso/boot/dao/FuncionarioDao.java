package com.example.curso.boot.dao;

import com.example.curso.boot.domain.Funcionario;
import java.util.List;

/**
 *
 * @author jennifer
 */
public interface FuncionarioDao {

    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();

}
