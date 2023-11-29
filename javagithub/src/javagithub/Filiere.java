package javagithub;

import java.util.List;

public class Filiere {
	    private String intitule;
	    private Enseignant responsable;
	    private Departement departement;
	    private List<Module> modules;
	    
		public Filiere(String intitule, Enseignant responsable, Departement departement, List<Module> modules) {
			super();
			this.intitule = intitule;
			this.responsable = responsable;
			this.departement = departement;
			this.modules = modules;
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
		public Departement getDepartement() {
			return departement;
		}
		public void setDepartement(Departement departement) {
			this.departement = departement;
		}
		public List<Module> getModules() {
			return modules;
		}
		public void setModules(List<Module> modules) {
			this.modules = modules;
		}

	    
	}
