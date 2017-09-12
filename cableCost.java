/*This code is to create a quick tool for calculating the cable expense and revenue. 
Variables to be used are cableCostPerFoot; firstConnector; secondConnector; lengthOfCable; */

import javax.swing.JOptionPane;

public class cableCost {

  

   public static void main(String[] args){
   
   
     String cableCostPerFootInput = JOptionPane.showInputDialog("Please enter the cost of the cable per foot: ");
     double cableCostPerFoot = Double.parseDouble(cableCostPerFootInput);
     
     String connectorOneInput = JOptionPane.showInputDialog("Please enter the cost for the first connector: ");
     double connectorOneCost = Double.parseDouble(connectorOneInput);
     
     String connectorOneCountInput = JOptionPane.showInputDialog("Please enter the quantity of the first connector: ");
     double connectorOneCount = Double.parseDouble(connectorOneCountInput);

     
     String connectorTwoInput = JOptionPane.showInputDialog("Please enter the cost for the second connector: ");
     int connectorTwoCost = Integer.parseInt(connectorTwoInput);
     
     String connectorTwoCountInput = JOptionPane.showInputDialog("Please enter the quantity of the second connector: ");
     double connectorTwoCount = Double.parseDouble(connectorTwoCountInput);

     String cableLengthInput = JOptionPane.showInputDialog("Please enter the bulk length of the cable: ");
     int cableLength = Integer.parseInt(cableLengthInput);
     
     String sellPriceInput = JOptionPane.showInputDialog("Please enter the price you want to sell the cables at each: ");
     double sellPrice = Double.parseDouble(sellPriceInput);
     
     String desiredCableLengthInput = JOptionPane.showInputDialog("Please enter the length of the completed cable: ");
     int desiredCableLength = Integer.parseInt(desiredCableLengthInput);
     
     

     double initialConnectorCost = (connectorTwoCount * connectorTwoCost) + (connectorOneCount * connectorOneCost);
     
     double amountOfCables = cableLength / desiredCableLength;
     
     double finalConnectorCost = amountOfCables * initialConnectorCost;
     
     double cableOnlyCost = cableLength * cableCostPerFoot;
     
     double totalExpense = finalConnectorCost + cableOnlyCost;
     
     double profit = amountOfCables * sellPrice;
     
     double revenue = profit - totalExpense;
     
     
     JOptionPane.showMessageDialog(null, "For a " + desiredCableLength + "ft cable, your total expenses are $" + totalExpense + ", and your profit is $" + profit + ", leaving you with a final revenue of $" + revenue);

   
   
   
   
   
   
   System.exit(0);
   }


}