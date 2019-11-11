package Dao;

import entites.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao {

    private static Connection conn;

    public static void SalvarUser(Usuario user) {
        conn = ConnectDao.getConnection();
        String sql = "INSERT INTO usuario (nome,email,telefone,senha) VALUES (?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getTelefone());
            preparedStatement.setString(4, user.getSenha());
            preparedStatement.execute();

            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionPrepare(preparedStatement);
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //metodo para buscar user
    public static boolean getUser(Usuario user) {
        conn = ConnectDao.getConnection();
        String sql = "SELECT * FROM usuario WHERE  email = '" + user.getEmail() + "' AND telefone = '" + user.getTelefone() + "'";
        ResultSet res;
        boolean resultado = false;
        try {
            Statement statement = conn.createStatement();
            res = statement.executeQuery(sql);
            resultado = res.next();
            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionStatement(statement); 
            ConnectDao.closeConnectionPrepare(res);
          
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(resultado);
        return resultado;

    }
    
    //verificação para login
    public static boolean getUserAndSenha(String user, String senha) {
        conn = ConnectDao.getConnection();
        String sql = "SELECT * FROM usuario WHERE  nome = '" + user + "' AND senha = '" + senha + "'";
        ResultSet res ;
        boolean resultado = false;
        try {
            Statement statement = conn.createStatement();
            res = statement.executeQuery(sql);
            resultado = res.next();
            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionStatement(statement);
            ConnectDao.closeConnectionPrepare(res);
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;

    }
}