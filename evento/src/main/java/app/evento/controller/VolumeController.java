package app.evento.controller;

import app.evento.model.Artigo;
import app.evento.model.Volume;
import app.evento.repository.ArtigoRepository;
import app.evento.repository.VolumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VolumeController {

    @Autowired
    private VolumeRepository volumeRepository;

    @Autowired
    private ArtigoRepository artigoRepository;

    @RequestMapping(value = "/volume/criar", method = RequestMethod.GET)
    public String formVolume(){
        return "volume/criarVolume";
    }

    @RequestMapping(value = "/volume/criar", method = RequestMethod.POST)
    public String criar(Volume volume){
        volumeRepository.save(volume);
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Volume> volumes = volumeRepository.findAll();
        mv.addObject("volumes", volumes);
        return mv;
    }

    @RequestMapping(value = "/{idVolume}", method = RequestMethod.GET)
    public ModelAndView detalharVolume(@PathVariable("idVolume") long idVolume){
        Volume volume = volumeRepository.findById(idVolume);
        ModelAndView mv = new ModelAndView("volume/detalharVolume");
        mv.addObject("volume", volume);

        return mv;
    }

    @RequestMapping(value = "/deletar")
    public String deletarVolume(long idVolume){
        Volume volume = volumeRepository.findById(idVolume);
        volumeRepository.delete(volume);
        return "redirect:/home";
    }

    @RequestMapping(value = "/volume/atualizar", method = RequestMethod.GET)
    public String formEditar(){
        return "volume/editarVolume";
    }

    @RequestMapping(value = "/volume/atualizar", method = RequestMethod.POST)
    public String editar(Volume volume){
        volumeRepository.save(volume);
        return "redirect:/home";
    }
}
