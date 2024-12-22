package mk.ukim.finki.wp.lab.repository.jpa;

<<<<<<< HEAD
public interface ArtistRepositoryJpa extends Jpa{
=======
import mk.ukim.finki.wp.lab.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepositoryJpa extends JpaRepository<Artist, Long> {
>>>>>>> ebf3e29d4067150ef8e40811429144f9a698769a
}
