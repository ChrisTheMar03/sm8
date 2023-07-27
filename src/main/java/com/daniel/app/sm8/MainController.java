package com.daniel.app.sm8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    
    @GetMapping(path = "/")
    public @ResponseBody String index(){
        return "Demo application";
    }

    

}
