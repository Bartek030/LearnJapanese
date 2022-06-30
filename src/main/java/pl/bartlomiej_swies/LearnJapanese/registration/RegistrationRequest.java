package pl.bartlomiej_swies.LearnJapanese.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
class RegistrationRequest {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
