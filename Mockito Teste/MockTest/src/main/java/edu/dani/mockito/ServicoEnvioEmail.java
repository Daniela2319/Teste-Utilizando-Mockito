package edu.dani.mockito;

import java.text.Format;

public class ServicoEnvioEmail {

    private PlataformaDeEnvio plataformaDeEnvio;

    void enviarEmail(String enderecoEmail, String mensagem, boolean formatoHTML){

        Email email = null;

        if (formatoHTML){
            email = new Email(enderecoEmail, mensagem, Formato.HTML);
        }else
            email = new Email(enderecoEmail, mensagem, Formato.TEXTO);

        plataformaDeEnvio.enviarEmail(email);
    }
}
