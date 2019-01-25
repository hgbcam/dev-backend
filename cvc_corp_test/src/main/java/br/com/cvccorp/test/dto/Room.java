package br.com.cvccorp.test.dto;

/** Classe DTO representa uma acomodação de um hotel.
 *  URL: https://cvcbackendhotel.herokuapp.com/hotels/avail/1032
 * 
 * @author Hugo Barros Camboim
 */
public class Room {
	
	/** ID da acomodacao */
	private long roomID;
	
	/** Categoria da acomodação */
	private String categoryName;
	
	/** Preço da acomodação */
	private Price price;

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(long roomID, String categoryName, Price price) {
		super();
		this.roomID = roomID;
		this.categoryName = categoryName;
		this.price = price;
	}

	public long getRoomID() {
		return roomID;
	}

	public void setRoomID(long roomID) {
		this.roomID = roomID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Room [roomID=" + roomID + ", categoryName=" + categoryName
				+ ", price=" + price + "]";
	}
	
	
}
