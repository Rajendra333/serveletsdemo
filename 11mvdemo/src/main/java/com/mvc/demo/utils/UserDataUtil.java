package com.mvc.demo.utils;

import java.util.ArrayList;
import java.util.List;

import com.mvc.demo.model.User;

public class UserDataUtil {
  public static List<User>getUser(){
	  List<User>users=new ArrayList<>();
	  users.add(new User("john","willmison","jwl@gmail.com","123"));
	  users.add(new User("David","Miller","dmi@gmail.com","124"));
	return users;
	  
	  
  }
}
