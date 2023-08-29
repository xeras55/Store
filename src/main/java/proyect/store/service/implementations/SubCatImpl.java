package proyect.store.service.implementations;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.PostConstruct;
import proyect.store.model.SubCategoriesModel;
import proyect.store.repository.SubCatRepo;
import proyect.store.service.services.SubCatService;

public class SubCatImpl implements SubCatService{
  @Autowired
  private SubCatRepo subCatRepo;

  private List<SubCategoriesModel> listSub;
  private List<String> listSubN;
  

  public SubCatImpl() {

  }

  @PostConstruct
  public void initialize(List<Long> ids){
    //listSub = subCatRepo.findAll();
    listSubN = subCatRepo.findNamesByIds(ids);
  }



  @Override
  public List<SubCategoriesModel> listSub() {
    return listSub;
  }

    @Override
  public List<String> listSubN() {
    return listSubN;
  }
  
}
