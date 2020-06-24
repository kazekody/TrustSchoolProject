package fr.kody.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Classe")
public class Classe implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idClasse", unique = true, updatable = false, nullable = false)
    private long IDClasse;
	
	@Column(name = "Libelle")
    private String libelle;
	
	@Column(name = "Filiere")
    private String filiere;
	
	@Column(name = "Niveau")
    private String niveau;
	
	 @OneToMany(mappedBy = "classe", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	    private List<Eleve> eleve;

    public  Classe(){

    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;

    }

    public long getIDClasse() {
        return IDClasse;
    }

    public String getFiliere() {
        return filiere;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public void setIDClasse(long IDClasse) {
        this.IDClasse = IDClasse;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (IDClasse ^ (IDClasse >>> 32));
		result = prime * result + ((filiere == null) ? 0 : filiere.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + ((niveau == null) ? 0 : niveau.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Classe other = (Classe) obj;
		if (IDClasse != other.IDClasse)
			return false;
		if (filiere == null) {
			if (other.filiere != null)
				return false;
		} else if (!filiere.equals(other.filiere))
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (niveau == null) {
			if (other.niveau != null)
				return false;
		} else if (!niveau.equals(other.niveau))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Classe [IDClasse=" + IDClasse + ", libelle=" + libelle + ", filiere=" + filiere + ", niveau=" + niveau
				+ "]";
	}
    
    
}
