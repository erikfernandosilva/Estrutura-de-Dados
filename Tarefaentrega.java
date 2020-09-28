/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferna
 */
public class Tarefaentrega {
    public static void main(String[] args) {
       Funcionario func1 = new Funcionario();
       func1.nome = "marcio";
        System.out.println(func1.nome);
        
        Vendedor exemplo = new Vendedor();
        exemplo.comissao = 15;
        exemplo.numeroVendas = 100;
        System.out.println(exemplo.getSalario());
        
        
    }
    
}
class Funcionario{
    String nome;
    int RG;
 
    public double getSalario(){
        return 0;
    
        
}
    public boolean cadastrar(){
        return false;
        
    }
    
    public boolean demitir(){
        return false;
        
    }
    
    
}

class Gerente{
    float bonificacao;
    
    protected double bonificação;
    
    public double getSalario(){
        return getSalario() * 15 + bonificação;
    }
}

   
class Consultor extends Funcionario{
    protected double valorHora;
    protected int horasTrabalhadas;
    
    public double getSalario(){
        return horasTrabalhadas * valorHora;
         
        
     }
}


   class Vendedor extends Funcionario{
       protected double comissao;
       protected int numeroVendas;
       
       public double getSalario(){
           return numeroVendas * comissao;
       }
   }
