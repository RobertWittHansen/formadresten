package madkassen.formadresten.model;

public class GetSetClass
{
    private String firstname;
    private String lastname;
    private String email;
    private String postname;
    private String postarea;




    // Constructer.
    public GetSetClass(String firstname, String lastname, String email,
                       String postname, String post)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.postname = postname;
        this.postarea = postarea;


    }

    // Getters.


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
    public String getPostname() {
        return postname;
    }
    public String getPostarea() {
        return postarea;
    }


    }
