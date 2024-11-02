package com.framework_desen_software.controller;

import com.framework_desen_software.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

    @Controller
    public class UserController {

        @GetMapping("/cadastro")
        public String showCadastroForm(Model model) {
            model.addAttribute("user", new User());
            return "register";
        }

        @PostMapping("/cadastro")
        public String processCadastro(@ModelAttribute("user") User user, Model model) {
            model.addAttribute("message", "Usuário cadastrado com sucesso!");
            return "register";
        }

}
