package pl.bartlomiej_swies.LearnJapanese.appUser;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
@Repository
interface AppUserRepository {

    Optional<AppUser> findByEmail(final String email);
}
