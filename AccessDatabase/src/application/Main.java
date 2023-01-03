package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        /* ================================================== REALIZANDO BUSCA NO BANCO =====================================
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection =DB.getConnection(); //cria conexão com o banco de dados

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from department");

            while (resultSet.next()){
                System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally{
            DB.closeStatement(statement);
            DB.closeResulSet(resultSet);
            DB.closeConnection();
        }*/

        // ================================================== INSERINDO DADOS NO BANCO =====================================
        /*
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy");

        try{
            conn = DB.getConnection();
            preparedStatement = conn.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId)" +
                    " VALUES " +
                    "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1,"Eduardo Franco");
            preparedStatement.setString(2,"franco@gmail.com");
            preparedStatement.setDate(3, new java.sql.Date(sdf.parse("24/09/2001").getTime()));
            preparedStatement.setDouble(4, 3471.0);
            preparedStatement.setInt(5,4);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Done! \nRows affected: " + rowsAffected);
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
         */

        // ================================================== ATUALIZAR DADOS NO BANCO =====================================
        /*
        Connection conn = null;
        PreparedStatement preparedStatement = null;

        try{
            conn = DB.getConnection();

            preparedStatement = conn.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)");
            preparedStatement.setDouble(1,200.0);
            preparedStatement.setInt(2,2);

            int rowsaffected = preparedStatement.executeUpdate();
            System.out.println("Done! \nRows affected: " + rowsaffected);

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
        */

        // ================================================== DELETAR DADOS NO BANCO =====================================
        /*
        Connection conn = null;
        PreparedStatement preparedStatement = null;

        try{
            conn = DB.getConnection();
            preparedStatement = conn.prepareStatement("DELETE FROM department WHERE Id = ?");
            preparedStatement.setInt(1,5);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Done ! \n Rows affected: " + rowsAffected);
        }catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
        */
        // ================================================== TRANSAÇÃO DADOS NO BANCO =====================================

        Connection connection = null;
        Statement statement = null;



        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false); //protege a transação de alterações
            statement = connection.createStatement();

            int rowsOne = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
            int rowsTwo = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit(); //encerra aqui a proteção

            System.out.println("Rows 1 = " + rowsOne);
            System.out.println("Rows 2 = " + rowsTwo);

        }catch (SQLException e){
            try {
                connection.rollback();//volta ao estado inicial do banco caso seja encontrado alguma exceção durante a execução do codigo
                throw new DbException("Transaction rolled back !! \n Caused by " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback \n Caused by " + ex.getMessage());
            }
        }finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}