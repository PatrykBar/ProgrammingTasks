package Patryk.company.builder;

public class House {

    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    private House(HouseBuilder houseBuilder){
        this.walls = houseBuilder.walls;
        this.floors = houseBuilder.floors;
        this.rooms = houseBuilder.rooms;
        this.roof = houseBuilder.roof;
        this.windows = houseBuilder.windows;
        this.doors = houseBuilder.doors;
        this.garage = houseBuilder.garage;
    }

//    public House(String walls, String floors, String rooms, String roof, String windows, String doors, String garage) {
//        this.walls = walls;
//        this.floors = floors;
//        this.rooms = rooms;
//        this.roof = roof;
//        this.windows = windows;
//        this.doors = doors;
//        this.garage = garage;
//    }
//
//    public House(String walls, String floors, String rooms, String roof, String windows, String doors) {
//        this.walls = walls;
//        this.floors = floors;
//        this.rooms = rooms;
//        this.roof = roof;
//        this.windows = windows;
//        this.doors = doors;
//    }

    public String getWalls() {
        return walls;
    }

    public String getFloors() {
        return floors;
    }

    public String getRooms() {
        return rooms;
    }

    public String getRoof() {
        return roof;
    }

    public String getWindows() {
        return windows;
    }

    public String getDoors() {
        return doors;
    }

    public String getGarage() {
        return garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }

    public static class HouseBuilder{
        private String walls;
        private String floors;
        private String rooms;
        private String roof;
        private String windows;
        private String doors;
        private String garage;

        public HouseBuilder buildWalls(String walls){
            this.walls = walls;
            return this;
        }

        public HouseBuilder buildFloors(String floors){
            this.floors = floors;
            return this;
        }
        public HouseBuilder buildRooms(String rooms){
            this.rooms = rooms;
            return this;
        }
        public HouseBuilder buildRoof(String roof){
            this.roof = roof;
            return this;
        }
        public HouseBuilder buildWindows(String windows){
            this.windows = windows;
            return this;
        }
        public HouseBuilder buildDoors(String doors){
            this.doors = doors;
            return this;
        }
        public HouseBuilder buildGarage(String garage){
            this.garage = garage;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }

}
