class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    class Attraction {
        private String name;
        private int workingHours;
        private int cost;

        public Attraction(String name, int workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public String getInfo() {
            return "Attraction: " + name + ", Working Hours: " + workingHours + " hours, Cost: $" + cost;
        }
    }
}