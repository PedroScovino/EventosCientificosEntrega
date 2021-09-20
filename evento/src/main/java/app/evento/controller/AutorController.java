package app.evento.controller;

import app.evento.repository.ArtigoRepository;
import app.evento.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AutorController {
//
//    @Autowired
//    private AutorRepository autorRepository;
//
//    @Autowired
//    private ArtigoRepository artigoRepository;
//
//    @RequestMapping("/detalharArtigo")
//    public ModelAndView listar(){
//        ModelAndView mv = new ModelAndView("detalharAutor");
//        Iterable<Autor> autores = autorRepository.findAll();
//        mv.addObject("autor", autores);
//        return mv;
//    }
//
//    @RequestMapping(value = "/autor/criar", method = RequestMethod.GET)
//    public String formAutor(){
//        return "autor/criarAutor";
//    }
//
//    @RequestMapping(value = "/{idArtigo}", method = RequestMethod.POST)
//    public String criarAutor(@PathVariable("idArtigo") long idArtigo, Autor autor){
//        Artigo artigo = artigoRepository.findById(idArtigo);
//        autor.setArtigo(artigo);
//        autorRepository.save(autor);
//        return "redirect:/{idArtigo}" ;
//    }
//
//    @RequestMapping("/deletarAutor")
//    public String deletarAutor(@PathVariable ("idAutor") long idAutor ){
//        Autor autor = autorRepository.findById(idAutor);
//        autorRepository.delete(autor);
//        return "redirect:/home";
//    }
}
