package data;

public enum AnimalType {
    CAT("кошка"),
    DOG("собака"),
    DUCK("утка");

    private String name;
    AnimalType(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
