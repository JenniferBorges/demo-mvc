package com.example.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jennifer
 */
@Controller
@RequestMapping("/cargos")
public class CargoController {

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "/cargo/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/cargo/lista";
    }
}
