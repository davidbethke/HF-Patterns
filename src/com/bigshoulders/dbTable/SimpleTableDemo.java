package com.bigshoulders.dbTable;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class SimpleTableDemo extends JPanel implements TableModelListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public SimpleTableDemo(){
		super(new GridLayout(1, 0));
		
		final JTable table = new JTable(new MyTableModel());
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);
		//add to this panel
		table.getModel().addTableModelListener(this);
		add(scrollPane);
		//Make a combo box selector for the sports column
		TableColumn sportCol = table.getColumnModel().getColumn(2);
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("SnowBoarding");
		comboBox.addItem("Rowing");
		comboBox.addItem("None");
		sportCol.setCellEditor(new DefaultCellEditor(comboBox));
		
	}
	class MyTableModel extends AbstractTableModel{
		String[] colNames ={"First Name",
				"Last Name",
				"Sport",
				"# of Years",
				"Vegetarian"};
		Object[][] data ={ {"Kathy", "Smith","Snowboarding",new Integer(5),new Boolean(false)},
				{"John","Doe","Rowing", new Integer(9), new Boolean(true)},
				{"Sue","Black","Knitting",new Integer(20), new Boolean(true)},
				{"Dave","Bethke","Shooting",new Integer(1), new Boolean(false)}
		};
		
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return colNames.length;
		}

		public int getRowCount() {
			// TODO Auto-generated method stub
			return data.length;
		}
		public String getColumnName(int col){
			return colNames[col];
		}
		public Object getValueAt(int row, int col){
			return data[row][col];
		}
		public Class getColumnClass(int c){
			return getValueAt(0, c).getClass();
		}
		public boolean isCellEditable(int row, int col){
			if(col < 2){
				return false;
				
			}else{
				return true;
			}
		}
		public void setValueAt(Object value, int row, int col){
			data[row][col] = value;
			fireTableCellUpdated(row, col);
		}

		
		
	}
	private static void createAndShowGUI(){
		//Frame
		JFrame frame = new JFrame("SimpleTableDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Content Pane
		
		SimpleTableDemo newContentPane = new SimpleTableDemo();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		frame.pack();
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				createAndShowGUI();
				
			}
		});

	}
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		int row = e.getFirstRow();
		int col = e.getColumn();
		TableModel model = (TableModel)e.getSource();
		String colName = model.getColumnName(col);
		Object data = model.getValueAt(row, col);
		System.out.println("ColName:"+colName+"Row: "+ row+", Col:"+col+"Value: "+ data.toString());
		
		
	}

}
