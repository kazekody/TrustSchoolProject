package fr.kody.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Eleve")
public class Eleve implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id", unique = true, updatable = false, nullable = false)
	private long id;
	
	@Column(name = "Nom", nullable = false)
	 private String nom;
	
	@Column(name = "Prenom", nullable = false)
	    private String prenom;
	
	@Column(name = "Date_Naissance", nullable = false)
	    private Date date_naissance;
	
	@Column(name = "Lieu_Naissance", nullable = false)
	    private String lieu_naissance;
	
	@Column(name = "Nom_Pere", nullable = false)
	private String nomPere;
	
	@Column(name = "Nom_Mere", nullable = false)
	private String nomMere;
	
	@Column(name = "Profession_Pere", nullable = false)
	private String professionPere;
	
	@Column(name = "Profession_Mere", nullable = false)
	private String professionMere;
	
	@Column(name = "Tel_Pere", nullable = false)
	private String telephonePere;
	
	@Column(name = "Tel_Mere", nullable = false)
	private String telephoneMere;
	
	@Column(name = "Comment", nullable = false)
	private String motifDeplacement;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="idClasse", nullable=false)
    private Classe classe;

	public String getNomPere() {
		return nomPere;
	}

	public void setNomPere(String nomPere) {
		this.nomPere = nomPere;
	}

	public String getNomMere() {
		return nomMere;
	}

	public void setNomMere(String nomMere) {
		this.nomMere = nomMere;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfessionPere() {
		return professionPere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getLieu_naissance() {
		return lieu_naissance;
	}

	public void setLieu_naissance(String lieu_naissance) {
		this.lieu_naissance = lieu_naissance;
	}

	public void setProfessionPere(String professionPere) {
		this.professionPere = professionPere;
	}

	public String getProfessionMere() {
		return professionMere;
	}

	public void setProfessionMere(String professionMere) {
		this.professionMere = professionMere;
	}

	public String getTelephonePere() {
		return telephonePere;
	}

	public void setTelephonePere(String telephonePere) {
		this.telephonePere = telephonePere;
	}

	public String getTelephoneMere() {
		return telephoneMere;
	}

	public void setTelephoneMere(String telephoneMere) {
		this.telephoneMere = telephoneMere;
	}

	public String getMotifDeplacement() {
		return motifDeplacement;
	}

	public void setMotifDeplacement(String motifDeplacement) {
		this.motifDeplacement = motifDeplacement;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}


	@Override
	public String toString() {
		return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", date_naissance=" + date_naissance
				+ ", lieu_naissance=" + lieu_naissance + ", nomPere=" + nomPere + ", nomMere=" + nomMere
				+ ", professionPere=" + professionPere + ", professionMere=" + professionMere + ", telephonePere="
				+ telephonePere + ", telephoneMere=" + telephoneMere + ", motifDeplacement=" + motifDeplacement
				+ ", classe=" + classe + "]";
	}

    
    
}
