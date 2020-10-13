package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")

public class Ticket {
	
	// attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="TICKET_DESCRIPTION")
	private String description;
	private int storeId; // wasn't sure if we were still going to use store id in the table
	@Column(name="TICKET_COMPLETED")
	private boolean isCompleted;
	
	//default no args
	public Ticket() {
		super();
	}

	//two args
	public Ticket(boolean isCompleted, int id) {
		super();
		this.isCompleted = isCompleted;
		this.id = id;
	}

	//three args
	public Ticket(boolean isCompleted, int storeId, int id) {
		super();
		this.isCompleted = isCompleted;
		this.storeId = storeId;
		this.id = id;
	}

	//all args
	public Ticket(String description, boolean isCompleted, int storeId, int id) {
		super();
		this.description = description;
		this.isCompleted = isCompleted;
		this.storeId = storeId;
		this.id = id;
	}


	//getters and setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getStoreId() {
		return storeId;
	}


	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}


	public boolean isCompleted() {
		return isCompleted;
	}


	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", description=" + description + ", storeId=" + storeId + ", isCompleted="
				+ isCompleted + "]";
	}
	
	//public String returnTicketDetails() {
	//	return id + " : " + description + ": Completion : " + isCompleted;
 	//}
}