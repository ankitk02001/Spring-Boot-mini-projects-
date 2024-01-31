package in.ankit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Player {
	
	@Id
	@Column(name="Player_Id")
	private Integer playerId;
	@Column(name="Player_Name")
	private String playerName;
	@Column(name="Player_Age")
	private Integer playerAge;
	private String address;
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
