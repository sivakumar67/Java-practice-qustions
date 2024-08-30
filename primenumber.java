import java.util.Scanner;
class sample{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start:");
        int s=sc.nextInt();
        System.out.println("Enter End: ");
        int e=sc.nextInt();
        for(int i=s;i<=e;i++){
            boolean res=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    res=false;
                }
            }
            if(res && i!=1){
                System.out.println(" "+ i);
            }
        }
    }
}
