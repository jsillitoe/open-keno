package org.jsillitoe.casino.keno.paytable;

import java.util.Map;

public interface PayTableProvider {

	public int getMaxSupportedMarks();
	
	public PayTable getPayTable(int marks) throws PayTableException;
	
	public Map<Integer, PayTable> getPayTableMap();
	
}
