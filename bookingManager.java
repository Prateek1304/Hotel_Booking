public class duplicateelement {

    public static void main(String[] args) {

        int [] arr= {3,6,7,3,4,8,4,6};

        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
