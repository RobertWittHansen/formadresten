package madkassen.formadresten.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

    @GetMapping("/")


    @PostMapping("/tavleopslag")
    public String tavleopslag(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname,@RequestParam("email") String email, @RequestParam("opslagstavlen") String opslagstavlen)
    {


        return  "redirect:/opslagstavlen";
    }

    @GetMapping("/succes")
    public String succes()
    {


        return "succes";
    }


    @GetMapping("/opslagstavlen")
    public String opslagstavlen()
    {
        return "opslagstavlen";
    }
}
