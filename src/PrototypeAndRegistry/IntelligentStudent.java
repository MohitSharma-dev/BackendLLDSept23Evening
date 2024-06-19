package PrototypeAndRegistry;

public class IntelligentStudent extends Student {
    int iq;

    IntelligentStudent(){

    }

    IntelligentStudent(IntelligentStudent copy){
        super(copy);
        this.iq = copy.iq;
    }

    public IntelligentStudent copy(){
        IntelligentStudent copy = new IntelligentStudent(this);
        return copy;
    }
}
