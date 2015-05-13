package Dao;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conectar {

	String dbUrl = "jdbc:mysql://localhost/lab";
	Connection con = null;
	
	public void Conectar(String usuario, String senha){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(dbUrl,usuario, senha);
			JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso...");
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, "Erro na conexão!\n"+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Conectar aplicacao = new Conectar();
		aplicacao.Conectar("root", "teste");

	}

}
