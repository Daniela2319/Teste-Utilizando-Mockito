package edu.dani.mockito;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
public class CadastrarPessoasTeste {

    @Mock //quanto quer moca uma informação esta mocando um objeto de uma classe
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test // dessa forma já pode fazer o teste cadastrar pessoal
    void validarDadosDeCadastro(){

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("PR", "Fazenda Rio Grande", "Rua Bromelias", "Casa", "Centro");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("78900007")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Daniela","7896790", LocalDate.now(), "78900007" );

        // valida
        assertEquals("Daniela", pessoa.getNome());
        assertEquals("7896790", pessoa.getDocumento());
        assertEquals("PR", pessoa.getEndereco().getUf());
        assertEquals("Casa", pessoa.getEndereco().getComplemento());
    }
}
