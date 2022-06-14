package br.sisacademico.daunstapa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarAoBancoDeDados {
 
    private static final String urlDB = "jdbc:derby://localhost:1527/sisacademico_noite";
    private static final String user = "root";
    private static final String pass = "root";
    
    public static Connection getConnection() throws SQLException{
        DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
        return DriverManager.getConnection(urlDB, user, pass);
    }
}
