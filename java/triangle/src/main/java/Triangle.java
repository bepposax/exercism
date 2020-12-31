class Triangle {
    private double s1, s2, s3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            throw new TriangleException();
        else {
            double maxSide = Math.max(Math.max(side1, side2), side3);
            // Inequality check
            if (maxSide > Math.min(Math.min(side1 + side2, side2 + side3), side1 + side3))
                throw new TriangleException();
        }
        s1 = side1;
        s2 = side2;
        s3 = side3;
    }

    boolean isEquilateral() {
        return (s1 == s2) && (s2 == s3);
    }

    boolean isIsosceles() {
        return (s1 == s2) || (s2 == s3) || (s1 == s3);
    }

    boolean isScalene() {
        return (!isIsosceles());
    }

}
