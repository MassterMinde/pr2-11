public class Human {
    Head head = new Head();
    Leg leg = new Leg();
    Hand hand = new Hand();

    public Hand getHand() {
        return hand;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeg() {
        return leg;
    }

    @Override
    public String toString() {
        return getHead()+"\n"+getHand()+"\n"+getLeg();
    }
}
//Создать класс, описывающий тело человека (Human).
// Для описания каждой части тела создать отдельные классы (Head, Leg, Hand) не используя наследование.
// Описать необходимые свойства и методы для каждого класса (в том числе геттеры/сеттеры). Протестировать работу класса Human.
// Нарисовать UML диаграмму относительно этих классов (для построение диаграммы подойдет сайт https://draw.io)
