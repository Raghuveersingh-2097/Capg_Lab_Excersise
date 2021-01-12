package com.cg.bankaccount.serviceImpl;

class Person
{
String name;
float age;
String getName()
{
return name;		
}
void setName(String name)
{
		this.name=name;
}
float getAge()
{
		return age;
}
void setAge(float age)
{
if(age<=0)
{
System.out.println("Enter valid age");
}
this.age=age;
}
}