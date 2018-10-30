package cl.hfierroprog.emailRestApi.EmailRestApi.service.impl;

import cl.hfierroprog.emailRestApi.EmailRestApi.model.Email;
import cl.hfierroprog.emailRestApi.EmailRestApi.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailServiceImpl implements cl.hfierroprog.emailRestApi.EmailRestApi.service.EmailService {

    @Autowired
    public JavaMailSender emailSender;

    @Override
    public Response sendEmail(Email mail) {

        Response response = new Response();
        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(mail.getTo());
            message.setSubject(mail.getSubject());
            message.setText(mail.getText());

            emailSender.send(message);

            response.setCode(0);
            response.setMessage("Email send ok!");
        } catch (Exception ex) {
            response.setCode(1);
            response.setMessage("Error sending email: " + ex.getMessage());
        }

        return response;
    }
}
