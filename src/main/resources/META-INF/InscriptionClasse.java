package fr.kody.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.kody.Entity.Classe;
import fr.kody.Service.IClasseService;

@CrossOrigin
@RestController
@RequestMapping("/InscriptionClasse")
public class InscriptionClasse {
	
	@Autowired
	private IClasseService classeService;
	
	@CrossOrigin
	@PostMapping("/enregistrement/{libelle}/{filiere}/{niveau}")
	public void EnregistrementClasse(@PathVariable("libelle")String libelle, @PathVariable("filiere")String filiere,
			@PathVariable("niveau")String niveau) {
		
		Classe classe = new Classe();
		classe.setFiliere(filiere);
		classe.setLibelle(libelle);
		classe.setNiveau(niveau);
		classeService.ajouterClasse(classe);
		
	}

}
