package org.jsillitoe.casino.keno.paytable;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO: Document me.
 */
public class DefaultPayTable implements PayTable {

	private Map<Integer, Integer> paytable = new HashMap<Integer, Integer>();
	
	
	/**
	 * TODO: Document me.
	 */
	public DefaultPayTable(Map<Integer, Integer> paytable) {
		this.paytable = paytable;
	}

	
	/**
	 * TODO: Document me.
	 */
	public int getPays(int caught) throws PayTableException {
		if (paytable.containsKey(caught)){
			return paytable.get(caught);
		}else{
			throw new PayTableException("Catch value not found in this paytable.");
		}
	}

	
	/**
	 * TODO: Document me.
	 */
	public Map<Integer, Integer> getPaysMap() {
		return new HashMap<Integer, Integer>(paytable);
	}

}
