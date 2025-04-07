package com.phtn.mbl.test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.logging.Logger;

public class ClassOne {

	public static void main(String[] args) throws FileNotFoundException {
		
		//System.out.println();
		System.out.println("hello, world2");
		
		System.out.println();
		System.out.print("Class");
		System.out.print("room");
		System.out.print("AUTOMATION");
		
		System.out.println();
		System.out.printf("%nIm, %s working as lead engineer %d years of experience. %n", "AK", 3);
		System.out.println();
		//System.out.printf("%s IM Lead engineer: ID is %d:" , args)
		
		System.out.println();
		System.out.append("ak").append("kongarasan");
		
		System.out.println();
		System.out.format("total year of exp %.2f %n", 10.5);
		
		System.out.println();
		System.out.write(122);
	
		System.out.println();
		System.err.println("Error: App failed");
		
		System.out.println();
		Logger log = Logger.getLogger("test");
		  log.info("Line message 24");
		
		
		
		PrintWriter writer = new PrintWriter("/Users/kongarasan.asokan/eclipse/java-2025-03/AutomationProjec/Logs");
		writer.print("March 4");
		writer.close();

	}

}
