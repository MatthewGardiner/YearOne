/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package databasestuff;

/*
 * DBdemo.java
 *
 * Created on 6 February 2006, 21:11
 * Last updated: 2012-02-20T15:54+0000
 */

/**
 * Demonstrates how to use DB.getDataArray() to retrieve information from
 * the database
 *
 * @author  gharel
 * modified by P.Trundle
 */
public class DBdemo {

 /**
  * @param args the command line arguments; args[0] = UB_Number
  */
 public static void main(String args[]) {

 DB db = new DB();
 db.open();

 String name="";
 String title="";
 String query="select Name,Title from projects where UB_Number='"+args[0]+"'";
 System.out.println("Query: "+query);

 String[][] da=db.getDataArray(query);
 if (da!=null) {
  name=da[0][0];
  title=da[0][1]; }

 System.out.println(name+": "+title);

 db.close();
 }

}
