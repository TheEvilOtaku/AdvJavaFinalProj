package com.deitel.ch17;

public class CreateSequentialFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateSequentialFile application = new CreateSequentialFile();
		
		application.openFile();
		application.addRecords();
		application.closeFile();

	}

}
