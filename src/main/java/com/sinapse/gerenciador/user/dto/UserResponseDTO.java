package com.sinapse.gerenciador.user.dto;

import com.sinapse.gerenciador.user.model.StatusUsuario;

public class UserResponseDTO {
    private String name;
    private String login;
    private String telefone;
    private StatusUsuario status;

    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public StatusUsuario getStatus() {
        return status;
    }

    public void setStatus(StatusUsuario status) {
        this.status = status;
    }
}
