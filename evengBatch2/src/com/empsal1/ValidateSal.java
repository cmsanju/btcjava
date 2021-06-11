package com.empsal1;

public class ValidateSal {
	
	public void checkSal(double sal)throws PsalException,NsalException
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
