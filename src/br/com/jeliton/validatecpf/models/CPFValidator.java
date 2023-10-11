package br.com.jeliton.validatecpf.models;


import java.util.ArrayList;
import java.util.List;

public class CPFValidator {
    private String validatedCPF;

    public String getValidatedCPF() {
        return validatedCPF;
    }

    List<Integer> list = new ArrayList<>();
    public void validateCPF(String cpf) {
        String cpfVerified = cpf.replace(".", "")
                .replace("-", "").trim();

        int total = 0;
        int multiplier = 2;

        if (cpfVerified.length() != 11) {
            throw new RuntimeException("CPF DEVE TER 11 DIGITOS");
        }
        String subCPF = cpfVerified.substring(0, 9);      // 149676547

        for (int i = subCPF.length() - 1; i >= 0; i--) {


            int iCpf = Integer.parseInt(String.valueOf(subCPF.charAt(i)));

            total += iCpf * multiplier;
            multiplier++;
        }

        System.out.println(total);
    }
}
