package lan.zold.controllers;

import javax.swing.JButton;
import lan.zold.models.Triangle;
import lan.zold.views.InputPanel;
import lan.zold.views.MainFrame;

public class MainController {

  MainFrame mainFrame;

  public MainController() {
    this.mainFrame = new MainFrame();
    this.handleEvents();
  }

  private void handleEvents() {
    JButton calculateButton = mainFrame.getCalculateButton();
    calculateButton.addActionListener(e -> {
      onClickCalculateButton();
    });
  }

  private void onClickCalculateButton() {
    InputPanel basePanel = this.mainFrame.getBasePanel();
    InputPanel heightPanel = this.mainFrame.getHeightPanel();
    InputPanel areaPanel = this.mainFrame.getAreaPanel();

    double base = Double.parseDouble(basePanel.getValue());
    double height = Double.parseDouble(heightPanel.getValue());

    Double area = Triangle.calculateArea(base, height);
    areaPanel.setValue(area.toString());
  }
}
