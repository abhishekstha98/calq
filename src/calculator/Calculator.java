package calculator;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JButton SevenBTN;
	private JButton EightBTN;
	private JButton NineBTN;
	private JButton FourBTN;
	private JButton FiveBTN;
	private JButton SixBTN;
	private JButton OneBTN;
	private JButton TwoBTN;
	private JButton ThreeBTN;
	private JButton ZeroBTN;
	private JButton ClearBTN;
	private JButton DivideBTN;
	private JButton MultiplyBTN;
	private JButton AddBTN;
	private JButton SubtractBTN;
	private JButton ResultBTN;
	private JTextField InputTXT;
	private JButton DoubleZeroBTN;
	private JTextField OutputTXT;
	private String s="";
	private JLabel ResultLBL;
	private JButton TripleZeroBTN;
	private JButton DotBTN;
	private JButton DeleteBTN;
	private JButton ANSBTN;
	private Double result = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setTitle("My First Calculator");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(17, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(getFourBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(getFiveBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(getSixBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(getAddBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
						.addComponent(getInputTXT(), 290, 290, 290)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(getSevenBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(getEightBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(getOneBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(getTwoBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(getDoubleZeroBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(getZeroBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(getDotBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(getANSBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(getClearBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
											.addComponent(getThreeBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
										.addComponent(getTripleZeroBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(getSubtractBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
										.addComponent(getDivideBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
										.addComponent(getResultBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(getNineBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(getMultiplyBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(getResultLBL())
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(getOutputTXT(), GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(getDeleteBTN(), GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
					.addGap(35))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(15)
					.addComponent(getInputTXT(), GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(getResultLBL(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(getOutputTXT(), GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addComponent(getDeleteBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getSevenBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getEightBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getNineBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getMultiplyBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getFiveBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getSixBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getAddBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getFourBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getSubtractBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getOneBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTwoBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getThreeBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(getDivideBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(getZeroBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addComponent(getDoubleZeroBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getTripleZeroBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(getResultBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getClearBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getDotBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(getANSBTN(), GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(39))
		);
		contentPane.setLayout(gl_contentPane);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getInputTXT(), getOutputTXT(), getSevenBTN(), getEightBTN(), getNineBTN(), getMultiplyBTN(), getFourBTN(), getFiveBTN(), getSixBTN(), getAddBTN(), getOneBTN(), getTwoBTN(), getThreeBTN(), getSubtractBTN(), getDoubleZeroBTN(), getZeroBTN(), getDivideBTN(), getClearBTN(), getResultBTN()}));
	}
	private JButton getSevenBTN() {
		if (SevenBTN == null) {
			SevenBTN = new JButton("7");
			SevenBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("7");
					return;
				}
			});
		}
		return SevenBTN;
	}
	private JButton getEightBTN() {
		if (EightBTN == null) {
			EightBTN = new JButton("8");
			EightBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("8");
					return;
				}
			});
		}
		return EightBTN;
	}
	private JButton getNineBTN() {
		if (NineBTN == null) {
			NineBTN = new JButton("9");
			NineBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("9");
					return;
				}
			});
		}
		return NineBTN;
	}
	private JButton getFourBTN() {
		if (FourBTN == null) {
			FourBTN = new JButton("4");
			FourBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("4");
					return;
				}
			});
		}
		return FourBTN;
	}
	private JButton getFiveBTN() {
		if (FiveBTN == null) {
			FiveBTN = new JButton("5");
			FiveBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("5");
					return;
				}
			});
		}
		return FiveBTN;
	}
	private JButton getSixBTN() {
		if (SixBTN == null) {
			SixBTN = new JButton("6");
			SixBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("6");
					return;
				}
			});
		}
		return SixBTN;
	}
	private JButton getOneBTN() {
		if (OneBTN == null) {
			OneBTN = new JButton("1");
			OneBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("1");
					return;
				}
			});
		}
		return OneBTN;
	}
	private JButton getTwoBTN() {
		if (TwoBTN == null) {
			TwoBTN = new JButton("2");
			TwoBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("2");
				}
			});
		}
		return TwoBTN;
	}
	private JButton getThreeBTN() {
		if (ThreeBTN == null) {
			ThreeBTN = new JButton("3");
			ThreeBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("3");
					return;
				}
			});
		}
		return ThreeBTN;
	}
	private JButton getZeroBTN() {
		if (ZeroBTN == null) {
			ZeroBTN = new JButton("0");
			ZeroBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("0");
					return;
				}
			});
		}
		return ZeroBTN;
	}
	private JButton getClearBTN() {
		if (ClearBTN == null) {
			ClearBTN = new JButton("C");
			ClearBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InputTXT.setText("");
					OutputTXT.setText("");
					s="";
					
				}
			});
		}
		return ClearBTN;
	}
	private JButton getDivideBTN() {
		if (DivideBTN == null) {
			DivideBTN = new JButton("/");
			DivideBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("/");
					return;
				}
			});
		}
		return DivideBTN;
	}
	private JButton getMultiplyBTN() {
		if (MultiplyBTN == null) {
			MultiplyBTN = new JButton("*");
			MultiplyBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("*");
					return;
				}
			});
		}
		return MultiplyBTN;
	}
	private JButton getAddBTN() {
		if (AddBTN == null) {
			AddBTN = new JButton("+");
			AddBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("+");
					return;
				}
			});
		}
		return AddBTN;
	}
	private JButton getSubtractBTN() {
		if (SubtractBTN == null) {
			SubtractBTN = new JButton("-");
			SubtractBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("-");
					return;
				}
			});
		}
		return SubtractBTN;
	}
	private JButton getResultBTN() {
		if (ResultBTN == null) {
			ResultBTN = new JButton("=");
			ResultBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result = expre(s);
					OutputTXT.setText(result.toString());
				}
			});
		}
		return ResultBTN;
	}
	private JTextField getInputTXT() {
		if (InputTXT == null) {
			InputTXT = new JTextField();
			InputTXT.setEditable(false);
			InputTXT.setColumns(10);
		}
		return InputTXT;
	}
	private JButton getDoubleZeroBTN() {
		if (DoubleZeroBTN == null) {
			DoubleZeroBTN = new JButton("00");
			DoubleZeroBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("00");
					return;
				}
			});
		}
		return DoubleZeroBTN;
	}
	private JTextField getOutputTXT() {
		if (OutputTXT == null) {
			OutputTXT = new JTextField();
			OutputTXT.setEditable(false);
			OutputTXT.setColumns(10);
		}
		return OutputTXT;
	}
	private JLabel getResultLBL() {
		if (ResultLBL == null) {
			ResultLBL = new JLabel("RESULT:");
		}
		return ResultLBL;
	}
	public void set_Text( String s) {
		this.s=this.s+s;
		InputTXT.setText(this.s);
	}
	public static Double expre( String expre ) {
        Stack<Integer> op  = new Stack<Integer>();
        Stack<Double> val = new Stack<Double>();
        Stack<Integer> operator  = new Stack<Integer>();
        Stack<Double> value = new Stack<Double>();
        String input = expre;
        input = "0" + input;
        input = input.replaceAll("-","+-");
        String temp = "";
        for (int i = 0;i < input.length();i++)
        {
            char ch = input.charAt(i);
            if (ch == '-')
                temp = "-" + temp;
            else if (ch != '+' &&  ch != '*' && ch != '/')
               temp = temp + ch;
            else
            {
                val.push(Double.parseDouble(temp));
                op.push((int)ch);
                temp = "";
            }
        }
        val.push(Double.parseDouble(temp));
        char operators[] = {'/','*','+'};
        for (int i = 0; i < 3; i++)
        {
            boolean it = false;
            while (!op.isEmpty())
            {
                int optr = op.pop();
                double v1 = val.pop();
                double v2 = val.pop();
                if (optr == operators[i])
                {
                    if (i == 0)
                    {
                        value.push(v2 / v1);
                        it = true;
                        break;
                    }
                    else if (i == 1)
                    {
                        value.push(v2 * v1);
                        it = true;
                        break;
                    }
                    else if (i == 2)
                    {
                        value.push(v2 + v1);
                        it = true;
                        break;
                    }                                        
                }
                else
                {
                    value.push(v1);
                    val.push(v2);
                    operator.push(optr);
                }                
            }              
            while (!value.isEmpty())
                val.push(value.pop());
            while (!operator.isEmpty())
                op.push(operator.pop());
            if (it)
                i--;                            
        }    
		return val.pop();
	}
	private char[] idSym() {
		char[]as={'a','b','c'};
		return as;
	}
	private JButton getTripleZeroBTN() {
		if (TripleZeroBTN == null) {
			TripleZeroBTN = new JButton("000");
			TripleZeroBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text("000");
					return;
				}
			});
		}
		return TripleZeroBTN;
	}
	private JButton getDotBTN() {
		if (DotBTN == null) {
			DotBTN = new JButton(".");
			DotBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					set_Text(".");
				}
			});
		}
		return DotBTN;
	}
	private JButton getDeleteBTN() {
		if (DeleteBTN == null) {
			DeleteBTN = new JButton("<—");
			DeleteBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					s=(s.substring(0, (s.length()-1)));
					set_Text("");
				}
			});
		}
		return DeleteBTN;
	}
	private JButton getANSBTN() {
		if (ANSBTN == null) {
			ANSBTN = new JButton("ANS");
			ANSBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(result==0.0){
						set_Text("");
					}
					else{
						set_Text(result.toString());
					}
				}
			});
		}
		return ANSBTN;
	}
}



















