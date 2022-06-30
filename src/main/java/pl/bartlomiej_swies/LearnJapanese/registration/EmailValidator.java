package pl.bartlomiej_swies.LearnJapanese.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(final String s) {
        // TODO: Regex to validate email
        return true;
    }
}
