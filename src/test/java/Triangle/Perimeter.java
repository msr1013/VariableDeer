package Triangle;

public class Perimeter {

    public void perimeter(double[] a){
        double p=0;
        for(int i=0;i<a.length;i++){
             p +=a[i];
        }
        System.out.println("perimeter is :"+p);

    }

}
