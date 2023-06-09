package tests;
import java.util.ArrayList;

import Estacionamento;
import EstacionamentoException;

public class Valetinho {
    private Estacionamento estacionamentoAtual;
    public Valetinho(int quant) throws Exception{
        estacionamentoAtual = new Estacionamento(quant);
    }
    public void Entrada(int vagaEscolhida, String placaVeiculo) throws Exception{
        estacionamentoAtual.entrar(placaVeiculo, vagaEscolhida);
    }
    public void Saida(int vagaEscolhida) throws Exception{
        estacionamentoAtual.sair(vagaEscolhida);
    }
    public int consultaPlaca(String placaEscolhida) throws Exception{
        int posVaga = estacionamentoAtual.consultarPlaca(placaEscolhida);
        if(posVaga>0) {
            return posVaga;
        }
        throw new EstacionamentoException("Inexistente");
    }
    public void transfereVaga(int placaEscolhida, int vagaDestino) throws Exception{
        estacionamentoAtual.transferir(placaEscolhida, vagaDestino);
    }
    public String[] listagemGeral(){
        return estacionamentoAtual.listarGeral();
    }
    public ArrayList<Integer> listagemLivres(){
        return estacionamentoAtual.listarLivres();
    }
}
