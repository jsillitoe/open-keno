package org.jsillitoe.casino.keno.paytable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO: Document me.
 */
public class DefaultPayTableProvider extends AbstractPayTableProvider {
	
	/**
	 * TODO: Document me.
	 */
	public DefaultPayTableProvider() {
		
		List<Integer[]> pays = new ArrayList<Integer[]>();
		pays.add((new Integer[]{0,3}));//1
		pays.add((new Integer[]{0,0,12}));//2
		pays.add((new Integer[]{0,0,1,42}));//3
		pays.add((new Integer[]{0,0,1,3,150}));//4
		pays.add((new Integer[]{0,0,0,1,15,700}));//5
		pays.add((new Integer[]{0,0,0,1,2,85,2000}));//6
		pays.add((new Integer[]{0,0,0,0,2,30,300,5000}));//7
		pays.add((new Integer[]{0,0,0,0,0,5,100,1500,30000}));//8
		pays.add((new Integer[]{0,0,0,0,0,3,30,400,4000,40000}));//9
		pays.add((new Integer[]{0,0,0,0,0,1,10,100,1000,5000,1000000}));//10
		
		for (int x=0;x<pays.size();x++){
			Map<Integer,Integer> numbers = new HashMap<Integer,Integer>();
			for (int y=0;y<pays.get(x).length;y++){
				numbers.put(y,pays.get(x)[y]);
			}
			paytables.put(x+1, new DefaultPayTable(numbers));
		}
		
	}

}
