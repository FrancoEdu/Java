package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//clase craida paa conexão com o banco de dados.
public class DB {
    private static Connection conn = null;

    // metodo para criar conexao com o banco de dados
    public static Connection getConnection(){
        if (conn == null){
            try {
                    Properties properties = loadProperties(); //pegando propriedades
                    String url = properties.getProperty("dburl"); //url do banco
                    conn = DriverManager.getConnection(url,properties);
            }catch (SQLException sql){
                throw new DbException(sql.getMessage());
            }
        }
        return conn;
    }

    //metodo para fechar conexão com o banco
    public static void closeConnection(){
        if (conn != null){
            try {
                conn.close();
            }catch (SQLException sqlException){
                throw new DbException(sqlException.getMessage());
            }
        }
    }
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (FileNotFoundException e) {
            throw new DbException("Falha ao encontrar o arquivo db.properties");
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement statement){
        if (statement!=null){
            try{
                statement.close();
            }catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResulSet(ResultSet resultSet){
        if (resultSet!=null){
            try{
                resultSet.close();
            }catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }
}
