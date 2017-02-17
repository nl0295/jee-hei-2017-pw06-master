package hei.tp06.core.service;

import hei.tp06.core.entity.Evenement;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public interface EvenementService {

    Evenement findById(Long id);

    Evenement findByTitle(String title);

    List<Evenement> findAll();

    void save(Evenement event);
}
