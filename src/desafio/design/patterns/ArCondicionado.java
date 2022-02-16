package desafio.design.patterns;

// classe que vai implementar os métodos da interface Observer
public class ArCondicionado implements Observer {
    private Observable sensor;
    private boolean ligado;

    public  ArCondicionado(Observable sensor){
        this.sensor = sensor;
        this.sensor.register(this);
        this.ligado = false;
    }

    @Override
    public void update(int i) {
        if(i > 24 && !ligado){
            System.out.println("Temperatura: " + i + " --> Ligando o ar condicionado...");
            ligado = true;
        }else if(i < 24 && ligado){
            System.out.println("Temperatura: " + i + " --> Desligando o ar condicionado...");
            ligado = false;
        }
    }
}
