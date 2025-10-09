package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}

	public int getForcePotion() {
		return forcePotion;
	}

	public int getQuantitePotion() {
		return quantitePotion;
	}

	public boolean resterPotion() {
		return quantitePotion > 0;
	}

	public int prendreLouche() {
		if (quantitePotion > 0) {
			quantitePotion--;
		} else {
			forcePotion = 0;
		}
		return forcePotion;
	}

}
