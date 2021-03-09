package madkassen.formadresten.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController
{
    @GetMapping("/index")
    public String index()
    {
        return "index";
    }

    @GetMapping("/forbrugeren")
    public String forbrugeren()
    {
        return "forbrugeren";
    }

    @GetMapping("/organisation")
    public String organisation()
    {
        return "organisation";
    }

    @GetMapping("/virksomhed")
    public String virksomhed()
    {
        return "virksomhed";
    }


}
