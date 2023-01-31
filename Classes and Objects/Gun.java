public class Gun {
  
    // Rundown of Gun attributes
    int MagazineCapacity;
    String name;
    double FireRate;

    // Gun method
    public void sayGunName() {
        System.out.println("Valorant gun:" + name);
    }

    public void sayMagazineCapacity() {
        System.out.println("Magazine capacity:" + MagazineCapacity);
    }

    public void sayFireRate() {
        System.out.println("Fire rate:" + FireRate);
    }

    // Using or inputting a constructor
    public Gun(int mgc, String gunName, double dfr ) {
        MagazineCapacity = mgc;
        name = gunName;
        FireRate = dfr;
    }
}
