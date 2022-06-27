package pl.bartlomiej_swies.LearnJapanese.appUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
@Repository
interface AppUserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByEmail(final String email);
}
