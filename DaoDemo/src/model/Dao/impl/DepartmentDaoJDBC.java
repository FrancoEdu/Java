package model.Dao.impl;

import db.DB;
import db.DbException;
import model.Dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentDaoJDBC implements DepartmentDao {
    private Connection conn;
    public DepartmentDaoJDBC(Connection conn){
        this.conn = conn;
    }
    @Override
    public void insert(Department obj) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try{
            preparedStatement = conn.prepareStatement("INSERT INTO department (Name) VALUES (?)" , Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, obj.getName());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0){
                resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()){
                    int id = resultSet.getInt(1);
                    obj.setId(id);
                }
            }else{
                throw new DbException("Nenhuma linha alterada!");
            }

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally{
            DB.closeStatement(preparedStatement);
            DB.closeResulSet(resultSet);
        }
    }

    @Override
    public void update(Department obj) {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conn.prepareStatement("UPDATE department SET Name=? Where Id=?");
            preparedStatement.setString(1, obj.getName());
            preparedStatement.setInt(2,obj.getId());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conn.prepareStatement("DELETE FROM seller WHERE Id = ?");
            preparedStatement.setInt(1,id);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected == 0)
                throw new DbException("Departamento nao encontrado digite um codigo valido!");
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closeStatement(preparedStatement);
        }
    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM department WHERE Id=?");
            st.setInt(1,id);
            rs = st.executeQuery();
            if (rs.next()){
                Department obj = new Department();
                obj.setId(rs.getInt("Id"));
                obj.setName(rs.getString("Name"));
                return obj;
            }
            return null; //n existia nenhum vendedor com esse Id
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResulSet(rs);
        }
    }
    @Override
    public List<Department> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT * FROM department ORDER BY Name");
            rs = st.executeQuery();

            List<Department> list = new ArrayList<>();

            while (rs.next()) {
                Department obj = new Department();
                obj.setId(rs.getInt("Id"));
                obj.setName(rs.getString("Name"));
                list.add(obj);
            }
            return list;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResulSet(rs);
        }
    }
    private Department instantiateDepartment(ResultSet rs) throws  SQLException{
        Department dep = new Department();
        dep.setId(rs.getInt("DepartmentId"));
        dep.setName(rs.getString("DepName"));
        return dep;
    }
}
