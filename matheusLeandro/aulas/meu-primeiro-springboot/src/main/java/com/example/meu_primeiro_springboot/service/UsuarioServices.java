package com.example.meu_primeiro_springboot.service;

import com.example.meu_primeiro_springboot.model.UsuarioModel;
import com.example.meu_primeiro_springboot.repository.UsuarioRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServices {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioServices(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public UsuarioModel registrarUsuario(String username, String password) {
        String senhaCriptografada = passwordEncoder.encode(password);
        UsuarioModel usuario = new UsuarioModel(username, senhaCriptografada);
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> buscarPorUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

}
