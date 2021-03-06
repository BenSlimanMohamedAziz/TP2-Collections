package Pile;

import java.util.List;
import java.util.ArrayList;

public class CPile<A> implements IPile {
	
	public ArrayList <A> Pile;
	
	CPile()
	{
		Pile = new ArrayList<>();
	}
	
	@Override
	public boolean estVide() {
		return Pile.isEmpty();
	}

	@Override
	public Object depile() {
		if (!estVide())
			Pile.remove(Pile.size() - 1);
		return Pile;
	}

	@Override
	public int nbElements() {
		return Pile.size();
	}

	@Override
	public Object sommet() {
		if (!estVide())
			return Pile.get(Pile.size() - 1);
		return -1;
	}

	@Override
	public void empile(Object a) {
		Pile.add((A) a);
		
	}
	@Override
	public String toString()
	{
		return Pile.toString();
	}

}
