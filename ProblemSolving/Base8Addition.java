package ProblemSolving;

public class Base8Addition {
    public static void main(String[] args) {
        int num1 = 547;
        int num2 = 41;
        int digit1 = 0;
        int digit2 = 0;
        int sum = 0;
        int netsum=0;

        int place =0;
        int carry =0;
        int greater = num1>num2?num1:num2;
        while(greater!=0)
        {
            digit1= num1%10;
            digit2 =  num2%10;
            sum= digit1+digit2+carry;
            if(sum>7)
            {
               sum = sum-8;
               netsum = netsum +sum*(int)Math.pow(10, place);
               carry =1;
               

            }
            else
            {
                netsum = netsum+sum*(int)Math.pow(10, place);
                carry=0;
            }
            place++;
            greater= greater/10;
            num1= num1/10;
            num2=num2/10;
        }
        System.out.println(netsum);

    }
}
