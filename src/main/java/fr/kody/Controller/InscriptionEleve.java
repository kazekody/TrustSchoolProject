package fr.kody.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.kody.Entity.Classe;
import fr.kody.Entity.Eleve;
import fr.kody.Service.IEleveService;
import fr.kody.Tools.Response;

@CrossOrigin
@RestController
@RequestMapping("/InscriptionEleve")
public class InscriptionEleve {
	
	@Autowired
	private IEleveService eleveService;
	
	@CrossOrigin
	@PostMapping("/enregistrement/{nom}/{prenom}/{date_naissance}/{lieu_naissance}/{nomPere}/{nomMere}/{professionPere}/{professionMere}/{telephonePere}/{telephoneMere}/{motifDeplacement}/{classe}")
	public Response EnregistrementEleve(@PathVariable ("nom")String nom, @PathVariable("prenom")String prenom,
			@PathVariable("date_naissance")Date date_naissance, @PathVariable("lieu_naissance")String lieu_naissance,
			@PathVariable("nomPere")String nomPere, @PathVariable("nomMere")String nomMere, @PathVariable("professionPere")String professionPere,
			@PathVariable("professionMere")String professionMere, @PathVariable("telephonePere")String telephonePere, @PathVariable("telephoneMere")String telephoneMere, @PathVariable("motifDeplacement")String motifDeplacement,
			@RequestBody Classe classe){
		
		Response reponse = new Response();
		Eleve eleve = new Eleve();
		eleve.setNom(nom);
		eleve.setPrenom(prenom);
		eleve.setLieu_naissance(lieu_naissance);
		eleve.setDate_naissance(date_naissance);
		eleve.setNomPere(nomPere);
		eleve.setNomMere(nomMere);
		eleve.setProfessionPere(professionPere);
		eleve.setProfessionMere(professionMere);
		eleve.setTelephonePere(telephonePere);
		eleve.setTelephoneMere(telephoneMere);
		eleve.setMotifDeplacement(motifDeplacement);
		eleve.setClasse(classe);
		reponse.setReturnValue(eleve);
		eleveService.ajouterEleve(eleve);
		
		return reponse;
	}

}
