package mk.ukim.finki.wp.lab.repository.jpa;

import mk.ukim.finki.wp.lab.model.Album;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepositoryJpa extends JpaRepository<Album, Long>{
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepositoryJpa extends JpaRepository<Album, Long> {
>>>>>>> ebf3e29d4067150ef8e40811429144f9a698769a
}
