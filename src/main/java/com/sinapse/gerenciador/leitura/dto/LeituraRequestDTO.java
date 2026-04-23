package com.sinapse.gerenciador.leitura.dto;

import com.sinapse.gerenciador.leitura.model.StatusLeitura;

import java.time.LocalDateTime;

public class LeituraRequestDTO {

    private Long usuarioId;
    private Long pontoNfcId;
    private String codigoNfcLido;
    private Double latitude;
    private Double longitude;
    private Double precisao;
    private LocalDateTime horaAparelho;
    private StatusLeitura status;

    // Getters e Setters


    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getPontoNfcId() {
        return pontoNfcId;
    }

    public void setPontoNfcId(Long pontoNfcId) {
        this.pontoNfcId = pontoNfcId;
    }

    public String getCodigoNfcLido() {
        return codigoNfcLido;
    }

    public void setCodigoNfcLido(String codigoNfcLido) {
        this.codigoNfcLido = codigoNfcLido;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getPrecisao() {
        return precisao;
    }

    public void setPrecisao(Double precisao) {
        this.precisao = precisao;
    }

    public LocalDateTime getHoraAparelho() {
        return horaAparelho;
    }

    public void setHoraAparelho(LocalDateTime horaAparelho) {
        this.horaAparelho = horaAparelho;
    }


    public StatusLeitura getStatus() {
        return  status;
    }

    public void setStatus(StatusLeitura status) {
        this.status = status;
    }
}
