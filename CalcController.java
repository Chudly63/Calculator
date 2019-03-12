import java.awt.event.*;

public class CalcController implements ActionListener{

    public static CalcController control = new CalcController();

    private EquationItem root;
    private State currentState = new StateStart();

    private CalcController(){}

    public static CalcController getInstance(){
        return control;
    }

    public void actionPerformed(ActionEvent e){
        System.out.println(e.getActionCommand());
        switch(e.getActionCommand()){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.println("New Operand()");
                currentState.newOperand(new Operand(0));
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                System.out.println("New Operator()");
                currentState.newOperator(new Operator(null,null ));
                break;
            case "C":
                System.out.println("Clear");
                root = null;
                currentState = new StateStart();
                break;
            case "=":
                System.out.println("Equals");
                currentState.calculate();
                break;
            default:
                System.out.println("oops");
        }
    }

    public EquationItem getRoot(){
        return root;
    }

    public void setRoot(EquationItem r){
        root = r;
    }

    public void setState(State newState){
        currentState = newState;
    }
    
}