package tp.model;

public class TauxChange {
	private String currency;
	private Double rate;

	public TauxChange() {
		super();
	}

	public TauxChange(String currency, Double rate) {
		super();
		this.currency = currency;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "TauxChange [currency=" + currency + ", rate=" + rate + "]";
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

}
