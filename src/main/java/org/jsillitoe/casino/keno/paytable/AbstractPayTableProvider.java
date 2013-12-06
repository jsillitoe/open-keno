package org.jsillitoe.casino.keno.paytable;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO: Document me.
 */
public abstract class AbstractPayTableProvider implements PayTableProvider {

	//TODO: Document me.
	protected Map<Integer, PayTable> paytables = new HashMap<Integer, PayTable>();
	
	
	/**
	 * TODO: Document me.
	 */
	public int getMaxSupportedMarks() {
		return paytables.size();
	}
	
	
	/**
	 * TODO: Document me.
	 */
	public PayTable getPayTable(int marks) throws PayTableException{
		if (paytables.containsKey(marks)){
			return paytables.get(marks);
		}else{
			throw new PayTableException("Mark value not found in paytables.");
		}
	}

	
	/**
	 * TODO: Document me.
	 */
	public Map<Integer, PayTable> getPayTableMap() {
		return new HashMap<Integer, PayTable>(paytables);
	}


}
