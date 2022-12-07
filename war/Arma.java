package war;


public abstract class Arma {
	
	//da aggiungere la precisione
	
	private String nome;
	private int danniTesta;
	private int danniCorpo;
	private int danniGambe;
	private int caricatore;
	private int capacitaCaricatore;
	
	
	public Arma(String nome, int danniTesta, int danniCorpo, int danniGambe, int caricatore) {
		this.nome = nome;
		this.danniTesta = danniTesta;
		this.danniCorpo = danniCorpo;
		this.danniGambe = danniGambe;
		this.caricatore = caricatore;
		this.capacitaCaricatore = caricatore;
	}
	
	public Arma() {
		
	}
	
	
	
	public int getCapacitaCaricatore() {
		return capacitaCaricatore;
	}

	public void setCapacitaCaricatore(int capacitaCaricatore) {
		this.capacitaCaricatore = capacitaCaricatore;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDanniTesta() {
		return danniTesta;
	}

	public void setDanniTesta(int danniTesta) {
		this.danniTesta = danniTesta;
	}

	public int getDanniCorpo() {
		return danniCorpo;
	}

	public void setDanniCorpo(int danniCorpo) {
		this.danniCorpo = danniCorpo;
	}

	public int getDanniGambe() {
		return danniGambe;
	}

	public void setDanniGambe(int danniGambe) {
		this.danniGambe = danniGambe;
	}


	public int getCaricatore() {
		return caricatore;
	}


	public void setCaricatore(int caricatore) {
		this.caricatore = caricatore;
	}
	
	
	
}
