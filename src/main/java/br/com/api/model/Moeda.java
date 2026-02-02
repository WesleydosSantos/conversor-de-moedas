package br.com.api.model;

import java.math.BigDecimal;

import br.com.api.dto.MoedaDto;

public class Moeda {

    private BigDecimal taxaDeConversao;
    private String tempo;
    private double resultadoConversao;

    public Moeda(MoedaDto moedaDto) {
        this.taxaDeConversao = moedaDto.conversion_rate();
        this.tempo = moedaDto.time_last_update_utc();
        this.resultadoConversao = moedaDto.conversion_result();
    }

    public Moeda() {
    }

    public double getResultadoConversao() {
        return resultadoConversao;
    }

    public void setResultadoConversao(double resultadoConversao) {
        this.resultadoConversao = resultadoConversao;
    }

    public BigDecimal getTaxaDeConversao() {
        return taxaDeConversao;
    }

    public void setTaxaDeConversao(BigDecimal taxaDeConversao) {
        this.taxaDeConversao = taxaDeConversao;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Moeda [taxaDeConversao=" + taxaDeConversao + ", tempo=" + tempo + "]";
    }
}
