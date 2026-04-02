package br.com.senai.api_ecommerce.controller;

import br.com.senai.api_ecommerce.categoria.Categoria;
import br.com.senai.api_ecommerce.categoria.CategoriaRepository;
import br.com.senai.api_ecommerce.categoria.DadosCadastrados;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarCategoria(@RequestBody @Valid DadosCadastrados dados){
        repository.save(new Categoria(dados));

    }

    @GetMapping
    public List<Categoria> listarCategorias(){
        return repository.findAll();
    }

}