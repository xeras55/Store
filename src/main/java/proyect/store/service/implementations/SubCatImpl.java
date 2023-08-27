package proyect.store.service.implementations;

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
  public void initialize(){
    //listSub = subCatRepo.findAll();
    listSubN = subCatRepo.findName(3L);
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
