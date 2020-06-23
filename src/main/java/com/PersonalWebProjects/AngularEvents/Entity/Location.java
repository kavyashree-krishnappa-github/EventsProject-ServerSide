package com.PersonalWebProjects.AngularEvents.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="events_list")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Event_Id")
	private int id;
	@JsonBackReference
	@OneToOne(fetch = FetchType.LAZY, optional = false)	
	@JoinColumn(name="Event_Id")
	private Events event;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="country")
	private String country;
	
}
