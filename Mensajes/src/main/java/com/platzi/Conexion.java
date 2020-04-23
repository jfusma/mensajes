package com.platzi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author John Fredy Usma
 *
 */
public class Conexion {

	/**
	 * 
	 */
	public Connection get_connection() {
		Connection con = null;
				
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reas?useUnicode=true&characterEncoding=UTF-8", "root", "root");
			if (con != null) {}
			System.out.println("conexion OK !!");
		} catch (Exception e) {
			System.out.println("conexion fallida !!" + e);
		}

		return con;
	}

}
