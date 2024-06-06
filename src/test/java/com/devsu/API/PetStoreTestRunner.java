package com.devsu.API;

import com.intuit.karate.junit5.Karate;

class PetStoreTestRunner {
    
    @Karate.Test
    Karate testAll() {
        return Karate.run("classpath:features/petstore.feature");
    }
}
