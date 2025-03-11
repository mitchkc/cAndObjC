#include <stdio.h>
#include <stdlib.h>

    //C is not an object oriented language

struct Person{
    int age;
    void (*set)(struct Person *, int);
    int (*get)(struct Person *);
};

void setAge(struct Person * inst, int age){ //inst = instance of class
    inst->age = age;
};

int getAge(struct Person * inst){
    return inst->age;
};

int main()
{

    struct Person p1;
    p1.get = getAge; //bind
    p1.set = setAge;
    p1.set(&p1, 31);    //pass in address of or variable
    printf("Age is: %d", p1.get(&p1));

    return 0;
}
