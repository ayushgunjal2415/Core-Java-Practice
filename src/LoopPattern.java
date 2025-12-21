class LoopPattern {

    public void pattern(){

        int rows = 0;
        while(rows < 20 ){
            System.out.print("*");

            int i = 0;                        //initialization
            while(i < rows){                  //condition
                System.out.print(" *");
                i++;                          //Updation
            }
            System.out.println();
            rows++;
        }
    }

    public static void main(String[] args) {
        LoopPattern lp = new LoopPattern();
        lp.pattern();

    }
}



//Using for loop;

/* class LoopPattern {

    public static void main(String[] args) {

        for (int row = 1; row <= 20; row++) {      // controls lines
            for (int star = 1; star <= row; star++) { // controls stars
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}
 */