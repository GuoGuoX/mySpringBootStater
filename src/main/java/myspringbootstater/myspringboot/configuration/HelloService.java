package myspringbootstater.myspringboot.configuration;

public class HelloService {
    HelloProperties helloProperties;
    public void setHelloProperties(HelloProperties helloProperties){
        this.helloProperties = helloProperties;
    }
    public HelloProperties getHelloProperties(){
        return helloProperties;
    }

    public String helloWorld(){
        return "新年好"+helloProperties.getHello()+helloProperties.getWorld();
    }


}
