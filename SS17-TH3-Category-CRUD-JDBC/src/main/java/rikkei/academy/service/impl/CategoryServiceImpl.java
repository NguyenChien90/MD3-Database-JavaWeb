package rikkei.academy.service.impl;

import org.springframework.stereotype.Service;
import rikkei.academy.model.Category;
import rikkei.academy.service.CategoryService;
import rikkei.academy.utils.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<Category> findAll() {
        Connection conn = ConnectionDB.openConnection();
        List<Category> categories = new ArrayList<>();
        try {
            CallableStatement callableStatement = conn.prepareCall("{call findAllCategory()}");
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()){
                Category category = new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getBoolean("status")
                );
                categories.add(category);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn);
        }
        return categories;
    }

    @Override
    public Category findById(Integer id) {
        Connection conn = ConnectionDB.openConnection();
        Category category = new Category();
        try {
            CallableStatement callableStatement = conn.prepareCall("{call findByIdCategory(?)}");
            callableStatement.setInt(1,id);
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()){
                category = new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getBoolean("status")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn);
        }
        return category;
    }

    @Override
    public void save(Category category) {
        Connection conn = ConnectionDB.openConnection();
        CallableStatement callableStatement;
        try {
            if (category.getId() == null){
                callableStatement = conn.prepareCall("{call addNewCategory(?,?)}");
                callableStatement.setString(1,category.getName());
                callableStatement.setBoolean(2,category.getStatus());
            }else {
                callableStatement = conn.prepareCall("{call updateInfoCategory(?,?,?)}");
                callableStatement.setInt(1,category.getId());
                callableStatement.setString(2,category.getName());
                callableStatement.setBoolean(3,category.getStatus());
            }
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn);
        }
    }

    @Override
    public void delete(Integer id) {
        Connection conn = ConnectionDB.openConnection();
        try {
            CallableStatement callableStatement = conn.prepareCall("{call deleteInfoCategory(?)}");
            callableStatement.setInt(1,id);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn);
        }


    }
}
