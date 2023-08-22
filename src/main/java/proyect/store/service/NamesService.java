package proyect.store.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyect.store.DTO.CategoriesNamesDTO;
import proyect.store.model.CategoriesModel;
import proyect.store.repository.CategoriesRepo;


@Service
public class NamesService {
  @Autowired
  private CategoriesRepo categoriesRepo;


  private List<CategoriesNamesDTO> list;

  public List<String> test(){
    //List<Object[]> result = categoriesRepo.getAll();
    List<String> res = new ArrayList<>();
  
    return null;
    
  }
}
