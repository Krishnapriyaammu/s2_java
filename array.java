import java.util.Scanner;
class Arayy{
public static void main(String args[]){
int arr[] = new int[10];
int i,j,temp,sum=0;
Scanner input = new Scanner(System.in);
System.out.println("Enter array size:");
int n = input.nextInt();
System.out.println("Enter array elements:");

for(i=0;i<n;i++){
arr[i] = input.nextInt();
}

//sorting elements
for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
           if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
}
}}
System.out.println("Array elements are:");
for(i=0;i<n;i++){
        System.out.print(arr[i]+" ");
}

//Sum of elements
for(i=0;i<n;i++){
         sum = sum+arr[i];
}
System.out.println("Sum of elements are:"+sum);


//Max & Min
System.out.println("Max value is:"+arr[0]);
System.out.println("Min value is:"+arr[n-1]);


//search
System.out.println("Enter an element to search:");
int in = input.nextInt();
for(i=0;i<n;i++){
        if(arr[i]==in){
          System.out.println("Element found at index:"+i);
  return;
}
}
System.out.println("Not found");
}
}
