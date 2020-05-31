package fr.kody.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import fr.kody.Entity.Eleve;

@Repository
public interface IEleveRepository extends JpaRepository<Eleve, Long> {
	
	List<Eleve> findByNom(String nom);
	
	@Modifying
	@Transactional
	@Query(value = "delete from Eleve eleve where eleve.nom=:nom")
	void deleteEleve(@Param("nom")String nom);

}
