package desafio.design.patterns;


// classe que vai implementar os métodos da interface Observer
public class Aquecedor  implements Observer{

    private Observable sensor;
    private boolean ligado;

    public  Aquecedor(Observable sensor){
        this.sensor = sensor;
        this.sensor.register(this);
        this.ligado = false;
    }

    @Override
    public void update(int i) {
        if(i <= 16 && !ligado){
            System.out.println("Temperatura: " + i + " --> Ligando o aquecedor...");
            ligado = true;
         }else if(i > 16 && ligado){
            System.out.println("Temperatura: " + i + " --> Desligando o aquecedor...");
            ligado = false;
        }
    }
}
