package com.epsilonplius.Entity;

import java.math.BigDecimal;

public class Preke {
	private String kodas;
	private String Pavadinimas;
	private Integer kiekis;
	private BigDecimal kaina;
	
	public String getKodas() {
		return kodas;
	}
	public void setKodas(String kodas) {
		this.kodas = kodas;
	}
	public String getPavadinimas() {
		return Pavadinimas;
	}
	public void setPavadinimas(String pavadinimas) {
		Pavadinimas = pavadinimas;
	}
	public Integer getKiekis() {
		return kiekis;
	}
	public void setKiekis(Integer kiekis) {
		this.kiekis = kiekis;
	}
	public BigDecimal getKaina() {
		return kaina;
	}
	public void setKaina(BigDecimal kaina) {
		this.kaina = kaina;
	}

}
