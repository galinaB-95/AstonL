package org.example;

public class Park {
    private Attraktion attraktion;

    public class Attraktion {
        private String nameAttraktion;
        private String workingHours;
        private int cost;

        public Attraktion(String nameAttraktion, String workingHours, int cost) {
            this.nameAttraktion = nameAttraktion;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public String getNameAttraktion() {
            return nameAttraktion;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public int getCost() {
            return cost;
        }
    }

}

