package br.com.api.dto;

import java.math.BigDecimal;

public record MoedaDto(BigDecimal conversion_rate, String time_last_update_utc, double conversion_result) {
    
}
