package semana06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MeuPI extends JFrame {
	private JButton btOriginal;
	private Botao btPersonal;
	private JLabel lbNum1, lbNum2, lbResultado;
	private JTextField tfNum1, tfNum2, tfResultado;

	public MeuPI() {
		setTitle("Meu PI");
		setBounds(100, 100, 350, 300);
		setLayout(null);
		setResizable(false);
		lbNum1 = new JLabel("Numero 1: ");
		lbNum2 = new JLabel("Numero 2: ");
		lbResultado = new JLabel("Resultado: ");
		tfNum1 = new JTextField();
		tfNum2 = new JTextField();
		tfResultado = new JTextField();
		tfResultado.setEditable(false);

		btOriginal = new JButton("Somar");
		btOriginal.setMnemonic('S');
		btOriginal.setToolTipText("Realiza a soma");

		btPersonal = new Botao("Limpar");
		btPersonal.setMnemonic('L');
		btPersonal.setToolTipText("Limpa as caixas");

		lbNum1.setBounds(10, 10, 150, 25);
		lbNum2.setBounds(10, 60, 150, 25);
		lbResultado.setBounds(10, 110, 150, 25);

		add(lbNum1);
		add(lbNum2);
		add(lbResultado);

		tfNum1.setBounds(130, 10, 150, 25);
		tfNum2.setBounds(130, 60, 150, 25);
		tfResultado.setBounds(130, 110, 150, 25);

		add(tfNum1);
		add(tfNum2);
		add(tfResultado);

		btOriginal.setBounds(50, 180, 100, 25);
		btPersonal.setBounds(170, 180, 100, 25);

		add(btOriginal);
		add(btPersonal);

		// botão somar
		btOriginal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double n1 = Double.parseDouble(tfNum1.getText());
					double n2 = Double.parseDouble(tfNum2.getText());
					tfResultado.setText("" + (n1 + n2));
				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(btOriginal, "Forneça dois números!");

				}

			}
		});

		// botão sair
		btPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.exit(0); //sair
				tfNum1.setText("");
				tfNum2.setText("");
				tfResultado.setText("");
				tfNum1.requestFocus();

			}
		});
	}

	public static void main(String[] args) {
		MeuPI m = new MeuPI();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
