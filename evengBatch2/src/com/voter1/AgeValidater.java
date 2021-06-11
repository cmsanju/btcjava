package com.voter1;

public class AgeValidater {
	
	public void checkAge(int age)throws ValidVoterException,InvalidVoterException
	{
		if(age >= 18)
		{
			ValidVoterException ve = new ValidVoterException("eligible");
			
			throw(ve);
		}
		else
		{
			InvalidVoterException ie = new InvalidVoterException("not eiligible");
			
			throw(ie);
		}
	}

}
