package calca;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Calca extends Application{
	 TextArea textarea=new TextArea();
	    String showExpression = "";
	    String hiddenExpression = "";
	    boolean isSquare = false;
	    boolean isOpen = false;
	    boolean isequal=false;
	    int countOpen = 0;
	    int countClose = 0;
            VBox vbox2; //design pane
	
	 @Override
	 public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		 vbox2=desingCalculator();
		 Scene scene=new Scene(vbox2,200,200);
		
		 arg0.setTitle("Calcluator");
		 arg0.setScene(scene);
		 arg0.show();
		
		arg0.setOnCloseRequest(e->{
			arg0.close();
			
		});  
	 }
	  
	 
	 public VBox desingCalculator(){
        VBox vbox=new VBox();
		 Button one =new Button("1"); //buttons 
		 Button two =new Button("2");
		 Button three =new Button("3");
		 Button four =new Button("4");
		 Button five =new Button("5");
		 Button six =new Button("6");
		 Button seven =new Button("7");
		 Button eight =new Button("8");
		 Button nine =new Button("9");
		 Button plus =new Button("+");
		 Button minus =new Button("-");
		 Button mul =new Button("*");
		 Button div =new Button("/");
		 Button sqrt = new Button("√");
		 Button mod =new Button("%");
		 Button dot =new Button(".");
		 Button square =new Button("x^2");
		 Button equal =new Button("=");
		 Button open =new Button("(");
		 Button close =new Button(")");
		 Button clear =new Button("C");
		 Button zero =new Button("0");
		 Button reset=new Button("Reset");// end of button
		
		 HBox hbox1=new HBox();
		 hbox1.setSpacing(2);
		 hbox1.getChildren().addAll(one,two,three,clear,reset);
		 HBox hbox2=new HBox();
		 hbox2.setSpacing(2);
		 hbox2.getChildren().addAll(four,five,six,mul,div);
		 HBox hbox3=new HBox();
		 hbox3.setSpacing(2);
		 hbox3.getChildren().addAll(seven,eight,nine,open,close);
		 HBox hbox4=new HBox();
		 hbox4.setSpacing(2);
		 HBox hbox5=new HBox();
		 hbox5.setSpacing(2);
		 hbox4.getChildren().addAll(zero,dot,mod,plus,minus);
		
		hbox5.getChildren().addAll(square,sqrt,equal);
		 one.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 one.prefHeightProperty().bind(hbox1.heightProperty());
		two.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 two.prefHeightProperty().bind(hbox1.heightProperty());
		three.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 three.prefHeightProperty().bind(hbox1.heightProperty());
		four.prefWidthProperty().bind(hbox2.widthProperty().divide(5));
		 four.prefHeightProperty().bind(hbox1.heightProperty());
		five.prefWidthProperty().bind(hbox2.widthProperty().divide(5));
		 five.prefHeightProperty().bind(hbox1.heightProperty());
		six.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 six.prefHeightProperty().bind(hbox1.heightProperty());
		seven.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 seven.prefHeightProperty().bind(hbox1.heightProperty());
		eight.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 eight.prefHeightProperty().bind(hbox1.heightProperty());
		nine.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 nine.prefHeightProperty().bind(hbox1.heightProperty());
		zero.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 zero.prefHeightProperty().bind(hbox1.heightProperty());
		plus.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 plus.prefHeightProperty().bind(hbox1.heightProperty());
		minus.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 minus.prefHeightProperty().bind(hbox1.heightProperty());
		mul.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 mul.prefHeightProperty().bind(hbox1.heightProperty());
		div.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 div.prefHeightProperty().bind(hbox1.heightProperty());
		dot.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 dot.prefHeightProperty().bind(hbox1.heightProperty());
		mod.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 mod.prefHeightProperty().bind(hbox1.heightProperty());
		open.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 open.prefHeightProperty().bind(hbox1.heightProperty());
		close.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 close.prefHeightProperty().bind(hbox1.heightProperty());
		clear.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 clear.prefHeightProperty().bind(hbox1.heightProperty());
		reset.prefWidthProperty().bind(hbox1.widthProperty().divide(5));
		 reset.prefHeightProperty().bind(hbox1.heightProperty());
		square.prefWidthProperty().bind(hbox5.widthProperty().divide(5));
		 square.prefHeightProperty().bind(hbox5.heightProperty());
		 sqrt.prefWidthProperty().bind(hbox5.widthProperty().divide(5));
		 sqrt.prefHeightProperty().bind(hbox5.heightProperty());
			equal.prefHeightProperty().bind(hbox5.heightProperty());
			
			equal.prefWidthProperty().bind(hbox5.widthProperty().divide(5).multiply(3));
			 
	
   	 	 vbox.getChildren().addAll(textarea,hbox1,hbox2,hbox3,hbox4,hbox5);
		    hbox1.prefWidthProperty().bind(vbox.widthProperty());
		    hbox2.prefWidthProperty().bind(vbox.widthProperty());
			hbox3.prefWidthProperty().bind(vbox.widthProperty());
			hbox4.prefWidthProperty().bind(vbox.widthProperty());
			hbox5.prefWidthProperty().bind(vbox.widthProperty());

			hbox1.prefHeightProperty().bind(vbox.heightProperty().divide(6));
			hbox2.prefHeightProperty().bind(vbox.heightProperty().divide(6));
			hbox3.prefHeightProperty().bind(vbox.heightProperty().divide(6));
			hbox4.prefHeightProperty().bind(vbox.heightProperty().divide(6));
			hbox5.prefHeightProperty().bind(vbox.heightProperty().divide(6));

		 	textarea.prefWidthProperty().bind(vbox.widthProperty());
		 	textarea.prefHeightProperty().bind(vbox.heightProperty().divide(6));			
		///////////////////////////////////////////////////////////////// one button is clicked
		 one.setOnAction(e->{
                     
                     //fsqrt=0; fsquare=0;fmul=0;fmin=0;fplus=0;fdiv=0;fmod=0;
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "1";
                 hiddenExpression += "1";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "1";
                 hiddenExpression = "1";
                 textarea.setText(showExpression);
                 isequal=false;
             }

		 });
                 ///////////////////////////////////////////////////////////////// two button is clicked
		 two.setOnAction(e->{
                    

			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "2";
                 hiddenExpression += "2";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "2";
                 hiddenExpression = "2";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
                 ///////////////////////////////////////////////////////////////// three button is clicked
		 three.setOnAction(e->{
                    

			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "3";
                 hiddenExpression += "3";
                 textarea.setText(showExpression);

             }
             if(isequal){
            	 showExpression = "3";
                 hiddenExpression = "3";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
                 ///////////////////////////////////////////////////////////////// four button is clicked
		 four.setOnAction(e->{
                   
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "4";
                 hiddenExpression += "4";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "4";
                 hiddenExpression = "4";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
		 five.setOnAction(e->{
                     
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "5";
                 hiddenExpression += "5";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "5";
                 hiddenExpression = "5";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
                 ///////////////////////////////////////////////////////////////// six button is clicked
		 six.setOnAction(e->{
                     
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "6";
                 hiddenExpression += "6";
                 textarea.setText(showExpression);
             } 
             if(isequal){
            	 showExpression = "6";
                 hiddenExpression = "6";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
		 seven.setOnAction(e->{
                    
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "7";
                 hiddenExpression += "7";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "7";
                 hiddenExpression = "7";
                 textarea.setText(showExpression);
                 isequal=false;
             }
         });
                 ///////////////////////////////////////////////////////////////// eight button is clicked
		 eight.setOnAction(e->{
                    
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "8";
                 hiddenExpression += "8";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "8";
                 hiddenExpression = "8";
                 textarea.setText(showExpression);
                 isequal=false;
             }
         
		 });
                 ///////////////////////////////////////////////////////////////// nine button is clicked
		 nine.setOnAction(e->{
                     
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "9";
                 hiddenExpression += "9";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "9";
                 hiddenExpression = "9";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
                 ///////////////////////////////////////////////////////////////// Zero button is clicked
		 zero.setOnAction(e->{
                    
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {

                 showExpression += "0";
                 hiddenExpression += "0";
                 textarea.setText(showExpression);

             }
             if(isequal){
            	 showExpression = "0";
                 hiddenExpression = "0";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
                 ///////////////////////////////////////////////////////////////// dot button is clicked
		 dot.setOnAction(e->{
			 
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {

                 showExpression += ".";
                 hiddenExpression += ".";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "0.";
                 hiddenExpression = "0.";
                 textarea.setText(showExpression);
                 isequal=false;
             }
	
		 });
                 ///////////////////////////////////////////////////////////////// plus button is clicked
		 plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
               
                  ch = showExpression.charAt(showExpression.length() - 1);
            
         if(isequal){
             if(showExpression.equals("error expression")){
                 showExpression = "";
         hiddenExpression = "";
             }
             else{
    	 showExpression += "+";
         hiddenExpression += "+";
         textarea.setText(showExpression);
         isequal=false;
             }
               }
         else {
    	 showExpression += "+";
         hiddenExpression += "+";
         textarea.setText(showExpression);
         isequal=false;
             }
     if(showExpression==""){
//    	 showExpression = "0+";
//         hiddenExpression = "0+";
//         textarea.setText(showExpression); 
     }

            }
                 catch(Exception e)
                {
                }
            }
        });
                 ///////////////////////////////////////////////////////////////// minus button is clicked
 minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                   // fmin=1;if(isequal){
            if(isequal){
             if(showExpression.equals("error expression")){
                 showExpression = "";
         hiddenExpression = "";
             }
             else{
    	 showExpression += "-";
         hiddenExpression += "-";
         textarea.setText(showExpression);
         isequal=false;
             }
     }
     else if(showExpression==""){
//    	 showExpression = "0-";
//         hiddenExpression = "0-";
//         textarea.setText(showExpression); 
     }
     else{
	 showExpression += "-";
     hiddenExpression += "-";
     textarea.setText(showExpression);
     isSquare = false;	 
     }
                
                
            }
                 catch(Exception e)
                {
                }
            }
        });
 ///////////////////////////////////////////////////////////////// div button is clicked
 div.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = showExpression.charAt(showExpression.length() - 1);
         if(isequal){
             if(showExpression.equals("error expression")){
                 showExpression = "";
         hiddenExpression = "";
             }
             else{
    	 showExpression += "/";
         hiddenExpression += "/";
         textarea.setText(showExpression);
         isequal=false;
             }
     }
     
     else if (Character.isDigit(ch) || ch == ')') {
         showExpression += "/";
         hiddenExpression += "/";
         textarea.setText(showExpression);
         isSquare = false;
     }
     else if(showExpression==""){
//    	 showExpression = "0/";
//         hiddenExpression = "0/";
//         textarea.setText(showExpression); 
     }     
                }
                 catch(Exception e)
                {
                }
                 
            }
        });
 ///////////////////////////////////////////////////////////////// mul button is clicked
 mul.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                
	 char ch = showExpression.charAt(showExpression.length() - 1);
    
      if(isequal){
             if(showExpression.equals("error expression")){
                 showExpression = "";
         hiddenExpression = "";
             }
             else{
    	 showExpression += "*";
         hiddenExpression += "*";
         textarea.setText(showExpression);
         isequal=false;
             }
     }
      else if (Character.isDigit(ch) || ch == ')') {
         showExpression += "*";
         hiddenExpression += "*";
         textarea.setText(showExpression);
         isSquare = false;
     }
     else if(showExpression==""){
//    	 showExpression = "0*";
//         hiddenExpression = "0*";
//         textarea.setText(showExpression); 
     }             }
                 catch(Exception e)
                {
                }
                 
            }

 });
 ///////////////////////////////////////////////////////////////// mod button is clicked
