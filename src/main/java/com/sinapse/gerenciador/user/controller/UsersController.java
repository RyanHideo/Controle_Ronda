package com.sinapse.gerenciador.user.controller;

import com.sinapse.gerenciador.user.dto.UserResponseDTO;
import com.sinapse.gerenciador.user.model.User;
import com.sinapse.gerenciador.user.repository.UserRepository;
import com.sinapse.gerenciador.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsersController {

    private  final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.buscarPorId(id));
    }

    @GetMapping("/login")
    public ResponseEntity<UserResponseDTO> getUserByLogin(@PathVariable String login){
        return ResponseEntity.ok(userService.buscarPorLogin(login));
    }



}
