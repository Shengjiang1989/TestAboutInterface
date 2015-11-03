package test;

public class Test {
    public static void main(String[] args) {
        
        bird tb = new bird();
        tb.fly();
        
        plane tp = new plane();
        tp.fly();
        
        tb.fly();
        
        bombplane bp = new bombplane();
        
        System.out.println(bp.weight);
        
        bp.fly();
    }
}

abstract class animal{
    abstract void roam();
}

abstract class robot{
    abstract void noise();
}

interface fly{
    void fly();
}

class bird extends animal implements fly{
    void roam(){
        System.out.println("squid");
    }
    
    public void fly(){
        System.out.println("bird is flying in the sky");
    }
}

class plane extends robot implements fly{
    void noise(){
        System.out.println("weng");
    }
    
    public void fly(){
        System.out.println("plane is flying in the sky");
    }
}

class bombplane extends plane{
    float weight;
    
    public bombplane(float w){
        weight = w;
    }
    
    public bombplane(){
        this(0.40f);
    }
    
    public void fly(){
        System.out.println("bombplane is flying in the sky");
    }
}


