package proyect.store.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyect.store.DTO.CategoriesNamesDTO;
import proyect.store.model.CategoriesModel;
import proyect.store.repository.CategoriesRepo;
import proyect.store.service.MyService;

@RestController
@Controller
public class MainControler {
  @Autowired
  private CategoriesRepo categoriesRepo;

  private  MyService service= new MyService();
  @GetMapping("/inicio")
  public String main(Model model){
    model.addAttribute("objeto", service.myop());
    return "main";
  }
    @GetMapping("/test")
  public String test(Model model){
    model.addAttribute("objeto", service.myop());
    return "test";
  }
  
  @GetMapping("/a")
  public List<CategoriesModel> verPuerbas(){
  return categoriesRepo.findAll();
  }

    @GetMapping("/b")
  public List<CategoriesModel> verPuerbas1(){
    List<CategoriesModel> res = categoriesRepo.findAll();
    for (CategoriesModel categoriesModel : res) {
    System.out.println(categoriesModel.getNombre_categoria()); 
    }
    return categoriesRepo.findAll();

  }
}

