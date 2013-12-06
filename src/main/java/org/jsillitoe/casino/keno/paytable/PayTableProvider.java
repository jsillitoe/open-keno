package org.jsillitoe.casino.keno.paytable;

import java.util.Map;

/**
 * TODO: Document me.
 */
public interface PayTableProvider {

	/**
	 * TODO: Document me.
	 */
	public int getMaxSupportedMarks();
	
	
	/**
	 * TODO: Document me.
	 */
	public PayTable getPayTable(int marks) throws PayTableException;
	
	
	/**
	 * TODO: Document me.
	 */
	public Map<Integer, PayTable> getPayTableMap();
	
}
