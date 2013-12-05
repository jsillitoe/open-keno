package org.jsillitoe.casino.keno.paytable;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import au.com.bytecode.opencsv.CSVReader;

public class CSVPayTableProvider implements PayTableProvider {

	Map<Integer, PayTable> paytables = new HashMap<Integer, PayTable>();
	
	public CSVPayTableProvider() throws IOException{
		InputStream csvstream = CSVPayTableProvider.class.getResourceAsStream("paytable.csv");
		CSVReader reader = new CSVReader(new InputStreamReader(csvstream));
		List<String[]> entries = reader.readAll();
		reader.close();
		for (String[] entry : entries){
			int marks = Integer.parseInt(entry[0]);
			Map<Integer, Integer> table = new HashMap<Integer, Integer>();
			for (int x=0;x<=marks;x++){
				table.put(x, Integer.parseInt(entry[x+1]));
			}
			paytables.put(marks, new DefaultPayTable(table));
		}
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
