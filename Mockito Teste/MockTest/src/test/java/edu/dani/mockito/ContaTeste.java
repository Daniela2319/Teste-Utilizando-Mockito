package edu.dani.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTeste {

    @Spy
     private Conta conta = new Conta(1000);
    // verificar aquela instacia estou espiando esse objeto estou espiando esta seguindo ordem que espero.

    @Test
    void validarOrdemDeChamadas(){

        conta.pagaBoleto(500);

       InOrder inOrder = Mockito.inOrder(conta);
        inOrder.verify(conta).pagaBoleto(500);
        inOrder.verify(conta). validaSaldo(500);
        inOrder.verify(conta).debita(500);
        inOrder.verify(conta).enviarCreditoParaEmissor(500);


    }

   @Test
    void validarQuantidadesDeChamadas(){

        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(600);

        Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyInt());
   }



}
