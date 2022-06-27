package pl.bartlomiej_swies.LearnJapanese.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.bartlomiej_swies.LearnJapanese.appUser.AppUser;
import pl.bartlomiej_swies.LearnJapanese.appUser.AppUserRole;
import pl.bartlomiej_swies.LearnJapanese.appUser.AppUserService;

@Service
@AllArgsConstructor
class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;

    String register(final RegistrationRequest request) {
        final boolean isEmailValid = emailValidator.test(request.getEmail());

        if (!isEmailValid) {
            throw new IllegalStateException("email not valid");
        }
        return appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }
}
