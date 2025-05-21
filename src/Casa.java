import java.util.ArrayList;
import java.util.List;

public class Casa {
   private Endereco endereco; //associação 1 para 1
   private List<Comodo> comodos; //Composição

   //public Casa(){

  // } 
  
  //Composição é obrigatório ter sua parte
  // Não é recomendado ter construtores vazios
  // é necessário colocar IF-ELSE para validações
  //Todo(casa)-Parte(comodos)
  //comodos podem existir sem casa
  //casa não existe sem comodos
  
    public Casa(Endereco endereco, List<Comodo> comodos){
    this.endereco = endereco;

    if(comodos == null || comodos.size()==0 || comodos.isEmpty()){
        System.out.println("Necessário ter pelo menos um cômodo");
    }else{
        this.endereco = endereco;
        this.comodos = new ArrayList<>(comodos);
    }

   }
   public void adicionarComodo(Comodo comodo){
        comodos.add(comodo);
   }

   public void removerComodo(Comodo comodo){
        comodos.remove(comodo);
   }

   public void exibirComodo(){
    for (Comodo comodo : comodos){
        comodo.exibir();
    }

   }
}
