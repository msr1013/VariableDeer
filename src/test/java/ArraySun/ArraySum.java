package ArraySun;

public class ArraySum {

    public void addArray(){
        int number[] = {1,2,3};
        int sum=0;
        for (int i=0;i< number.length;i++){
            sum=sum+number[i];
        }
        System.out.println("sum is:" + sum);
    }

    public void StringArrays(){
        String fruitNames[] = {"mango","banana"};
        for (String fruits: fruitNames){
            System.out.println(fruits);
        }
    }

    public void displayMatrix() {
        int multi[][] = {{1,2,3},{4,5,6}};
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(multi[i][j]);
            }
            System.out.println();
        }
    }

}
