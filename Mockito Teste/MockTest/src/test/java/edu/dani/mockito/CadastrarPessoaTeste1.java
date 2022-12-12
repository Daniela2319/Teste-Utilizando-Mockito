package edu.dani.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste1 {

    @Mock //quanto quer moca uma informação esta mocando um objeto de uma classe
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
        // dessa forma já pode fazer o teste cadastrar pessoal
    void validarDadosDeCadastro() {

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("PR", "Fazenda Rio Grande", "Rua Bromelias", "Casa", "Centro");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(null);

        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Daniela", "7896790", LocalDate.now(), "78900007");

        // valida
        assertNull(pessoa.getEndereco());

    }

    @Test
        // dessa forma já pode fazer o teste cadastrar pessoal
    void lancaExceptionQuandoChamarApiDosCorreios(){


        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalArgumentException.class);



        Assertions.assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("Daniela","7896790", LocalDate.now(), "78900007" ));

        }

    }


