package proyect.store.service.implementations;

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
import proyect.store.service.services.NamesService;

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

  @Override
  public List<CategoriesModel> list() {
  return list;
  }

}
