package proyect.store.service.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import proyect.store.model.CategoriesModel;
import proyect.store.repository.CateSubAuxRepo;
import proyect.store.repository.CategoriesRepo;
import proyect.store.repository.SubCatRepo;
import proyect.store.service.services.SubCatService;

@Primary
@Service
public class SubCatIm implements SubCatService {
  @Autowired
  private CategoriesRepo categoriesRepo;// !aquin traemos el id y la categoria principal trae todo, no necesita id

  @Autowired
  private CateSubAuxRepo cateSubAuxRepo;// ! aqui regresa una lista con los valores de la lista auxiliar donde se
                                        // encuentre "X" id

  @Autowired
  private SubCatRepo subCatRepo;// ! aqui regresamos una lista de las sub categorias en base a una lista de id
                                // Arrays.asList(1L, 2L, 3L,4l)

  private List<String> categoriesList = new ArrayList<>();

  Map<String, List<String>> mapa = new HashMap<>();
  

  private List<String> listSubN;

  private List<Long> idsToStart;

  private List<List<String>> listSubList = new ArrayList<>();

  List<List<Long>> lislist = new ArrayList<>();

  List<Long> listaDeIds = Arrays.asList(1L, 2L, 3L, 4l);

  public List<List<String>> working() {
    List<CategoriesModel> fList = categoriesRepo.findAll();// !a

    for (CategoriesModel categoriesModel : fList) {
      // System.out.println(categoriesModel.getNombre_categoria());
      // System.out.println(cateSubAuxRepo.fidByMySelf(1l));
      // System.out.println(cateSubAuxRepo.fidByMySelf(categoriesModel.getId_categoria_p()));
      // System.out.println(subCatRepo.findNamesByIds(cateSubAuxRepo.fidByMySelf(categoriesModel.getId_categoria_p())));
      listSubList.add(subCatRepo.findNamesByIds(cateSubAuxRepo.fidByMySelf(categoriesModel.getId_categoria_p())));
      // System.out.println(subCatRepo.findNamesByIds(cateSubAuxRepo.fidByMySelf(1l)));
      // System.out.println(subCatRepo.findNamesByIds(Arrays.asList(1L, 2L, 3L,4l)));
    }
    //System.out.println(listSubList);
    return null;
  }

  public List<String> bringCategories() {
    List<CategoriesModel> fList = categoriesRepo.findAll();// !a

    for (CategoriesModel categoriesModel : fList) {
      // System.out.println(categoriesModel.getNombre_categoria());
      categoriesList.add(categoriesModel.getNombre_categoria());
      //System.out.println(categoriesModel.getNombre_categoria());
    }
    //System.out.println(categoriesList);
    return categoriesList;
  }

  public List<List<String>> bringSubCat() {
    List<CategoriesModel> fList = categoriesRepo.findAll();// !a
    for (CategoriesModel categoriesModel : fList) {
      // System.out.println(categoriesModel.getNombre_categoria());
      listSubList.add(subCatRepo.findNamesByIds(cateSubAuxRepo.fidByMySelf(categoriesModel.getId_categoria_p())));
      mapa.put("a", subCatRepo.findNamesByIds(cateSubAuxRepo.fidByMySelf(categoriesModel.getId_categoria_p())));
    }
    System.out.println(listSubList);
    return listSubList;
  }



    public Map<String, List<String>> bringBoth() {
    List<CategoriesModel> fList = categoriesRepo.findAll();// !a
    String aaa = "";
    for (CategoriesModel categoriesModel : fList) {
      //System.out.println(categoriesModel.getNombre_categoria());
      listSubList.add(subCatRepo.findNamesByIds(cateSubAuxRepo.fidByMySelf(categoriesModel.getId_categoria_p())));
      mapa.put(categoriesModel.getNombre_categoria(), subCatRepo.findNamesByIds(cateSubAuxRepo.fidByMySelf(categoriesModel.getId_categoria_p())));

    }
    System.out.println(mapa);
    return mapa;
  }


  public SubCatIm(List<Long> listaDeIds) {
    this.idsToStart = listaDeIds;
  }

  @PostConstruct
  public void initialize() {
    // listSub = subCatRepo.findAll();
    listSubN = subCatRepo.findNamesByIds(listaDeIds);
  }

  @Override
  public List<String> listSubN() {
    // return listSubN;
    return null;
  }

  @Override
  public List<List<String>> listSubN1() {

    //System.out.println(listSubN);
    return null;
  }

}
