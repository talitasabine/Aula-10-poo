import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        //agregação
        //Professor p1 = new Professor("Francisco Abreu", 1);
        //Professor p2 = new Professor("Daisy Eboli", 2);
        //Professor p3 = new Professor("Marcia Bissaco", 3);
        //Professor p4 = new Professor("Rogerio Silva", 4);

        //Departamento colegiado = new Departamento("ADS", 1);

        //colegiado.adicionarProfessor(p1);
        //colegiado.adicionarProfessor(p2);
        //colegiado.adicionarProfessor(p3);
        //colegiado.adicionarProfessor(p4);

        //colegiado.listarProfessor();


        // composição


        List<Comodo> comodos = new ArrayList<>();
        comodos.add(new Comodo("Quarto", 9));
        comodos.add(new Comodo("Cozinha", 6));
    
        Casa casa = new Casa(comodos);

        casa.listarComodo();

      //  casa.adicionarComodo(quarto);
       // casa.adicionarComodo(cozinha);

        //casa.exibirComodo();

        Casa casa2 = new Casa(new ArrayList<>());

}
}