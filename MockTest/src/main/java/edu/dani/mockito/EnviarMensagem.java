package edu.dani.mockito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnviarMensagem {

    //referencia de mensagem
    private List<Mensagem> mensagems = new ArrayList<>();

    // método para adicionar mensagem
    public void adicionarMensagem(Mensagem mensagem){
        this.mensagems.add(mensagem);
    }

    // método para devolver essa mensagem
    public List<Mensagem> getMensagems(){
        return Collections.unmodifiableList(this.mensagems);
    }
}
