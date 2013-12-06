package org.jsillitoe.casino.keno.paytable;

import java.util.Map;

/**
 * TODO: Document me.
 */
public interface PayTable {

	/**
	 * TODO: Document me.
	 */
	public int getPays(int caught) throws PayTableException;
	
	
	/**
	 * TODO: Document me.
	 */
	public Map<Integer, Integer> getPaysMap();
	
}
