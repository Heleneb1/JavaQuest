public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String whoAmI() {
        if (aware) {
            return "Je m'appelle" + " " + this.getFirstName() + " " + "et je suis aware";
        } else {
            return "Je m'appelle" + " " + this.getFirstName() + " " + "et je ne suis pas aware";
        }
    }

    // getters
    public String getFirstName() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    // setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
}