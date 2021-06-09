package com.empsal;

public class ValidateSal {
	
	public void checkSalary(double sal)throws PsalException,NsalException
	{
		if(sal > 0)
		{
			PsalException pe = new PsalException("valid salary");
			
			throw(pe);
		}
		else
		{
			NsalException ne = new NsalException("invalid salary");
			
			throw(ne);
		}
	}

}
