import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:9099/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Le WSDL est un Document XML qui permet de faire la description d'une interface d'un web Service ");
        System.out.println("Web Service déployé sur :"+url);
    }
}