Get Students: http://localhost:8081/student/all

Sample post, ready to copy-paste to postman (http://localhost:8081/student/all):

{
        
        "firstName": "Grzegorz",
        "sureName": "Nowak",
        "birthDate": "1856-01-01",
        "dyslexia": false,
        "address": {
            
            "street": "Opolska",
            "zipCode": "32-111",
            "city": "Częstochowa",
            "houseNumber": "5b"
        },
        "clas": {
            
            "level": 2,
            "name": "a"
        },
        "marks": [
            {
                
                "mark": "3",
                "subject": {
                    
                    "name": "Angielski"
                }
            },
            {
                
                "mark": "1",
                "subject": {
                    
                    "name": "WOS"
                }
            }
        ]
    }
