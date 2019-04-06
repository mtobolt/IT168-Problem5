/*
* File name: Organization.java
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
public class Organization
{
        String organizationName;
        String url;

        Address address = new Address();
        public Organization()
        {
        }
        public Organization(Scanner inputReader) throws IOException
        {
                        this.organizationName = inputReader.nextLine();
                        inputReader.nextLine();
                        inputReader.nextLine();
                        this.url = inputReader.nextLine();
        }

        /**
         * @return the url
         */
        public String urlEnding()
        {
                int length = url.length()-1;
                String urlEnding = url.substring(length-3, length+1);
                return urlEnding;
        }
        /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString()
        {
                return organizationName + ",";
        }
        /**
         * @return the url
         */
        public String getUrl()
        {
                return "," + url;
        }


}
