package Modul6_Pemro_II_FaisalTanjung_2410817310012;
public class Data {
    private final String name;
    private final String nim;
    private final String hobby;
    private final String motto;

    private Data(Data.Builder builder) {
        this.name = builder.name;
        this.nim = builder.nim;
        this.hobby = builder.hobby;
        this.motto = builder.motto;
    }

    public String getName() { return name; }
    public String getNim() { return nim; }
    public String getHobby() { return hobby; }
    public String getMotto() { return motto; }

    public static class Builder {
        private String name;
        private String nim;
        private String hobby;
        private String motto;

        public Builder() {}

        public Data.Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Data.Builder setNim(String nim) {
            this.nim = nim;
            return this;
        }

        public Data.Builder setHobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        public Data.Builder setMotto(String motto) {
            this.motto = motto;
            return this;
        }

        public Data build() {
            return new Data(this);
        }
    }
}