package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BookingRoom")
public class BookingRoom {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "BookingId")
	private String bookingId;
	@Column(name = "DepartureDay")
	private Integer departureDay;
	@Column(name = "NumberOfParticipants")
	private Integer numberOfParticipants;
	@Column(name = "Price")
	private Integer price;
	@Column(name = "Created_at")
	private Date created_at;
	@Column(name = "Update_at")
	private Date update_at;
	
	public BookingRoom() {
		// TODO Auto-generated constructor stub
	}

	
	
	
}
