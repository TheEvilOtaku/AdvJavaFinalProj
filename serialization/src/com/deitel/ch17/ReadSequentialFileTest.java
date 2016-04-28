package com.deitel.ch17;

public class ReadSequentialFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadSequentialFile application = new ReadSequentialFile();
		
		application.openFile();
		application.readRecords();
		application.closeFile();
	}

}
