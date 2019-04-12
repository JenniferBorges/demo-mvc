package com.example.curso.boot.dao;

import com.example.curso.boot.domain.Departamento;
import java.util.List;

/**
 *
 * @author jennifer
 */
public interface DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
