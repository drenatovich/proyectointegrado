package Modelo;

import java.sql.*;

public class BD {
	Connection con;
	String nomservidor;
	String nombbdd;
	String nomusuari;
	String pwdusuari;
	
	public BD(String nomservidor, String nombbdd, String nomusuari, String pwdusuari) {
		this.nomservidor = nomservidor;
		this.nombbdd = nombbdd;
		this.nomusuari = nomusuari;
		this.pwdusuari = pwdusuari;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://"+nomservidor+":3306/"+nombbdd+"?user="+nomusuari+"&password="+pwdusuari);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection(){
		return con;
	}
	
	
}
