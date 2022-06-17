abstract class Tuple3d {
 
   public double x;
   public double y;
   public double z;
 
   public Tuple3d(double x, double y, double z) {
       this.x = x;
       this.y = y;
       this.z = z;
   }
 
   public Tuple3d(double[] t) {
       this.x = t[0];
       this.y = t[1];
       this.z = t[2];
   }
 
   @Override
   public String toString() {
       return "(" + this.x + ", " + this.y + ", " + this.z + ")";
   }
}






 
public class Vector3d extends Tuple3d {
 
 public Vector3d(double x, double y, double z) {
   super(x, y, z);
 }
 
 public Vector3d(double[] v) {
   super(v);
 }
 
 public Vector3d() {
   super(0, 0, 0);
 }
 
 public final void cross(Vector3d v1, Vector3d v2) {
   this.z = v1.x * v2.y - v1.y * v2.x;
   this.x = v1.y * v2.z - v1.z * v2.y;
   this.y = v2.x * v1.z - v2.z * v1.x;
 }
 
 public final void normalize() {
   this.x *= 1.0 / Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
   this.y *= 1.0 / Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
   this.z *= 1.0 / Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
 }
 
 public final double dot(Vector3d v1) {
   return this.x * v1.x + this.y * v1.y + this.z * v1.z;
 }
 
 public final double length() {
   return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
 }
 
 public final double angle(Vector3d v1) {
   double vDot = this.dot(v1) / (this.length() * v1.length());
   if (vDot < -1.0)
     vDot = -1.0;
   if (vDot > 1.0)
     vDot = 1.0;
   return (double) Math.acos(vDot);
 }
 
}
