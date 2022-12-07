package war;

import java.util.Objects;
import java.util.Random;

public class Giocatore {
	
	private String nome;
	private int puntiVita;
	private Arma arma;
	
	
	Random rand = new Random();
	private int cap = 101;
	
	
	
	public Giocatore(String nome, Arma arma) {
		this.nome = nome;
		this.puntiVita = 150;
		this.arma = arma;
	}

	int danno = 0;
	String dannoZona = "";
	
	
	public void spara(Giocatore giocatore) {
		int fortuna =  rand.nextInt(cap); 
		
		
		
		if(this.arma.getCaricatore() > 0) {
			if(fortuna < 15) {
	            danno = this.arma.getDanniTesta();
	            dannoZona = "alla testa";
	            riduciCaricatore();
	            applicaDanno(giocatore);
			}
			
			else if(fortuna >= 15 && fortuna < 55){
				danno = this.arma.getDanniCorpo();
				dannoZona = "al corpo";
				riduciCaricatore();
				applicaDanno(giocatore);
			}
			
			else {
				danno = this.arma.getDanniGambe();
				dannoZona = "alle gambe";
				riduciCaricatore();
				applicaDanno(giocatore);
			}
		}
		else {
			System.out.println("BUG");
			//System.out.println(this.getNome() + " ricarica l'arma...");
			//this.arma.setCaricatore(this.arma.getCapacitaCaricatore());
			
		}

		if(giocatore.getPuntiVita() <= 0) {
			giocatore.setPuntiVita(0);
			System.out.println(giocatore.getNome()+" e' morto");
		}
	}

	
	public void ricaricaArma() {
		this.arma.setCaricatore(this.arma.getCapacitaCaricatore());
	}
	
	
	public void applicaDanno(Giocatore giocatore) {
		giocatore.setPuntiVita(giocatore.getPuntiVita() - danno); 
		
		System.out.println(this.getNome()+" ha colpito "+giocatore.getNome()+" "+ dannoZona + " utilizzando l'arma "+this.getArma().getNome() );
	}
	
	public void riduciCaricatore() {
		this.arma.setCaricatore(this.arma.getCaricatore()-1);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPuntiVita() {
		return puntiVita;
	}

	public void setPuntiVita(int puntiVita) {
		this.puntiVita = puntiVita;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	@Override
	public String toString() {
		return "Giocatore [nome=" + nome + ", puntiVita=" + puntiVita + ", arma=" + arma + "]";
	}






	



	
	

}
	


