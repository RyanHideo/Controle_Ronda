package com.sinapse.gerenciador.pontoNfc.dto;

import com.sinapse.gerenciador.pontoNfc.model.StatusPontoNfc;

public class PontoNfcResponseDTO {

    private Long id;
    private String codigoNfc;
    private String nome;
    private Double latitude;
    private Double longitude;
    private Double raioPermitido;
    private StatusPontoNfc status;


    // getters e setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoNfc() {
        return codigoNfc;
    }

    public void setCodigoNfc(String codigoNfc) {
        this.codigoNfc = codigoNfc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Double getRaioPermitido() {
        return raioPermitido;
    }

    public void setRaioPermitido(Double raioPermitido) {
        this.raioPermitido = raioPermitido;
    }

    public StatusPontoNfc getStatus() {
        return status;
    }

    public void setStatus(StatusPontoNfc status) {
        this.status = status;
    }
}
