package br.com.api.conversor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

import br.com.api.dto.MoedaDto;
import br.com.api.model.Moeda;
import br.com.api.model.MoedaEnum;
import io.github.cdimascio.dotenv.Dotenv;

public class ConversorDeMoeda {
    private MoedaEnum moedaEnum;
    Dotenv dotenv = Dotenv.load();
    String KEY = dotenv.get("KEY");
    Gson gson = new Gson();
    Moeda moeda = new Moeda();

    public Moeda converterMoeda(MoedaEnum baseCode, MoedaEnum targetCode, double amount) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(
                        "https://v6.exchangerate-api.com/v6/" + KEY + "/pair/" + baseCode + "/" + targetCode + "/" + amount))
                .build();
        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            String json = response.body();
            MoedaDto moedaDto = gson.fromJson(json, MoedaDto.class);
            Moeda moeda = new Moeda(moedaDto);
            return moeda;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MoedaEnum getMoeda() {
        return moedaEnum;
    }

    public void setMoeda(MoedaEnum moeda) {
        this.moedaEnum = moeda;
    }
}
