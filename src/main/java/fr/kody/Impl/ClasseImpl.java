package fr.kody.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.kody.Entity.Classe;
import fr.kody.Repository.IClasseRepository;
import fr.kody.Service.IClasseService;

@Service
public class ClasseImpl implements IClasseService {
	
	
	@Autowired
	public IClasseRepository classeRepository;

	@Override
	public void ajouterClasse(Classe classe) {
		classeRepository.save(classe);

	}

	@Override
	public List<Classe> listerClasse() {
		List<Classe> classe = classeRepository.findAll();
		return classe;
	}

	@Override
	public List<Classe> listerClasseLibelle(String libelle) {
		List<Classe> classe = classeRepository.findByLibelle(libelle);
		return classe;
	}

	@Override
	public void modifierClasse(Classe classe) {
		classeRepository.save(classe);

	}

	@Override
	public Boolean deleteClasse(String libelle) {
	classeRepository.deleteClasse(libelle);
	boolean reponse = true;
		return reponse;

	}

}
