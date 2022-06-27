package pl.bartlomiej_swies.LearnJapanese.registration;

import org.springframework.stereotype.Service;

@Service
class RegistrationService {
    String register(final RegistrationRequest request) {
        return "It works";
    }
}