mod.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                // fmod=1;
	  char ch = showExpression.charAt(showExpression.length() - 1);
         if(isequal){
             if(showExpression.equals("error expression")){
                 showExpression = "";
         hiddenExpression = "";
             }
             else{
    	 showExpression += "%";
         hiddenExpression += "%";
         textarea.setText(showExpression);
         isequal=false;
             }
     }
         
     else if (Character.isDigit(ch) || ch ==')') {

         showExpression += "%";
         hiddenExpression += "%";
         textarea.setText(showExpression);
         isSquare = false;
     } 
     if(showExpression==""){
//    	 showExpression = "0%";
//         hiddenExpression = "0%";
//         textarea.setText(showExpression); 
     }
            }
                 catch(Exception e)
                {
                }
            }
        });
///////////////////////////////////////////////////////////////// sqrt button is clicked
 sqrt.setOnAction(new EventHandler<ActionEvent>(){  
   
            @Override
            public void handle(ActionEvent event) {  
                
     try {
           
     if(showExpression.equals("error expression")){
                 showExpression = "";
         hiddenExpression = "";
             }
        
        else if (showExpression.equals("")) {

         showExpression += "√";
         hiddenExpression += "|";
         textarea.setText(showExpression);

     }
           char ch = ' ';
    ch = showExpression.charAt(showExpression.length() - 1);
     if(Character.isDigit(ch)) 
{
	if(isequal){
		textarea.setText("error expression");
                showExpression = "";
        hiddenExpression = "";
	}
        else  {

showExpression += "√";
hiddenExpression += "|";
textarea.setText(showExpression);


	}
      
       /*  {

showExpression += "√";
hiddenExpression += "|";
textarea.setText(showExpression);

}*/
}
       
       
     }catch (Exception e) {
     }
 
            }
     
 });
