package com.example.AtividadeClienteServidor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    @Bean
    public double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
}
