package edu.joaoLucas.contaBancaria;

import java.util.Scanner;

public class ContaTerminal {
    private static Scanner scanner = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta!");

        while (true) {
            String texto = scanner.nextLine();
            if (eUmNumeroInteiro(texto)) {
                numero = conveterParaNumeroInteiro(texto);
                break;
            } else {
                System.out.println("Formato inválido. Por favor, digite um número válido!");
            }
        }

        System.out.println("Por favor, digite o número da agência!");

        while (true) {
            agencia = scanner.nextLine();
            if (!agencia.isBlank())
                break;
            else
                System.out.println("Texto vazio. Por favor, digite pelo menos um caractere!");
        }

        System.out.println("Por favor, digite o nome do cliente!");

        while (true) {
            nomeCliente = scanner.nextLine();
            if (!nomeCliente.isBlank())
                break;
            else
                System.out.println("Texto vazio. Por favor, digite pelo menos um caractere!");
        }

        System.out.println("Por favor, digite o saldo!");

        while (true) {
            String texto = scanner.nextLine();
            if (eUmNumeroDecimal(texto)) {
                saldo = converterParaNumeroDecimal(texto);
                break;
            } else {
                System.out.println("Formato inválido. Por favor, digite um número válido!");
            }
        }

        System.out.println(
                "\"Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
                ", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque\"");

    }

    public static boolean eUmNumeroInteiro(String texto) {
        texto = texto.replaceAll(",", ".");
        return texto.matches("^[0-9]+$");
    }

    public static boolean eUmNumeroDecimal(String texto) {
        texto = texto.replaceAll(",", ".");
        return texto.matches("^[0-9]+\\.?[0-9]*$");
    }

    public static int conveterParaNumeroInteiro(String texto) {
        texto = texto.replaceAll(",", ".");
        return Integer.parseInt(texto);
    }

    public static double converterParaNumeroDecimal(String texto) {
        texto = texto.replaceAll(",", ".");
        return Double.parseDouble(texto);
    }

}
