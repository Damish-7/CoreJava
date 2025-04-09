package com.xworkz.encapsulation.internal;

public class Badge {
        private String type;
        private String issuedBy;
        private int level;
        private boolean valid;
        private double size;

        // Setters (package-private)
        void setType(String type) { this.type = type; }
        void setIssuedBy(String issuedBy) { this.issuedBy = issuedBy; }
        void setLevel(int level) { this.level = level; }
        void setValid(boolean valid) { this.valid = valid; }
        void setSize(double size) { this.size = size; }

        // Getters (public)
        public String getType() { return type; }
        public String getIssuedBy() { return issuedBy; }
        public int getLevel() { return level; }
        public boolean isValid() { return valid; }
        public double getSize() { return size; }

        public void scan() {
            System.out.println("Badge of type " + type + " scanned successfully.");
        }
}
