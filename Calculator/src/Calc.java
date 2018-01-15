import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calc extends JFrame {
 private JTextField answerarea;
 private JButton clear,zero,one,two,three,four,five,six,seven,eight,nine,equals,minus,plus,divide,multiply,decimal;
 private String sfirstnumber,ssecondnumber,sanswer;
 private double answer=0;
 private JPanel contentpanel;
 private boolean equalsClicked=false ; 
 private boolean opChosen=false;
char operation=('_');
 
 
 public Calc() {
	 super("Calculator");
	 answerarea=new JTextField(null,30);
	 answerarea.setEditable(false);
	 one=new JButton("1");
	 two=new JButton("2");
	 three=new JButton("3");
	 four=new JButton("4");
	 five=new JButton("5");
	 six=new JButton("6");
	 seven=new JButton("7");
	 eight=new JButton("8");
	 nine=new JButton("9");
	 zero=new JButton("0");
	 equals=new JButton("=");
	 minus=new JButton("-");
	 plus =new JButton("+");
	 divide=new JButton("/");
	 multiply=new JButton("*");
	 clear=new JButton("C");
     decimal=new JButton(".");
  
	 
	Dimension x= new Dimension(105,45);
	
	one.setPreferredSize(x);
	two.setPreferredSize(x);
	three.setPreferredSize(x);
	four.setPreferredSize(x);
	five.setPreferredSize(x);
	six.setPreferredSize(x);
	seven.setPreferredSize(x);
	eight.setPreferredSize(x);
	nine.setPreferredSize(x);
	zero.setPreferredSize(x);
	equals.setPreferredSize(x);
	minus.setPreferredSize(x);
	divide.setPreferredSize(x);
	multiply.setPreferredSize(x);
	plus.setPreferredSize(x);
	clear.setPreferredSize(x);
	decimal.setPreferredSize(x);
	
	Numbers n=new Numbers();
	Gui g= new Gui();

	
	zero.addActionListener(n);one.addActionListener(n);two.addActionListener(n);
	three.addActionListener(n);four.addActionListener(n);five.addActionListener(n);
	six.addActionListener(n);seven.addActionListener(n);eight.addActionListener(n);
	nine.addActionListener(n);clear.addActionListener(n);decimal.addActionListener(n);
	
	multiply.addActionListener(g);equals.addActionListener(g);divide.addActionListener(g);
	minus.addActionListener(g);plus.addActionListener(g);
	
	 contentpanel=new JPanel();
	 contentpanel.setBackground(Color.BLACK);
	 contentpanel.setLayout(new FlowLayout());
	 contentpanel.add(answerarea,BorderLayout.NORTH);
	 contentpanel.add(one);contentpanel.add(two);contentpanel.add(three);
	 contentpanel.add(four);contentpanel.add(five);contentpanel.add(six);
	 contentpanel.add(seven);contentpanel.add(eight);contentpanel.add(nine);
	 contentpanel.add(plus);contentpanel.add(zero);contentpanel.add(minus);
	 contentpanel.add(multiply);contentpanel.add(equals);contentpanel.add(divide);contentpanel.add(clear);contentpanel.add(decimal);
	 this.setContentPane(contentpanel);
	 }

 private class Numbers implements ActionListener{
	 public void actionPerformed(ActionEvent event) {
		JButton src=(JButton)event.getSource();
		
		 
	        if(src.equals(one)){
	            if(opChosen==false){
	                if(sfirstnumber==null){
	                   sfirstnumber= "1"; 
	                } else{ 
	                    sfirstnumber= sfirstnumber  + "1";
	                }
	            }else{
	                if(ssecondnumber==null){
	                   ssecondnumber= "1"; 
	                } else{ 
	                    ssecondnumber= ssecondnumber  + "1";
	            }
	        }
	     }
	        if(src.equals(two)){
	            if(opChosen==false){
	                if(sfirstnumber==null){
	                   sfirstnumber= "2"; 
	                } else{ 
	                    sfirstnumber= sfirstnumber  + "2";
	                }
	            }else{
	                if(ssecondnumber==null){
	                   ssecondnumber= "2"; 
	                } else{ 
	                    ssecondnumber= ssecondnumber  + "2";
	            }
	        }
	     }
	        if(src.equals(three)){
	            if(opChosen==false){
	                if(sfirstnumber==null){
	                   sfirstnumber= "3"; 
	                } else{ 
	                    sfirstnumber= sfirstnumber  + "3";
	                }
	            }else{
	                if(ssecondnumber==null){
	                   ssecondnumber= "3"; 
	                } else{ 
	                    ssecondnumber= ssecondnumber  + "3";
	            }
	        }
	     }
	        if(src.equals(four)){
	            if(opChosen==false){
	                if(sfirstnumber==null){
	                   sfirstnumber= "4"; 
	                } else{ 
	                    sfirstnumber= sfirstnumber  + "4";
	                }
	            }else{
	                if(ssecondnumber==null){
	                   ssecondnumber= "4"; 
	                } else{ 
	                    ssecondnumber= ssecondnumber  + "4";
	            }
	        }
	     }
	        if(src.equals(five)){
	            if(opChosen==false){
	                if(sfirstnumber==null){
	                   sfirstnumber= "5"; 
	                } else{ 
	                    sfirstnumber= sfirstnumber  + "5";
	                }
	            }else{
	                if(ssecondnumber==null){
	                   ssecondnumber= "5"; 
	                } else{ 
	                    ssecondnumber= ssecondnumber  + "5";
	            }
	        }
	     }
	        if(src.equals(six)){
	            if(opChosen==false){
	                if(sfirstnumber==null){
	                   sfirstnumber= "6"; 
	                } else{ 
	                    sfirstnumber= sfirstnumber  + "6";
	                }
	            }else{
	                if(ssecondnumber==null){
	                   ssecondnumber= "6"; 
	                } else{ 
	                    ssecondnumber= ssecondnumber  + "6";
	            }
	        }
	     }
	        if(src.equals(seven)){
	            if(opChosen==false){
	                if(sfirstnumber==null){
	                   sfirstnumber= "7"; 
	                } else{ 
	                    sfirstnumber= sfirstnumber  + "7";
	                }
	            }else{
	                if(ssecondnumber==null){
	                   ssecondnumber= "7"; 
	                } else{ 
	                    ssecondnumber= ssecondnumber  + "7";
	            }
	        }
	     }
	        if(src.equals(eight)){
	            if(opChosen==false){
	                if(sfirstnumber==null){
	                   sfirstnumber= "8"; 
	                } else{ 
	                    sfirstnumber= sfirstnumber  + "8";
	                }
	            }else{
	                if(ssecondnumber==null){
	                   ssecondnumber= "8"; 
	                } else{ 
	                    ssecondnumber= ssecondnumber  + "8";
	            }
	        }
	     }
	        if(src.equals(nine)){
	            if(opChosen==false){
	                if(sfirstnumber==null){
	                   sfirstnumber= "9"; 
	                } else{ 
	                    sfirstnumber= sfirstnumber  + "9";
	                }
	            }else{
	                if(ssecondnumber==null){
	                   ssecondnumber= "9"; 
	                } else{ 
	                    ssecondnumber= ssecondnumber  + "9";
	            }
	        }
	     }
	        if(src.equals(zero)){
	            if(opChosen==false){
	                if(sfirstnumber==null){
	                   sfirstnumber= "0"; 
	                } else{ 
	                    sfirstnumber= sfirstnumber  + "0";
	                }
	            }else{
	                if(ssecondnumber==null){
	                   ssecondnumber= "0"; 
	                } else{ 
	                    ssecondnumber= ssecondnumber  + "0";
	            }
	        }
	     }
	        if(src.equals(decimal)){
	            if(opChosen==false){
	                if(sfirstnumber==null){
	                   sfirstnumber= "."; 
	                } else
	                	if(sfirstnumber != null) {
	                	  if(sfirstnumber.contains(".")) {
	                		  System.out.println("A decimal has already been used!");
	                	  }else {
	                		  sfirstnumber += "."; 
	                	  } 
	                  
	                }
	            }else{
	                if(ssecondnumber==null){
	                   ssecondnumber= "."; 
	                } else 
	                	if(ssecondnumber != null) {
	                		if(ssecondnumber.contains(".")) {
	                			System.out.println("A decimal has already been used!");
	                		} else {
	                			ssecondnumber += ".";
	                		}
	            }
	        }
	     }
	        
	      
	        
	        if(src.equals(clear)) {
	        	 if(opChosen==false){
	                 if(sfirstnumber==null) {
	                	 System.out.print("Can't delete");
	                 } else {
	                	 sfirstnumber= sfirstnumber.substring(0, sfirstnumber.length()-1);
	                 }
	        	 }else {
	        		 if(ssecondnumber==null) {
	                	 System.out.print("Can't delete");
	                 } else {
	                	 ssecondnumber= ssecondnumber.substring(0, ssecondnumber.length()-1);
	        	 }
	          }
	        }
	        
	        if(equalsClicked==false){
	            if(opChosen==false){
	           answerarea.setText(sfirstnumber);
	        }else{
	             answerarea.setText(ssecondnumber);
	        }
	       } 
	     }
	  } 
	  
	  
	  
	 
	   private class Gui implements ActionListener{
	        public void actionPerformed(ActionEvent event){
	          JButton src = (JButton) event.getSource(); 
	          
	          if(src.equals(plus)){
	              if(sfirstnumber==null){
	                  System.out.println("Choose your numbers first");
	              }else
	                  if(sfirstnumber != null && ssecondnumber == null){
	                      opChosen= true;
	                      operation = '+';
	                  }else
	                      if(sfirstnumber != null && ssecondnumber != null){
	                          System.out.println("Two operations only");
	                      }
	          }
	          if(src.equals(minus)){
	              if(sfirstnumber==null){
	                  System.out.println("Choose your numbers first");
	              }else
	                  if(sfirstnumber != null && ssecondnumber == null){
	                      opChosen= true;
	                      operation = '-';
	                  }else
	                      if(sfirstnumber != null && ssecondnumber != null){
	                          System.out.println("Two operations only");
	                      }
	          }
	          if(src.equals(multiply)){
	              if(sfirstnumber==null){
	                  System.out.println("Choose your numbers first");
	              }else
	                  if(sfirstnumber != null && ssecondnumber == null){
	                      opChosen= true;
	                      operation = '*';
	                  }else
	                      if(sfirstnumber != null && ssecondnumber != null){
	                          System.out.println("Two operations only");
	                      }
	          }
	          if(src.equals(divide)){
	              if(sfirstnumber==null){
	                  System.out.println("Choose your numbers first");
	              }else
	                  if(sfirstnumber != null && ssecondnumber == null){
	                      opChosen= true;
	                      operation = '/';
	                  }else
	                      if(sfirstnumber != null && ssecondnumber != null){
	                          System.out.println("Two operations only");
	                      }
	          }
	          if(src.equals(equals)){
	              if(sfirstnumber==null){
	             
	              }else
	                  if(sfirstnumber != null && ssecondnumber == null){
	                	 
	                    
	                  }
	              if(sfirstnumber != null && ssecondnumber !=null){
	                  double d1 = 0.0, d2=0.0;
	                  
	                  d1= Double.parseDouble(sfirstnumber);
	                  d2= Double.parseDouble(ssecondnumber);
	                  
	                  switch(operation){
	                  case '+': 
	                     answer= d1 + d2;
	                     break;
	                  case '-': 
	                      answer= d1 - d2;
	                      break;
	                  case '*': 
	                      answer= d1 * d2;
	                      break;
	                  case '/': 
	                      answer= d1 / d2;
	                      break;
	                  } 
	                  
	                  sanswer= Double.toString(answer);
	                  answerarea.setText(sanswer); 
	                  if(operation == '/' && d2 == 0.0) {
	                	  answerarea.setText("Math ERROR");
	                  }
	                 }
	               }
	              
	                 if(src.equals(clear)) {
	                	 sfirstnumber = null;
	                	 ssecondnumber = null;
	                	 equalsClicked= false;
	                	 opChosen = false;
	                	 operation = ' ';
	                	 answerarea.setText(null);
	                	 sanswer = null;
	               }
	          }
	   }
}
	