package com.sinapse.gerenciador.leitura.model;

import com.sinapse.gerenciador.pontoNfc.model.PontoNfc;
import com.sinapse.gerenciador.user.model.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "leituras")
public class Leituras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private User usuario;
    @ManyToOne
    @JoinColumn(name = "ponto_nfc_id", nullable = false)
    private PontoNfc pontoNfc;
    @Column(name = "codigo_nfc_lido",nullable = false)
    private String codigoNfcLido;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "precisao")
    private Double precisao;
    @Column(name = "hora_aparelho",nullable = false)
    private LocalDateTime horaAparelho;
    @Column(name = "hora_servidor",nullable = false)
    private LocalDateTime horaServidor;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusLeitura status;

    // Construtores

    public Leituras() {
    }

    public Leituras(User usuario, PontoNfc pontoNfc, String codigoNfcLido, Double latitude, Double longitude, Double precisao, LocalDateTime horaAparelho, LocalDateTime horaServidor, StatusLeitura status) {
        this.usuario = usuario;
        this.pontoNfc = pontoNfc;
        this.codigoNfcLido = codigoNfcLido;
        this.latitude = latitude;
        this.longitude = longitude;
        this.precisao = precisao;
        this.horaAparelho = horaAparelho;
        this.horaServidor = horaServidor;
        this.status = status;
    }

    // Getters e Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public PontoNfc getPontoNfc() {
        return pontoNfc;
    }

    public void setPontoNfc(PontoNfc pontoNfc) {
        this.pontoNfc = pontoNfc;
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

    public LocalDateTime getHoraServidor() {
        return horaServidor;
    }

    public void setHoraServidor(LocalDateTime horaServidor) {
        this.horaServidor = horaServidor;
    }


    public StatusLeitura getStatus() {
        return status;
    }

    public void setStatus(StatusLeitura status) {
        this.status = status;
    }
}
