package oop.Abstraction;

 class Eagle extends Bird {
    
    public void fly(){
        System.out.println(getBreed() +" is flying..");
    }

    public Eagle() {
        super("Eagle");
    }

}
