package projeto;

import java.time.LocalDate;

public class Participacao {
    private Integer id;
    private Integer idFuncionario;
    private LocalDate dataInicio;
    private LocalDate dataTermino;

    public Participacao(Integer id, Integer idFuncionario, LocalDate dataInicio, LocalDate dataTermino) throws IllegalAccessException {
        this.id = id;
        this.idFuncionario = idFuncionario;
        this.dataInicio = dataInicio;
        this.dataTermino = ConfirmarData.confirmarDataTermino(dataInicio,dataTermino);
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }
}
