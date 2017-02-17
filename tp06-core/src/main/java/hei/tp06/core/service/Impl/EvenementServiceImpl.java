package hei.tp06.core.service.Impl;

import hei.tp06.core.dao.EvenementDAO;
import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class EvenementServiceImpl implements EvenementService {

    @Inject
    EvenementDAO evenementDAO;

    public Evenement findById(Long id) {
        return evenementDAO.findById(id);
    }

    public Evenement findByTitle(String title) {
        return evenementDAO.findByTitle(title);
    }

    public List<Evenement> findAll() {
        return evenementDAO.findAll();
    }

    public void save(Evenement event){
        evenementDAO.save(event);
    }

}
