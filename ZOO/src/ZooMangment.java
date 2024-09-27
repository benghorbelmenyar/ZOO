import java.util.Scanner;
public class ZooMangment {
   /*public static void main(String[] args)
    {
        int nbrCages = 20;
        String zooName = "my zoo";

    System.out.println(zooName+ " comparte" +" "+nbrCages+" "+"cages");
}*/

    public static void main(String[] args)
    {
        int nbrCages ;
        String zooName ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
       zooName = scanner.nextLine();
        System.out.print("Entrez le nombre de cages : ");
        nbrCages = scanner.nextInt();
        System.out.println("Nom du ZOO  est : " + zooName);
        System.out.println("nombre de cages  est : " + nbrCages);
        Animal lion = new Animal();
        lion.setName("Lion");
        lion.setFamily("Felidae");
        lion.setAge(5);
        lion.setIsMammal(true);
        System.out.println("Animal créé :");
        lion.afficheInfos();
        Zoo myZoo = new Zoo();
        myZoo.setName("myZoo");
        myZoo.setCity("Paris");
        myZoo.setNbrCages(20);
        myZoo.setAnimals(new Animal[25]);
        myZoo.getAnimals()[0] = lion;
        System.out.println("\nZoo créé :");
        System.out.println("Nom du zoo : " + myZoo.getName());
        System.out.println("Ville : " + myZoo.getCity());
        System.out.println("Nombre de cages : " + myZoo.getNbrCages());
        System.out.println("Animaux dans le zoo :");
        for (Animal animal : myZoo.getAnimals()) {
            animal.afficheInfos();
        }

        scanner.close();


    }

    static class Animal {
        String family;
        String name;
        int age;
        boolean isMammal;
        public Animal(){}
        public Animal(String family,String name, int age, boolean isMammal) {
            this.family = family;
            this.name= name;
            this.age = age;
            this.isMammal = isMammal;
        }


        public void setFamily(String family) {
            this.family = family;
        }
        public String getFamily() {
            return family;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        public void setIsMammal(boolean isMammal) {
            this.isMammal = isMammal;
        }
        public boolean getIsMammal() {
            return isMammal;
        }
        public void afficheInfos() {
            System.out.println("Nom: " + name + ", Famille: " + family + ", Âge: " + age + ", Est un mammifère: " + isMammal);
        }
    }
    static class Zoo {
        Animal[] animals;
        String name;
        String city;
        int nbrCages;


        public void setAnimals(Animal[] animals)
        {
            this.animals = animals;
        }
        public Animal[] getAnimals()
        {
            return animals;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public String getName()
        {
            return name;
        }
        public void setCity(String city)
        {
            this.city = city;
        }
        public String getCity()
        {
            return city;
        }
        public void setNbrCages(int nbrCages)
        {
            this.nbrCages = nbrCages;
        }
        public int getNbrCages()
        {
            return nbrCages;
        }
    }

}
