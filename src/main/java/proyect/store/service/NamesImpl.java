package proyect.store.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import proyect.store.DTO.CategoriesNamesDTO;
import proyect.store.model.CategoriesModel;
import proyect.store.repository.CategoriesRepo;

@Service
public class NamesImpl implements NamesService {
  
  @Autowired
  private CategoriesRepo categoriesRepo;


  private List<CategoriesModel> list;



  public NamesImpl() {
    
  }
  @PostConstruct
  public void initialize(){
    list = categoriesRepo.findAll();
  }
  /*
  public List<String> test(){
    List<CategoriesModel> res = categoriesRepo.findAll();
    List<String> re = new ArrayList<>();
    for (CategoriesModel categoriesModel : res) {
    System.out.println(categoriesModel.getNombre_categoria());
    re.add(categoriesModel.getNombre_categoria());
    }
    return re;
  }
  */
  @Override
  public List<CategoriesModel> list() {
  return list;
  }

}
