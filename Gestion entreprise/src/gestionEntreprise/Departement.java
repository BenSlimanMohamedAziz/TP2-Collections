package gestionEntreprise;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
private int idDep;
private int Capacity;
Set <employe> LEmployes;

public Departement(int idDep, int capacity) {
	super();
	this.idDep = idDep;
	Capacity = capacity;
	LEmployes = new HashSet <employe>();
}

public int getIdDep() {
	return idDep;
}

public void setIdDep(int idDep) {
	this.idDep = idDep;
}

public int getCapacity() {
	return Capacity;
}

public void setCapacity(int capacity) {
	Capacity = capacity;
}

 public void ajoutEmploye(employe E) {
	 if(E.getCin()>0) {
	 LEmployes.add(E);
	 }
	 else {
		 System.out.println("Cin doit etre superieure a 0");
	 }
 }
public void retirerEmploye(employe E) {
	 LEmployes.remove(E);
}

@Override
public String toString() {
	return "Departement [idDep=" + idDep + ", Capacity=" + Capacity + ", LEmployes=" + LEmployes + "]";
}

public void afficheDep() {
Iterator<employe> iterator=LEmployes.iterator();
while(iterator.hasNext()) {
	System.out.print(iterator.next()+"\n");
}
}

public boolean existeE(int cin) {
	if(LEmployes.equals(cin)){
		return true;
	}
	else {
		return false;
	}
}


public employe getEmpSalMax() {	
	//System.out.println("avant trie: "+ LEmployes);
	TreeSet<employe> TS=new TreeSet<>(LEmployes);
	System.out.println("Liste Triee : ");
	Iterator<employe> iterator=TS.iterator();
	while(iterator.hasNext()) {
		System.out.print(iterator.next()+"\n");
	}
	System.out.println("\nEmploye a Salaire Max est : ");
    return TS.last(); 

    }
}

