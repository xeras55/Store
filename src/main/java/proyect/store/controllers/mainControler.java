package proyect.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyect.store.service.MyService;



@Controller
public class mainControler {
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
}
