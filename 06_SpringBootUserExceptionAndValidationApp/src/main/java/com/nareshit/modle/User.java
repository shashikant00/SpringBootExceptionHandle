package com.nareshit.modle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity
@Table(name="Use_TBL")
public class User {

	@Id
	@GeneratedValue
	private Integer userId;
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private Integer age;
	private String nationality;
}
