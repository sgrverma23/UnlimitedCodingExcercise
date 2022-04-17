public class ThreadEx {
    public static void main(String[] args) throws InterruptedException {
         Thread t1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i = 0; i < 4; i++) {
                     System.out.println("A " + i);
                 }
             }
         });

          Thread t2 = new Thread(new Runnable() {
              @Override
              public void run() {
                  for (int i = 0; i < 4; i++) {
                      System.out.println("B " + i);
                  }
              }
          });


          t2.start();

    }
}

