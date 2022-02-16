package desafio.design.patterns;

import java.util.ArrayList;
import java.util.List;

// classe que vai implementar os métodos da interface Observable
public class SensorTemperatura implements Observable{

    private int temperatura;
    List<Observer> observers = new ArrayList<Observer>();

    public void setTemperatura(int temperatura){
        if (this.temperatura != temperatura){
            this.temperatura = temperatura;
            notifyObservers();
        }
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observers){
           o.update(this.temperatura);
        }
    }
}
