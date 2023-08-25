package proyect.store.service;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import proyect.store.model.CategoriesModel;

public interface NamesService {
  public List<CategoriesModel> list();

}
