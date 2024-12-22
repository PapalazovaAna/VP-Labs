package mk.ukim.finki.wp.lab.service.impl;

import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.exceptions.AlbumDoesNotExistException;
<<<<<<< HEAD
import mk.ukim.finki.wp.lab.repository.inmemory.AlbumRepository;
=======
import mk.ukim.finki.wp.lab.repository.jpa.AlbumRepositoryJpa;
>>>>>>> ebf3e29d4067150ef8e40811429144f9a698769a
import mk.ukim.finki.wp.lab.service.AlbumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {
<<<<<<< HEAD
    private final AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
=======
    private final AlbumRepositoryJpa albumRepository;

    public AlbumServiceImpl(AlbumRepositoryJpa albumRepository) {
>>>>>>> ebf3e29d4067150ef8e40811429144f9a698769a
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    @Override
    public Album findById(Long id) throws AlbumDoesNotExistException {
        return albumRepository.findById(id).orElseThrow(() -> new AlbumDoesNotExistException(id));
    }


}
