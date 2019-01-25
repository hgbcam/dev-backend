package br.com.cvccorp.test.dto;

/** Classe DTO represta o preço de uma acomodação 
 * 
 *  @author Hugo Barros Camboim
 */
public class Price {
	
	/** Preço para adultos */
	private float adult;
	
	/** Preço para crianças */
	private float child;
	
	public Price() {
		super();
	}

	public Price(float adult, float child) {
		super();
		this.adult = adult;
		this.child = child;
	}

	public float getAdult() {
		return adult;
	}

	public void setAdult(float adult) {
		this.adult = adult;
	}

	public float getChild() {
		return child;
	}

	public void setChild(float child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "Price [adult=" + adult + ", child=" + child + "]";
	}
	
	
}
