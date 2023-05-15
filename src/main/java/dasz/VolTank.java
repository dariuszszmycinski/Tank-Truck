package dasz;

public class VolTank {
    public static int tankVol(int h, int d, int vt) {
        double r = (double) d /2;
        double triangleHeight = Math.abs(r-h);
        double angle = Math.acos(triangleHeight / r); //radian
        double area = angle* r * r - r * r *Math.sin(angle)*Math.cos(angle);
        double percentOfVolume;
        if (h<r){
            percentOfVolume = area/(Math.PI*r*r);
        } else {
            percentOfVolume = 1-area/(Math.PI*r*r);
        }
        double result = vt*percentOfVolume;
        return (int) result;
    }
}
