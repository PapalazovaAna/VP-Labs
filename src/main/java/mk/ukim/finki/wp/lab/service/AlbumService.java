package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.exceptions.AlbumDoesNotExistException;

import java.util.List;

public interface AlbumService {
    List<Album> findAll();
    Album findById(Long id) throws AlbumDoesNotExistException;
}
