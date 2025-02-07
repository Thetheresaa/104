package pacchetto;

public class Persona {

	private String nome; // no usages
	private String cognome;// no usages
	private int eta; // no usages
	private String codicefiscale;// no usages
	private String citta; // no usages
	private String giorno;
	private String mese;

	public Persona(String nome, String cognome, String codicefiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codicefiscale = codicefiscale;
		this.giorno = calcolanascita();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String nome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return this.eta;
	}

	public void setEta(String nome) {
		this.eta = eta;
	}

	public String getCodicefiscale() {
		return this.codicefiscale;
	}

	public void setCodicefiscale(String nome) {
		this.codicefiscale = codicefiscale;
	}

	public String getCitta() {
		return this.citta;
	}

	public void setCitta(String nome) {
		this.citta = citta;
	}

	public String calcolanascita() {
		boolean check = false;
		String giorno = codicefiscale.substring(9, 11);

		int giornoNum = Integer.parseInt(giorno);
		if (giornoNum > 40)
			giornoNum -= 40;
		if (giornoNum > 31 || giornoNum < 0)
			return "Data errata";

		giorno = giornoNum + "";
		if (giornoNum < 10)
			giorno = "0" + giornoNum;

		String mese = codicefiscale.substring(8, 9);
		String anno = codicefiscale.substring(6, 8);
		switch (mese) {
		case "A":
			mese = "01";
			break;
		case "B":
			mese = "02";
			break;
		case "C":
			mese = "03";
			break;
		case "D":
			mese = "04";
			break;
		case "E":
			mese = "05";
			break;
		case "H":
			mese = "06";
			break;
		case "L":
			mese = "07";
			break;
		case "M":
			mese = "08";
			break;
		case "P":
			mese = "09";
			break;
		case "R":
			mese = "10";
			break;
		case "S":
			mese = "11";
			break;
		case "T":
			mese = "12";
			break;

		default:
			check = false;
			break;
		}
		if (check)
			return giorno + "/" + mese + "/" + anno;
		else
			return "Data errata";

	}
}
