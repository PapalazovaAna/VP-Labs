package mk.ukim.finki.wp.lab.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import mk.ukim.finki.wp.lab.service.ArtistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/artist")
public class ArtistController {
    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    public String getArtistsPage(@RequestParam(required = false) String error, Model model){
        System.out.println("in artist get method");
        if (error != null && !error.isEmpty()){
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        model.addAttribute("artists", artistService.listArtists());
        return "artistsList";
    }

    @PostMapping
    public String showDetailsForSong(@RequestParam(required = false) Long artistId, HttpServletRequest req){
        System.out.println("in artist post method");
        if (artistId != null){
            req.getSession().setAttribute("artistId", artistId);
            return "redirect:/songDetails";
        }
        else{
            return "redirect:/artist";
        }
    }
}
