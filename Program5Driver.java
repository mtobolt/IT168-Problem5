/*
* File name: Program5Driver.java
*
* Programmer: Matt Tobolt
* ULID: mtobolt
*
* Date: Nov 6, 2014
*
* Class: IT 168
* Lecture Section: 01
* Lecture Instructor: Matsuda
* Lab Section: 03
* Lab Instructor: Karl Bissereth
*/
package edu.ilstu;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
  * <insert class description here>
  *
  * @author Matt Tobolt
  *
  */
public class Program5Driver
{

        /**
         * @param args
         * @throws IOException
         */
        public static void main(String[] args) throws IOException
        {
                String filename;
                Scanner kb = new Scanner(System.in);
                File myfile = new File("Program5Input.txt");
                Scanner inputReader = new Scanner(myfile);
                Organization organization = new Organization(inputReader);
                Address address = new Address(inputReader);
                System.out.print("Enter the file name: ");
                filename = kb.nextLine();
                if(!(filename.equalsIgnoreCase("Program5Input.txt")))
                {
                        System.out.println("Please enter a valid file name: ");
                        filename = kb.nextLine();
                }
                else
                {
                        System.out.println("yay that name works.");
                }
                while(inputReader.hasNextLine())
                {
                    if(organization.urlEnding().equals(".com")||organization.urlEnding().equals(".edu")||organization.urlEnding().equals(".org")||organization.urlEnding().equals(".gov"));
                    {
                        try
                        {
                                inputReader = new Scanner(myfile);
                                PrintWriter dotCom = new PrintWriter("MRT_com_Lists.csv");
                                dotCom.print(organization);
                                dotCom.print(address);
                                dotCom.println(organization.getUrl());
                                dotCom.close();
                        }
                        catch(FileNotFoundException e)
                        {
                                System.out.println("Error");
                                System.exit(1);
                        }
                    }
                }
        }
}