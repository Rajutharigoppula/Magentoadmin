#Author: raju.tarigoppula@jivainfotech.com

@TestC
Feature: Order Module (Admin)

 @Test17
  Scenario: Create an order from Magento admin with the cart Price rule
    Given open application with "chrome"
    Then login in to admin "admin" and "i95devteam"
 

@Test18
  Scenario: Create an order from Magento admin with the catalog price rule
  Pending index issue
@Test19
  Scenario: Create an order from Magento admin with the cart price rule and catalog price rule
  Pending due to index issue
@Test20
  Scenario: Order creation with same billing and shipping address from Magento admin 
@Test21
  Scenario: Order creation with different billing and shipping address from Magento admin 
@Test22
  Scenario: Order creation from Magento admin with unsaved billing address 
@Test23
  Scenario: Order creation from Magento admin with unsaved shipping address 
@Test24
  Scenario: Order creation from Magento admin with unsaved billing and unsaved shipping address 
@Test25
  Scenario: Order creation from Magento admin with saved billing address 
@Test26
  Scenario: Order creation from Magento admin with saved shipping address 
@Test27
  Scenario: Order creation from Magento admin with saved billing address and saved shipping address 
@Test28
  Scenario: Order Creation from Magento admin with the Free shipping method
@Test29
  Scenario: Order creation from Magento admin with the Flat rate shipping method
@Test30
  Scenario: Order creation from Magento admin with the UPS shipping method
@Test31
  Scenario: Order creation from Magento admin with the USPS shipping method
@Test32
  Scenario: Order creation from Magento admin with Fedex Shipping method
@Test33
  Scenario: order creation from Magento admin with the Cash on delivery payment method
@Test34
  Scenario: Order creation from Magento admin with the Check Payment method
@Test35
  Scenario: Order creation from Magento admin with the Authorize .net Direct post payment method
    
