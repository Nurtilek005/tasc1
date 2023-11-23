
    class Cylinder {
        private double radius;
        private double height;

        public Cylinder(double radius, double height) {
            if (radius <= 0 || height <= 0) {
                throw new IllegalArgumentException("Параметры должны быть положительными числами");
            }

            this.radius = radius;
            this.height = height;
        }

        public double calculateArea() {
            return 2 * Math.PI * radius * (height + radius);
        }

        public double calculateVolume() {
            return Math.PI * radius * radius * height;
        }
    }

