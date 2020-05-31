package fr.kody.Service;

import java.util.List;

import fr.kody.Entity.Eleve;

public interface IEleveService {

	
	public void ajouterEleve(Eleve eleve);
	
	public  List<Eleve> listerClasse();
	
	public  List<Eleve> listerEleveNom(String nom);
	
	public  void modifierEleve(Eleve eleve);

	public  void deleteEleve(String nom);
}
