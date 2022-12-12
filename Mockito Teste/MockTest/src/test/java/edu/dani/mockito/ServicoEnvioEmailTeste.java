package edu.dani.mockito;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {

    @Mock
    private PlataformaDeEnvio plataformaDeEnvio;

    @InjectMocks
    private ServicoEnvioEmail servico;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaPlataforma(){

        String enderecoDeEmail = "usuaro@test.com.br";
        String mensagem = "Olá mundo teste mensagem";
        boolean ehFormatoHTML = false;

        servico.enviarEmail(enderecoDeEmail, mensagem, ehFormatoHTML);

        Mockito.verify(plataformaDeEnvio).enviarEmail(captor.capture()); // capturou a informação foi passada

        Email emailCapturado = captor.getValue(); // buscou ela dentro de uma variavel

        Assertions.assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
    }
}
