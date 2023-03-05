package lk.madhack.codeduo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "event")
public class Event {
	
	public Event() {
		super();
	}

	public Event(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "event_id")
	private Integer event_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "date")
	private String date;

}
