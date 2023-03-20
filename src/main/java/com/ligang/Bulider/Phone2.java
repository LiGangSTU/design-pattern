package com.ligang.Bulider;

public class Phone2 {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    private Phone2(Bulider bulider){
        cpu = bulider.cpu;
        screen = bulider.screen;
        memory = bulider.memory;
        mainboard = bulider.mainboard;
    }

    public static final class Bulider{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Bulider(String cpu, String screen, String memory, String mainboard) {
            this.cpu = cpu;
            this.screen = screen;
            this.memory = memory;
            this.mainboard = mainboard;
        }

        public Bulider() {
        }

        public Bulider cpu(String val) {
            cpu = val;
            return this;
        }
        public Bulider screen(String val) {
            screen = val;
            return this;
        }
        public Bulider memory(String val) {
            memory = val;
            return this;
        }
        public Bulider mainboard(String val) {
            mainboard = val;
            return this;
        }
        public Phone2 build() {
            return new Phone2(this);
        }
    }
    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}
