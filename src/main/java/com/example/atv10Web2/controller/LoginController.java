/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.atv10Web2.controller;

import com.example.atv10Web2.model.PessoaFisica;
import javax.transaction.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author joaoh
 */
@Transactional
@Controller
public class LoginController {

    @GetMapping("/login")
    public String form() {
        return "autenticacao/login";
    }
    
}
