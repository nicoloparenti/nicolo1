package war;

import java.util.Random;
import java.util.Scanner;

public class Partita {

	Scanner scanner = new Scanner(System.in);
	Random rand = new Random();
	private int cap = 10;
	private int cap2 = 3;

	public Partita() {

	}
	
	private String nome1 = "";
	private String nome2 = "";

	private Assalto assalto;
	private Cecchino cecchino;
	private Pistola pistola;
	
	
	
	public void nomi() {
		System.out.println("Benvenuto! Inserisci il tuo nome:");
		this.nome1 = scanner.nextLine();
		System.out.println("Inserisci il nome del tuo avversario:");
		this.nome2 = scanner.nextLine();
	}
	
	
	
	public Arma sceltaArmaP1() {
		System.out.println("Scegli l'arma:");
		System.out.println("1. Barrett, 2. AK47, 3. Pistola");
		int armaTemp = scanner.nextInt();
		
		if(armaTemp == 1) {
			System.out.println("Hai scelto il cecchino");
			return cecchino = new Cecchino("Barrett", 150, 80, 60, 1); 
		}
		else if (armaTemp == 2) {
			System.out.println("Hai scelto l'assalto ");
			return assalto = new Assalto("AK47", 150, 80, 45, 1);
			 
		}
		else {
			System.out.println("Hai scelto la pistola ");
			return pistola = new Pistola("Revolver", 60, 25, 15, 1);
		}
}
		
		public Arma sceltaArmaBot() {
			System.out.println("Il bot sta scegliendo l'arma..");
			
			int moneta = rand.nextInt(cap2);
			if(moneta == 0 ) {
				System.out.println("Il bot ha scelto il cecchino");
				return cecchino = new Cecchino("Barrett", 150, 80, 60, 1); 
				
			}
			else if (moneta == 1) {
				System.out.println("Il bot ha scelto l'assalto ");
				return assalto = new Assalto("AK47", 150, 80, 45, 1);
			}
			else {
				System.out.println("Il bot ha scelto la pistola ");
				return pistola = new Pistola("Revolver", 60, 25, 15, 1);
			}
			
		}

	
	
	
	
	public void testaOCroce(Giocatore giocatore1, Giocatore giocatore2) {
		int moneta = rand.nextInt(cap);
		if (moneta % 2 == 0) {
			while (giocatore1.getPuntiVita() > 0 & giocatore2.getPuntiVita() > 0) {
				if(giocatore1.getArma().getCaricatore() > 0) {
					giocatore1.spara(giocatore2);
					System.out.println("I punti vita di " + giocatore2.getNome() + " ora sono: " + giocatore2.getPuntiVita());
				}
				else if (giocatore1.getArma().getCaricatore() <= 0){
					giocatore1.ricaricaArma();
					System.out.println(giocatore1.getNome() + " salta turno per ricaricare l'arma");
				}
				if (giocatore2.getPuntiVita() > 0 & giocatore2.getArma().getCaricatore() > 0) {
					giocatore2.spara(giocatore1);
					System.out.println("I punti vita di " + giocatore1.getNome() + " ora sono: " + giocatore1.getPuntiVita());
				}
				else if(giocatore2.getArma().getCaricatore() <= 0){
					giocatore2.ricaricaArma();
					System.out.println(giocatore2.getNome() + " salta turno per ricaricare l'arma");
				}
			}

		} else {
			while (giocatore1.getPuntiVita() > 0 & giocatore2.getPuntiVita() > 0) {
				if(giocatore2.getArma().getCaricatore() > 0) {
					giocatore2.spara(giocatore1);
					System.out.println("I punti vita di " + giocatore1.getNome() + " ora sono: " + giocatore1.getPuntiVita());
				}
				else if (giocatore2.getArma().getCaricatore() <= 0){
					giocatore2.ricaricaArma();
					System.out.println(giocatore2.getNome() + " salta turno per ricaricare l'arma");
				}
				if (giocatore1.getPuntiVita() > 0 & giocatore1.getArma().getCaricatore() > 0) {
					giocatore1.spara(giocatore2);
					System.out.println("I punti vita di " + giocatore2.getNome() + " ora sono: " + giocatore2.getPuntiVita());
				}
				else if(giocatore1.getArma().getCaricatore() <= 0){
					giocatore1.ricaricaArma();
					System.out.println(giocatore1.getNome() + " salta turno per ricaricare l'arma");
				}
			}
		}

	}


	public int getCap() {
		return cap;
	}


	public void setCap(int cap) {
		this.cap = cap;
	}


	public String getNome1() {
		return nome1;
	}


	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}


	public String getNome2() {
		return nome2;
	}


	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}



	public Assalto getAssalto() {
		return assalto;
	}



	public void setAssalto(Assalto assalto) {
		this.assalto = assalto;
	}



	public Cecchino getCecchino() {
		return cecchino;
	}



	public void setCecchino(Cecchino cecchino) {
		this.cecchino = cecchino;
	}



	public Pistola getPistola() {
		return pistola;
	}



	public void setPistola(Pistola pistola) {
		this.pistola = pistola;
	}



	@Override
	public String toString() {
		return "Partita [scanner=" + scanner + ", rand=" + rand + ", cap=" + cap + ", cap2=" + cap2 + ", nome1=" + nome1
				+ ", nome2=" + nome2 + ", assalto=" + assalto + ", cecchino=" + cecchino + ", pistola=" + pistola + "]";
	}


	
	
	
}


