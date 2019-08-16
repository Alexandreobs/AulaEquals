package br.digitalhouse.equals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {

        System.out.println("exercicio 1 Pessoa");

        Pessoa Alexandre = new Pessoa("Alexandre", 1234111);
        Pessoa Camila = new Pessoa("camila", 1234111);

         System.out.println(Alexandre.equals(Camila));

        System.out.println("\n");

        System.out.println("exercicio 2 CoCa");

        Coca umlintro = new Coca(1,2.50);
        Coca doisLitros = new Coca(1,5.50);

        System.out.println(umlintro.equals(doisLitros));

        System.out.println("\n");

        System.out.println("exercicio 3 Alunos");

        Aluno robson = new Aluno("Robson",1);
        Aluno will = new Aluno("will", 2);
        Aluno vitor = new Aluno("Vitor",3);
        Aluno allan = new Aluno("Allan",4);
        Aluno vitoria = new Aluno("Vitoria", 4);

        List<Aluno> listaAluno = new ArrayList <>();
        listaAluno.add(robson);
        listaAluno.add(will);
        listaAluno.add(vitor);
        listaAluno.add(allan);

        System.out.println(listaAluno.equals(vitoria));

        System.out.println("\n");

        System.out.println("exercicio 4 Funcionario");

        Funcionario pedro = new Funcionario("Pedro",1);
        Funcionario roberto = new Funcionario("Roberto",2);
        Funcionario carla = new Funcionario("Carla",3);
        Funcionario sofia = new Funcionario("Sofia", 4);
        Funcionario luciana = new Funcionario("Luciana",2);

        Set<Funcionario> listaFuncionarios = new HashSet<>();
        listaFuncionarios.add(pedro);
        listaFuncionarios.add(carla);
        listaFuncionarios.add(roberto);
        listaFuncionarios.add(sofia);
    

//        System.out.println(listaFuncionarios.equals(luciana));

        for (int i = 0; i < listaFuncionarios.size(); i++){
            System.out.println(listaFuncionarios.equals(luciana));

        }

    }

}
