package pl.tfalkowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tfalkowski.model.Letter;

@Repository
public interface LetterRepository extends JpaRepository<Letter, Long> {

}
