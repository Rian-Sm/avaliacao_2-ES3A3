import projeto.Participacao;
import projeto.Projeto;
import projeto.ProjetoRepositorio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {
    private static DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) throws IllegalAccessException {
        ProjetoRepositorio projRepositorio= new ProjetoRepositorio();
        Projeto proj1 = new Projeto(1,"Novo Projeto", LocalDate.parse("2021-04-01", dtFormatter), LocalDate.parse("2021-04-30",dtFormatter), true);
        Projeto proj2 = new Projeto(2,"projeto secundario", LocalDate.parse("2021-03-27",dtFormatter), LocalDate.parse("2021-04-30",dtFormatter), true);

        Participacao part1 = new Participacao(1,1,LocalDate.parse("2021-04-01", dtFormatter), LocalDate.parse("2021-04-20", dtFormatter));
        Participacao part2 = new Participacao(2,2,LocalDate.parse("2021-04-02", dtFormatter), LocalDate.parse("2021-04-25", dtFormatter));
        Participacao part3 = new Participacao(3,3,LocalDate.parse("2021-04-03", dtFormatter), LocalDate.parse("2021-04-25", dtFormatter));
        Participacao part4 = new Participacao(4,4,LocalDate.parse("2021-04-04", dtFormatter), LocalDate.parse("2021-04-25", dtFormatter));
        Participacao part5 = new Participacao(5,5,LocalDate.parse("2021-04-05", dtFormatter), LocalDate.parse("2021-04-30", dtFormatter));

        proj1.addParticipacoes(part1);
        proj1.addParticipacoes(part2);
        proj1.addParticipacoes(part3);
        proj1.addParticipacoes(part4);

        proj2.addParticipacoes(part5);
        proj2.addParticipacoes(part2);
        proj2.addParticipacoes(part1);

        projRepositorio.save(proj1);
        projRepositorio.save(proj2);

        System.out.println(projRepositorio.get(1));

        projRepositorio.delete(proj1);


    }
}
