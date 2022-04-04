package Pile;

public interface IPile <A> {
boolean estVide();
void empile(A a);
A depile(); // retourne l'�l�ment en sommet de pile et d�pile
int nbElements();
A sommet(); // retourne le sommet de pile mais ne le d�pile pas
}