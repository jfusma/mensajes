package com.platzi;

import java.sql.Connection;

/**
 * @author John Fredy Usma
 *
 */
public class Inicio {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Conexion conexion1 = new Conexion();
		try(Connection connection = conexion1.get_connection()){
			
		} catch (Exception e) {
			System.out.println("inicio" + e);
		}


	}

}
