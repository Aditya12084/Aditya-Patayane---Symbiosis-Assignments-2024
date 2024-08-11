public class Palindrome {
    public static void main(String[] args) {
        int num = 32213;
        String castedNum = Integer.toString(num);
        char numArr[]=castedNum.toCharArray();

        int start=0,end=numArr.length-1;
        char temp;
        while (start<end){
            temp=numArr[start];
            numArr[start]=numArr[end];
            numArr[end]=temp;
            start++;
            end--;
        }

        String revCatsedNum="";

        for (int i = 0; i < numArr.length; i++) {
           revCatsedNum+=numArr[i];
        }

        if(num == Integer.parseInt(revCatsedNum)){
            System.out.println("Its a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}