textarea.setEditable(false);

///////////////////////////////////////////////////////////////// square button is clicked
 square.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                  //  fsquare=1;
                   char lastChar = showExpression.charAt(showExpression.length() - 1);
 
 if (Character.isDigit(lastChar)) {
     String number = "";
     String swapNumber = "";
     String str = textarea.getText();
     for (int i = str.length() - 1; i >= 0; i--) {
         char ch = str.charAt(i);
         if (Character.isDigit(ch)) {
             number += ch;
         } else {
             break;
         }
     }
     for (int i = number.length() - 1; i >= 0; i--) {
         char ch = number.charAt(i);
         swapNumber += ch;
     }
     hiddenExpression += "*" + swapNumber;
     showExpression += "^2";
     textarea.setText(showExpression);
     isSquare = true;	} 
                } catch (Exception e) {
                }
            }
     
	 
 
 });
 ///////////////////////////////////////////////////////////////// clear button is clicked
 clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                   if(showExpression.equals("error expression")){
         textarea.clear();}
                 char ch = ' ';
     if (!showExpression.equals("")) {
         ch = showExpression.charAt(showExpression.length() - 1);
     }
     if (ch == ')') {
         countClose--;
     } else if (ch == '(') {
         countOpen--;
         if (countOpen == 0);
         isOpen = false;
     }

     String str = textarea.getText();
     String newStr = str.substring(0, showExpression.length() - 1);
     showExpression = newStr;
     hiddenExpression = hiddenExpression.substring(0, hiddenExpression.length() - 1);
     textarea.setText(showExpression);
	
                } catch (Exception e) {
                }
            }
     
	 
 
 });
   ///////////////////////////////////////////////////////////////// reset button is clicked
 reset.setOnAction(e->{
     
	 textarea.setText("");
     showExpression = "";
     hiddenExpression = "";
     isOpen = false;
     isSquare = false;
     countClose = 0;
     countOpen = 0;

 });
		 open.setOnAction(e->{
		 char ch1 = ' ';
                  if(showExpression.equals("error expression")){
                 showExpression = "";
         hiddenExpression = "";}
             if (!showExpression.equals("")) {
                 ch1 = showExpression.charAt(showExpression.length() - 1);
             }
             if (((!Character.isDigit(ch1) && isSquare == false) && ch1 != ')') || ch1 == ' ') {
                 showExpression += "(";
                 hiddenExpression += "(";
                 textarea.setText(showExpression);
                 isOpen = true;
                 countOpen++;
             }
		 });
                 ///////////////////////////////////////////////////////////////// close brackets button is clicked
		 close.setOnAction(e->{
			 if (isOpen) {
                 showExpression += ")";
                 hiddenExpression += ")";
                 textarea.setText(showExpression);
                 countClose++;
             }
		 });
                 ///////////////////////////////////////////////////////////////// equal button is clicked
		
                 equal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                if (countClose != countOpen) {
                 textarea.setText("error expression");
                 showExpression = "";
                 hiddenExpression = "";
             } else {

                 EvaluteExpression ev = new EvaluteExpression();
                 hiddenExpression = ev.brackets(hiddenExpression);
                 textarea.setText(hiddenExpression);
                 showExpression = hiddenExpression;
//                 if(fdiv==1 || fmin==1|| fmod==1||fmul==1||fplus==1||fsqrt==1||fsquare==1){
//                 //showExpression = hiddenExpression;
//                 
//                 }else{
//                 showExpression ="";
//                 hiddenExpression="";
//                 }
                 
                 isequal=true;
             }
            }
                 catch(Exception e)
                {
                }
            }
        });
		return vbox;


	 }
	 
	public static void main(String[]args){
	 
		 Application.launch(args);
	 }
}

 class EvaluteExpression {

    ArrayList<String> contents;
    String item;
    EvaluteExpression check;

    public  <E> E brackets(E e) {
        check = new EvaluteExpression();
        String s=e.toString();
        while (s.contains(Character.toString('(')) || s.contains(Character.toString(')'))) {
            for (int i =  s.length()-1; i >=0; i--) {
                if (s.charAt(i) == ')') {
                    for (int j = i; j >= 0; j--) {
                        if (s.charAt(j) == '(') {
                            String in = s.substring(j + 1, i);
                            in = check.recognize(in);
                            s = s.substring(0, j) + in + s.substring(i + 1);
                            j = i = 0;
                        }
                    }
                }
            }

        }
        s = check.recognize(s);
        
        return (E)s;
    }

    public <E> E recognize(E e) {
        PutIt putIt = new PutIt();
        contents = new ArrayList<String>();
        String s=e.toString();
        item = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                item = s.charAt(i) + item;
                if (i == 0) {
                    putIt.put();
                }
            } else {
                if (s.charAt(i) == '.') {
                    item = s.charAt(i) + item;
                } else if (s.charAt(i) == '-' && (i == 0 || (!Character.isDigit(s.charAt(i - 1))))) {
                    item = s.charAt(i) + item;
                    putIt.put();
                } else {
                    putIt.put();
                    item += s.charAt(i);
                    putIt.put();
                    if (s.charAt(i) == '|') {
                        item += " ";
                        putIt.put();
                    }
                }
            }
        }
        contents = putIt.result(contents, "^", "%");
        contents = putIt.result(contents, "*", "/");
        contents = putIt.result(contents, "+", "-");
        return (E)contents.get(0);
    }

    public class PutIt {

        public void put() {
            if (!item.equals("")) {
                contents.add(0, item);
                item = "";
            }
        }

        public ArrayList<String> result(ArrayList<String> arrayList, String op1, String op2) {
            int scale = 10;
            String e="";
            BigDecimal result = new BigDecimal(0);
            for (int c = 0; c < arrayList.size(); c++) {
                if (arrayList.get(c).equals(op1) || arrayList.get(c).equals(op2)) {
                    if (arrayList.get(c).equals("|")) {
                        result = new BigDecimal(Math.sqrt(Double.parseDouble(arrayList.get(c + 1))));
                    } else if (arrayList.get(c).equals("*")) {
                        result = new BigDecimal(arrayList.get(c - 1)).multiply(new BigDecimal(arrayList.get(c + 1)));
                    } else if (arrayList.get(c).equals("/")) {
                        if(arrayList.get(c +1).equals("0")){//divide by zero
                                e="error expression";
                               arrayList.clear();
                               arrayList.add(e);
                               return arrayList;
                        }
                        result = new BigDecimal(arrayList.get(c - 1)).divide(new BigDecimal(arrayList.get(c + 1)), scale, BigDecimal.ROUND_DOWN);
                    } else if (arrayList.get(c).equals("+")) {
                        result = new BigDecimal(arrayList.get(c - 1)).add(new BigDecimal(arrayList.get(c + 1)));
                    } else if (arrayList.get(c).equals("-")) {
                        result = new BigDecimal(arrayList.get(c - 1)).subtract(new BigDecimal(arrayList.get(c + 1)));
                    } else if (arrayList.get(c).equals("%")) {
                        
                         result = new BigDecimal(arrayList.get(c - 1)).remainder(new BigDecimal(arrayList.get(c + 1)));
                    }

                    try {
                        arrayList.set(c, (result.setScale(scale, RoundingMode.HALF_DOWN).
                                stripTrailingZeros().toPlainString()));
                        arrayList.remove(c + 1);
                        arrayList.remove(c - 1);
                    } catch (Exception ignored) {
                    }
                } else {
                    continue;
                }
                c = 0;
            }
            return arrayList;
        }
    }
}
