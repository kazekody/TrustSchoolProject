package fr.kody.Service;

import java.util.List;

import fr.kody.Entity.Classe;


public interface IClasseService {
	
	public void ajouterClasse(Classe classe);
	
	public  List<Classe> listerClasse();
	
	public  List<Classe> listerClasseLibelle(String libelle);
	
	public  void modifierClasse(Classe classe);

	public  void deleteClasse(String libelle);

}
