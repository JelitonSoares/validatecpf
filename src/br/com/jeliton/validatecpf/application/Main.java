package br.com.jeliton.validatecpf.application;

import br.com.jeliton.validatecpf.models.CPFValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CPFValidator validator = new CPFValidator();

        System.out.println("DIGITE UM CPF: ");
        String cpf = scanner.nextLine();
        validator.validateCPF(cpf);

    }
}
