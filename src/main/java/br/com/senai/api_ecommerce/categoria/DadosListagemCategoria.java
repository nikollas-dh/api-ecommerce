package br.com.senai.api_ecommerce.categoria;

public record DadosListagemCategoria(
        long id ,
        String nome

) {
    public DadosListagemCategoria(Categoria categoria){
        this(categoria.getId(), categoria.getNome());
    }
}
