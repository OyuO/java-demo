package org.zy;

import java.util.Scanner;

public class Wgs84ToEnuUtil {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Please enter longitude:");
        var lon = scanner.nextDouble();
        System.out.println("Please enter latitude:");
        var lat = scanner.nextDouble();
        System.out.println("Please enter height:");
        var h = scanner.nextDouble();
        //此处经纬度是需要比对的偏移经纬度
        var pointEcef = wgs84ToEcef(lat, lon, h);
        System.out.println(pointEcef);
    }

    public static PointEcef wgs84ToEcef(double latitude, double longitude, double height) {
        double x;
        double y;
        double z;
        double a = 6378137.0;
        double b = 6356752.31424518;
        double E = (a * a - b * b) / (a * a);
        double COSLAT = Math.cos(latitude * Math.PI / 180);
        double SINLAT = Math.sin(latitude * Math.PI / 180);
        double COSLONG = Math.cos(longitude * Math.PI / 180);
        double SINLONG = Math.sin(longitude * Math.PI / 180);
        double N = a / (Math.sqrt(1 - E * SINLAT * SINLAT));
        double NH = N + height;
        x = NH * COSLAT * COSLONG;
        y = NH * COSLAT * SINLONG;
        z = (b * b * N / (a * a) + height) * SINLAT;

        return new PointEcef(x, y, z);

    }

    public static double[] ecefToEnu(double x, double y, double z, double lat, double lng, double height) {
        double a = 6378137;
        double b = 6356752.3142;
        double f = (a - b) / a;
        double e_sq = f * (2 - f);
        double lamb = Math.toRadians(lat);
        double phi = Math.toRadians(lng);
        double s = Math.sin(lamb);
        double N = a / Math.sqrt(1 - e_sq * s * s);
        double sin_lambda = Math.sin(lamb);
        double cos_lambda = Math.cos(lamb);
        double sin_phi = Math.sin(phi);
        double cos_phi = Math.cos(phi);

        double x0 = (height + N) * cos_lambda * cos_phi;
        double y0 = (height + N) * cos_lambda * sin_phi;
        double z0 = (height + (1 - e_sq) * N) * sin_lambda;

        double xd = x - x0;
        double yd = y - y0;
        double zd = z - z0;

        double t = -cos_phi * xd - sin_phi * yd;

        double xEast = -sin_phi * xd + cos_phi * yd;
        double yNorth = t * sin_lambda + cos_lambda * zd;
        double zUp = cos_lambda * cos_phi * xd + cos_lambda * sin_phi * yd + sin_lambda * zd;
        return new double[]{xEast, yNorth, zUp};
    }

    public static class PointEcef {
        private Double x;

        private Double y;

        private Double z;

        public PointEcef(Double x, Double y, Double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public String toString() {
            return String.format("X:%f, Y:%f, Z:%f",this.x,this.y,this.z);
        }

        public Double getX() {
            return x;
        }

        public Double getY() {
            return y;
        }

        public Double getZ() {
            return z;
        }
    }

}
