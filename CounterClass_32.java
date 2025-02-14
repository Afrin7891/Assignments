public class CounterClass_32 {
    private static int instanceCount = 0;
    public CounterClass_32() {
        instanceCount++;
        if (instanceCount > 50) {
            instanceCount = 0;
            System.out.println("Object count exceeded 50, resetting to 0.");
        }
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new CounterClass_32();
            System.out.println("Instance count: " + CounterClass_32.getInstanceCount());
        }
    }
}
