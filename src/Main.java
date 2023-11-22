import PackageAnimals.Animal;
import PackageAnimals.Bird;
import PackageAnimals.Mammal;

public class Main {
    public static void main(String[] args) {
     PackageAnimals.Animal[] animals=new PackageAnimals.Animal[5];
     animals[0]=new PackageAnimals.Dog("Archi",10,10,"brown","haski");
     animals[1]=new PackageAnimals.Dog("Stormi");
     animals[2]=new PackageAnimals.Blowfish("Lily",7,5,"light blue","2.5");
     animals[3]=new PackageAnimals.Mammal("Sam",15,16,"black");
     animals[4]=new PackageAnimals.Pigeon(7,"Ice pigeon");

     for(int i=0;i< animals.length;i++){
         System.out.println(animals[i]);
         animals[i].eat();
         animals[i].getVoice();
         if(animals[i] instanceof PackageAnimals.Dog){
             ((PackageAnimals.Dog)animals[i]).run();
         }
         if(animals[i]instanceof PackageAnimals.Blowfish){
             ((PackageAnimals.Blowfish)animals[i]).ask();
         }
         if(animals[i] instanceof PackageAnimals.Pigeon){
             ((PackageAnimals.Pigeon)animals[i]).swim();
         }
        }
    }
}