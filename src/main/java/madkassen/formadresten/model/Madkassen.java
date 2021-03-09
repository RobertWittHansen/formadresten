package madkassen.formadresten.model;

public class Madkassen
{
    private String forNavn;
    private String efterNavn;
    private String email;

    private String forslag;

    private String forbrugeren;
    private String virksomhed;
    private String organisation;


    // Constructer.
    public Madkassen( String forNavn, String efterNavn, String email, String forslag, String forbrugeren, String virksomhed, String organisation)
    {
        this.forNavn = forNavn;
        this.efterNavn = efterNavn;
        this.email = email;
        this.forslag = forslag;
        this.forbrugeren = forbrugeren;
        this.virksomhed = virksomhed;
        this.organisation = organisation;
    }

    // Getter.
    public String getForNavn() { return forNavn; }
    public String getEfterNavn() { return efterNavn; }
    public String getEmail() { return email; }
    public String getForslag() { return forslag; }
    public String getForbrugeren() { return forbrugeren; }
    public String getVirksomhed() { return virksomhed; }
    public String getOrganisation() { return organisation; }



}
