package hei.tp06.core.dao;

import hei.tp06.core.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EvenementDAO extends JpaRepository<Evenement, Long> {

    Evenement findById(Long id);

    Evenement findByTitle(String title);

    List<Evenement> findAll();

}