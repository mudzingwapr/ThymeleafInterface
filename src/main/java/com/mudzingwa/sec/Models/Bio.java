package com.mudzingwa.sec.Models;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class Bio {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bioid;
	private String ecnumber;
	private String nid;
	private String tittle;
	private String sex;
	private String surname;
	private String fname;
	private Date dateofbirth;
	private String phone;
	private String cellphone;
	private String email;
	private String signature;
	private Date date;


	private String ppost;
	private String pministry;
	private String postexaminedfor;
	private String ministryexaminedfor;
@ElementCollection
@CollectionTable(name="roletab",joinColumns=@JoinColumn(name="bioid"))
@Column(name="roles")
	private List<String> role;
}
