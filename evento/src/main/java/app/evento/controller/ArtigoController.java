package app.evento.controller;

import app.evento.model.Artigo;
import app.evento.model.Volume;
import app.evento.repository.ArtigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArtigoController {

//    @Autowired
//    private ArtigoRepository artigoRepository;
//
//    @Autowired
//    private VolumeRepository volumeRepository;
//
//    @RequestMapping("/detalharVolume")
//    public ModelAndView listar(){
//        ModelAndView mv = new ModelAndView("detalharArtigo");
//        Iterable<Artigo> artigos = artigoRepository.findAll();
//        mv.addObject("artigos", artigos);
//        return mv;
//    }
//
//    @RequestMapping(value = "/artigo/criar", method = RequestMethod.GET)
//    public String formArtigo(){
//        return "artigo/criarArtigo";
//    }
//
//    @RequestMapping(value = "/{idVolume}", method = RequestMethod.POST)
//    public String criarArtigo(@PathVariable("idVolume") long idVolume, Artigo artigo){
//        Volume volume = volumeRepository.findById(idVolume);
//        artigo.setVolume(volume);
//        artigoRepository.save(artigo);
//        return "redirect:/{idVolume}" ;
//    }
//
//    @RequestMapping("/deletarArtigo")
//    public String deletarArtigo(@PathVariable ("idArtigo") long idArtigo ){
//        Artigo artigo = artigoRepository.findById(idArtigo);
//        artigoRepository.delete(artigo);
//        return "redirect:/home";
//    }
}
