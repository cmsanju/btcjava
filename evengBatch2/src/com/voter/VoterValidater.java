package com.voter;

public class VoterValidater {
	
	public void checkAge(int age)throws ValidvoterException,InvalidVoterException
	{
		if(age >= 18)
		{
			ValidvoterException ve = new ValidvoterException("eligible");
			
			throw(ve);
		}
		else
		{
			InvalidVoterException ie = new InvalidVoterException("not eligible");
			
			throw(ie);
		}
	}

}
