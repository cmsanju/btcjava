package com.test;

interface User
{
	public User getUserObject(User user);
}

class UserTest implements User
{
	public User getUserObject(User user) // factory design pattern singleton design pattern 
	{
		user = new UserTest();
		
		if(user == null)
		{
			user = new UserTest();
		}
		
		return user;
	}
}

public class Exp18 {

}
// 1 new operator
// 2 factor method
// 3 clone();
// 4 Class.forName();
