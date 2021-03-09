package madkassen.formadresten.controller;


import madkassen.formadresten.model.GetSetClass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
public class MyController
{

    ArrayList<GetSetClass> dashboard = new ArrayList<>();
    // Main site.
    @GetMapping("/index")
    public String index()
    {
        return "index";
    }

    // Statisk info til bruger.
    @GetMapping("/consumer")
    public String consumer()
    {
        return "consumer";
    }

    // Statisk info til bruger.
    @GetMapping("/company")
    public String company()
    {
        return "company";
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
    @PostMapping("/post")
    public String post(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname,
                       @RequestParam("email") String email, @RequestParam("date") String date,
                       @RequestParam("postname") String postname, @RequestParam("postarea") String postarea)
    {
        GetSetClass dashboardarray = new GetSetClass(firstname,lastname,email,postname,postarea);
        dashboard.add(dashboardarray);
        return  "redirect:/succes";
    }

    // griber det omdrigeret opslag, så brugeren kan se det.
    @GetMapping("/succes")
    public String succes()
    {
        return "succes";
    }


    // Selve opslagstavlen (dashboardet).
    @GetMapping("/dashboard")
    public String dashboard()
    {
        return "dashboard";
    }
}
