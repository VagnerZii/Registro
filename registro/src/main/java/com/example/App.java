package com.example;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Chopper", 1000.0, LocalDate.of(2024, 6, 9));
        Funcionario f2 = new Funcionario("Zoro", 5100.0, LocalDate.of(2024, 6, 8));

        Departamento d1 = new Departamento("TI");
        Departamento d2 = new Departamento("RH");

        d1.adicionarFuncionario(f1);
        d2.adicionarFuncionario(f2);

        Empresa empresa = new Empresa("P-TEC Corporation", "12345678901234");

        empresa.adicionarDepartamento(d1);
        empresa.adicionarDepartamento(d2);

        System.out.println(empresa);
    }
}
