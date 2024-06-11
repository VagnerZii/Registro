package com.example;
import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Departamento> departamentos;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.departamentos = new ArrayList<>(10); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void adicionarDepartamento(Departamento departamento) {
        if (departamentos.size() < 10) {
            departamentos.add(departamento);
        } else {
            System.out.println("Limite de departamentos atingido");
        }
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa: ").append(nome).append("\n");
        sb.append("CNPJ: ").append(cnpj).append("\n");
        sb.append("\nDepartamentos:\n");
    for (Departamento d : departamentos) {
        sb.append(d).append("\n");
    }
    return sb.toString();
}

}
