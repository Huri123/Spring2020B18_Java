package day34_CustomClass;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    String name;

    public void eating(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drinking(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void playing(String toy) {
        System.out.println(name + " is playing " + toy);
    }

    public void studying(String subject) {
        System.out.println(name + " is studying " + subject);
    }

    /*public void setDogInfo(String DogBreed, String DogSize, int DogAge, String DogColor, String DogName) {//parantez icindekiler parameter
        bunlar yukardaki intance variable ile ayni name olmamali. yani String breed dersen buraya da, DogObject de null verir.
        cunku local variable i kullanir. o da hata verir.Bunun icin instance varible(not the local ones) i kullanmak icin
        this. kullanmaliyiz.preferred way is using same name wit this keyword
       sadece assign yapacagimiz icin void yaptik
        breed=DogBreed;
        size=DogSize;
        age=DogAge;
        color=DogColor;
        name=DogName;
    }
     */
    public void setDogInfo(String breed, String size, int age, String color, String name) {
        this.breed = breed;//instance variables lari kullanabilmek icin this kullandik
        this.size = size; //size=size deseydik bu size local size olurdu. instance variable olmazdi.
        this.age = age;
        this.color = color;
        this.name = name;
        // this keyword is used for calling object instance (instance variables).preferred way is using same name wit this keyword
    }

    public String toString() {
        return "Dog Name: " + name + ", breed" + breed + ", size" + size + ", color" + color + ", age: " + age;
    }
}
    /*
    Muhtar'in kodlari
    public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;

    public void eating(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drinking(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void playing(String toy){
        System.out.println(name+" is playing "+toy);
    }

    public void studying(String subject){
        System.out.println(name+" is studying "+subject);
    }

    public void setDogInfo(String breed, String size, int age, String color, String name){
       this.breed = breed;
       this.size = size;
       this.age = age;
       this.color = color;
       this.name = name;
       // this keyword is used for calling object instance (instance variables)
    }


    public String toString(){
        return "Dog Name: "+name+", breed: "+
                breed+", size: "+size+", color:"+color+", age: "+age;
    }



}
     */

