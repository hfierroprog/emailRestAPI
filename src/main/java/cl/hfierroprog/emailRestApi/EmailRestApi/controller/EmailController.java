package cl.hfierroprog.emailRestApi.EmailRestApi.controller;

import cl.hfierroprog.emailRestApi.EmailRestApi.model.Email;
import cl.hfierroprog.emailRestApi.EmailRestApi.model.Response;
import cl.hfierroprog.emailRestApi.EmailRestApi.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendMailSimple")
    public Response sendMailSimple(@RequestBody Email mail) {
        return emailService.sendEmail(mail);
    }
}
