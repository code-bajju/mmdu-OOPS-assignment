
    //Interface Declaration
    interface school {
        void print();
        }
        class MMIS implements school {
        public void print(){
        System.out.println("Your attendance is 76%");
        }
        public static void main(String[] args) {
        MMIS a = new MMIS(); //Object is provided by the method
        a.print();
        }
    }
    
    