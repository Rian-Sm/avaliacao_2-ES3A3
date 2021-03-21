package projeto;

import java.time.LocalDate;

public class ConfirmarData {
    public static LocalDate confirmarDataTermino(LocalDate dataInicio, LocalDate dataTermino ) throws IllegalAccessException {
        if (dataInicio.isBefore(dataTermino)) {
            return dataTermino;
        } else {
            throw new IllegalAccessException("Valores invalidos de data");
        }
    }
}
