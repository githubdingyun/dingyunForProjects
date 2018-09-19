//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.stream.IntStream;
//
//public class T1 {
//
//
//    public static void main(String[] args) {
//
//        //新建一个线程池
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.execute(() -> {
//            System.out.println("ss");
//        });
//
//
//        new Thread(T1::run, "t1").start();
//    }
//
//    private static void run() {
//        IntStream.range(0, 10).forEach(i -> {
//            Thread thread = Thread.currentThread();
////            StackTraceElement[] stackTrace = thread.getStackTrace();
////            for (StackTraceElement a:stackTrace
////                 ) {
////                System.out.println(a.getClassName());
////            }
//
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            Thread.State state = thread.getState();
//            System.out.println(state.name());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(i);
//        });
//    }
//}
