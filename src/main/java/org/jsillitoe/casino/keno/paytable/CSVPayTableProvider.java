package org.jsillitoe.casino.keno.paytable;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import au.com.bytecode.opencsv.CSVReader;

public class CSVPayTableProvider extends AbstractPayTableProvider{

	
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

	
	
}
