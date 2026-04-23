package br.com.senai.api_ecommerce.cliente;

import br.com.senai.api_ecommerce.endereco.DadosAtualizarEndereco;
import br.com.senai.api_ecommerce.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record DadosAtualizarCliente(
        Long id,

        @NotBlank
        @Size(min=3, max=100)
        String nome,

        @Email
        @NotBlank
        String email,

        @Size(max=20)
        String telefone,

        @Valid
        DadosAtualizarEndereco endereco
) {
}
