package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Aluno;


public class AlunoController {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(3, 01234567, "Joao", "Nunes", "joao@gmail.com");
        Aluno aluno4 = new Aluno(4, 11114444, "Maria", "Cruz", "maria@gmail.com");
        Aluno aluno5 = new Aluno("Pedro", 5);
        Aluno aluno6 = new Aluno("Pablo", 6);

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5.getNome());
        System.out.println(aluno5.getId());
        System.out.println(aluno6.getNome());
        System.out.println(aluno6.getId());

        //alterando os padrões
        aluno1.setId(1);
        aluno1.setCpf(11111111);
        aluno1.setNome("Tiago");
        aluno1.setSobrenome("Pereira");
        aluno1.setEmail("tiago@gmail.com");

        aluno2.setId(2);
        aluno2.setCpf(22222222);
        aluno2.setNome("Cauã");
        aluno2.setSobrenome("Santos");
        aluno2.setEmail("caua@gmail.com");

        //imprimindo com as alterações
        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());

        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());

        List<Aluno> alunosList = new ArrayList<>();
        alunosList.add(aluno1);
        alunosList.add(aluno2);
        alunosList.add(aluno3);
        alunosList.add(aluno4);
        alunosList.add(aluno5);
        alunosList.add(aluno6);

        alunosList.sort(Comparator.comparing(Aluno::getId));
        System.out.println();
        System.out.println("---- Lista Ordenada ----");
        System.out.println(alunosList);

        alunosList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println();
        System.out.println("---- Lista decrescente ----");
        System.out.println(alunosList);

        Map<Integer, Aluno> alunoMap = new HashMap<>();
        alunoMap.put(aluno1.getId(), aluno1);
        alunoMap.put(aluno1.getId(), aluno2);
        alunoMap.put(aluno1.getId(), aluno3);
        alunoMap.put(aluno1.getId(), aluno4);
        alunoMap.put(aluno1.getId(), aluno5);
        alunoMap.put(aluno1.getId(), aluno6);
        System.out.println(alunoMap);

    }

}
