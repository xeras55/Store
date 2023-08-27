package proyect.store.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import proyect.store.repository.CateSubAuxRepo;
import proyect.store.service.services.SubCatAuxService;
@Service
public class SubCatAunxImpl implements SubCatAuxService{

  @Autowired
  private CateSubAuxRepo categoriesRepo;
  
  private List<Long> listSub;

  public SubCatAunxImpl() {
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
