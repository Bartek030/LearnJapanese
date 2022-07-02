package pl.bartlomiej_swies.LearnJapanese.jwt;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
class UsernameAndPasswordAuthenticationRequest {

    private String username;
    private String password;
}
