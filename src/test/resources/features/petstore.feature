Feature: PetStore API Tests


Scenario: Create a user
    Given url 'https://petstore.swagger.io/v2/user'
    And request { id: 12345, username: 'testuser', firstName: 'Test', lastName: 'User', email: 'testuser@example.com', password: 'password', phone: '123-456-7890', userStatus: 1 }
    When method post
    Then status 200

Scenario: Verify the user is created
    Given url 'https://petstore.swagger.io/v2/user/testuser'
    When method get
    Then status 200
    And match response.username == 'testuser'

Scenario: Update the user name and email
    Given url 'https://petstore.swagger.io/v2/user/testuser'
    And request { id: 12345, username: 'testuser', firstName: 'UpdatedTest', lastName: 'User', email: 'updateduser@example.com', password: 'password', phone: '123-456-7890', userStatus: 1 }
    When method put
    Then status 200

Scenario: Verify the user is updated
    Given url 'https://petstore.swagger.io/v2/user/testuser'
    When method get
    Then status 200
    And match response.firstName == 'UpdatedTest'
    And match response.email == 'updateduser@example.com'

Scenario: Delete the user
    Given url 'https://petstore.swagger.io/v2/user/testuser'
    When method delete
    Then status 200

Scenario: Verify the user is deleted
    Given url 'https://petstore.swagger.io/v2/user/testuser'
    When method get
    Then status 404
