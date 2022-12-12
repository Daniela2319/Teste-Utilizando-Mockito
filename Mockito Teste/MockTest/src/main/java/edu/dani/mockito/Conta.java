package edu.dani.mockito;

public class Conta {

    private int saldo;

    public Conta(int saldo){
        this.saldo = saldo;
    }

    public void pagaBoleto(int valorApagar){
        validaSaldo(valorApagar);
        debita(valorApagar);
        enviarCreditoParaEmissor(valorApagar);
    }

    public void validaSaldo(int valorApagar){
        if (valorApagar > saldo){
            throw new IllegalStateException("Saldo insuficiente");
        }
    }

    public void debita(int valorApagar){
        this.saldo = this.saldo - valorApagar;
    }

    public void enviarCreditoParaEmissor(int valorApagar){
        //enviar valor para emissor do boleto
    }
}
