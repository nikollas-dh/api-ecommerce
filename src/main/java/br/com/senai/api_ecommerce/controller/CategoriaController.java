package br.com.senai.api_ecommerce.controller;

import br.com.senai.api_ecommerce.categoria.Categoria;
import br.com.senai.api_ecommerce.categoria.CategoriaRepository;
import br.com.senai.api_ecommerce.categoria.DadosCadastrados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @PostMapping
    public void cadastrarCategoria(@RequestBody DadosCadastrados dados){
    repository.save(new Categoria(dados));
    }

}
