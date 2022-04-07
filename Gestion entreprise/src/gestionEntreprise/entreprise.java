package gestionEntreprise;

import java.util.*;

public class entreprise {
	
private String nomEntreprise;
HashMap<Integer,Departement> Liste_Deps;

public entreprise (String n){
	nomEntreprise =n; 
	Liste_Deps = new HashMap <Integer ,Departement>();
}

public void ajoutDep(int idDep,Departement d) {
	Liste_Deps.put(d.getIdDep(),d);
		}

public void retirerDep(Departement d) {
	Liste_Deps.remove(d.getIdDep());
}

public void afficheE(int idDep) {
	System.out.println("Departement "+idDep+" :");
   for (Departement d : Liste_Deps.values()){
    d.afficheDep();
   }
}

public String getNomEntreprise() {
	return "\nNom Entreprise : "+nomEntreprise;
}

public void setNomEntreprise(String nomEntreprise) {
	this.nomEntreprise = nomEntreprise;
}

public void UpdateDep(employe E, int idDep) {
	Liste_Deps.get(E.getNumDep()).retirerEmploye(E);
	E.setNumDep(idDep);
	Liste_Deps.get(idDep).ajoutEmploye(E);
}

public boolean existeD(Departement d) {
	return Liste_Deps.containsKey(d.getIdDep());
}

public void DepMinCapacity() {
List <Departement> c = new ArrayList(Liste_Deps.values());
Collections.sort(c);
System.out.println(c.get(0));
}

public HashMap<Integer, Departement> getListe_Deps() {
	return Liste_Deps;
}

public void setListe_Deps(HashMap<Integer, Departement> liste_Deps) {
	Liste_Deps = liste_Deps;
}


}
