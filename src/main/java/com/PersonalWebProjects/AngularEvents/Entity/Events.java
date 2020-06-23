package com.PersonalWebProjects.AngularEvents.Entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="events_list")
@Setter
@Getter
@ToString
public class Events {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Event_Id")
	private int id;
	@Column(name="Event_Name")
	private String name;
	@Column(name="Event_Date")
	private Date date; 
	@Column(name="Event_Time")
	private String time;
	@Column(name="Price")
	private double price; 
	@Column(name="Image_URL")
	private String imageUrl;
	@JsonManagedReference
	@OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL, mappedBy = "event")
	private Location location;
	@Column(name="Online_URL")
	private String url;
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "event", fetch = FetchType.EAGER,  targetEntity = Sessions.class)
	private List<Sessions> sessions;
}
