package com.sinapse.gerenciador.pontoNfc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ponto_nfc")
public class PontoNfc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "codigo_nfc", unique = true, nullable = false)
    private String codigoNfc;
    @Column(name = "nome", unique = true, nullable = false)
    private String nome;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "raiopermitido")
    private Double raioPermitido;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusPontoNfc status;
    // Construtores

    public PontoNfc() {
    }

    public PontoNfc(Long id, String codigoNfc, String nome, Double latitude, Double longitude, Double raioPermitido, StatusPontoNfc status) {
        this.id = id;
        this.codigoNfc = codigoNfc;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.raioPermitido = raioPermitido;
        this.status = status;
    }
    // Getters e Setters


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
