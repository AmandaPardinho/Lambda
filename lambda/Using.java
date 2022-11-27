public class Using {
    public static void main(String[] args) {
        ServiceInterface iS;

        iS = new ServiceInterface(){
            public void executes(int value){
                System.out.println("Executing... - " + value);
            }
        };

        iS.executes(10);

//        ServiceInterface iS2 = new ServiceInterface() {
//            @Override
//            public void executes() {
//                System.out.println("Executing other logic...");
//            }
//        };

        //lambda can only be used with functional interfaces
        ServiceInterface iS2 = (int value) -> {
            System.out.println("Executing other logic... - " + value);
        };

        iS2.executes(20);
    }
}
