@Search @One
	Scenario: Verify whether the User is able to search for products
		Given I launch the application
		When I search for a product "Samsung SyncMaster 941BW"
		Then I should see the product in the search address