package cl.hfierroprog.emailRestApi.EmailRestApi.service;

import cl.hfierroprog.emailRestApi.EmailRestApi.model.Email;
import cl.hfierroprog.emailRestApi.EmailRestApi.model.Response;

public interface EmailService {
    Response sendEmail(Email mail);
}
