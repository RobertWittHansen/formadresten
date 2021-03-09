package madkassen.formadresten.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController
{
    // Main site.
    @GetMapping("/index")
    public String index()
    {
        return "index";
    }

    // Statisk info til bruger.
    @GetMapping("/forbrugeren")
    public String forbrugeren()
    {
        return "forbrugeren";
    }

    // Statisk info til bruger.
    @GetMapping("/virksomhed")
    public String virksomhed()
    {
        return "virksomhed";
    }

    // Statisk info til bruger.
    @GetMapping("/organisation")
    public String organisation()
    {
        return "organisation";
    }



    // Koden til: profil, opslagstavlen.
    @GetMapping("/form")
    public String form()
    {
        return "form";
    }

    // postmapping sender "dit" tavleopslag videre.
    @PostMapping("/tavleopslag")
    public String tavleopslag(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname,
                              @RequestParam("email") String email, @RequestParam("forslag") String forslag)
    {


        return  "redirect:/succes";
    }

    // griber det omdrigeret opslag, så brugeren kan se det.
    @GetMapping("/succes")
    public String succes()
    {


        return "succes";
    }


    // Selve opslaget.
    @GetMapping("/opslagstavlen")
    public String opslagstavlen()
    {
        return "opslagstavlen";
    }
}
