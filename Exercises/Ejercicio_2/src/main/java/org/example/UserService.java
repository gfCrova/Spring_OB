package org.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService notiService;

    public UserService(NotificationService notiService) {
        this.notiService = notiService;
    }
}
