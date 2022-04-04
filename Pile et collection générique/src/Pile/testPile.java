package Pile;

public class testPile {

	public static void main(String[] args)
	{
		CPile p = new CPile();
		int i = 1;
		while (i <= 10)
			p.empile(new Integer(i++));
		System.out.print("Pile => ");
		System.out.println(p);
		System.out.print("Nombre elements Pile =  ");
		System.out.println(p.nbElements());
		System.out.println("Depile :");
		while (!p.estVide())
		{
			System.out.println(p.sommet());
			p.depile();
		}
	}

}
