package WB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Panel;


public class GeradorOcorrencia extends JFrame {

	
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public static JTextField textNumeroOcoL;
	public static JTextField textNomeVitimaL;
	private static JTextField textDescricaoOcoL;
	private static JTextField textNumeroOcoH;
	private static JTextField textNomeVitimaH;
	private static JTextField textDescricaoOcoH;
	private static JTextField textNumeroOcoF;
	private static JTextField textNomeVitimaF;
	private static JTextField textDescricaoOcoF;

	
	public static void main(String[] args) {
		      		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeradorOcorrencia frame = new GeradorOcorrencia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GeradorOcorrencia() {
		
		
					
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Ocorrencia Latrocínio", null, panel, null);
		panel.setLayout(null);
		
			
		JButton btnNewButton = new JButton("Gerar Ocorrencia");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				OcorrenciaLatrocinio ocL = montaOcorrenciaL();
				JOptionPane.showMessageDialog(null,ocL.exibeinfoOcorrencia());
				
				
			  
			 }
		    });
		
		btnNewButton.setBounds(219, 216, 150, 23);
		panel.add(btnNewButton);
		
		textNumeroOcoL = new JTextField();
		textNumeroOcoL.setBounds(269, 45, 226, 20);
		panel.add(textNumeroOcoL);
		textNumeroOcoL.setColumns(10);
		
		textNomeVitimaL = new JTextField();
		textNomeVitimaL.setBounds(269, 88, 226, 20);
		panel.add(textNomeVitimaL);
		textNomeVitimaL.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome da vitima:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(169, 84, 115, 26);
		panel.add(lblNewLabel);
		
		JLabel lbltext = new JLabel("Numero da ocorrencia:");
		lbltext.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbltext.setHorizontalAlignment(SwingConstants.CENTER);
		lbltext.setBounds(94, 41, 208, 26);
		panel.add(lbltext);
		
		textDescricaoOcoL = new JTextField();
		textDescricaoOcoL.setColumns(10);
		textDescricaoOcoL.setBounds(269, 137, 227, 20);
		panel.add(textDescricaoOcoL);
		
		JLabel lblNewLabel_3 = new JLabel("Descri\u00E7\u00E3o:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(203, 133, 67, 26);
		panel.add(lblNewLabel_3);
		
				
				JPanel panel_2 = new JPanel();
				tabbedPane.addTab("Ocorrencia Homic\u00EDdio", null, panel_2, null);
				panel_2.setLayout(null);
				
				JButton btnNewButton_1_1 = new JButton("Gerar Ocorrencia");
				btnNewButton_1_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						
						OcorrenciaHomicidio ocH = montaOcorrenciaH();
						JOptionPane.showMessageDialog(null,ocH.exibeinfoOcorrencia());
						
						
						
						
					}
				});
				btnNewButton_1_1.setForeground(Color.BLACK);
				btnNewButton_1_1.setBackground(Color.GREEN);
				btnNewButton_1_1.setBounds(219, 221, 152, 23);
				panel_2.add(btnNewButton_1_1);
				
				textNumeroOcoH = new JTextField();
				textNumeroOcoH.setColumns(10);
				textNumeroOcoH.setBounds(242, 38, 226, 20);
				panel_2.add(textNumeroOcoH);
				
				JLabel lbltext_2 = new JLabel("Numero da ocorrencia:");
				lbltext_2.setHorizontalAlignment(SwingConstants.CENTER);
				lbltext_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lbltext_2.setBounds(67, 34, 208, 26);
				panel_2.add(lbltext_2);
				
				JLabel lblNewLabel_4 = new JLabel("Nome da vitima:");
				lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNewLabel_4.setBounds(142, 77, 115, 26);
				panel_2.add(lblNewLabel_4);
				
				textNomeVitimaH = new JTextField();
				textNomeVitimaH.setColumns(10);
				textNomeVitimaH.setBounds(242, 81, 226, 20);
				panel_2.add(textNomeVitimaH);
				
				JLabel lblNewLabel_3_4 = new JLabel("Descri\u00E7\u00E3o:");
				lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNewLabel_3_4.setBounds(176, 126, 67, 26);
				panel_2.add(lblNewLabel_3_4);
				
				textDescricaoOcoH = new JTextField();
				textDescricaoOcoH.setColumns(10);
				textDescricaoOcoH.setBounds(242, 130, 227, 20);
				panel_2.add(textDescricaoOcoH);
				
				
				JPanel panel_1 = new JPanel();
				tabbedPane.addTab("Ocorrencia Furto", null, panel_1, null);
				panel_1.setLayout(null);
				
				JButton btnNewButton_1 = new JButton("Gerar Ocorrencia");
				btnNewButton_1.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						
						OcorrenciaFurto ocF = montaOcorrenciaF();
						JOptionPane.showMessageDialog(null,ocF.exibeinfoOcorrencia());
												
						
						
						
					}
				});
				btnNewButton_1.setForeground(Color.BLACK);
				btnNewButton_1.setBackground(Color.GREEN);
				btnNewButton_1.setBounds(219, 215, 151, 23);
				panel_1.add(btnNewButton_1);
				
				JLabel lbltext_1 = new JLabel("Numero da ocorrencia:");
				lbltext_1.setHorizontalAlignment(SwingConstants.CENTER);
				lbltext_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lbltext_1.setBounds(80, 47, 208, 26);
				panel_1.add(lbltext_1);
				
				textNumeroOcoF = new JTextField();
				textNumeroOcoF.setColumns(10);
				textNumeroOcoF.setBounds(255, 51, 226, 20);
				panel_1.add(textNumeroOcoF);
				
				JLabel lblNewLabel_2 = new JLabel("Nome da vitima:");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNewLabel_2.setBounds(155, 90, 115, 26);
				panel_1.add(lblNewLabel_2);
				
				textNomeVitimaF = new JTextField();
				textNomeVitimaF.setColumns(10);
				textNomeVitimaF.setBounds(255, 94, 226, 20);
				panel_1.add(textNomeVitimaF);
				
				JLabel lblNewLabel_3_3 = new JLabel("Descri\u00E7\u00E3o:");
				lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNewLabel_3_3.setBounds(189, 139, 67, 26);
				panel_1.add(lblNewLabel_3_3);
				
				textDescricaoOcoF = new JTextField();
				textDescricaoOcoF.setColumns(10);
				textDescricaoOcoF.setBounds(255, 143, 227, 20);
				panel_1.add(textDescricaoOcoF);
				
				Panel panel_4 = new Panel();
				tabbedPane.addTab("Creditos", null, panel_4, null);
				panel_4.setLayout(null);
				
				JLabel lblNewLabel_1 = new JLabel("Rafael Lins Ferreira");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
				lblNewLabel_1.setBounds(191, 66, 211, 14);
				panel_4.add(lblNewLabel_1);
				
				JLabel lblNewLabel_1_1 = new JLabel("Thiago Alves");
				lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
				lblNewLabel_1_1.setBounds(191, 139, 135, 21);
				panel_4.add(lblNewLabel_1_1);
				
				JLabel lblNewLabel_1_2 = new JLabel("Fernando Amorim");
				lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
				lblNewLabel_1_2.setBounds(191, 223, 169, 14);
				panel_4.add(lblNewLabel_1_2);
	}
	
	
	public static OcorrenciaFurto montaOcorrenciaF() {
		int numero = Integer.parseInt((textNumeroOcoF.getText()));
		String nomeV = (textNomeVitimaF.getText());
		String descricao = (textDescricaoOcoF.getText());
		OcorrenciaFurto ocF = new OcorrenciaFurto();
		ocF.setNumero(numero);
		ocF.setNomeVitima(nomeV);
		ocF.setDescricaoOcorrencia(descricao);
		
		return ocF;
	}

	public static OcorrenciaHomicidio montaOcorrenciaH() {
		int numero = Integer.parseInt((textNumeroOcoH.getText()));
		String nomeV = (textNomeVitimaH.getText());
		String descricao = (textDescricaoOcoH.getText());
		OcorrenciaHomicidio ocH = new OcorrenciaHomicidio();
		ocH.setNumero(numero);
		ocH.setNomeVitima(nomeV);
		ocH.setDescricaoOcorrencia(descricao);
		return ocH;
	}


	public static OcorrenciaLatrocinio montaOcorrenciaL() {
		int numero = Integer.parseInt((textNumeroOcoL.getText()));
		String nomeV = (textNomeVitimaL.getText());
		String descricao = (textDescricaoOcoL.getText());
		OcorrenciaLatrocinio ocL = new OcorrenciaLatrocinio();
		ocL.setNumero(numero);
		ocL.setNomeVitima(nomeV);
		ocL.setDescricaoOcorrencia(descricao);
		return ocL;
	}
	

 
 
}
	

