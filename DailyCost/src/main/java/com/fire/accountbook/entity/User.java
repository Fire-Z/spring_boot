package com.fire.accountbook.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity(name = "t_user")
public class User {
	private String userName;
}
