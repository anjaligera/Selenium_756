package day10;

import java.io.FileReader;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CsvRead {
	
  @Test
  public void f() throws Exception {  //CSVReader is the plugin for open csv
	CSVReader CR=new CSVReader(new FileReader(".\\data.csv"));// dot(.data.csv means it will read the data from current directory)
	List<String[]> allData=CR.readAll();
	
	for(String rowData[]:allData) //array type List
	{
		for(String ColData:rowData)
		{
			System.out.println(ColData); //this for inside for is an alternate option for below two sys out line
		}
		// for each line reader we use read.next
	//	System.out.println(rowData[0]);// this is first row 1st column
	//	System.out.println(rowData[1]); // this is first row 2nd column phir iterate hga
		//for reading the data
	}
  }
}
