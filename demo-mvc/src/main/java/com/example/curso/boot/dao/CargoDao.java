package com.example.curso.boot.dao;

import com.example.curso.boot.domain.Cargo;
import java.util.List;

/**
 *
 * @author jennifer
 */
public interface CargoDao {

    void save(Cargo cargo );

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
