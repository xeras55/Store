package proyect.store.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyect.DataBaseConecction;
import proyect.store.model.CategoriesModel;

@Service
public class NewCategoriesRepo {
  @Autowired
  DataSource dataSource;

    public List<CategoriesModel> getAllCategories() throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM categorias_principales");

        List<CategoriesModel> categories = new ArrayList<>();
        while (resultSet.next()) {
            CategoriesModel category = new CategoriesModel();
            category.setId_categoria_p(resultSet.getLong("id_categoria_p"));
            category.setNombre_categoria(resultSet.getString("nombre_categoria"));
            categories.add(category);
        }
        for (CategoriesModel categoriesModel : categories) {
          System.out.println(categoriesModel.getNombre_categoria());
        }

        return categories;
    }

}
