package behavior.MementoPattern;

public class demo {
    /**
     * 备忘录模式使用三个类 Memento 、 Originator 和 CareTaker
     * <p>
     * 定义类 Memento 包含了要被恢复的对象的状态
     * 定义类 Originator 创建并在 Memento 对象中存储状态
     * 定义类Caretaker 对象负责从 Memento 中恢复对象的状态
     * 最后使用 MementoPatternDemo 类使用 CareTaker 和 Originator 对象来显示对象的状态恢复
     */
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
