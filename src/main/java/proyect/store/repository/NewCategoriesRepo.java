package proyect.store.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
  /*
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
     */

  /* */
  @Autowired
  private Connection con;


  public NewCategoriesRepo(Connection con){
    this.con = con;
  }

  public List<CategoriesModel> getAllCategories() throws SQLException {
    List<CategoriesModel> res = new ArrayList<>();
    try {
      final PreparedStatement statement = con
      .prepareStatement("SELECT * FROM categorias_principales");

      try(statement){
        statement.execute();
        final ResultSet resultSet = statement.getResultSet();

        try(resultSet){
          while(resultSet.next()){
            res.add(new CategoriesModel(resultSet.getLong("id_categoria_p"),
                                        resultSet.getString("nombre_categoria")));
          }
        }
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    for (CategoriesModel categoriesModel : res) {
      System.out.println(categoriesModel.getNombre_categoria());
    }
    
    return res;
    
  }

  
}
