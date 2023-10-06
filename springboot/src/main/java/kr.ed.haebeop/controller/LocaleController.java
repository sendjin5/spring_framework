package kr.ed.haebeop.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

@Controller
@RequestMapping("/locale")
public class LocaleController {
//    private static final Logger logger = LoggerFactory.getLogger(LocaleController.class);

    @Autowired
    SessionLocaleResolver localeResolver;

    @Autowired
    MessageSource messageSource;

    @RequestMapping("/locale/lang1")
    public String callLocale(Locale locale, HttpServletRequest request, Model model) {
//        logger.info("Session locale is {}", localeResolver.resolveLocale(request));
        return "/locale/localeTest";
    }


    @RequestMapping("/locale/lang2")
    public String callLocale2(@RequestParam("lang") String language, HttpServletRequest request, HttpServletResponse response) {
       Locale locale = new Locale(language);
        LocaleResolver.setLocale(request, response, locale);
//        logger.info("Session locale is {}", localeResolver.resolveLocale(request));
        return "/locale/localeTest";
    }
}
