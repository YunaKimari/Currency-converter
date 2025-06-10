package com.conversor;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;

public class TaxasDeCambio {

    public static Map<String, Double> buscarTaxas(String moedaOrigem, List<String> moedasDestino){
        try {
            String apiKey = "P1ODbhtOb13XLEjzrK2grOHoec7Idkay";
            String symbols = String.join(",", moedasDestino);
            String urlString = "https://api.apilayer.com/exchangerates_data/latest?base=" + moedaOrigem + "&symbols=" + symbols + "&apikey=" + apiKey;

            URL url = new URL(urlString);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            InputStreamReader leitor = new InputStreamReader(conexao.getInputStream());
            Gson gson = new Gson();

            RespostaCambio resposta = gson.fromJson(leitor, RespostaCambio.class);
            return resposta.rates;

        } catch (Exception e) {
            System.out.println("Erro ao buscar taxas: " + e.getMessage());
            return null;
        }
    }
}