package desafio.design.patterns;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();
        Aquecedor aquecedor = new Aquecedor(sensor);
        ArCondicionado arCondicionado = new ArCondicionado(sensor);
        sensor.setTemperatura(10);
        sensor.setTemperatura(28);
        sensor.setTemperatura(15);
        sensor.unRegister(aquecedor);
        sensor.unRegister(arCondicionado);
    }
}
