package com.example;
import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>(100); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (funcionarios.size() < 100) {
            funcionarios.add(funcionario);
        } else {
            System.out.println("Limite de funcionários atingido");
        }
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento: ").append(nome).append("\n");
        sb.append("Funcionários:\n");
    for (Funcionario f : funcionarios) {
        sb.append("  - ").append(f).append("\n");
        }
    return sb.toString();
    }
}
