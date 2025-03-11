#include <stdio.h>  //standard input and output
#include <stdlib.h>
#include <assert.h>

/*
int square(int x){
    return x*x;
}

void hello(){
    printf("hello");
}

//'unsigned int' = must be positive
//e.g with assertion

void countdownUn (int x){
    assert(x>=0 && "x was not greater than 0!");    //assertion error handling
    if(x<0){
        return;
    }
    printf("%d\n", x);
    return countdownUn(x-1);
}

void countdown(int n){  //recursion
    //base case
    if(n<0){
        return;
    }

    printf("%d\n", n);
    return countdown(n-1);
}


typedef struct student{
    int age;
    int id;
    char grade;
}student_t;


void printStudent(student_t s){
    printf("Students age = %d\n", s.age);
    printf("Students id = %d\n", s.id);
    printf("Student grade = %c", s.grade);
}

void printStudent(student_t* s){            // now using a pointer
    printf("Students age = %d\n", s->age);  // -> dereferences a struct and accesses a field, the . accesses the field
    printf("Students id = %d\n", (*s).id);  // alternate way
    printf("Student grade = %c", s->grade);
}


typedef struct node{
    int data;
    struct node* next;
}node_t;

int main()
{
    // LINKED LIST
        //linked lists can be expanded or contracted by removing/adding pointers
    node_t one;
    node_t two;
    node_t three;

    one.data = 1;
    one.next = &two;
    two.data = 2;
    two.next = &three;
    three.data = 3;
    three.next = NULL;

    //looping through linked data structure
    node_t* iterate = &one;
    while(iterate != NULL){
        printf("data: %d\n", iterate->data);
        iterate=iterate->next;  //set iterate to next and follow chain
    }




    /*
    student_t Michael;
    Michael.age = 31;
    Michael.id = 123;
    Michael.grade = 'A';
    printStudent(&Michael);


    // STRING LITERAL
     char* a = "hello"; //char* = string literal
     puts(a);
     printf(a);
     a[0] = 'b';    //cant change like this as is a constant value = segmentation fault
     //change value in string instead by using char[] instead of *
     printf("\na[0] = %c",a[0]);    //should print h


    // MALLOC and FREE
        //dynamic memory allocator - a dynamically allocated array vs static

    int sizeOfArray = 0;
    scanf("%d", &sizeOfArray);  //& used in scanf to overwrite the actual value at its memory address instead of a copy being taken
    int* dynamicArray = malloc(sizeof(int)*sizeOfArray); //use memory

    for (int i =0; i < sizeOfArray; i++){
        dynamicArray[i] = i;
    }

    for(int i = 0; i < sizeOfArray; i++){
        printf("array[%d]: %d\n", i, dynamicArray[i]);
    }

    free(dynamicArray); //end use of memory


    /*
    int x = 31;
    int* px = &x;   //pointer created

    int* px2 = &x;  //2nd pointer created pointing to same location in memory of value in x

    printf("address of x = %p\n", &x);
    printf("value of x = %d\n", *&x);
    printf("px is: %p", px);


    /*
    int x = 0;

    puts("Enter x: ");
    scanf("%d", &x);    //& = address of

    if(x>0){
        puts("x = +ve");
    }
    else if(x==0){
        puts("x = 0");
    }
    else{
        puts("x = -ve");
    }


    countdown(10);
    countdownUn(-10);

    puts("Hello world!"); //put as string, auto skips to new line at end
    printf("Hello world!\n");
    hello();
    printf("\nsquare of 4 is: %d", square(4));




    return 0;
}
*/
