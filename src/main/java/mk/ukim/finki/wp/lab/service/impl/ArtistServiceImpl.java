package mk.ukim.finki.wp.lab.service.impl;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.exceptions.ArtistDoesNotExistException;
<<<<<<< HEAD
import mk.ukim.finki.wp.lab.repository.inmemory.ArtistRepository;
=======
import mk.ukim.finki.wp.lab.repository.jpa.ArtistRepositoryJpa;
>>>>>>> ebf3e29d4067150ef8e40811429144f9a698769a
import mk.ukim.finki.wp.lab.service.ArtistService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {
<<<<<<< HEAD
    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
=======
    private final ArtistRepositoryJpa artistRepository;

    public ArtistServiceImpl(ArtistRepositoryJpa artistRepository) {
>>>>>>> ebf3e29d4067150ef8e40811429144f9a698769a
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> listArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Artist findById(Long id) throws ArtistDoesNotExistException {
        return artistRepository.findById(id).orElseThrow(() -> new ArtistDoesNotExistException(id));
    }

//    @Override
//    public Song addSongToArtist(Artist artist, Song song) {
//        return artistRepository.addSongToArtist(artist, song);
//    }
}
