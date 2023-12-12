package lan.zold.views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

  InputPanel basePanel;
  InputPanel heightPanel;
  JButton calculateButton;
  InputPanel areaPanel;

  public MainFrame() {
    this.initComponents();
    this.setComponents();
    this.addComponents();
    this.initFrame();
  }

  private void initComponents() {
    this.basePanel = new InputPanel();
    this.heightPanel = new InputPanel();
    this.calculateButton = new JButton("Szamol");
    this.areaPanel = new InputPanel();
  }

  private void setComponents() {
    this.basePanel.setText("Alap: ");
    this.heightPanel.setText("Magassag: ");
    this.areaPanel.setText("Terulet: ");
  }

  private void addComponents() {
    this.add(this.basePanel);
    this.add(this.heightPanel);
    this.add(this.calculateButton);
    this.add(this.areaPanel);
  }

  public void initFrame() {
    this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public InputPanel getBasePanel() {
    return basePanel;
  }

  public void setBasePanel(InputPanel basePanel) {
    this.basePanel = basePanel;
  }

  public InputPanel getHeightPanel() {
    return heightPanel;
  }

  public void setHeightPanel(InputPanel heightPanel) {
    this.heightPanel = heightPanel;
  }

  public JButton getCalculateButton() {
    return calculateButton;
  }

  public void setCalculateButton(JButton calculateButton) {
    this.calculateButton = calculateButton;
  }

  public InputPanel getAreaPanel() {
    return areaPanel;
  }

  public void setAreaPanel(InputPanel areaPanel) {
    this.areaPanel = areaPanel;
  }
}
