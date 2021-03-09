package madkassen.formadresten.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MyController
{
    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/forbrugeren")
    public String forbrugeren()
    {
        return "forbrugeren";
    }

    @GetMapping("/virksomhed")
    public String virksomhed()
    {
        return "virksomhed";
    }

    @GetMapping("/organnsation")
    public String organisation()
    {
        return "organnsation";
    }

    @PostMapping("/")
    public String tavleopslag()
    {

        return  "redirect: /opslagstavlen";
    }

    @GetMapping("/opslagstavlen")
    public String opslagstavlen()
    {
        return "opslagstavlen";
    }
}
