package edu.dani.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {

    // Utilizado para espiar @Spy, vou espiar enviando mensagem
    @Spy
    private EnviarMensagem enviarMensagem;

    //Teste mostra método de referencia para observar o comportamento das classes
    @Test
    void verificarComportamentoDaClasse(){
        Mockito.verifyNoInteractions(enviarMensagem);

        Mensagem mensagem = new Mensagem("Hello World"); // criou uma mensagem
        enviarMensagem.adicionarMensagem(mensagem);      // adicionou a mensagem

        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem); //mockito verifica enviando a mensagem se adicionou mensagem

        //verifica se a lista esta vazia
        Assertions.assertFalse(enviarMensagem.getMensagems().isEmpty());
    }


}
