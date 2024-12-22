package mk.ukim.finki.wp.lab.service.impl;

import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.model.exceptions.AlbumDoesNotExistException;
import mk.ukim.finki.wp.lab.model.exceptions.SongDoesNotExistException;
import mk.ukim.finki.wp.lab.repository.inmemory.AlbumRepository;
import mk.ukim.finki.wp.lab.repository.inmemory.SongRepository;
import mk.ukim.finki.wp.lab.service.SongService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SongServiceImpl implements SongService {
    private final SongRepository songRepository;
    private final AlbumRepository albumRepository;

    public SongServiceImpl(SongRepository songRepository, AlbumRepository albumRepository) {
        this.songRepository = songRepository;
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public Artist addArtistToSong(Artist artist, Song song) {
        return songRepository.addArtistToSong(artist, song);
    }

    @Override
    public Song findByTrackId(String trackId) {
        return songRepository.findByTrackId(trackId).orElseThrow();
    }

    @Override
    public Song findById(Long id) throws SongDoesNotExistException {
        return songRepository.findById(id).orElseThrow(() -> new SongDoesNotExistException(id));
    }

    @Override
    public void deleteById(Long id){
        songRepository.deleteById(id);
    }

    @Override
    public void addSong(String title, String trackId, String genre, int releaseYear, Long albumId) throws AlbumDoesNotExistException {
        Album album = albumRepository.findById(albumId).orElseThrow(() -> new AlbumDoesNotExistException(albumId));
        songRepository.addSong(title, trackId, genre, releaseYear, Optional.ofNullable(album));
    }

    @Override
    public void editSong(Long songId, String title, String trackId, String genre, int releaseYear, Long albumId) throws SongDoesNotExistException, AlbumDoesNotExistException {
        Album album = albumRepository.findById(albumId).orElseThrow(() -> new AlbumDoesNotExistException(albumId));
        Song song = songRepository.findById(songId).orElseThrow(() -> new SongDoesNotExistException(songId));
        song.setTitle(title);
        song.setTrackId(trackId);
        song.setGenre(genre);
        song.setReleaseYear(releaseYear);
        song.setAlbum(Optional.ofNullable(album));
    }


}
