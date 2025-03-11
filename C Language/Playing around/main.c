#include <stdio.h>
#include <stdlib.h>
#include <math.h>

//function to cube a number
//double cube(double num);    //prototyped function, allowing it to be below main function

/*
int max(int num1, int num2){
    int result;
    if(num1 > num2){
        result = num1;
    }
    else if(num1 < num2){
        result = num2;
    }

    return result;
}


int max(num1, num2, num3){
    int result;
    if(num1 >= num2 && num1 >= num3){
        result = num1;
        return result;
    }
    else if(num2 >= num1 && num2 >= num3){
        result = num2;
        return num2;
    }
    else{
        result = num3;
        return result;
    }
}



int main()
{
    /*
    int age = 31;
    double ageActual = 31.3;
    char name[] = "Michael";
    char initial = 'M';

    // integer = %d, double = %f, string = %s, char = %c

    printf("Age = %d, Name = %s, Age with month = %f, Initial = %c \n", age, name, ageActual, initial );
    printf("\n");
    printf("%f \n", sqrt(36));
    printf("%f \n", pow(2, 2));
    printf("%f \n", ceil(33.6));
    printf("%f \n", floor(33.6));

    This is a comment
    Blah Blah
    Blah

    const int num = 5;      //declaring a constant variable in c, usually give constants capitalised names! I.e. NUM
    printf("%d\n", num);    //strings are considered constants as they cant be modified
    num = 8;
    printf("%d", num);      // throws error!
    */


    // USER INPUT!!!!
    /*
    printf("Please enter your age: ");
    int userAge;
    scanf("%d", &userAge);   //type of variable to be input by user and then where to store in
    printf("Your are %d years old! \n", userAge);

    printf("Enter your age with the month in decimal: ");
    double ageMonth;
    scanf("%lf", &ageMonth);             //forgot & and %lf here initially and failed. NEED %LF NOT %F FOR DOUBLES!!
    printf("You are %f old!", ageMonth);

    char grade;
    printf("Enter your grade: ");
    scanf("%c", &grade);
    printf("Your grade is %c", grade);

    //STRING INPUTS!!!
    printf("Enter your name: ");
    char name[20];
    fgets(name, 20, stdin);           //no & needed for string variables - scanf does not allow spaces! Use fgets instead. stdin = standard input I.e. console
                                      //fgets will print a new line also by accepting enter from input
    printf("Your name is %s", name);


    //CALCULATOR

    printf("Enter 1st number: ");
    double numOne;
    double numTwo;
    scanf("%lf", &numOne);
    printf("Enter 2nd number: ");
    scanf("%lf", &numTwo);
    printf("Answer: %f", numOne+numTwo);


    //BUILD MADLIBS GAME

    char colour[20];
    char pluralNoun[20];
    char celebrityF[20];
    char celebS[20];

    printf("Enter a colour: ");
    //fgets(colour, 20, stdin);
    scanf("%s", colour);

    printf("Enter a plural noun: ", pluralNoun);
    //fgets(pluralNoun, 20, stdin);
    scanf("%s", pluralNoun);

    printf("Enter a celebrity: ");
    //fgets(celebrity, 20, stdin);
    //scanf("%s", celebrity);
    scanf("%s%s", celebrityF, celebS);  // scanf allows two string inputs for name using this method BUT this breaks in celeb only has 1 name!!!


    printf("Roses are %s \n", colour);
    printf("%s are blue \n", pluralNoun);   //fgets prints new line so poem prints with a new line after first verse which is bad! should have used scanf!!!
    printf("I love %s %s\n", celebrityF, celebS);



    //ARRAYS

    int nums[] = {1, 2, 3, 4, 5};
    nums[0] = 200;
    printf("%d", nums[0]);

    int nums[10];
    nums[0] = 100;
    printf("%d %d", nums[0], nums[1]);



    //FUNCTIONS(c) or METHODS(java)

    sayHello(); //function call
    sayHi("Michael", 31);
    sayHi("James", 20);


    printf("Answer of cube function: %f", cube(3.0));   //function call in print statement


    // IF STATEMENTS
    int num1;
    int num2;
    int num3;
    printf("Enter num1: ");
    scanf("%d", &num1);
    printf("Enter num2: ");
    scanf("%d", &num2);
    printf("Enter num3: ");
    scanf("%d", &num3);
    printf("%d is bigger", max(num1, num2, num3));





    return 0;   //return type
}


double cube(double num){            //function with prototype above main
    double result = num*num*num;
    return result;
}


void sayHello(){ //void returns nothing
     printf("Hello!");
}

void sayHi(char name[], int age){
    printf("Hi %s, you are %d \n", name, age);
}
*/
