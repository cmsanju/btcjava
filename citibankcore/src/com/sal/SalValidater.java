package com.sal;

public class SalValidater {
	
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
