package desafio.design.patterns;

// Interface para sensores

public interface Observable {

    // Método para registrar quem vai ouvir o sensor
    void register(Observer observer);

    // Método para remover quem está ouvindo o sensor
    void unRegister(Observer observer);

    // Método para notificar os ouvintes
    void notifyObservers();

}

