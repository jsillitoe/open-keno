package org.jsillitoe.casino.keno.paytable;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractPayTableProvider implements PayTableProvider {

	protected Map<Integer, PayTable> paytables = new HashMap<Integer, PayTable>();
	

	public int getMaxSupportedMarks() {
		return paytables.size();
	}
	
	public PayTable getPayTable(int marks) throws PayTableException{
		if (paytables.containsKey(marks)){
			return paytables.get(marks);
		}else{
			throw new PayTableException("Mark value not found in paytables.");
		}
	}

	
	public Map<Integer, PayTable> getPayTableMap() {
		return new HashMap<Integer, PayTable>(paytables);
	}


}
