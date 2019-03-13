public class Calculator{

    private static CalcView myView;
    private static CalcController control = CalcController.getInstance();

    
    
    public static void main(String [] args){
        myView = new CalcView();
        control.attach(myView);
        myView.display();
    }
}