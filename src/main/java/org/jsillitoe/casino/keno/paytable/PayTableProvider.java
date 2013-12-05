package org.jsillitoe.casino.keno.paytable;

import java.util.Map;

public interface PayTableProvider {

	public PayTable getPayTable(int marks) throws PayTableException;
	
	public Map<Integer, PayTable> getPayTableMap();
	
}
