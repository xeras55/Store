package proyect.store.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyect.store.model.CategSubCaAux;
import proyect.store.model.CategoriesModel;
import proyect.store.model.SubCategoriesModel;
import proyect.store.repository.CateSubAuxRepo;
import proyect.store.repository.CategoriesRepo;
import proyect.store.repository.SubCatRepo;

@Service
public class BringAllData {
  @Autowired
  private CategoriesRepo categoriesRepo;
  @Autowired
  private CateSubAuxRepo cateSubAuxRepo;
  @Autowired
  private SubCatRepo subCatRepo;

  private String res= "";
  List<CategoriesModel> listCategories = new ArrayList<>();
  List<Long> listAux = new ArrayList<>();
  List<SubCategoriesModel> listSubcat = new ArrayList<>();
  TreeMap<Long,String> treeMap = new TreeMap<>();


  public List<Long> BringAllDataall(){
  List<CategoriesModel> fList = categoriesRepo.findAll();//!a
  for (CategoriesModel categoriesModel : fList) {
    treeMap.put(categoriesModel.getId_categoria_p(), categoriesModel.getNombre_categoria());
    System.out.println(treeMap);
  }
  List<Long> sList = cateSubAuxRepo.fidByMySelf(4L);//!c
  System.out.println(sList);
  List<SubCategoriesModel> tList = subCatRepo.findAll();  //!d
  for (SubCategoriesModel iterable_element : tList) {
    System.out.println(iterable_element.getNombre_subcategoria());
  }

    return sList;
  }
}
