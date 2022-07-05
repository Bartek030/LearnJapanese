package pl.bartlomiej_swies.LearnJapanese.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
class EmailValidator implements Predicate<String> {

    private final static String EMAIL_REGEX_PATTERN = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    @Override
    public boolean test(final String s) {

        Pattern pattern = Pattern.compile(EMAIL_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(s);

        return matcher.find();
    }
}
