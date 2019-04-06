/*
* File name: Address.java
*
* Programmer: Matt Tobolt
* ULID: mtobolt
*
* Date: Nov 5, 2014
*
* Class: IT 168
* Lecture Section: 01
* Lecture Instructor: Matsuda
* Lab Section: 03
* Lab Instructor: Karl Bissereth
*/
package edu.ilstu;

import java.io.IOException;
import java.util.Scanner;

/**
  * <insert class description here>
  *
  * @author Matt Tobolt
  *
  */
public class Address
{
        String streetAddress;
        String city;
        String state;
        String zipCode;


        public Address()
        {
        }
        public Address(Scanner inputReader) throws IOException
        {
                        inputReader.nextLine();
                        streetAddress = inputReader.nextLine();
                        city = inputReader.next();
                        state = inputReader.next();
                        zipCode = inputReader.next();
        }

        /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString()
        {
                return streetAddress + ", " + city + "," + state + "," + zipCode;
        }
}


