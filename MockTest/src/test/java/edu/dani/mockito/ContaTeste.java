package edu.dani.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;

import static org.mockito.Mockito.inOrder;

public class ContaTeste {

    @Spy
    private Conta conta = new Conta(1000);

    @Test
    void validarOrdemDeChamadas(){// verificar aquela instacia estou espiando esse objeto estou espiando esta seguindo ordem que espero.
        conta.pagaBoleto(300);

        InOrder inOrder = inOrder(conta);
        inOrder.verify(conta).pagaBoleto(300);
        inOrder.verify(conta).validaSaldo(300);
        inOrder.verify(conta).debita(300);
        inOrder.verify(conta).enviarCreditoParaEmissor(300);
    }

   @Test
    void validarQuantidadesDeChamadas(){

        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(600);

        Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyInt());
   }



}
