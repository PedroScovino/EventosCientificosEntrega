package app.evento.repository;

import app.evento.model.Volume;
import org.springframework.data.repository.CrudRepository;

public interface VolumeRepository extends CrudRepository<Volume, Long> {
    Volume findById(long idVolume);
}
