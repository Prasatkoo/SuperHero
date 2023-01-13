public class SuperHero {
    private String heroName;
    private String fullname;
    private String gender;
    private String race;
    private String team;

    public String getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(String publisherid) {
        this.publisherid = publisherid;
    }

    private String publisherid;


    public SuperHero(String heroName, String fullname, String gender, String race, String team, String publisherid) {
        this.heroName = heroName;
        this.fullname = fullname;
        this.gender = gender;
        this.race = race;
        this.team = team;
        this.publisherid = publisherid;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
