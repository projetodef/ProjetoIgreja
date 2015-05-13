package Dao;
import Model.LoginModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


//import Model.Clientes;
import java.sql.PreparedStatement;


public class ClienteDao {

	final String dbUrl = "jdbc:mysql://localhost:3306/lab";
	final String usuario = "root";
	final String senha = "teste";
	Connection con = null;
        
	
	public void inserir(LoginModel loginmodel) {
		try{
                        Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl, usuario, senha);
			String sqlStmt = "INSERT INTO usuario (login,senha)VALUES(?,?)";
                        PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sqlStmt); 
                        stmt.setString(1, loginmodel.getNome());
			stmt.setString(2, loginmodel.getSenha());
                        stmt.execute();
			con.close();
			JOptionPane.showMessageDialog(null, "Gravado com sucesso...");
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro na gravação!\n"+e.getMessage());
		}
	}
	
}