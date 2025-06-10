package com.conversor;

import java.util.*;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> moedasDisponiveis = Arrays.asList("BRL", "USD", "EUR", "GBP");

        System.out.println("Bem-vindo ao Conversor de Moedas!");

        String moedaOrigem;
        while(true) {
            System.out.print("Digite a moeda de origem (BRL, USD, EUR, GBP): ");
            moedaOrigem = scanner.nextLine().trim().toUpperCase();

            if (moedasDisponiveis.contains(moedaOrigem)) {
                break;
            } else {
                System.out.println("Moeda inválida. Tente novamente.");
            }
        }

        System.out.print("Digite o valor que deseja converter: ");
        double valorOriginal = scanner.nextDouble();
        scanner.nextLine();

        int quantidadeDestinos = 0;
        while (quantidadeDestinos < 1 || quantidadeDestinos > 3) {
            System.out.print("Quantas moedas diferentes você quer converter? (1 a 3): ");
            quantidadeDestinos = scanner.nextInt();
            scanner.nextLine();
        }

        List<String> moedasDestino = new ArrayList<>();
        for (int i = 0; i < quantidadeDestinos; i++) {
            String moedaDestino;
            while (true) {
                System.out.print("Digite o código da moeda destino #" + (i + 1) + " (BRL, USD, EUR, GBP): ");
                moedaDestino = scanner.nextLine().trim().toUpperCase();

                if (!moedaDestino.equals(moedaOrigem) && moedasDisponiveis.contains(moedaDestino) && !moedasDestino.contains(moedaDestino)) {
                    moedasDestino.add(moedaDestino);
                    break;
                } else {
                    System.out.println("Moeda inválida ou repetida. Tente outra.");
                }
            }
        }

        Map<String, Double> taxas = TaxasDeCambio.buscarTaxas(moedaOrigem, moedasDestino);

        if (taxas != null) {
            System.out.println("\n💱 Conversão: ");
            for (String destino : moedasDestino) {
                double convertido = valorOriginal * taxas.get(destino);
                System.out.printf("%s: %.2f\n", destino, convertido);
            }
        } else {
            System.out.println("Não foi possível obter as taxas de câmbio.");
        }

        scanner.close();
    }
}