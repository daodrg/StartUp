package s5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Yura on 28.01.14.
 */

@Controller
public class WelcomeController
{
    @RequestMapping(value="/")
    public String ProcessRoot()
    {
        return "index";
    }
}
