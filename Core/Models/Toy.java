package Core.Models;

@SuppressWarnings("ALL")
public class Toy implements Comparable<Toy> {
    public int id;
    public String name;
    public int weight;
    public int count;    

    public Toy(int id, String name, int weight, int count) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }
    public int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Идентификатор игрушки:" + id + "; Имя: " + name + "; Вес: " + weight + "; Количество: " + count;
    }

    @Override
    public int compareTo(Toy o) {
        return o.getWeight() - this.getWeight();
    }
}
