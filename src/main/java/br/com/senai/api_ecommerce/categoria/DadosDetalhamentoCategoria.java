package br.com.senai.api_ecommerce.categoria;

import org.springframework.data.domain.Page;

public record DadosDetalhamentoCategoria(
        Long id,
        String nome,
        String descricao
) {
    public DadosDetalhamentoCategoria(Categoria categoria) {
        this(categoria.getId(), categoria.getNome(), categoria.getDescricao());
    }
}
