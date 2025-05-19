package com.school.management;
public class School{
       private string name;
       private string lacation;
public void  setName(string name){
   this.name=name;
}
public void setLocation(string location){
    this.location=location;
}
public string getname(){
     return name;
}
public string getlocation(){
      return location;
}
public void showSchoolInfo(){
System.out.println("School Name:"+name);
System.out.println("Location:"+location);
}
}
                                                                                                                               