package org.jsillitoe.casino.keno.paytable;

import java.util.Map;

public interface PayTable {

	public int getPays(int caught) throws PayTableException;
	
	public Map<Integer, Integer> getPaysMap();
	
}
