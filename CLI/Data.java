package CLI;
public class Data {
    private String name;
    private String nim;
    private String hobby;
    private String motto;

    public Data(String name, String nim, String hobby, String motto) {
        this.name = name;
        this.nim = nim;
        this.hobby = hobby;
        this.motto = motto;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public String getHobby() {
        return hobby;
    }

    public String getMotto() {
        return motto;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
}