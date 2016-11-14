package ru.inn.avborg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Контроллер беззопасности. Основной функционал:
 *  - связь модели со страницей авторизации
 *  - связь модели со страницей регистрации
 *  - связь модели с основной страницей приложения
 */
@Controller
public class SecurityController {

    @RequestMapping(value = {"/", "/welcome"})
    public String welcome(Model model){

        return "welcome";
    }

}
