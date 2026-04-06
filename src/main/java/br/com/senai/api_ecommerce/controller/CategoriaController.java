package br.com.senai.api_ecommerce.controller;

import br.com.senai.api_ecommerce.categoria.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<DadosListagemCategoria> listarCategorias(@PageableDefault(size = 10,sort = {"nome"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao)
                .map(DadosListagemCategoria::new);
    }

    @PutMapping()
    @Transactional
    public void atualizarCategoria(@RequestBody DadosAtualizarCategoria dados){
        var categoria = repository.getReferenceById(dados.id());
        categoria.atualizarCategoria(dados);
    }

//    @DeleteMapping("/{id}")
//    @Transactional
//    public void deletarCategoria(@PathVariable Long id){
//        repository.deleteById(id);
//    }
    @PutMapping("/{id}")
    @Transactional
    public void deletarCategoria(@PathVariable Long id){
        var categoria = repository.getReferenceById(id);
        categoria.excluirCategoria();
    }


}