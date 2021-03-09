package madkassen.formadresten.model;

public class Madkassen
{
    private String firstName;
    private String lastName;
    private String email;

    private String forslag;

    private String forbrugeren;
    private String virksomhed;
    private String organisation;


    // Constructer.
    public Madkassen( String firstName, String lastName, String email, String forslag, String forbrugeren, String virksomhed, String organisation)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.forslag = forslag;
        this.forbrugeren = forbrugeren;
        this.virksomhed = virksomhed;
        this.organisation = organisation;
    }

    // Getter.
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getForslag() { return forslag; }
    public String getForbrugeren() { return forbrugeren; }
    public String getVirksomhed() { return virksomhed; }
    public String getOrganisation() { return organisation; }



}
