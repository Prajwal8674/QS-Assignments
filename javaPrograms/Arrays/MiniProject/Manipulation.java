package Arrays.MiniProject;


public class Manipulation {

    Student s1 = new Student();

    public void sortById(Student[] arr){

        for(int i = 0 ; i < arr.length-1; i++){

            for(int j = 0 ; j < arr.length-1-i ; j++){

                if(arr[j].id>arr[j+1].id){
                    Student[] temp = new Student[arr.length] ;
                    temp[j] = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp[j];
                }
            }
        }
    }
    public void sortByAge(Student[] arr){

        for(int i = 0 ; i < arr.length-1; i++){

            for(int j = 0 ; j < arr.length-1-i ; j++){

                if(arr[j].age>arr[j+1].age){
                    Student[] temp = new Student[arr.length] ;
                    temp[j] = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp[j];
                }
            }
        }
    }
    public void sortBypercent(Student[] arr){

        for(int i = 0 ; i < arr.length-1; i++){

            for(int j = 0 ; j < arr.length-1-i ; j++){

                if(arr[j].percent>arr[j+1].percent){
                    Student[] temp = new Student[arr.length] ;
                    temp[j] = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp[j];
                }
            }
        }
    }
    public Student searchById(Student arr[], int size, int value){

       int start=0;
       int end = size-1;
       int mid = start+end/2;

       for(int i = 0 ; i < arr.length ; i ++){

           if(arr[i].id==value){
               System.out.println(arr[value-1]);
           }
           if(arr[i].id>value){
               start=mid+1;
           }
           else{
               end=mid-1;
           }
           mid=start+end/2;
       }
       return null;
    }

    public Student[] sortbyAge(Student arr[]){

        for (int i = 0 ; i < arr.length-1; i++){
            return new Student[i];
        }
         return new Student[0];
    }
}
