package proyect.store.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import proyect.store.model.SubCategoriesModel;
import proyect.store.repository.CateSubAuxRepo;
import proyect.store.service.services.SubCatService;
@Service
public class SubCatImpl implements SubCatService{

  @Autowired
  private CateSubAuxRepo categoriesRepo;
  
  private List<Long> listSub;

  public SubCatImpl() {
  }

    @PostConstruct
  public void initialize(){
    listSub = categoriesRepo.fidByMySelf(4L);
  }


  @Override
  public List<Long> listSub() {
    return listSub;
  }
  
}
