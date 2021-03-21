package projeto;

import java.util.ArrayList;
import java.util.List;

public class ProjetoRepositorio {
    private List<Projeto> projetos = new ArrayList<>();

    public Projeto save(Projeto proj){
        this.projetos.add(proj);
        return proj;
    }

    public void delete(Projeto proj){
        this.projetos.remove(proj);
    }

    public Projeto get(Integer id){
        return projetos.stream().filter(proj -> proj.getId() == id).findAny().orElse(null);
    }

}
