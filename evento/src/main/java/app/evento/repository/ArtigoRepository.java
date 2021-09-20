package app.evento.repository;

import app.evento.model.Artigo;
import app.evento.model.Volume;
import org.springframework.data.repository.CrudRepository;

public interface ArtigoRepository extends CrudRepository<Artigo, Long> {
    Iterable<Artigo> findByVolume(Volume volume);
    Artigo findById(long idArtigo);
}
