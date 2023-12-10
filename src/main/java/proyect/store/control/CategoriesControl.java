package proyect.store.control;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyect.DataBaseConecction;
import proyect.store.model.CategoriesModel;
import proyect.store.repository.NewCategoriesRepo;

@Service
public class CategoriesControl {
  
  @Autowired
  DataBaseConecction dataBaseConecction;
  @Autowired
  private NewCategoriesRepo ewCategoriesRepo;

  public CategoriesControl() {
    DataBaseConecction data = new DataBaseConecction();
    this.ewCategoriesRepo = new NewCategoriesRepo(data.getConnection());
  }

  public void list() throws SQLException {
    ewCategoriesRepo.getAllCategories();
  }

}
