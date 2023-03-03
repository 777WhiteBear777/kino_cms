package lab.space.kino_cms.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main")
public class MainPageController {
    @GetMapping({"/",""})
    public String showMainPage(){
        return "/web/pages/main-page/main-page";
    }
}