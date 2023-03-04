package lab.space.kino_cms.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("about-cinema")
public class AboutCinemaController {
    @GetMapping("news")
    public String showNewsPage(){
        return "/web/pages/about-cinema/news";
    }
    @GetMapping("contacts")
    public String showContactsPage(){
        return "/web/pages/about-cinema/contacts";
    }
    @GetMapping("cafe-bar")
    public String showCafeBarPage(){
        return "/web/pages/about-cinema/cafe-bar";
    }
    @GetMapping("advertising")
    public String showAboutCinemaPage(){
        return "/web/pages/about-cinema/advertising";
    }
}
