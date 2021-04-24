package behavior.StatePattern;

public class StatePatternDemo {
    /**
     * 我们将创建一个 State 接口和实现了 State 接口的实体状态类。
     * Context 是一个带有某个状态的类
     * StatePatternDemo ，我们的演示类使用 Context 和状态对象来演示 Context 在状态改变时的行为变化
     */
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
