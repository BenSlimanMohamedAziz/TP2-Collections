package gestionEntreprise;

public class test {

	public static void main(String[] args) {

		employe e=new employe(1,"aziz",1500,5);
		employe e2=new employe(2,"ahmed",1200,10);
		employe e3=new employe(3,"mounir",1600,15);
		
		Departement d=new Departement(10,150);
		
		d.ajoutEmploye(e);
		d.ajoutEmploye(e2);
		d.ajoutEmploye(e3);
		
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
	    
	}

}
