import java.util.Scanner;
public class Day5Lab1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    /*1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        two numbers , takes two numbers as input
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5 */

       /* System.out.println("Enter the 1st number: ");
        int num1=input.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2=input.nextInt();

            int sum=num1+num2;
            int sub=num1-num2;
            int multiply=num1*num2;
            int divide=num1/num2;
            int reminder=num1%num2;

            System.out.println(num1+"+"+num2+"="+sum);
            System.out.println(num1+"-"+num2+"="+sub);
            System.out.println(num1+"x"+num2+"="+multiply);
            System.out.println(num1+"/"+num2+"="+divide);
            System.out.println(num1+"mod"+num2+"="+reminder);*/


        /*2. Write a Java program that takes a number as input and prints its multiplication table up to
        10.
        Test Data:
        Input a number: 8 Expected
        Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80 */

        /*System.out.println("Enter a number: ");
        int num = input.nextInt();
        int i;
        for (i = 1; i <=10; i++) {
            int multipli = num * i;
            System.out.println(num + "x" + i + "=" + multipli);
        }*/


        /*Write a Java program to print the area and perimeter of a circle.
        2
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586*/

        /*System.out.println("Enter the Radius: ");
        float radius= input.nextFloat();

        float perimeter= (float) (2*3.14*radius);
        float erea= (float) (3.14*(radius*radius));

        System.out.println("parimeter is: "+perimeter);
        System.out.println("Area is: "+erea);*/


        /*4. Java program to find out the average of a set of integers
        Enter the count of numbers:
        5
        Enter an integer:
        3
        Enter an integer:
        8
        Enter an integer:
        6
        Enter an integer:
        7
        Enter an integer:
        2
        The average is: 5.2 */

        /*System.out.println("Enter the count of numbers");
        int count= input.nextInt();
        int sum=0 ;
        double average = 0;
        for (int i = 1; i <=count ; i++) {
            System.out.println("Enter an integer: ");
            int  number=input.nextInt();
            sum=number+sum;
            average= (double) sum /count;
        }
        System.out.println("The average is: "+average);*/


        /*. Write a Java program that accepts three integers as input, adds the first two integers
        together, and then determines whether the sum is equal to the third integer.
        3
        Sample Output:
        Input the first number : 5
        Input the second number: 10
        Input the third number : 15
        The result is: true
        --------
        Input the first number : 10
        Input the second number: 20
        Input the third number : 25
        The result is: false */


        /*System.out.print("Input the first number: ");
        int num1= input.nextInt();
        System.out.print("Input thr second number: ");
        int num2= input.nextInt();
        System.out.print("Input the third number: ");
        int num3= input.nextInt();
        if(num1+num2==num3){
            System.out.println("The result is:true");
        }else {
            System.out.println("The result is:false");
        }*/


        /*6. Write a Java program to reverse a word.
        Sample Output:
        Input a word: dsaf
        Reverse word: fasd */

        /*System.out.println("Input a word: ");
        String word= input.nextLine();
        String reversed = "";
        for (int i = 0; i < word.length(); i++) {
            reversed = word.charAt(i)+reversed;
        }

        System.out.println("Reversed word: "+ reversed);*/

        /*7 - Java program to check whether the given number is even or odd
        Enter a number:
        33
        The number is Odd
        Enter a number:
        24
        The number is Even */

        /*System.out.println("Enter a number: ");
        int number= input.nextInt();

        if (number== 0) {
            System.out.println("The number is 0");
        } else if (number %2== 0) {
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }*/

        /*8 - Java program to convert the temperature in Centigrade to Fahrenheit
        4
        Enter temperature in Centigrade:
        43
        Temperature in Fahrenheit is: 109.4 */

        //TODO: عدليه عشان يطلع بالفاصله
        /*System.out.println("Enter temperature in Centigrade:");
        int Centigrade= input.nextInt();

        double Fahrenheit=((Centigrade*9/5) +32);
        System.out.println("Temperature in Fahrenheit is:"+Fahrenheit);
*/

        /*9.Write a Java program that takes a string and a number from the user,then prints the
        character in the given index.
        Test Data:
        Input a string: Java Bootcamp
        Input a number: 1
        Expected Output:
        a */

        /*System.out.print("Input a string: ");
        String sinput= input.nextLine();
        System.out.println("Enter a number");
        int number= input.nextInt();
        if (number>sinput.length()){
            System.out.println("that number is not valid");
        }else {System.out.println(sinput.charAt(number));}*/


        /*10. Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.5 Height = 8.5
        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20 */

        /*System.out.println("Enter the Width: ");
        double width= input.nextDouble();
        System.out.println("Enter the height: ");
        double height= input.nextDouble();
        double area=width*height;
        double v = width + height;
        double perimeter=2*v;
        System.out.println("Area is: "+width+"*"+height+"="+area);
        System.out.println("Perimeter is: 2* "+"("+width+"+"+height+")="+perimeter);*/


        /*11. Write a Java program to compare two numbers.
        Input Data:
        Input first integer: 25
        Input second integer: 39
        Expected Output
        25 != 39
        25 < 39
        25 <= 39 */

        /*System.out.println("Enter first integer:");
        int num1= input.nextInt();
        System.out.println("Enter second number:");
        int num2= input.nextInt();

        if (num1>num2){
            System.out.println(num1+">"+num2);
            System.out.println(num1+"!="+num2);
            System.out.println(num1+"=>"+num2);
        } else if (num2>num1) {
            System.out.println(num2+">"+num1);
            System.out.println(num2+"!="+num1);
            System.out.println(num2+"=>"+num1);
        }else {
            System.out.println(num1+"="+num2);}*/


        /*12. Write a Java program to convert seconds to hours, minutes and seconds.
        Sample Output:
        Input seconds: 86399
        23:59:59*/

        /*System.out.print("Input seconds: ");
        int seconds =input.nextInt();
        int second = seconds % 60;
        int hour = seconds / 60;
        int munit = hour % 60;
        hour /= 60;
        System.out.print( hour + ":" + munit + ":" + second);*/

        /*13. Write a Java program that accepts four integers from the user and prints equal if all
        four are equal, and not equal otherwise.
        Sample Output:
        Input first number: 25
        Input second number: 37
        Input third number: 45
        Input fourth number: 23
        Numbers are not equal!*/

       /*System.out.println("Enter first number:");
       int num1= input.nextInt();
       System.out.println("Enter second number:");
       int num2= input.nextInt();
       System.out.println("Enter third number:");
       int num3= input.nextInt();
       System.out.println("Enter forth number:");
       int num4= input.nextInt();

       if (num1==num2 && num2==num3 && num3==num4){
           System.out.println("Numbers are equal!");
       }else {
           System.out.println("Numbers are not equal");
       }*/

        /*14.Write a Java program that reads an integer and check whether it is negative, zero, or
        positive.
        Test Data Input a number: 7 Expected Output :
        Number is positive */

        /*System.out.println("Enter a number: ");
        int number=input.nextInt();
            if (number==0){
                System.out.println("The number is Zero");
        }else if(number>0){
                System.out.println("The number is positive");
            }else {
                System.out.println("The number is negative");
            }*/


        /*15.Write a program to enter the numbers till the user wants and at the end it
        should display the count of positive, negative and zeros entered (End loop use -1 ,
        Don’t count -1).
        Test data
        1
        3
        0
        -2
        -4
        -1
        2 positives
        1 zero
        2 negatives */

        /*int number=0;
        int positivenum = 0;
        int negativennum=0;
        int zero=0;
        do {
            System.out.println("Enter a numbers, enter -1 to stop:");
            number= input.nextInt();
           //اذا اليوزر \خل -1 بوقف البرنامج وبطبع الي تحت
             if (number==-1){
                 break;
             } //اذا الرقم اكبر من الصفر بنزيد البوزتيف نمبرز
            else if (number>0){
                positivenum++;
            }//اذا الرقم اصغر من الصفر فبنزيد الارقام السالبه
            else if (number<0 ){
                negativennum++;
            }else {
                zero++;
            }
        }while (number!=-1);

        System.out.println(positivenum+" positive");
        System.out.println(zero+" zero");
        System.out.println(negativennum+" negative");*/


        /*16 - Write a program that prompts the user to input an integer and then outputs the
        number with the digits reversed.
        For example, if the input is 12345, the output should be 54321. */

        /*System.out.println("Input an integer number");
        //خليته  سترنق عشان اقدر اعكسه
        String number= input.nextLine();
        // هنا بنخزن الرقم الي انعكس
        String reversed = "";
        for (int i = 0; i < number.length(); i++) {
        //هنا نظيف الرقم
            reversed = number.charAt(i)+reversed;}
        System.out.println(reversed);*/


        /*17 - Write a program to enter the numbers till the user wants and at the end the
        program should display the largest and smallest numbers entered.
        enter the number : 4
        enter the number : 5
        enter the number : -1
        enter the number : 9
        the large number : 9
        the small number : -1 */


        /*System.out.println("Enter the number of the inputs you will do:");
        int number= input.nextInt();
        int min=0;
        int max=0;
        int i;
        //اللوب بيوقف اذا صارت ال i  النمبر نفس الشي
        for (i =1; i <=number ; i++) {
            System.out.println("Enter a number");
            int numb=input.nextInt();
            // يشوف اي اكبر و اذا النمب اكبر بيدخل وبتكون قيمه الماكس الجديده هي
            if (max < numb){
                max=numb;
            }
            //بيشوف اذا النمب اصغر من او يساوي المين بيعطي قيمته للمين
            else if (min >= numb){
                min=numb;
            }else {break;}
        }
        System.out.println("The largest number is: "+max);
        System.out.println("The smallest number is: "+min);*/



        /*18 - Determine and print the number of times the character ‘a’ appears in the input
        entered by the user.
        Enter String:
        Java bootcamp
        Output: Number of a's: 3 */


        /*System.out.println("Enter String: ");
        String sentece=input.nextLine();
        int counter=0;
        for(int i = 0; i < sentece.length(); i++) {
            //اللاين الي يحدد اذا هو a و لا
            if(sentece.charAt(i) == 'a')
                counter++;
        }
        System.out.println("number of a's:"+counter);*/



    }


    }
//}
