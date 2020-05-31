package fr.kody.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.kody.Entity.Classe;
import fr.kody.Service.IClasseService;
import fr.kody.Tools.Response;

@CrossOrigin
@RestController
@RequestMapping("/InscriptionClasse")
public class InscriptionClasse {
	
	@Autowired
	private IClasseService classeService;
	
	@CrossOrigin
	@PostMapping("/enregistrement/{libelle}/{filiere}/{niveau}")
	public Response EnregistrementClasse(@PathVariable("libelle")String libelle, @PathVariable("filiere")String filiere,
			@PathVariable("niveau")String niveau) {
		Response reponse = new Response();
		Classe classe = new Classe();
		classe.setFiliere(filiere);
		classe.setLibelle(libelle);
		classe.setNiveau(niveau);
		classeService.ajouterClasse(classe);
		reponse.setReturnValue(classe);
		
		return reponse;
		
	}
	
	@CrossOrigin
	@GetMapping("/listerClasse")
	public Response listerClasse() {
		Response reponse = new Response();
		List<Classe> listClasse = classeService.listerClasse();
		reponse.setReturnValue(listClasse);
		return reponse;
	}

}
