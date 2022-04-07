package gestionEntreprise;

public class test {

	public static void main(String[] args) {

		employe e=new employe(1,"aziz",1500,10);
		employe e2=new employe(2,"ahmed",1200,10);
		employe e3=new employe(3,"mounir",1600,20);
		
		Departement d=new Departement(10,10);
		Departement d2=new Departement(20,250);
		
		d.ajoutEmploye(e);
		d.ajoutEmploye(e2);
		d2.ajoutEmploye(e3);
		
		//d.retirerEmploye(e3);
		
		System.out.println("Affichage liste");
	    d.afficheDep();
	    
	    int CIN=1;
		if(d.existeE(CIN)){
			System.out.println("\nCIN " + CIN + " Existe !");
		}
		else {
			System.out.println("\nCIN " + CIN + " N'Existe pas !");
		}
		
	    System.out.print("\n");
	    System.out.println(d.getEmpSalMax());
	    

	entreprise En=new entreprise("entrprise 1");
	
	En.ajoutDep(d.getIdDep(),d);
	System.out.println(En.getNomEntreprise());
	En.afficheE(d.getIdDep());
	En.ajoutDep(d2.getIdDep(),d2);
	En.afficheE(d2.getIdDep());
	En.retirerDep(d2);
	  
	  System.out.println("\nDepartement a Min Capacity :");
	  En.DepMinCapacity();
	  
	  
	}
}
