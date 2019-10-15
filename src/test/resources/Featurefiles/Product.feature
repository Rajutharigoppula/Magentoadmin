#Author: raju.tarigoppula@jivainfotech.com

@TestB
Feature: Product Module

 @Test13
  Scenario: Product creation from Magento admin
    Given open application with "chrome"
    Then login in to admin "admin" and "i95devteam"
    Then Create a product "Typeprod1" and "Typeprodsku1" and "20"
    And close the browser
    
  @Test14
  Scenario: Product update from Magento admin
    Given open application with "chrome"
    Then login in to admin "admin" and "i95devteam"
    Then Update a product "XSASA" and "Updatepro2" and "updatesku2" and "30"
    And close the browser
    
 @Test15
  Scenario: Catalog price rule creation in Magento
    Given open application with "chrome"
    Then login in to admin "admin" and "i95devteam"
    Then Create a catalog rule "Catalogrule10" and "Ruledesc" and "20"
    And close the browser
    
@smoketest @Test16
  Scenario: Cart Price rule creation in Magento
    Given open application with "chrome"
    Then login in to admin "admin" and "i95devteam"
    Then Create a cart rule "Cartrule10" and "Ruledesc" and "TEST500" and "30"
    And close the browser
