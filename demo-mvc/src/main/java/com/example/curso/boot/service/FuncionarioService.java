package com.example.curso.boot.service;

import com.example.curso.boot.domain.Funcionario;
import java.util.List;

/**
 *
 * @author jennifer
 */
public interface FuncionarioService {
    
    void salvar(Funcionario funcionario);
    
    void editar(Funcionario funcionario);
    
    void excluir(Long id);
    
    Funcionario buscarPorId(Long id);
    
    List<Funcionario> buscarTodos();
    
}
