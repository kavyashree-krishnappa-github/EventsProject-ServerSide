package com.PersonalWebProjects.AngularEvents.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Lazy;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="sessions_list")
@Setter
@Getter
@ToString
public class Sessions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Session_Id")
	private int session_id;
	@Column(name="Session_Name")

	private String session_name;
	
	private String duration;
	private String presenter;
	private String level;
	@Column(name="Abstract")
	private String description; 
	@ManyToOne
	@JoinColumn(name="Event_Id")
	@JsonBackReference
	private Events event;
}
