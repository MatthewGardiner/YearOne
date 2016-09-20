/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package databasestuff;

/**
 *
 * @author mgardin2
 */
import java.sql.*;
import java.io.*;

public class DatabaseTest {

    private Connection con; // The database connection object

    /** Test driver */
    public static void main (String[] args) throws ClassNotFoundException {
        DatabaseTest db = new DatabaseTest();
	db.open();
	db.printTable("projects");
	db.close();
    }

    /** Open connection to the database server */
    public void open() {
	String url = 
	    "jdbc:postgresql://pgdbs8.inf.brad.ac.uk/sd2?user=sd2user&password=sd2user";
	try {
	    Class.forName("org.postgresql.Driver"); // Loading the PostgreSQL JDBC Driver
	    con = DriverManager.getConnection(url); // Connecting to the database at 'url'
	    System.out.println ("Connecting to the DB:");
	    DatabaseMetaData dbmd = con.getMetaData(); // Get MetaData to confirm connection
	    System.out.println("Connection to "+dbmd.getDatabaseProductName()+" "+
			       dbmd.getDatabaseProductVersion()+" is opened.\n");
	} catch (Exception e) {
	    System.out.println("Cannot open DB connection:");
	    System.out.println("Error: " + e.getMessage() + "\n" + e.toString());
	    e.printStackTrace();
	}
    }

    /** Close the connection to the database server */
    public void close() {
	try {
	    con.close(); // Closing connection to the database
	    System.out.println("\n"+"Connection is closed."); 
	} catch (SQLException e) {
	    System.out.println("Cannot close DB connection");
	    System.out.println("Error: " + e.getMessage());
	}
    }       

    /** Print the data and meta-data of a database table */
    public void printTable(String tableName) {
	String el;
	String queryString = "select * from "+tableName;
	try {
	    System.out.println("Query: "+queryString);
	    Statement stmt = con.createStatement();
	    // Execute the query and get the result-set and meta-data
	    ResultSet rs = stmt.executeQuery(queryString);
	    ResultSetMetaData rsMeta = rs.getMetaData();
	    int noCols = rsMeta.getColumnCount(); // Number of columns in the result-set
	    // Print some meta-data
	    System.out.println("\n"+"MetaData:");
	    for (int c= 1; c<= noCols; c++) {
		System.out.println(rsMeta.getColumnLabel(c)+" "+rsMeta.getColumnTypeName(c));
	    }
	    // Print the result-set
	    System.out.println("\n"+"Results:");
	    while (rs.next()) {
		el=""; for (int c= 1; c<= noCols; c++) {el += rs.getString(c)+" ";}
		System.out.println(el);
	    }
	    rs.close(); stmt.close();
	} catch(SQLException e) { 
	    System.out.println("SQL Error: " + e.getMessage());
	}
    }

}
