package madkassen.formadresten.model;

public class GetSetClass
{
    private String firstname;
    private String lastname;
    private String email;
    private String date;
    private String postname;
    private String postarea;

    // Constructer.
    public GetSetClass(String firstname, String lastname, String email, String date,
                       String postname, String postarea)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.date = date;
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
    public String getEmail() { return email; }
    public String getDate(){ return date; }
    public String getPostname() { return postname; }
    public String getPostarea() { return postarea; }
    }

