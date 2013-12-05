package org.jsillitoe.casino.keno.paytable;

import java.util.HashMap;
import java.util.Map;

public class DefaultPayTable implements PayTable {

	private Map<Integer, Integer> paytable = new HashMap<Integer, Integer>();
	
	public DefaultPayTable(Map<Integer, Integer> paytable) {
		this.paytable = paytable;
	}

	public int getPays(int caught) throws PayTableException {
		if (paytable.containsKey(caught)){
			return paytable.get(caught);
		}else{
			throw new PayTableException("Catch value not found in this paytable.");
		}
	}

	public Map<Integer, Integer> getPaysMap() {
		return new HashMap<Integer, Integer>(paytable);
	}

}
