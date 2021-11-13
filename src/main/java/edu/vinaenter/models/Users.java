package edu.vinaenter.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	// include: toString, getter, setter
@AllArgsConstructor
@NoArgsConstructor

public class Users {
	private String id;
	private String username;
	private String password;
	private String fullname;
}
