package br.com.uol.selecao.dto;

import java.util.ArrayList;
import java.util.List;

/** Classe DTO, representa um Hotel a ser cosumido pela API 
 * URL Exemplo: https://cvcbackendhotel.herokuapp.com/hotels/avail/1032
 * 
 * @author Hugo Barros Camboim
 */
public class Hotel {

	/**Id do Hotel*/
	private Long id;
	
	/**Nome do Hotel*/
	private String name;
	
	/**Código da cidade onde está situado o hotel*/
	private int cityCode;
	
	/**Nome da Cidade onde está situado o hotel*/
	private String cityName;
	
	/** Acomodações do Hotel*/
	private List<Room> rooms;
	
	public Hotel(){
		rooms = new ArrayList<Room>();
	}

	public Hotel(Long id, String name, int cityCode, String cityName,
			List<Room> rooms) {
		super();
		this.id = id;
		this.name = name;
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.rooms = rooms;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCityCode() {
		return cityCode;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", cityCode=" + cityCode
				+ ", cityName=" + cityName + ", rooms=" + rooms + "]";
	}
	
}
