package mk.ukim.finki.wp.lab.repository.jpa;

<<<<<<< HEAD
public interface SongRepositoryJpa {
=======
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepositoryJpa extends JpaRepository<Song, Long> {
    List<Song> findAllByAlbum_Id(Long albumId);
>>>>>>> ebf3e29d4067150ef8e40811429144f9a698769a
}
