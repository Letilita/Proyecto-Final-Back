package com.ArgPrograma.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleEmail(String fromEmail,
                                String body,
                                String nombre) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setCc(fromEmail);
        message.setTo("leticia.portillo.r@gmail.com");
        message.setText(body);
        message.setSubject("Consulta de "+ nombre +" desde Portfolio");

        mailSender.send(message);
        System.out.println("Mail Send...");
    }

}
