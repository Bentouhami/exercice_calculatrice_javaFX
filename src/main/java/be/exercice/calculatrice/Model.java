package be.exercice.calculatrice;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Model extends ActionEvent {
    private Pane root;

    private TextField txtf_ouput;
    private Button[] btn_nums = new Button[10];
    private Button[] btn_operators = new Button[8];
    private Button btn_add, btn_sub, btn_mult, btn_div, btn_vir, btn_equ, btn_clear;// btn_neg; // btn_neg pour rendre
                                                                                    // le button negatif

    private Pane pane_nums_hbox_1;
    private Pane pane_nums_hbox_2;
    private Pane pane_nums_hbox_3;
    private Pane pane_box;
    private Font myFont = new Font("Arial", 18);

    private double num1 = 0.0, num2 = 0.0, result = 0.0;
    private char operators;

    Model() {
        root = new VBox();
        
        center_box(root, pane_nums_hbox_1, pane_nums_hbox_2, pane_nums_hbox_3);

        initialze_content();
        generateNumPad_btn(btn_nums);
        addButtons_hbox(this.pane_nums_hbox_3, 7, 10);
        addButtons_hbox(this.pane_nums_hbox_2, 4, 7);
        addButtons_hbox(this.pane_nums_hbox_1, 1, 4);
        
        
        
        root.getChildren().addAll(this.txtf_ouput, this.pane_nums_hbox_3, this.pane_nums_hbox_2, this.pane_nums_hbox_1);
        

    }


    private void initialze_content() {

        this.pane_nums_hbox_1 = new HBox();
        this.pane_nums_hbox_2 = new HBox();
        this.pane_nums_hbox_3 = new HBox();
        
        
        
        this.btn_add = new Button("+");
        this.btn_sub = new Button("-");
        this.btn_mult = new Button("*");
        this.btn_div = new Button("/");
        this.btn_vir = new Button(".");
        this.btn_equ = new Button("=");
        this.btn_clear = new Button("C");
        
        this.txtf_ouput = new TextField("hello test");
    }


    private void center_box(Pane... panes) {
        for (Pane pane : panes) {
            if(pane instanceof VBox)
                ((VBox)root).setAlignment(Pos.CENTER);
                else if(pane instanceof HBox)
                ((HBox)root).setAlignment(Pos.CENTER);
        }
    }


    private void generateNumPad_btn(Button[] numPad) {
        for (int i = 0; i < 10; i++) {           
            btn_nums[i] = new Button(""+i);
            btn_nums[i].setPrefSize(50, 50);
        }
    }
    private void addButtons_hbox(Pane pane, int index , int end) {
        for(int i = index; i<end ; i++){
            pane.getChildren().add(btn_nums[i]);
        }
    }


    //#region getters & setters
    public Pane getRoot() {
        return root;
    }

    public void setRoot(Pane root) {
        this.root = root;
    }

    public TextField getTxtf_ouput() {
        return txtf_ouput;
    }

    public void setTxtf_ouput(TextField txtf_ouput) {
        this.txtf_ouput = txtf_ouput;
    }

    public Button[] getBtn_nums() {
        return btn_nums;
    }

    public void setBtn_nums(Button[] btn_nums) {
        this.btn_nums = btn_nums;
    }

    public Button[] getBtn_operators() {
        return btn_operators;
    }

    public void setBtn_operators(Button[] btn_operators) {
        this.btn_operators = btn_operators;
    }

    public Button getBtn_add() {
        return btn_add;
    }

    public void setBtn_add(Button btn_add) {
        this.btn_add = btn_add;
    }

    public Button getBtn_sub() {
        return btn_sub;
    }

    public void setBtn_sub(Button btn_sub) {
        this.btn_sub = btn_sub;
    }

    public Button getBtn_mult() {
        return btn_mult;
    }

    public void setBtn_mult(Button btn_mult) {
        this.btn_mult = btn_mult;
    }

    public Button getBtn_clear() {
        return btn_clear;
    }

    public void setBtn_clear(Button btn_clear) {
        this.btn_clear = btn_clear;
    }

    // public Button getBtn_neg() {
    // return btn_neg;
    // }

    // public void setBtn_neg(Button btn_neg) {
    // this.btn_neg = btn_neg;
    // }

    public Pane getPane_box() {
        return pane_box;
    }

    public void setPane_box(Pane pane_box) {
        this.pane_box = pane_box;
    }

    public Font getMyFont() {
        return myFont;
    }

    public void setMyFont(Font myFont) {
        this.myFont = myFont;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public char getOperators() {
        return operators;
    }

    public void setOperators(char operators) {
        this.operators = operators;
    }

    //#endregion getters & setters
    // functions and methodes

    
}
