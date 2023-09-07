package proyect.store.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import proyect.store.model.CategSubCaAux;
import proyect.store.model.CategoriesModel;
import proyect.store.model.SubCategoriesModel;
import proyect.store.repository.CateSubAuxRepo;
import proyect.store.repository.CategoriesRepo;
import proyect.store.repository.SubCatRepo;
import proyect.store.service.implementations.BringAllService;

@Service
public class BringAllData implements BringAllService{
  @Autowired
  private CategoriesRepo categoriesRepo;
  @Autowired
  private CateSubAuxRepo cateSubAuxRepo;
  @Autowired
  private SubCatRepo subCatRepo;

  public BringAllData() {
  }



  List<Long> listAux = new ArrayList<>();

  

  TreeMap<Long,String> treeMap = new TreeMap<>();
  
  TreeMap<Long,List<Long>> subMap = new TreeMap<>();

  TreeMap<Long,List<String>> valuesMap = new TreeMap<>();

  TreeMap<Long,List<String>> valuesMapim = new TreeMap<>();

  List<List<Long>> lislist = new ArrayList<>();
  List<List<String>> listString = new ArrayList<>();
  List<String> listStringnull = new ArrayList<>();



  public List<Long> BringAllDataall(){
  List<CategoriesModel> fList = categoriesRepo.findAll();//!a
  //List<Long> sList = cateSubAuxRepo.fidByMySelf(4L);//!c
  List<Long> listaDeIds = Arrays.asList(1L, 2L, 3L);
  List<String> tList = subCatRepo.findNamesByIds(listaDeIds);

  for (CategoriesModel categoriesModel : fList) {
    treeMap.put(categoriesModel.getId_categoria_p(), categoriesModel.getNombre_categoria());
    lislist.add(cateSubAuxRepo.fidByMySelf(categoriesModel.getId_categoria_p()));
    //subMap.put(categoriesModel.getId_categoria_p(), cateSubAuxRepo.fidByMySelf(categoriesModel.getId_categoria_p()));
    
  }
  //System.out.println(treeMap);
  //System.out.println(lislist);
  //System.out.println(subMap);

  

    for (int i = 0; i < lislist.size(); i++) {
    //System.out.println(subCatRepo.findNamesByIds(lislist.get(i)));
    valuesMap.put((long)i+1, subCatRepo.findNamesByIds(lislist.get(i)));
  }
  //System.out.println(valuesMap);

  /*
  System.out.println(subCatRepo.findNamesByIds(lislist.get(0)));
  System.out.println(subCatRepo.findNamesByIds(lislist.get(1)));
  System.out.println(subCatRepo.findNamesByIds(lislist.get(2)));
  System.out.println(subCatRepo.findNamesByIds(lislist.get(3)));
   */

  
  return listAux;
  }



  public List<List<String>> trial(){
  List<CategoriesModel> fList = categoriesRepo.findAll();//!a
  //List<Long> sList = cateSubAuxRepo.fidByMySelf(4L);//!c
  List<Long> listaDeIds = Arrays.asList(1L, 2L, 3L);
  List<String> tList = subCatRepo.findNamesByIds(listaDeIds);

  for (CategoriesModel categoriesModel : fList) {
    treeMap.put(categoriesModel.getId_categoria_p(), categoriesModel.getNombre_categoria());
    lislist.add(cateSubAuxRepo.fidByMySelf(categoriesModel.getId_categoria_p()));
    //subMap.put(categoriesModel.getId_categoria_p(), cateSubAuxRepo.fidByMySelf(categoriesModel.getId_categoria_p()));
  }
  //System.out.println(treeMap);
  //System.out.println(lislist);
  //System.out.println(subMap);

  

    for (int i = 0; i < lislist.size(); i++) {
    //System.out.println(subCatRepo.findNamesByIds(lislist.get(i)));
    //valuesMap.put((long)i+1, subCatRepo.findNamesByIds(lislist.get(i)));
    listString.add(subCatRepo.findNamesByIds(lislist.get(i)));
  }
  //System.out.println(listString);

  /*
  System.out.println(subCatRepo.findNamesByIds(lislist.get(0)));
  System.out.println(subCatRepo.findNamesByIds(lislist.get(1)));
  System.out.println(subCatRepo.findNamesByIds(lislist.get(2)));
  System.out.println(subCatRepo.findNamesByIds(lislist.get(3)));
   */

  
  return listString;
  }

  @PostConstruct
  public void initialize(){
    valuesMapim = valuesMap;
  }



  @Override
  public TreeMap<Long, List<String>> listMap() {
    return valuesMapim;
  }

  
}
