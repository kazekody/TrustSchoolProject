package fr.kody.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.kody.Entity.Eleve;
import fr.kody.Repository.IEleveRepository;
import fr.kody.Service.IEleveService;

@Service
public class EleveImpl implements IEleveService {

	
	@Autowired
	public IEleveRepository eleveRepository;
	
	@Override
	public void ajouterEleve(Eleve eleve) {
		eleveRepository.save(eleve);

	}

	@Override
	public List<Eleve> listerClasse() {
		List<Eleve> eleve = eleveRepository.findAll();
		return eleve;
	}

	@Override
	public List<Eleve> listerEleveNom(String nom) {
		List<Eleve> eleve = eleveRepository.findByNom(nom);
		return eleve;
	}

	@Override
	public void modifierEleve(Eleve eleve) {
		eleveRepository.save(eleve);

	}

	@Override
	public void deleteEleve(String nom) {
		eleveRepository.deleteEleve(nom);

	}

}
