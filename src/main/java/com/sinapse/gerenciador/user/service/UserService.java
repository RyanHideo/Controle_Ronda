package com.sinapse.gerenciador.user.service;

import com.sinapse.gerenciador.user.dto.UserResponseDTO;
import com.sinapse.gerenciador.user.model.User;
import com.sinapse.gerenciador.user.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
        {
        this.userRepository = userRepository;
    }

    //buscar por id
    public UserResponseDTO buscarPorId(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));

        return toResponseDTO(user);
    }

    private UserResponseDTO toResponseDTO(User user){
        if (user == null) return null;

        UserResponseDTO dto = new UserResponseDTO();
        dto.setLogin(user.getLogin());
        dto.setName(user.getName());
        dto.setStatus(user.getStatus());
        dto.setTelefone(user.getTelefone());
        return dto;
    }

    //Buscar por login
    public UserResponseDTO buscarPorLogin(String login) {
        User user = userRepository.findByLogin(login)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));

        return toResponseDTO(user);
    }
}
