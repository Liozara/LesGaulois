package personnages;

public class Chaudron {
	public int quantitePotion;
	public int forcePotion;

	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public boolean resterPotion() {
		return quantitePotion > 0;
	}
	
	public int prendreLouche() {
		if (quantitePotion > 0) {
			quantitePotion -= 1;
		} else {
			forcePotion = 0;			
		}
		return forcePotion;
	}
	
	
}
