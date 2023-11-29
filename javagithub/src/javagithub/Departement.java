package javagithub;

import java.util.List;

public class Departement {
	    private String intitule;
	    private Enseignant responsable;
	    private List<Filiere> filieres;
	    
		public Departement(String intitule, Enseignant responsable, List<Filiere> filieres) {
			super();
			this.intitule = intitule;
			this.responsable = responsable;
			this.filieres = filieres;
		}
		public String getIntitule() {
			return intitule;
		}
		public void setIntitule(String intitule) {
			this.intitule = intitule;
		}
		public Enseignant getResponsable() {
			return responsable;
		}
		public void setResponsable(Enseignant responsable) {
			this.responsable = responsable;
		}

	}
