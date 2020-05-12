package lemubit.academy;

public class Main {

    public static void main(String[] args) {

        OperateNum((n) -> {
            if (n % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }, 9);

    }

    static void OperateNum(Operation op, int value) {
        op.execute(value);
    }

    interface Operation {
        void execute(int num);
    }
}
