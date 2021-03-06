package Dao;

import entites.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.CaixaDeCarrinho;
import views.TelaDeLogin;

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
    
     public static void atualizarUser(Usuario user) {
        conn = ConnectDao.getConnection();
        String sql = "UPDATE usuario SET  nome = ?,email = ?,telefone = ?,senha = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getTelefone());
            preparedStatement.setString(4, user.getSenha());
            preparedStatement.setInt(5, user.getId());
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
        String sql = "SELECT * FROM usuario WHERE  nome = '" + user.getNome()+ "' AND senha = '" + user.getSenha()+ "'";
        ResultSet res;
        boolean resultado = false;
        try {
            Statement statement = conn.createStatement();
            res = statement.executeQuery(sql);
            resultado = res.next();
            //fechando conexoes
            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionStatement(statement);
            ConnectDao.closeConnectionPrepare(res);

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;

    }

    //verificação para login
    public static boolean getUserAndSenha(String user, String senha) {
        conn = ConnectDao.getConnection();
        String sql = "SELECT * FROM usuario WHERE  nome = '" + user + "' AND senha = '" + senha + "'";
        ResultSet res;
        boolean resultado = false;
        try {
            Statement statement = conn.createStatement();
            res = statement.executeQuery(sql);
            resultado = res.next();
            //fechando conexoes
            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionStatement(statement);
            ConnectDao.closeConnectionPrepare(res);

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;

    }

    //buscando id do usuario
    public static int getUserID(String user, String senha) {
        conn = ConnectDao.getConnection();

        String sql = "SELECT * FROM usuario WHERE  nome = '" + user + "' AND senha = '" + senha + "'";
        ResultSet res;
        Statement statement;
        int id = 0;
        try {
            statement = conn.createStatement();
            res = statement.executeQuery(sql);
            if (res.next()) {
                id = res.getInt("id");
            }
            //fechando conexoes
            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionStatement(statement);
            ConnectDao.closeConnectionPrepare(res);

        } catch (SQLException ex) {
            Logger.getLogger(CaixaDeCarrinho.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public static Usuario userDados(){
        
        conn = ConnectDao.getConnection();

        String sql = "SELECT * FROM usuario WHERE  id = "+TelaDeLogin.idUSER;
        ResultSet res;
        Statement statement;
        String nome = "",email="",telefone="",senha="";
            
        
        try {
            statement = conn.createStatement();
            res = statement.executeQuery(sql);
            if (res.next()) {
               nome = res.getString("nome");
               email = res.getString("email");
               telefone = res.getString("telefone");
               senha = res.getString("senha");
            }
            //fechando conexoes
            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionStatement(statement);
            ConnectDao.closeConnectionPrepare(res);
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return new Usuario(nome, email, telefone, senha);
    }
}
