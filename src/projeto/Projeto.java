package projeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private Integer id;
    private String titulo;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private boolean ativo;
    private List<Participacao> participacoes = new ArrayList<>();

    public Projeto(Integer id, String titulo, LocalDate dataInicio, LocalDate dataTermino, boolean ativo) throws IllegalAccessException {
        this.id = id;
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataTermino = ConfirmarData.confirmarDataTermino(dataInicio,dataTermino);
        this.ativo = ativo;
    }

    public void addParticipacoes(Participacao participacao){
        boolean confirn = false;
        if(participacoes.size()<=10){
            for(Participacao part : participacoes){
                if(part.getId() == participacao.getId())
                    confirn = true;
            }
            if (confirn == false)
                participacoes.add(participacao);
        }
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public List<Participacao> getParticipacoes() {
        if (ativo == true)
            return participacoes;
        else
            return null;
    }

    @Override
    public String toString(){
        return "PROJETO: "+ this.id + ", " + this.titulo;
    }
}
