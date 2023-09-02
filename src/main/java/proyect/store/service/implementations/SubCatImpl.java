package proyect.store.service.implementations;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.annotation.PostConstruct;
import proyect.store.repository.SubCatRepo;
import proyect.store.service.services.SubCatService;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class SubCatImpl implements SubCatService{

  @Autowired
  private SubCatRepo subCatRepo;

  //private List<SubCategoriesModel> listSub;
  private List<String> listSubN;
  
  private List<Long> idsToStart;
  List<Long> listaDeIds = Arrays.asList(1L, 2L, 3L);

  public SubCatImpl(List<Long> listaDeIds) {
    this.idsToStart = listaDeIds;
}

  @PostConstruct
  public void initialize(){
    //listSub = subCatRepo.findAll();
    listSubN = subCatRepo.findNamesByIds(listaDeIds);
  }


  /*
  @Override
  public List<SubCategoriesModel> listSub() {
    return listSub;
  }
 */
    @Override
  public List<String> listSubN() {
    return listSubN;
  }
  
}
//!la implementacion es lo que esta mal no puedo hacerla un service